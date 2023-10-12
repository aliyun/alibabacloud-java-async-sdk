// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmStatusRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmStatusRequest</p>
 */
public class ListAlarmStatusRequest extends Request {
    @Query
    @NameInMap("AggregateDataName")
    private String aggregateDataName;

    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("DedicatedLineId")
    private String dedicatedLineId;

    @Query
    @NameInMap("DedicatedLineName")
    private String dedicatedLineName;

    @Query
    @NameInMap("DeviceForm")
    private String deviceForm;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Manufacturer")
    private String manufacturer;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("Model")
    private String model;

    @Query
    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @Query
    @NameInMap("PortCollectionName")
    private String portCollectionName;

    @Query
    @NameInMap("Province")
    private String province;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("SecurityDomain")
    private String securityDomain;

    @Query
    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @Query
    @NameInMap("Space")
    private String space;

    @Query
    @NameInMap("SpaceType")
    private String spaceType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UniqueKey")
    private String uniqueKey;

    private ListAlarmStatusRequest(Builder builder) {
        super(builder);
        this.aggregateDataName = builder.aggregateDataName;
        this.city = builder.city;
        this.country = builder.country;
        this.dedicatedLineId = builder.dedicatedLineId;
        this.dedicatedLineName = builder.dedicatedLineName;
        this.deviceForm = builder.deviceForm;
        this.deviceId = builder.deviceId;
        this.domain = builder.domain;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.manufacturer = builder.manufacturer;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.monitorItemId = builder.monitorItemId;
        this.nextToken = builder.nextToken;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.portCollectionId = builder.portCollectionId;
        this.portCollectionName = builder.portCollectionName;
        this.province = builder.province;
        this.region = builder.region;
        this.role = builder.role;
        this.securityDomain = builder.securityDomain;
        this.serviceStatus = builder.serviceStatus;
        this.space = builder.space;
        this.spaceType = builder.spaceType;
        this.status = builder.status;
        this.type = builder.type;
        this.uniqueKey = builder.uniqueKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateDataName
     */
    public String getAggregateDataName() {
        return this.aggregateDataName;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return dedicatedLineId
     */
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    /**
     * @return dedicatedLineName
     */
    public String getDedicatedLineName() {
        return this.dedicatedLineName;
    }

    /**
     * @return deviceForm
     */
    public String getDeviceForm() {
        return this.deviceForm;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return portCollectionId
     */
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    /**
     * @return portCollectionName
     */
    public String getPortCollectionName() {
        return this.portCollectionName;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uniqueKey
     */
    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public static final class Builder extends Request.Builder<ListAlarmStatusRequest, Builder> {
        private String aggregateDataName; 
        private String city; 
        private String country; 
        private String dedicatedLineId; 
        private String dedicatedLineName; 
        private String deviceForm; 
        private String deviceId; 
        private String domain; 
        private String hostName; 
        private String instanceId; 
        private String manufacturer; 
        private Integer maxResults; 
        private String model; 
        private String monitorItemId; 
        private String nextToken; 
        private String physicalSpaceId; 
        private String portCollectionId; 
        private String portCollectionName; 
        private String province; 
        private String region; 
        private String role; 
        private String securityDomain; 
        private String serviceStatus; 
        private String space; 
        private String spaceType; 
        private String status; 
        private String type; 
        private String uniqueKey; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmStatusRequest request) {
            super(request);
            this.aggregateDataName = request.aggregateDataName;
            this.city = request.city;
            this.country = request.country;
            this.dedicatedLineId = request.dedicatedLineId;
            this.dedicatedLineName = request.dedicatedLineName;
            this.deviceForm = request.deviceForm;
            this.deviceId = request.deviceId;
            this.domain = request.domain;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.manufacturer = request.manufacturer;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.monitorItemId = request.monitorItemId;
            this.nextToken = request.nextToken;
            this.physicalSpaceId = request.physicalSpaceId;
            this.portCollectionId = request.portCollectionId;
            this.portCollectionName = request.portCollectionName;
            this.province = request.province;
            this.region = request.region;
            this.role = request.role;
            this.securityDomain = request.securityDomain;
            this.serviceStatus = request.serviceStatus;
            this.space = request.space;
            this.spaceType = request.spaceType;
            this.status = request.status;
            this.type = request.type;
            this.uniqueKey = request.uniqueKey;
        } 

        /**
         * AggregateDataName.
         */
        public Builder aggregateDataName(String aggregateDataName) {
            this.putQueryParameter("AggregateDataName", aggregateDataName);
            this.aggregateDataName = aggregateDataName;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * DedicatedLineId.
         */
        public Builder dedicatedLineId(String dedicatedLineId) {
            this.putQueryParameter("DedicatedLineId", dedicatedLineId);
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }

        /**
         * DedicatedLineName.
         */
        public Builder dedicatedLineName(String dedicatedLineName) {
            this.putQueryParameter("DedicatedLineName", dedicatedLineName);
            this.dedicatedLineName = dedicatedLineName;
            return this;
        }

        /**
         * DeviceForm.
         */
        public Builder deviceForm(String deviceForm) {
            this.putQueryParameter("DeviceForm", deviceForm);
            this.deviceForm = deviceForm;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Manufacturer.
         */
        public Builder manufacturer(String manufacturer) {
            this.putQueryParameter("Manufacturer", manufacturer);
            this.manufacturer = manufacturer;
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
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.putQueryParameter("MonitorItemId", monitorItemId);
            this.monitorItemId = monitorItemId;
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
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * PortCollectionId.
         */
        public Builder portCollectionId(String portCollectionId) {
            this.putQueryParameter("PortCollectionId", portCollectionId);
            this.portCollectionId = portCollectionId;
            return this;
        }

        /**
         * PortCollectionName.
         */
        public Builder portCollectionName(String portCollectionName) {
            this.putQueryParameter("PortCollectionName", portCollectionName);
            this.portCollectionName = portCollectionName;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.putQueryParameter("SecurityDomain", securityDomain);
            this.securityDomain = securityDomain;
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
         * Space.
         */
        public Builder space(String space) {
            this.putQueryParameter("Space", space);
            this.space = space;
            return this;
        }

        /**
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UniqueKey.
         */
        public Builder uniqueKey(String uniqueKey) {
            this.putQueryParameter("UniqueKey", uniqueKey);
            this.uniqueKey = uniqueKey;
            return this;
        }

        @Override
        public ListAlarmStatusRequest build() {
            return new ListAlarmStatusRequest(this);
        } 

    } 

}
