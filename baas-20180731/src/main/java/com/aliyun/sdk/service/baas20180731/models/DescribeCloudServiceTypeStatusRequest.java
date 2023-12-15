// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudServiceTypeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudServiceTypeStatusRequest</p>
 */
public class DescribeCloudServiceTypeStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("ServiceType")
    @Validation(required = true)
    private String serviceType;

    private DescribeCloudServiceTypeStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.organizationId = builder.organizationId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudServiceTypeStatusRequest create() {
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<DescribeCloudServiceTypeStatusRequest, Builder> {
        private String regionId; 
        private String organizationId; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudServiceTypeStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.organizationId = request.organizationId;
            this.serviceType = request.serviceType;
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

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public DescribeCloudServiceTypeStatusRequest build() {
            return new DescribeCloudServiceTypeStatusRequest(this);
        } 

    } 

}
