// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstancesResponseBody</p>
 */
public class DescribeDrdsInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The list of returned instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instances returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8734773E-7B21-4A22-9106-CBD245F8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsInstancesResponseBody build() {
            return new DescribeDrdsInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesResponseBody</p>
     */
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List<String> readOnlyDBInstanceId;

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
        public java.util.List<String> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List<String> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesResponseBody</p>
     */
    public static class Vip extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("dns")
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
             * <p>The virtual IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.23.<em><strong>.</strong></em></p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ports that are opened on the VIP.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of the VIP. Valid values:</p>
             * <ul>
             * <li>intranet: a private IP address</li>
             * <li>internet: a public IP address</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bpxxxxxxxxxxxy</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bpxxxxxxxxxxxxx96</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The domain name that is mapped to the VIP.</p>
             * 
             * <strong>example:</strong>
             * <p>drdssen1243as.drds.aliyuncs.com</p>
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
    /**
     * 
     * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesResponseBody</p>
     */
    public static class Vips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vip")
        private java.util.List<Vip> vip;

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
        public java.util.List<Vip> getVip() {
            return this.vip;
        }

        public static final class Builder {
            private java.util.List<Vip> vip; 

            /**
             * Vip.
             */
            public Builder vip(java.util.List<Vip> vip) {
                this.vip = vip;
                return this;
            }

            public Vips build() {
                return new Vips(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
        private String drdsInstanceId;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private Long expireDate;

        @com.aliyun.core.annotation.NameInMap("InstRole")
        private String instRole;

        @com.aliyun.core.annotation.NameInMap("InstanceSeries")
        private String instanceSeries;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("VersionAction")
        private String versionAction;

        @com.aliyun.core.annotation.NameInMap("Vips")
        private Vips vips;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("series")
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
             * <p>The commodity code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>drdsPost</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1568620311000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drdssen12****</p>
             */
            public Builder drdsInstanceId(String drdsInstanceId) {
                this.drdsInstanceId = drdsInstanceId;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>4724323200000</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The role of the instance. Valid values:</p>
             * <ul>
             * <li>MASTER: The instance is a primary instance.</li>
             * <li>SLAVE: The instance is a read-only instance to analyze complex queries.</li>
             * <li>SLAVE_FLOW: The instance is a read-only instance for high-concurrency scenarios.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MASTER</p>
             */
            public Builder instRole(String instRole) {
                this.instRole = instRole;
                return this;
            }

            /**
             * <p>The instance series.</p>
             * 
             * <strong>example:</strong>
             * <p>drds.sn2.4c16g</p>
             */
            public Builder instanceSeries(String instanceSeries) {
                this.instanceSeries = instanceSeries;
                return this;
            }

            /**
             * <p>The specification of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drds.sn2.4c16g.8C32G</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The tag of the instance. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The instance is a standard instance.</li>
             * <li><strong>HA</strong>: The instance is a high-availability (HA) instance.</li>
             * <li><strong>VPC</strong>: The instance is a VPC-based instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The machine type of the instance. Valid value: ecs.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>The ID of the primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drdssen12****</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLASSIC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The ID of the purchased instance.</p>
             * 
             * <strong>example:</strong>
             * <p>drdssen12****</p>
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * <p>The IDs of read-only instances that are associated with the instance.</p>
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2ljh3ye4****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RUN</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong>: The returned instance is a shared instance.</li>
             * <li><strong>PRIVATE</strong>: The returned instance is a dedicated instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Indicates whether the version of the instance can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>Upgradable</p>
             */
            public Builder versionAction(String versionAction) {
                this.versionAction = versionAction;
                return this;
            }

            /**
             * <p>The list of returned virtual IP addresses (VIPs).</p>
             */
            public Builder vips(Vips vips) {
                this.vips = vips;
                return this;
            }

            /**
             * <p>The ID of the instance that is deployed in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>drdssen12****</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp**********</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource is located.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bpxxxxxxxxxxxxx96</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>starter</strong>: Starter Edition</li>
             * <li><strong>enterprise</strong>: Enterprise Edition</li>
             * <li><strong>standard</strong>: Standard Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enterprise</p>
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
    /**
     * 
     * {@link DescribeDrdsInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
