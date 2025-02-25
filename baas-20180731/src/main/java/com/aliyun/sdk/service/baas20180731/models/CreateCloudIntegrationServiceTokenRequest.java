// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudIntegrationServiceTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudIntegrationServiceTokenRequest</p>
 */
public class CreateCloudIntegrationServiceTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    @com.aliyun.core.annotation.Validation(required = true)
    private String service;

    private CreateCloudIntegrationServiceTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.organizationId = builder.organizationId;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudIntegrationServiceTokenRequest create() {
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

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<CreateCloudIntegrationServiceTokenRequest, Builder> {
        private String regionId; 
        private String organizationId; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudIntegrationServiceTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.organizationId = request.organizationId;
            this.service = request.service;
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
            this.putQueryParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public CreateCloudIntegrationServiceTokenRequest build() {
            return new CreateCloudIntegrationServiceTokenRequest(this);
        } 

    } 

}
