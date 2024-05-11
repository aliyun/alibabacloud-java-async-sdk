// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * DoVoxelGridDownDownSampling.
         */
        public Builder doVoxelGridDownDownSampling(Boolean doVoxelGridDownDownSampling) {
            this.doVoxelGridDownDownSampling = doVoxelGridDownDownSampling;
            return this;
        }

        /**
         * LibraryName.
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /**
         * OctreeResolution.
         */
        public Builder octreeResolution(Double octreeResolution) {
            this.octreeResolution = octreeResolution;
            return this;
        }

        /**
         * PointResolution.
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
