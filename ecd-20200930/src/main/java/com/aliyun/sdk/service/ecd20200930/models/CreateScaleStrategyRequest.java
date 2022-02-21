// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScaleStrategyRequest} extends {@link RequestModel}
 *
 * <p>CreateScaleStrategyRequest</p>
 */
public class CreateScaleStrategyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

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
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScaleStep")
    @Validation(maximum = 100, minimum = 1)
    private Integer scaleStep;

    @Query
    @NameInMap("ScaleStrategyName")
    private String scaleStrategyName;

    @Query
    @NameInMap("ScaleStrategyType")
    private String scaleStrategyType;

    private CreateScaleStrategyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.maxAvailableDesktopsCount = builder.maxAvailableDesktopsCount;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minAvailableDesktopsCount = builder.minAvailableDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.scaleStep = builder.scaleStep;
        this.scaleStrategyName = builder.scaleStrategyName;
        this.scaleStrategyType = builder.scaleStrategyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScaleStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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

    public static final class Builder extends Request.Builder<CreateScaleStrategyRequest, Builder> {
        private String clientToken; 
        private Integer maxAvailableDesktopsCount; 
        private Integer maxDesktopsCount; 
        private Integer minAvailableDesktopsCount; 
        private Integer minDesktopsCount; 
        private String payType; 
        private String regionId; 
        private Integer scaleStep; 
        private String scaleStrategyName; 
        private String scaleStrategyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateScaleStrategyRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.maxAvailableDesktopsCount = response.maxAvailableDesktopsCount;
            this.maxDesktopsCount = response.maxDesktopsCount;
            this.minAvailableDesktopsCount = response.minAvailableDesktopsCount;
            this.minDesktopsCount = response.minDesktopsCount;
            this.payType = response.payType;
            this.regionId = response.regionId;
            this.scaleStep = response.scaleStep;
            this.scaleStrategyName = response.scaleStrategyName;
            this.scaleStrategyType = response.scaleStrategyType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
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
        public CreateScaleStrategyRequest build() {
            return new CreateScaleStrategyRequest(this);
        } 

    } 

}
