package com.tayloristic.nokamod.blocks.crops;


import java.util.Random;

import javax.annotation.Nullable;

import com.tayloristic.nokamod.Refrence.NokaModBlocks;
import com.tayloristic.nokamod.init.ModBlocks;
import com.tayloristic.nokamod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStem;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SquashStem extends BlockStem implements IBlockColor {
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);
    public static final PropertyDirection FACING = BlockTorch.FACING;
    private final Block crop;
    protected static final AxisAlignedBB[] STEM_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.125D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.25D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.375D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.5D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.625D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.75D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 0.875D, 0.625D), new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D)};

    public SquashStem(NokaModBlocks block) {
    	super(ModBlocks.squash_block);
    	crop = ModBlocks.squash_block;
		setUnlocalizedName(block.getUnlocalizedName());
	    setRegistryName(block.getRegistryName());
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return STEM_AABB[((Integer)state.getValue(AGE)).intValue()];
    }

    /**
     * Get the actual Block state of this Block at the given position. This applies properties not visible in the
     * metadata, such as fence connections.
     */
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        int i = ((Integer)state.getValue(AGE)).intValue();
        state = state.withProperty(FACING, EnumFacing.UP);

        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
        {
            if (worldIn.getBlockState(pos.offset(enumfacing)).getBlock() == this.crop && i == 7)
            {
                state = state.withProperty(FACING, enumfacing);
                break;
            }
        }

        return state;
    }

    /**
     * Return true if the block can sustain a Bush
     */
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.FARMLAND;
    }

    
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        super.updateTick(worldIn, pos, state, rand);

    }

    public void growStem(World worldIn, BlockPos pos, IBlockState state)
    {
        int i = ((Integer)state.getValue(AGE)).intValue() + MathHelper.getInt(worldIn.rand, 2, 5);
        worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(Math.min(7, i))), 2);
    }

    /**
     * Spawns this Block's drops into the World as EntityItems.
     */
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

    @Override
    public java.util.List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        java.util.List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
        {
            Item item = this.getSeedItem();

            if (item != null)
            {
                int i = ((Integer)state.getValue(AGE)).intValue();

                for (int j = 0; j < 3; ++j)
                {
                    if (RANDOM.nextInt(15) <= i)
                    {
                        ret.add(new ItemStack(item));
                    }
                }
            }
        }
        return ret;
    }

    @Nullable
    protected Item getSeedItem()
    {
        return ModItems.squash_seeds;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return null;
    }

    @Nullable
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        Item item = this.getSeedItem();
        return item == null ? null : new ItemStack(item);
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return ((Integer)state.getValue(AGE)).intValue() != 7;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return true;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        this.growStem(worldIn, pos, state);
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((Integer)state.getValue(AGE)).intValue();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE, FACING});
    }

	@Override
	public int colorMultiplier(IBlockState state, IBlockAccess worldIn, BlockPos pos, int tintIndex) {
		return 0;
	}
}