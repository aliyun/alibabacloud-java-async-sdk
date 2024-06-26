// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallFabricChaincodePackageRequest} extends {@link RequestModel}
 *
 * <p>InstallFabricChaincodePackageRequest</p>
 */
public class InstallFabricChaincodePackageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodePackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodePackageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private InstallFabricChaincodePackageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodePackageId = builder.chaincodePackageId;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallFabricChaincodePackageRequest create() {
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
     * @return chaincodePackageId
     */
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
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

    public static final class Builder extends Request.Builder<InstallFabricChaincodePackageRequest, Builder> {
        private String regionId; 
        private String chaincodePackageId; 
        private String location; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(InstallFabricChaincodePackageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodePackageId = request.chaincodePackageId;
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
         * ChaincodePackageId.
         */
        public Builder chaincodePackageId(String chaincodePackageId) {
            this.putBodyParameter("ChaincodePackageId", chaincodePackageId);
            this.chaincodePackageId = chaincodePackageId;
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
        public InstallFabricChaincodePackageRequest build() {
            return new InstallFabricChaincodePackageRequest(this);
        } 

    } 

}
