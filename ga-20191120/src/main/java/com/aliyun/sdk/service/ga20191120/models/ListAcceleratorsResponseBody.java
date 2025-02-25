// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcceleratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAcceleratorsResponseBody</p>
 */
public class ListAcceleratorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerators")
    private java.util.List < Accelerators> accelerators;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAcceleratorsResponseBody(Builder builder) {
        this.accelerators = builder.accelerators;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAcceleratorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerators
     */
    public java.util.List < Accelerators> getAccelerators() {
        return this.accelerators;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Accelerators> accelerators; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the GA instances.
         */
        public Builder accelerators(java.util.List < Accelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAcceleratorsResponseBody build() {
            return new ListAcceleratorsResponseBody(this);
        } 

    } 

    public static class BasicBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private BasicBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bandwidthType; 
            private String instanceId; 

            /**
             * The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The bandwidth type that is provided by the basic bandwidth plan. Valid values:
             * <p>
             * 
             * *   **Basic**
             * *   **Enhanced**
             * *   **Advanced**
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * The ID of the basic bandwidth plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BasicBandwidthPackage build() {
                return new BasicBandwidthPackage(this);
            } 

        } 

    }
    public static class CrossDomainBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private CrossDomainBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossDomainBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String instanceId; 

            /**
             * The bandwidth value of the cross-border acceleration bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The ID of the cross-border acceleration bandwidth plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CrossDomainBandwidthPackage build() {
                return new CrossDomainBandwidthPackage(this);
            } 

        } 

    }
    public static class IpSetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        private IpSetConfig(Builder builder) {
            this.accessMode = builder.accessMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSetConfig create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        public static final class Builder {
            private String accessMode; 

            /**
             * The access mode of the acceleration area. Valid values:
             * <p>
             * 
             * *   **UserDefine**: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.
             * *   **Anycast**: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            public IpSetConfig build() {
                return new IpSetConfig(this);
            } 

        } 

    }
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * The name of the action that is performed on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create**
             * *   **Update**
             * *   **Delete**
             * *   **Associate**
             * *   **UserUnmanaged**
             * *   **CreateChild**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener**: listener.
             * *   **IpSet**: acceleration region.
             * *   **EndpointGroup**: endpoint group.
             * *   **ForwardingRule**: forwarding rule.
             * *   **Endpoint**: endpoint.
             * *   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener.
             * *   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener.
             * 
             * >  This parameter takes effect only if the value of **Action** is **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed. Valid values:
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.
             * *   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Accelerators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthBillingType")
        private String bandwidthBillingType;

        @com.aliyun.core.annotation.NameInMap("BasicBandwidthPackage")
        private BasicBandwidthPackage basicBandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossBorderMode")
        private String crossBorderMode;

        @com.aliyun.core.annotation.NameInMap("CrossBorderStatus")
        private Boolean crossBorderStatus;

        @com.aliyun.core.annotation.NameInMap("CrossDomainBandwidthPackage")
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("DdosId")
        private String ddosId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DnsName")
        private String dnsName;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("IpSetConfig")
        private IpSetConfig ipSetConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondDnsName")
        private String secondDnsName;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpgradableStatus")
        private String upgradableStatus;

        private Accelerators(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.bandwidth = builder.bandwidth;
            this.bandwidthBillingType = builder.bandwidthBillingType;
            this.basicBandwidthPackage = builder.basicBandwidthPackage;
            this.cenId = builder.cenId;
            this.createTime = builder.createTime;
            this.crossBorderMode = builder.crossBorderMode;
            this.crossBorderStatus = builder.crossBorderStatus;
            this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
            this.ddosId = builder.ddosId;
            this.description = builder.description;
            this.dnsName = builder.dnsName;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.ipSetConfig = builder.ipSetConfig;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondDnsName = builder.secondDnsName;
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.spec = builder.spec;
            this.state = builder.state;
            this.tags = builder.tags;
            this.type = builder.type;
            this.upgradableStatus = builder.upgradableStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accelerators create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthBillingType
         */
        public String getBandwidthBillingType() {
            return this.bandwidthBillingType;
        }

        /**
         * @return basicBandwidthPackage
         */
        public BasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crossBorderMode
         */
        public String getCrossBorderMode() {
            return this.crossBorderMode;
        }

        /**
         * @return crossBorderStatus
         */
        public Boolean getCrossBorderStatus() {
            return this.crossBorderStatus;
        }

        /**
         * @return crossDomainBandwidthPackage
         */
        public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        /**
         * @return ddosId
         */
        public String getDdosId() {
            return this.ddosId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dnsName
         */
        public String getDnsName() {
            return this.dnsName;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return ipSetConfig
         */
        public IpSetConfig getIpSetConfig() {
            return this.ipSetConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return secondDnsName
         */
        public String getSecondDnsName() {
            return this.secondDnsName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceManagedInfos
         */
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return upgradableStatus
         */
        public String getUpgradableStatus() {
            return this.upgradableStatus;
        }

        public static final class Builder {
            private String acceleratorId; 
            private Integer bandwidth; 
            private String bandwidthBillingType; 
            private BasicBandwidthPackage basicBandwidthPackage; 
            private String cenId; 
            private Long createTime; 
            private String crossBorderMode; 
            private Boolean crossBorderStatus; 
            private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
            private String ddosId; 
            private String description; 
            private String dnsName; 
            private Long expiredTime; 
            private String instanceChargeType; 
            private IpSetConfig ipSetConfig; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String secondDnsName; 
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
            private String spec; 
            private String state; 
            private java.util.List < Tags> tags; 
            private String type; 
            private String upgradableStatus; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The bandwidth of the GA instance. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The bandwidth metering method. Valid values:
             * <p>
             * 
             * *   **BandwidthPackage**: billed based on bandwidth plans.
             * *   **CDT**: billed based on data transfer.
             */
            public Builder bandwidthBillingType(String bandwidthBillingType) {
                this.bandwidthBillingType = bandwidthBillingType;
                return this;
            }

            /**
             * The information about the basic bandwidth plan that is associated with the GA instance.
             */
            public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
                this.basicBandwidthPackage = basicBandwidthPackage;
                return this;
            }

            /**
             * The ID of the Cloud Enterprise Network (CEN) instance that is associated with the GA instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The timestamp that indicates when the GA instance was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The type of cross-border acceleration. This parameter is returned for GA instances whose bandwidth metering method is pay-by-data-transfer.
             * <p>
             * 
             * *   **bpgPro**: BGP (Multi-ISP) Pro lines.
             * *   **private**: cross-border Express Connect circuit.
             */
            public Builder crossBorderMode(String crossBorderMode) {
                this.crossBorderMode = crossBorderMode;
                return this;
            }

            /**
             * Indicates whether cross-border acceleration is enabled for the GA instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder crossBorderStatus(Boolean crossBorderStatus) {
                this.crossBorderStatus = crossBorderStatus;
                return this;
            }

            /**
             * The information about the cross-border acceleration bandwidth plan that is associated with the GA instance.
             * <p>
             * 
             * This array is returned only for GA instances that are created on the international site (alibabacloud.com).
             */
            public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
                this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
                return this;
            }

            /**
             * The ID of the Anti-DDoS Pro or Anti-DDOS Premium instance that is associated with the GA instance.
             */
            public Builder ddosId(String ddosId) {
                this.ddosId = ddosId;
                return this;
            }

            /**
             * The description of the GA instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The CNAME that is assigned to the GA instance.
             */
            public Builder dnsName(String dnsName) {
                this.dnsName = dnsName;
                return this;
            }

            /**
             * The timestamp that indicates when the GA instance expires.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The billing method of the GA instance.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The configurations of the acceleration area.
             */
            public Builder ipSetConfig(IpSetConfig ipSetConfig) {
                this.ipSetConfig = ipSetConfig;
                return this;
            }

            /**
             * The name of the GA instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region where GA instance is deployed. Only **cn-hangzhou** may be returned.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The CNAME that is used to associate the GA instance with an Anti-DDoS Pro instance or an Anti-DDOS Premium instance.
             */
            public Builder secondDnsName(String secondDnsName) {
                this.secondDnsName = secondDnsName;
                return this;
            }

            /**
             * The ID of the service that manages the instance.
             * <p>
             * 
             * >  This parameter takes effect only if the value of **ServiceManaged** is **true**.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Indicates whether the GA instance is managed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The actions that users can perform on the managed instance.
             * <p>
             * > *   This parameter takes effect only if the value of **ServiceManaged** is **true**.
             * > *   Users can perform only specific actions on a managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The specification of the GA instance. Valid values:
             * <p>
             * 
             * *   **1**: Small Ⅰ.
             * *   **2**: Small Ⅱ.
             * *   **3**: Small Ⅲ.
             * *   **5**: Medium Ⅰ.
             * *   **8**: Medium Ⅱ.
             * *   **10**: Medium Ⅲ.
             * *   **20**: Large Ⅰ.
             * *   **30**: Large Ⅱ.
             * *   **40**: Large Ⅲ.
             * *   **50**: Large IV.
             * *   **60**: Large V.
             * *   **70**: Large VI.
             * *   **80**: Large VII.
             * *   **90**: Large VIII.
             * *   **100**: Super Large Ⅰ.
             * *   **200**: Super Large Ⅱ.
             * 
             * >  The Large Ⅲ specification and higher specifications are available only to accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.
             * 
             * Different specifications provide different capabilities. For more information, see [Instance specifications](~~153127~~).
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the GA instance. Valid values:
             * <p>
             * 
             * *   **init**: The GA instance is being initialized.
             * *   **active**: The GA instance is available.
             * *   **configuring**: The GA instance is being configured.
             * *   **binding**: The GA instance is being associated.
             * *   **unbinding**: The GA instance is being disassociated.
             * *   **deleting**: The GA instance is being deleted.
             * *   **finacialLocked**: The GA instance is locked due to overdue payments.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The tags that are added to the resource.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * An invalid parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Indicates whether the GA instance can be upgraded. Valid values:
             * <p>
             * 
             * *   **notUpgradable**: The GA instance does not need to be upgraded.
             * *   **upgradable**: The GA instance can be upgraded to the latest version.
             * *   **upgradeFailed**: The GA instance failed to be upgraded.
             */
            public Builder upgradableStatus(String upgradableStatus) {
                this.upgradableStatus = upgradableStatus;
                return this;
            }

            public Accelerators build() {
                return new Accelerators(this);
            } 

        } 

    }
}
