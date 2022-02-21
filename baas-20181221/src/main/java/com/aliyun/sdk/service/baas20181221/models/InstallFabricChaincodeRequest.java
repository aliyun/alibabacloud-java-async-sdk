// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallFabricChaincodeRequest} extends {@link RequestModel}
 *
 * <p>InstallFabricChaincodeRequest</p>
 */
public class InstallFabricChaincodeRequest extends Request {
    @Body
    @NameInMap("ChaincodeId")
    @Validation(required = true)
    private String chaincodeId;

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

    private InstallFabricChaincodeRequest(Builder builder) {
        super(builder);
        this.chaincodeId = builder.chaincodeId;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallFabricChaincodeRequest create() {
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

    public static final class Builder extends Request.Builder<InstallFabricChaincodeRequest, Builder> {
        private String chaincodeId; 
        private String location; 
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InstallFabricChaincodeRequest response) {
            super(response);
            this.chaincodeId = response.chaincodeId;
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
        public InstallFabricChaincodeRequest build() {
            return new InstallFabricChaincodeRequest(this);
        } 

    } 

}
