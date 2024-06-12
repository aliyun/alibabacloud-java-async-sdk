// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceRequest</p>
 */
public class GetDiscoveredResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceOption")
    private Integer complianceOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private GetDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.complianceOption = builder.complianceOption;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return complianceOption
     */
    public Integer getComplianceOption() {
        return this.complianceOption;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetDiscoveredResourceRequest, Builder> {
        private Integer complianceOption; 
        private String region; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceRequest request) {
            super(request);
            this.complianceOption = request.complianceOption;
            this.region = request.region;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * ComplianceOption.
         */
        public Builder complianceOption(Integer complianceOption) {
            this.putQueryParameter("ComplianceOption", complianceOption);
            this.complianceOption = complianceOption;
            return this;
        }

        /**
         * The ID of the region in which the resource resides.
         * <p>
         * 
         * For more information about how to query the region ID of a resource, see [ListDiscoveredResources](~~411702~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The resource IDs.
         * <p>
         * 
         * For more information about how to query the ID of a resource, see [ListDiscoveredResources](~~411702~~).
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The resource type.
         * <p>
         * 
         * For more information about how to obtain the type of a resource, see [ListDiscoveredResources](~~411702~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetDiscoveredResourceRequest build() {
            return new GetDiscoveredResourceRequest(this);
        } 

    } 

}
