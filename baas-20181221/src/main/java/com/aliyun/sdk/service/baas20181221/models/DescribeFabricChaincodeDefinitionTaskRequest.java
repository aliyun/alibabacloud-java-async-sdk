// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChaincodeDefinitionTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricChaincodeDefinitionTaskRequest</p>
 */
public class DescribeFabricChaincodeDefinitionTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DescribeFabricChaincodeDefinitionTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChaincodeDefinitionTaskRequest create() {
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricChaincodeDefinitionTaskRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricChaincodeDefinitionTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
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
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DescribeFabricChaincodeDefinitionTaskRequest build() {
            return new DescribeFabricChaincodeDefinitionTaskRequest(this);
        } 

    } 

}
