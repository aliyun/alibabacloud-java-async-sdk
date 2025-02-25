// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChaincodeUploadPolicyRequest</p>
 */
public class DescribeFabricChaincodeUploadPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DescribeFabricChaincodeUploadPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.organizationId = builder.organizationId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricChaincodeUploadPolicyRequest, Builder> {
        private String regionId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChaincodeUploadPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeFabricChaincodeUploadPolicyRequest build() {
            return new DescribeFabricChaincodeUploadPolicyRequest(this);
        } 

    } 

}
