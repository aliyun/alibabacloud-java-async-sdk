// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OctreeOption} extends {@link TeaModel}
 *
 * <p>OctreeOption</p>
 */
public class OctreeOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DoVoxelGridDownDownSampling")
    private Boolean doVoxelGridDownDownSampling;

    @com.aliyun.core.annotation.NameInMap("LibraryName")
    private String libraryName;

    @com.aliyun.core.annotation.NameInMap("OctreeResolution")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Double octreeResolution;

    @com.aliyun.core.annotation.NameInMap("PointResolution")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Double pointResolution;

    private OctreeOption(Builder builder) {
        this.doVoxelGridDownDownSampling = builder.doVoxelGridDownDownSampling;
        this.libraryName = builder.libraryName;
        this.octreeResolution = builder.octreeResolution;
        this.pointResolution = builder.pointResolution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OctreeOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return doVoxelGridDownDownSampling
     */
    public Boolean getDoVoxelGridDownDownSampling() {
        return this.doVoxelGridDownDownSampling;
    }

    /**
     * @return libraryName
     */
    public String getLibraryName() {
        return this.libraryName;
    }

    /**
     * @return octreeResolution
     */
    public Double getOctreeResolution() {
        return this.octreeResolution;
    }

    /**
     * @return pointResolution
     */
    public Double getPointResolution() {
        return this.pointResolution;
    }

    public static final class Builder {
        private Boolean doVoxelGridDownDownSampling; 
        private String libraryName; 
        private Double octreeResolution; 
        private Double pointResolution; 

        private Builder() {
        } 

        private Builder(OctreeOption model) {
            this.doVoxelGridDownDownSampling = model.doVoxelGridDownDownSampling;
            this.libraryName = model.libraryName;
            this.octreeResolution = model.octreeResolution;
            this.pointResolution = model.pointResolution;
        } 

        /**
         * <p>Specifies whether to downsample the point cloud file. Valid values:</p>
         * <ul>
         * <li>true: The point cloud file is downsampled, and the coordinates of the points in a voxel are replaced with the coordinates of the center point of the voxel. The average color of all points in the voxel is used as the color of the voxel. In this case, the PointResolution parameter does not take effect.</li>
         * <li>false: Specific coordinates and colors in a voxel are encoded by calculating the offsets from each point to the lower-left corner of the voxel. The offsets are divided by the PointResolution value to obtain the integer coordinates. The residual of the color for each point relative to the average color of all points in the voxel is encoded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder doVoxelGridDownDownSampling(Boolean doVoxelGridDownDownSampling) {
            this.doVoxelGridDownDownSampling = doVoxelGridDownDownSampling;
            return this;
        }

        /**
         * <p>The library name. Set the value to pcl. Default value: pcl.</p>
         * 
         * <strong>example:</strong>
         * <p>pcl</p>
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /**
         * <p>The minimum block size when an octree is partitioned. The minimum block size indicates the edge length of a voxel. Default value: 0.01.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        public Builder octreeResolution(Double octreeResolution) {
            this.octreeResolution = octreeResolution;
            return this;
        }

        /**
         * <p>The point cloud resolution. This parameter determines the precision of the point coordinates during encoding. Default value: 0.01.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        public Builder pointResolution(Double pointResolution) {
            this.pointResolution = pointResolution;
            return this;
        }

        public OctreeOption build() {
            return new OctreeOption(this);
        } 

    } 

}
