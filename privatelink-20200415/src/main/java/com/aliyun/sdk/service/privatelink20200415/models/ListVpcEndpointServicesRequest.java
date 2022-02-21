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
    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private ListVpcEndpointServicesRequest(Builder builder) {
        super(builder);
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.serviceBusinessStatus = builder.serviceBusinessStatus;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceResourceType = builder.serviceResourceType;
        this.serviceStatus = builder.serviceStatus;
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
        private String serviceBusinessStatus; 
        private String serviceId; 
        private String serviceName; 
        private String serviceResourceType; 
        private String serviceStatus; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointServicesRequest response) {
            super(response);
            this.autoAcceptEnabled = response.autoAcceptEnabled;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.serviceBusinessStatus = response.serviceBusinessStatus;
            this.serviceId = response.serviceId;
            this.serviceName = response.serviceName;
            this.serviceResourceType = response.serviceResourceType;
            this.serviceStatus = response.serviceStatus;
            this.zoneAffinityEnabled = response.zoneAffinityEnabled;
        } 

        /**
         * AutoAcceptEnabled.
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceBusinessStatus.
         */
        public Builder serviceBusinessStatus(String serviceBusinessStatus) {
            this.putQueryParameter("ServiceBusinessStatus", serviceBusinessStatus);
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceResourceType.
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * ServiceStatus.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putQueryParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * ZoneAffinityEnabled.
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

}
