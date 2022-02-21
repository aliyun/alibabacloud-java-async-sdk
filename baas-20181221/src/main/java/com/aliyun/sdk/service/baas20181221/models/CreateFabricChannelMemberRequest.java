// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChannelMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricChannelMemberRequest</p>
 */
public class CreateFabricChannelMemberRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("Organization")
    @Validation(required = true)
    private java.util.List < Organization> organization;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateFabricChannelMemberRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.organization = builder.organization;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricChannelMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return organization
     */
    public java.util.List < Organization> getOrganization() {
        return this.organization;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateFabricChannelMemberRequest, Builder> {
        private String channelId; 
        private java.util.List < Organization> organization; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricChannelMemberRequest response) {
            super(response);
            this.channelId = response.channelId;
            this.organization = response.organization;
            this.regionId = response.regionId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateFabricChannelMemberRequest build() {
            return new CreateFabricChannelMemberRequest(this);
        } 

    } 

    public static class Organization extends TeaModel {
        @NameInMap("OrganizationId")
        private String organizationId;

        private Organization(Builder builder) {
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organization create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String organizationId; 

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public Organization build() {
                return new Organization(this);
            } 

        } 

    }
}
