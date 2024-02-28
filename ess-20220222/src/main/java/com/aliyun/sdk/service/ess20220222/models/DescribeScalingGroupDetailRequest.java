// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingGroupDetailRequest</p>
 */
public class DescribeScalingGroupDetailRequest extends Request {
    @Query
    @NameInMap("OutputFormat")
    private String outputFormat;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private DescribeScalingGroupDetailRequest(Builder builder) {
        super(builder);
        this.outputFormat = builder.outputFormat;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupDetailRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingGroupDetailRequest, Builder> {
        private String outputFormat; 
        private Long ownerId; 
        private String regionId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingGroupDetailRequest request) {
            super(request);
            this.outputFormat = request.outputFormat;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public DescribeScalingGroupDetailRequest build() {
            return new DescribeScalingGroupDetailRequest(this);
        } 

    } 

}
