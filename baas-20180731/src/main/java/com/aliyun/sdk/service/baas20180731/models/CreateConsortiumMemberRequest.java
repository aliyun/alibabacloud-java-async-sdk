// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsortiumMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateConsortiumMemberRequest</p>
 */
public class CreateConsortiumMemberRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Code")
    private String code;

    @Query
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Query
    @NameInMap("Organization")
    @Validation(required = true)
    private java.util.List < Organization> organization;

    private CreateConsortiumMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.consortiumId = builder.consortiumId;
        this.organization = builder.organization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsortiumMemberRequest create() {
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

    public static final class Builder extends Request.Builder<CreateConsortiumMemberRequest, Builder> {
        private String regionId; 
        private String code; 
        private String consortiumId; 
        private java.util.List < Organization> organization; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsortiumMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
            this.consortiumId = request.consortiumId;
            this.organization = request.organization;
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

        @Override
        public CreateConsortiumMemberRequest build() {
            return new CreateConsortiumMemberRequest(this);
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
