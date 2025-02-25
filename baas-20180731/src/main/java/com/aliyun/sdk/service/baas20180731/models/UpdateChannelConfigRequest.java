// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChannelConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateChannelConfigRequest</p>
 */
public class UpdateChannelConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchTimeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer batchTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxMessageCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxMessageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreferredMaxBytes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer preferredMaxBytes;

    private UpdateChannelConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.batchTimeout = builder.batchTimeout;
        this.channelId = builder.channelId;
        this.maxMessageCount = builder.maxMessageCount;
        this.organizationId = builder.organizationId;
        this.preferredMaxBytes = builder.preferredMaxBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChannelConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return batchTimeout
     */
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return maxMessageCount
     */
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return preferredMaxBytes
     */
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

    public static final class Builder extends Request.Builder<UpdateChannelConfigRequest, Builder> {
        private String regionId; 
        private Integer batchTimeout; 
        private String channelId; 
        private Integer maxMessageCount; 
        private String organizationId; 
        private Integer preferredMaxBytes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChannelConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.batchTimeout = request.batchTimeout;
            this.channelId = request.channelId;
            this.maxMessageCount = request.maxMessageCount;
            this.organizationId = request.organizationId;
            this.preferredMaxBytes = request.preferredMaxBytes;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BatchTimeout.
         */
        public Builder batchTimeout(Integer batchTimeout) {
            this.putBodyParameter("BatchTimeout", batchTimeout);
            this.batchTimeout = batchTimeout;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * MaxMessageCount.
         */
        public Builder maxMessageCount(Integer maxMessageCount) {
            this.putBodyParameter("MaxMessageCount", maxMessageCount);
            this.maxMessageCount = maxMessageCount;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * PreferredMaxBytes.
         */
        public Builder preferredMaxBytes(Integer preferredMaxBytes) {
            this.putBodyParameter("PreferredMaxBytes", preferredMaxBytes);
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }

        @Override
        public UpdateChannelConfigRequest build() {
            return new UpdateChannelConfigRequest(this);
        } 

    } 

}
