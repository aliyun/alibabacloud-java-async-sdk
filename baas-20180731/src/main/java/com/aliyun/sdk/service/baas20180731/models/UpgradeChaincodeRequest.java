// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeChaincodeRequest} extends {@link RequestModel}
 *
 * <p>UpgradeChaincodeRequest</p>
 */
public class UpgradeChaincodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CollectionConfig")
    private String collectionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndorsePolicy")
    private String endorsePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private UpgradeChaincodeRequest(Builder builder) {
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

    public static UpgradeChaincodeRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeChaincodeRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String collectionConfig; 
        private String endorsePolicy; 
        private String location; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeChaincodeRequest request) {
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
        public UpgradeChaincodeRequest build() {
            return new UpgradeChaincodeRequest(this);
        } 

    } 

}
