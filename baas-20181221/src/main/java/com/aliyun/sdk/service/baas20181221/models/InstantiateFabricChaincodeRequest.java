// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstantiateFabricChaincodeRequest} extends {@link RequestModel}
 *
 * <p>InstantiateFabricChaincodeRequest</p>
 */
public class InstantiateFabricChaincodeRequest extends Request {
    @Body
    @NameInMap("ChaincodeId")
    @Validation(required = true)
    private String chaincodeId;

    @Body
    @NameInMap("CollectionConfig")
    private String collectionConfig;

    @Body
    @NameInMap("EndorsePolicy")
    private String endorsePolicy;

    @Body
    @NameInMap("Location")
    private String location;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private InstantiateFabricChaincodeRequest(Builder builder) {
        super(builder);
        this.chaincodeId = builder.chaincodeId;
        this.collectionConfig = builder.collectionConfig;
        this.endorsePolicy = builder.endorsePolicy;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstantiateFabricChaincodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return collectionConfig
     */
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    /**
     * @return endorsePolicy
     */
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InstantiateFabricChaincodeRequest, Builder> {
        private String chaincodeId; 
        private String collectionConfig; 
        private String endorsePolicy; 
        private String location; 
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InstantiateFabricChaincodeRequest response) {
            super(response);
            this.chaincodeId = response.chaincodeId;
            this.collectionConfig = response.collectionConfig;
            this.endorsePolicy = response.endorsePolicy;
            this.location = response.location;
            this.organizationId = response.organizationId;
            this.regionId = response.regionId;
        } 

        /**
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putBodyParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
            return this;
        }

        /**
         * CollectionConfig.
         */
        public Builder collectionConfig(String collectionConfig) {
            this.putBodyParameter("CollectionConfig", collectionConfig);
            this.collectionConfig = collectionConfig;
            return this;
        }

        /**
         * EndorsePolicy.
         */
        public Builder endorsePolicy(String endorsePolicy) {
            this.putBodyParameter("EndorsePolicy", endorsePolicy);
            this.endorsePolicy = endorsePolicy;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InstantiateFabricChaincodeRequest build() {
            return new InstantiateFabricChaincodeRequest(this);
        } 

    } 

}
