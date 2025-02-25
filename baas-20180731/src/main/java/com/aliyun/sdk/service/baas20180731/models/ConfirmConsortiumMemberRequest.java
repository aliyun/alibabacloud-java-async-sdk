// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmConsortiumMemberRequest} extends {@link RequestModel}
 *
 * <p>ConfirmConsortiumMemberRequest</p>
 */
public class ConfirmConsortiumMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Organization> organization;

    private ConfirmConsortiumMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
        this.organization = builder.organization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmConsortiumMemberRequest create() {
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

    public static final class Builder extends Request.Builder<ConfirmConsortiumMemberRequest, Builder> {
        private String regionId; 
        private String consortiumId; 
        private java.util.List < Organization> organization; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmConsortiumMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public ConfirmConsortiumMemberRequest build() {
            return new ConfirmConsortiumMemberRequest(this);
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
