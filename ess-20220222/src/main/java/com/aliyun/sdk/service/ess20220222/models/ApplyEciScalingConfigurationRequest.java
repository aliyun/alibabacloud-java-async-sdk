// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyEciScalingConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ApplyEciScalingConfigurationRequest</p>
 */
public class ApplyEciScalingConfigurationRequest extends Request {
    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Format")
    private String format;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScalingConfigurationId")
    private String scalingConfigurationId;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    private ApplyEciScalingConfigurationRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.format = builder.format;
        this.regionId = builder.regionId;
        this.scalingConfigurationId = builder.scalingConfigurationId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyEciScalingConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
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

    public static final class Builder extends Request.Builder<ApplyEciScalingConfigurationRequest, Builder> {
        private String content; 
        private String format; 
        private String regionId; 
        private String scalingConfigurationId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyEciScalingConfigurationRequest request) {
            super(request);
            this.content = request.content;
            this.format = request.format;
            this.regionId = request.regionId;
            this.scalingConfigurationId = request.scalingConfigurationId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.putQueryParameter("Format", format);
            this.format = format;
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
        public ApplyEciScalingConfigurationRequest build() {
            return new ApplyEciScalingConfigurationRequest(this);
        } 

    } 

}
