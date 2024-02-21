// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointServicesRequest</p>
 */
public class ListVpcEndpointServicesRequest extends Request {
    @Query
    @NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ServiceBusinessStatus")
    private String serviceBusinessStatus;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("ServiceResourceType")
    private String serviceResourceType;

    @Query
    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private ListVpcEndpointServicesRequest(Builder builder) {
        super(builder);
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.serviceBusinessStatus = builder.serviceBusinessStatus;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceResourceType = builder.serviceResourceType;
        this.serviceStatus = builder.serviceStatus;
        this.tag = builder.tag;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoAcceptEnabled
     */
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return serviceBusinessStatus
     */
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceResourceType
     */
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder extends Request.Builder<ListVpcEndpointServicesRequest, Builder> {
        private Boolean autoAcceptEnabled; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String serviceBusinessStatus; 
        private String serviceId; 
        private String serviceName; 
        private String serviceResourceType; 
        private String serviceStatus; 
        private java.util.List < Tag> tag; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointServicesRequest request) {
            super(request);
            this.autoAcceptEnabled = request.autoAcceptEnabled;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.serviceBusinessStatus = request.serviceBusinessStatus;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
            this.serviceResourceType = request.serviceResourceType;
            this.serviceStatus = request.serviceStatus;
            this.tag = request.tag;
            this.zoneAffinityEnabled = request.zoneAffinityEnabled;
        } 

        /**
         * Specifies whether to automatically accept endpoint connection requests. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.
         * *   If a next request is to be performed, set the parameter to the value of NextToken that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the endpoint service.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The service resource ID.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The service state of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Normal**: The endpoint service runs as expected.
         * *   **FinancialLocked**: The endpoint service is locked due to overdue payments.
         */
        public Builder serviceBusinessStatus(String serviceBusinessStatus) {
            this.putQueryParameter("ServiceBusinessStatus", serviceBusinessStatus);
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the endpoint service.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The type of the service resource. Valid values:
         * <p>
         * 
         * *   **slb**: a Classic Load Balancer (CLB) instance
         * *   **alb**: an Application Load Balancer (ALB) instance
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * The state of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint service is being created.
         * *   **Pending**: The endpoint service is being modified.
         * *   **Active**: The endpoint service is available.
         * *   **Deleting**: The endpoint service is being deleted
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putQueryParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.putQueryParameter("ZoneAffinityEnabled", zoneAffinityEnabled);
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        @Override
        public ListVpcEndpointServicesRequest build() {
            return new ListVpcEndpointServicesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
