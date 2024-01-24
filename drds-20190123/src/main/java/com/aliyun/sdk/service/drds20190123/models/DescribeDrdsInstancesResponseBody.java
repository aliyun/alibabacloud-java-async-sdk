// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstancesResponseBody</p>
 */
public class DescribeDrdsInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private Instances instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private DescribeDrdsInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * The list of returned instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
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
         * The number of instances returned on each page.
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
         * The total number of instances returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsInstancesResponseBody build() {
            return new DescribeDrdsInstancesResponseBody(this);
        } 

    } 

    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        private java.util.List < String > readOnlyDBInstanceId;

        private ReadOnlyDBInstanceIds(Builder builder) {
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public java.util.List < String > getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List < String > readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    public static class Vip extends TeaModel {
        @NameInMap("IP")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("dns")
        private String dns;

        private Vip(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.dns = builder.dns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vip create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return dns
         */
        public String getDns() {
            return this.dns;
        }

        public static final class Builder {
            private String ip; 
            private String port; 
            private String type; 
            private String vpcId; 
            private String vswitchId; 
            private String dns; 

            /**
             * The virtual IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ports that are opened on the VIP.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The type of the VIP. Valid values:
             * <p>
             * 
             * *   intranet: a private IP address
             * *   internet: a public IP address
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The domain name that is mapped to the VIP.
             */
            public Builder dns(String dns) {
                this.dns = dns;
                return this;
            }

            public Vip build() {
                return new Vip(this);
            } 

        } 

    }
    public static class Vips extends TeaModel {
        @NameInMap("Vip")
        private java.util.List < Vip> vip;

        private Vips(Builder builder) {
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vips create() {
            return builder().build();
        }

        /**
         * @return vip
         */
        public java.util.List < Vip> getVip() {
            return this.vip;
        }

        public static final class Builder {
            private java.util.List < Vip> vip; 

            /**
             * Vip.
             */
            public Builder vip(java.util.List < Vip> vip) {
                this.vip = vip;
                return this;
            }

            public Vips build() {
                return new Vips(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DrdsInstanceId")
        private String drdsInstanceId;

        @NameInMap("ExpireDate")
        private Long expireDate;

        @NameInMap("InstRole")
        private String instRole;

        @NameInMap("InstanceSeries")
        private String instanceSeries;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("Label")
        private String label;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @NameInMap("ProductVersion")
        private String productVersion;

        @NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private Long version;

        @NameInMap("VersionAction")
        private String versionAction;

        @NameInMap("Vips")
        private Vips vips;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("series")
        private String series;

        private Instance(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.drdsInstanceId = builder.drdsInstanceId;
            this.expireDate = builder.expireDate;
            this.instRole = builder.instRole;
            this.instanceSeries = builder.instanceSeries;
            this.instanceSpec = builder.instanceSpec;
            this.label = builder.label;
            this.machineType = builder.machineType;
            this.masterInstanceId = builder.masterInstanceId;
            this.networkType = builder.networkType;
            this.orderInstanceId = builder.orderInstanceId;
            this.productVersion = builder.productVersion;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.type = builder.type;
            this.version = builder.version;
            this.versionAction = builder.versionAction;
            this.vips = builder.vips;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return drdsInstanceId
         */
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return instRole
         */
        public String getInstRole() {
            return this.instRole;
        }

        /**
         * @return instanceSeries
         */
        public String getInstanceSeries() {
            return this.instanceSeries;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return readOnlyDBInstanceIds
         */
        public ReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return versionAction
         */
        public String getVersionAction() {
            return this.versionAction;
        }

        /**
         * @return vips
         */
        public Vips getVips() {
            return this.vips;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        public static final class Builder {
            private String commodityCode; 
            private Long createTime; 
            private String description; 
            private String drdsInstanceId; 
            private Long expireDate; 
            private String instRole; 
            private String instanceSeries; 
            private String instanceSpec; 
            private String label; 
            private String machineType; 
            private String masterInstanceId; 
            private String networkType; 
            private String orderInstanceId; 
            private String productVersion; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private String type; 
            private Long version; 
            private String versionAction; 
            private Vips vips; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 
            private String series; 

            /**
             * The commodity code of the service.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The timestamp that indicates when the instance is created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder drdsInstanceId(String drdsInstanceId) {
                this.drdsInstanceId = drdsInstanceId;
                return this;
            }

            /**
             * The timestamp that indicates when the instance expires.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The role of the instance. Valid values:
             * <p>
             * 
             * *   MASTER: The instance is a primary instance.
             * *   SLAVE: The instance is a read-only instance to analyze complex queries.
             * *   SLAVE_FLOW: The instance is a read-only instance for high-concurrency scenarios.
             */
            public Builder instRole(String instRole) {
                this.instRole = instRole;
                return this;
            }

            /**
             * The instance series.
             */
            public Builder instanceSeries(String instanceSeries) {
                this.instanceSeries = instanceSeries;
                return this;
            }

            /**
             * The specification of the instance.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * The tag of the instance. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The instance is a standard instance.
             * *   **HA**: The instance is a high-availability (HA) instance.
             * *   **VPC**: The instance is a VPC-based instance.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The machine type of the instance. Valid value: ecs.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * The ID of the primary instance.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **CLASSIC**
             * *   **VPC**
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the purchased instance.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * The version of the service.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * The IDs of read-only instances that are associated with the instance.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the instance.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the instance. Valid values:
             * <p>
             * 
             * *   **PUBLIC**: The returned instance is a shared instance.
             * *   **PRIVATE**: The returned instance is a dedicated instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version of the instance.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * Indicates whether the version of the instance can be upgraded.
             */
            public Builder versionAction(String versionAction) {
                this.versionAction = versionAction;
                return this;
            }

            /**
             * The list of returned virtual IP addresses (VIPs).
             */
            public Builder vips(Vips vips) {
                this.vips = vips;
                return this;
            }

            /**
             * The ID of the instance that is deployed in the VPC.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * The ID of the VPC to which the instance belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone in which the resource is located.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The edition of the instance. Valid values:
             * <p>
             * 
             * *   **starter**: Starter Edition
             * *   **enterprise**: Enterprise Edition
             * *   **standard**: Standard Edition
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
