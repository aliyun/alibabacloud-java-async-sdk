// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciScalingConfigurationDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeEciScalingConfigurationDetailRequest</p>
 */
public class DescribeEciScalingConfigurationDetailRequest extends Request {
    @Query
    @NameInMap("OutputFormat")
    private String outputFormat;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScalingConfigurationId")
    @Validation(required = true)
    private String scalingConfigurationId;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private DescribeEciScalingConfigurationDetailRequest(Builder builder) {
        super(builder);
        this.outputFormat = builder.outputFormat;
        this.regionId = builder.regionId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciScalingConfigurationDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeEciScalingConfigurationDetailRequest, Builder> {
        private String outputFormat; 
        private String regionId; 
        private String scalingConfigurationId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEciScalingConfigurationDetailRequest request) {
            super(request);
            this.outputFormat = request.outputFormat;
            this.regionId = request.regionId;
            this.scalingConfigurationId = request.scalingConfigurationId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * OutputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.putQueryParameter("OutputFormat", outputFormat);
            this.outputFormat = outputFormat;
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
         * ScalingConfigurationId.
         */
        public Builder scalingConfigurationId(String scalingConfigurationId) {
            this.putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DescribeEciScalingConfigurationDetailRequest build() {
            return new DescribeEciScalingConfigurationDetailRequest(this);
        } 

    } 

}
