// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChaincodeUploadPolicyRequest</p>
 */
public class DescribeFabricChaincodeUploadPolicyRequest extends Request {
    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricChaincodeUploadPolicyRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChaincodeUploadPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeFabricChaincodeUploadPolicyRequest, Builder> {
        private String organizationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChaincodeUploadPolicyRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.regionId = response.regionId;
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
        public DescribeFabricChaincodeUploadPolicyRequest build() {
            return new DescribeFabricChaincodeUploadPolicyRequest(this);
        } 

    } 

}
