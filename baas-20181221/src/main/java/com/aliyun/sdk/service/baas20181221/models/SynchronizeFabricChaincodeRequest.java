// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SynchronizeFabricChaincodeRequest} extends {@link RequestModel}
 *
 * <p>SynchronizeFabricChaincodeRequest</p>
 */
public class SynchronizeFabricChaincodeRequest extends Request {
    @Body
    @NameInMap("ChaincodeId")
    @Validation(required = true)
    private String chaincodeId;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SynchronizeFabricChaincodeRequest(Builder builder) {
        super(builder);
        this.chaincodeId = builder.chaincodeId;
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SynchronizeFabricChaincodeRequest create() {
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

    public static final class Builder extends Request.Builder<SynchronizeFabricChaincodeRequest, Builder> {
        private String chaincodeId; 
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SynchronizeFabricChaincodeRequest response) {
            super(response);
            this.chaincodeId = response.chaincodeId;
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
        public SynchronizeFabricChaincodeRequest build() {
            return new SynchronizeFabricChaincodeRequest(this);
        } 

    } 

}
