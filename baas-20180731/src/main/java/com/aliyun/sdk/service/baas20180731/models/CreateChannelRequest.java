// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateChannelRequest</p>
 */
public class CreateChannelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("BatchTimeout")
    private Integer batchTimeout;

    @Query
    @NameInMap("ChannelName")
    @Validation(required = true)
    private String channelName;

    @Query
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("MaxMessageCount")
    private Integer maxMessageCount;

    @Query
    @NameInMap("Organization")
    @Validation(required = true)
    private java.util.List < Organization> organization;

    @Body
    @NameInMap("PreferredMaxBytes")
    private Integer preferredMaxBytes;

    private CreateChannelRequest(Builder builder) {
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

    public static CreateChannelRequest create() {
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

    public static final class Builder extends Request.Builder<CreateChannelRequest, Builder> {
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

        private Builder(CreateChannelRequest request) {
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
        public CreateChannelRequest build() {
            return new CreateChannelRequest(this);
        } 

    } 

    public static class Organization extends TeaModel {
        @NameInMap("Id")
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
