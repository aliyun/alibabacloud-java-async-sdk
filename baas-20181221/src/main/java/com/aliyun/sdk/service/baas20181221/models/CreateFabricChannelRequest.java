// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricChannelRequest</p>
 */
public class CreateFabricChannelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchTimeout")
    private Integer batchTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consortiumId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxMessageCount")
    private Integer maxMessageCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Organization> organization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreferredMaxBytes")
    private Integer preferredMaxBytes;

    private CreateFabricChannelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.batchTimeout = builder.batchTimeout;
        this.channelName = builder.channelName;
        this.consortiumId = builder.consortiumId;
        this.maxMessageCount = builder.maxMessageCount;
        this.organization = builder.organization;
        this.preferredMaxBytes = builder.preferredMaxBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricChannelRequest create() {
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
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return maxMessageCount
     */
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    /**
     * @return organization
     */
    public java.util.List < Organization> getOrganization() {
        return this.organization;
    }

    /**
     * @return preferredMaxBytes
     */
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

    public static final class Builder extends Request.Builder<CreateFabricChannelRequest, Builder> {
        private String regionId; 
        private Integer batchTimeout; 
        private String channelName; 
        private String consortiumId; 
        private Integer maxMessageCount; 
        private java.util.List < Organization> organization; 
        private Integer preferredMaxBytes; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricChannelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.batchTimeout = request.batchTimeout;
            this.channelName = request.channelName;
            this.consortiumId = request.consortiumId;
            this.maxMessageCount = request.maxMessageCount;
            this.organization = request.organization;
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
         * ChannelName.
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putQueryParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
         * Organization.
         */
        public Builder organization(java.util.List < Organization> organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
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
        public CreateFabricChannelRequest build() {
            return new CreateFabricChannelRequest(this);
        } 

    } 

    public static class Organization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Organization(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organization create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Organization build() {
                return new Organization(this);
            } 

        } 

    }
}
