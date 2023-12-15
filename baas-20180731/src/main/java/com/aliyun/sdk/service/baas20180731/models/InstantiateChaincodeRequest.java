// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstantiateChaincodeRequest} extends {@link RequestModel}
 *
 * <p>InstantiateChaincodeRequest</p>
 */
public class InstantiateChaincodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private InstantiateChaincodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
        this.collectionConfig = builder.collectionConfig;
        this.endorsePolicy = builder.endorsePolicy;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstantiateChaincodeRequest create() {
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

    public static final class Builder extends Request.Builder<InstantiateChaincodeRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String collectionConfig; 
        private String endorsePolicy; 
        private String location; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(InstantiateChaincodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
            this.collectionConfig = request.collectionConfig;
            this.endorsePolicy = request.endorsePolicy;
            this.location = request.location;
            this.organizationId = request.organizationId;
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

        @Override
        public InstantiateChaincodeRequest build() {
            return new InstantiateChaincodeRequest(this);
        } 

    } 

}
