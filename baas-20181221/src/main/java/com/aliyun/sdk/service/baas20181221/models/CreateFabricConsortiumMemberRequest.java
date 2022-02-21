// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricConsortiumMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricConsortiumMemberRequest</p>
 */
public class CreateFabricConsortiumMemberRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

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

    private CreateFabricConsortiumMemberRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.consortiumId = builder.consortiumId;
        this.organization = builder.organization;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricConsortiumMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder extends Request.Builder<CreateFabricConsortiumMemberRequest, Builder> {
        private String code; 
        private String consortiumId; 
        private java.util.List < Organization> organization; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricConsortiumMemberRequest response) {
            super(response);
            this.code = response.code;
            this.consortiumId = response.consortiumId;
            this.organization = response.organization;
            this.regionId = response.regionId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
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
        public CreateFabricConsortiumMemberRequest build() {
            return new CreateFabricConsortiumMemberRequest(this);
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
