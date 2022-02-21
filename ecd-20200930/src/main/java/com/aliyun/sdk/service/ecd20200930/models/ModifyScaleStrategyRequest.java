// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScaleStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyScaleStrategyRequest</p>
 */
public class ModifyScaleStrategyRequest extends Request {
    @Query
    @NameInMap("MaxAvailableDesktopsCount")
    @Validation(maximum = 100)
    private Integer maxAvailableDesktopsCount;

    @Query
    @NameInMap("MaxDesktopsCount")
    @Validation(maximum = 1000, minimum = 1)
    private Integer maxDesktopsCount;

    @Query
    @NameInMap("MinAvailableDesktopsCount")
    @Validation(maximum = 100)
    private Integer minAvailableDesktopsCount;

    @Query
    @NameInMap("MinDesktopsCount")
    @Validation(maximum = 500)
    private Integer minDesktopsCount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScaleStep")
    @Validation(maximum = 100, minimum = 1)
    private Integer scaleStep;

    @Query
    @NameInMap("ScaleStrategyId")
    @Validation(required = true)
    private String scaleStrategyId;

    @Query
    @NameInMap("ScaleStrategyName")
    private String scaleStrategyName;

    @Query
    @NameInMap("ScaleStrategyType")
    private String scaleStrategyType;

    private ModifyScaleStrategyRequest(Builder builder) {
        super(builder);
        this.maxAvailableDesktopsCount = builder.maxAvailableDesktopsCount;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minAvailableDesktopsCount = builder.minAvailableDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.regionId = builder.regionId;
        this.scaleStep = builder.scaleStep;
        this.scaleStrategyId = builder.scaleStrategyId;
        this.scaleStrategyName = builder.scaleStrategyName;
        this.scaleStrategyType = builder.scaleStrategyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScaleStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxAvailableDesktopsCount
     */
    public Integer getMaxAvailableDesktopsCount() {
        return this.maxAvailableDesktopsCount;
    }

    /**
     * @return maxDesktopsCount
     */
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    /**
     * @return minAvailableDesktopsCount
     */
    public Integer getMinAvailableDesktopsCount() {
        return this.minAvailableDesktopsCount;
    }

    /**
     * @return minDesktopsCount
     */
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scaleStep
     */
    public Integer getScaleStep() {
        return this.scaleStep;
    }

    /**
     * @return scaleStrategyId
     */
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    /**
     * @return scaleStrategyName
     */
    public String getScaleStrategyName() {
        return this.scaleStrategyName;
    }

    /**
     * @return scaleStrategyType
     */
    public String getScaleStrategyType() {
        return this.scaleStrategyType;
    }

    public static final class Builder extends Request.Builder<ModifyScaleStrategyRequest, Builder> {
        private Integer maxAvailableDesktopsCount; 
        private Integer maxDesktopsCount; 
        private Integer minAvailableDesktopsCount; 
        private Integer minDesktopsCount; 
        private String regionId; 
        private Integer scaleStep; 
        private String scaleStrategyId; 
        private String scaleStrategyName; 
        private String scaleStrategyType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScaleStrategyRequest response) {
            super(response);
            this.maxAvailableDesktopsCount = response.maxAvailableDesktopsCount;
            this.maxDesktopsCount = response.maxDesktopsCount;
            this.minAvailableDesktopsCount = response.minAvailableDesktopsCount;
            this.minDesktopsCount = response.minDesktopsCount;
            this.regionId = response.regionId;
            this.scaleStep = response.scaleStep;
            this.scaleStrategyId = response.scaleStrategyId;
            this.scaleStrategyName = response.scaleStrategyName;
            this.scaleStrategyType = response.scaleStrategyType;
        } 

        /**
         * MaxAvailableDesktopsCount.
         */
        public Builder maxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
            this.putQueryParameter("MaxAvailableDesktopsCount", maxAvailableDesktopsCount);
            this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
            return this;
        }

        /**
         * MaxDesktopsCount.
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * MinAvailableDesktopsCount.
         */
        public Builder minAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
            this.putQueryParameter("MinAvailableDesktopsCount", minAvailableDesktopsCount);
            this.minAvailableDesktopsCount = minAvailableDesktopsCount;
            return this;
        }

        /**
         * MinDesktopsCount.
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScaleStep.
         */
        public Builder scaleStep(Integer scaleStep) {
            this.putQueryParameter("ScaleStep", scaleStep);
            this.scaleStep = scaleStep;
            return this;
        }

        /**
         * ScaleStrategyId.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * ScaleStrategyName.
         */
        public Builder scaleStrategyName(String scaleStrategyName) {
            this.putQueryParameter("ScaleStrategyName", scaleStrategyName);
            this.scaleStrategyName = scaleStrategyName;
            return this;
        }

        /**
         * ScaleStrategyType.
         */
        public Builder scaleStrategyType(String scaleStrategyType) {
            this.putQueryParameter("ScaleStrategyType", scaleStrategyType);
            this.scaleStrategyType = scaleStrategyType;
            return this;
        }

        @Override
        public ModifyScaleStrategyRequest build() {
            return new ModifyScaleStrategyRequest(this);
        } 

    } 

}
