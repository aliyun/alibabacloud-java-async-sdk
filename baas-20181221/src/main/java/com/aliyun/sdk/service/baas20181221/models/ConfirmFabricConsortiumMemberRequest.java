// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmFabricConsortiumMemberRequest} extends {@link RequestModel}
 *
 * <p>ConfirmFabricConsortiumMemberRequest</p>
 */
public class ConfirmFabricConsortiumMemberRequest extends Request {
    @Query
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Query
    @NameInMap("Organization")
    @Validation(required = true)
    private java.util.List < Organization> organization;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ConfirmFabricConsortiumMemberRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.organization = builder.organization;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmFabricConsortiumMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
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

    public static final class Builder extends Request.Builder<ConfirmFabricConsortiumMemberRequest, Builder> {
        private String consortiumId; 
        private java.util.List < Organization> organization; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmFabricConsortiumMemberRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.organization = response.organization;
            this.regionId = response.regionId;
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
        public ConfirmFabricConsortiumMemberRequest build() {
            return new ConfirmFabricConsortiumMemberRequest(this);
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
