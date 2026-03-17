// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewaysResponseBody</p>
 */
public class DescribeSmartAccessGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAccessGateways")
    private SmartAccessGateways smartAccessGateways;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSmartAccessGatewaysResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smartAccessGateways = builder.smartAccessGateways;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return smartAccessGateways
     */
    public SmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SmartAccessGateways smartAccessGateways; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSmartAccessGatewaysResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.smartAccessGateways = model.smartAccessGateways;
            this.totalCount = model.totalCount;
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
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADE68CEE-8E4F-4D0B-9EE9-2C2FFAABF41F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of SAG instances.</p>
         */
        public Builder smartAccessGateways(SmartAccessGateways smartAccessGateways) {
            this.smartAccessGateways = smartAccessGateways;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSmartAccessGatewaysResponseBody build() {
            return new DescribeSmartAccessGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewaysResponseBody</p>
     */
    public static class Link extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("CommodityType")
        private String commodityType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RelateInstanceId")
        private String relateInstanceId;

        @com.aliyun.core.annotation.NameInMap("RelateInstanceRegionId")
        private String relateInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Link(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.commodityType = builder.commodityType;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.relateInstanceId = builder.relateInstanceId;
            this.relateInstanceRegionId = builder.relateInstanceRegionId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Link create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return commodityType
         */
        public String getCommodityType() {
            return this.commodityType;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return relateInstanceId
         */
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        /**
         * @return relateInstanceRegionId
         */
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
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

        public static final class Builder {
            private String bandwidth; 
            private String commodityType; 
            private Long endTime; 
            private String instanceId; 
            private String relateInstanceId; 
            private String relateInstanceRegionId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Link model) {
                this.bandwidth = model.bandwidth;
                this.commodityType = model.commodityType;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.relateInstanceId = model.relateInstanceId;
                this.relateInstanceRegionId = model.relateInstanceRegionId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The bandwidth value of the connection. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50M</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The product type. Valid values:</p>
             * <ul>
             * <li><strong>bandwidth</strong>: The SAG instance and bandwidth resources can be separately purchased.</li>
             * <li><strong>smartag</strong>: The SAG instance and bandwidth resources must be purchased as a bundle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>smartag</p>
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * <p>The timestamp when the connection expires. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1628265600000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the product instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-6z21oj0vjjrx6s****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the instance associated with the connection.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-iz26o9zye6lhoo****</p>
             */
            public Builder relateInstanceId(String relateInstanceId) {
                this.relateInstanceId = relateInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the instance with which the connection is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder relateInstanceRegionId(String relateInstanceRegionId) {
                this.relateInstanceRegionId = relateInstanceRegionId;
                return this;
            }

            /**
             * <p>The status of the network connection.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>Ordered</strong>: The order is to be shipped.</li>
             * <li><strong>Delivered</strong>: The order is shipped.</li>
             * <li><strong>Offline</strong>: The connection is disconnected.</li>
             * <li><strong>Active</strong>: The SAG device is available.</li>
             * <li><strong>Arrearage</strong>: The SAG device is locked due to overdue payments.</li>
             * </ul>
             * <p>The status of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal</li>
             * <li><strong>arrears</strong>: overdue payments</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the network connection. Valid values:</p>
             * <ul>
             * <li><strong>ccn</strong>: The on-premises network is connected to Alibaba Cloud through CCN.</li>
             * <li><strong>vbr</strong>: The on-premises network is connected to Alibaba Cloud through virtual border routers (VBRs) and Express Connect circuits.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ccn</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Link build() {
                return new Link(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewaysResponseBody</p>
     */
    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private java.util.List<Link> link;

        private Links(Builder builder) {
            this.link = builder.link;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public java.util.List<Link> getLink() {
            return this.link;
        }

        public static final class Builder {
            private java.util.List<Link> link; 

            private Builder() {
            } 

            private Builder(Links model) {
                this.link = model.link;
            } 

            /**
             * Link.
             */
            public Builder link(java.util.List<Link> link) {
                this.link = link;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewaysResponseBody</p>
     */
    public static class SmartAccessGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateBandwidth")
        private Long accelerateBandwidth;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("AclIds")
        private String aclIds;

        @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageId")
        private String applicationBandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCcnId")
        private String associatedCcnId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCcnName")
        private String associatedCcnName;

        @com.aliyun.core.annotation.NameInMap("BackupSoftwareVersion")
        private String backupSoftwareVersion;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataPlan")
        private Long dataPlan;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DpiMonitorStatus")
        private String dpiMonitorStatus;

        @com.aliyun.core.annotation.NameInMap("DpiStatus")
        private String dpiStatus;

        @com.aliyun.core.annotation.NameInMap("EnableAdvancedMonitor")
        private Boolean enableAdvancedMonitor;

        @com.aliyun.core.annotation.NameInMap("EnableSoftwareConnectionAudit")
        private Boolean enableSoftwareConnectionAudit;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseCode")
        private String enterpriseCode;

        @com.aliyun.core.annotation.NameInMap("HardwareVersion")
        private String hardwareVersion;

        @com.aliyun.core.annotation.NameInMap("IRIds")
        private String IRIds;

        @com.aliyun.core.annotation.NameInMap("IdaasApplicationId")
        private String idaasApplicationId;

        @com.aliyun.core.annotation.NameInMap("IdaasId")
        private String idaasId;

        @com.aliyun.core.annotation.NameInMap("IpsecStatus")
        private String ipsecStatus;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Links")
        private Links links;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
        private String maxBandwidth;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("QosIds")
        private String qosIds;

        @com.aliyun.core.annotation.NameInMap("ResellerInstanceId")
        private String resellerInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResellerUid")
        private String resellerUid;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
        private String routingStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityLockThreshold")
        private Integer securityLockThreshold;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SmartAGUid")
        private Long smartAGUid;

        @com.aliyun.core.annotation.NameInMap("SoftwareVersion")
        private String softwareVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpBandwidth4G")
        private Integer upBandwidth4G;

        @com.aliyun.core.annotation.NameInMap("UpBandwidthWan")
        private Integer upBandwidthWan;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        @com.aliyun.core.annotation.NameInMap("VpnStatus")
        private String vpnStatus;

        private SmartAccessGateway(Builder builder) {
            this.accelerateBandwidth = builder.accelerateBandwidth;
            this.accessPointId = builder.accessPointId;
            this.aclIds = builder.aclIds;
            this.applicationBandwidthPackageId = builder.applicationBandwidthPackageId;
            this.associatedCcnId = builder.associatedCcnId;
            this.associatedCcnName = builder.associatedCcnName;
            this.backupSoftwareVersion = builder.backupSoftwareVersion;
            this.backupStatus = builder.backupStatus;
            this.cidrBlock = builder.cidrBlock;
            this.city = builder.city;
            this.createTime = builder.createTime;
            this.dataPlan = builder.dataPlan;
            this.description = builder.description;
            this.dpiMonitorStatus = builder.dpiMonitorStatus;
            this.dpiStatus = builder.dpiStatus;
            this.enableAdvancedMonitor = builder.enableAdvancedMonitor;
            this.enableSoftwareConnectionAudit = builder.enableSoftwareConnectionAudit;
            this.endTime = builder.endTime;
            this.enterpriseCode = builder.enterpriseCode;
            this.hardwareVersion = builder.hardwareVersion;
            this.IRIds = builder.IRIds;
            this.idaasApplicationId = builder.idaasApplicationId;
            this.idaasId = builder.idaasId;
            this.ipsecStatus = builder.ipsecStatus;
            this.isp = builder.isp;
            this.links = builder.links;
            this.maxBandwidth = builder.maxBandwidth;
            this.name = builder.name;
            this.position = builder.position;
            this.qosIds = builder.qosIds;
            this.resellerInstanceId = builder.resellerInstanceId;
            this.resellerUid = builder.resellerUid;
            this.resourceGroupId = builder.resourceGroupId;
            this.routingStrategy = builder.routingStrategy;
            this.securityLockThreshold = builder.securityLockThreshold;
            this.serialNumber = builder.serialNumber;
            this.smartAGId = builder.smartAGId;
            this.smartAGUid = builder.smartAGUid;
            this.softwareVersion = builder.softwareVersion;
            this.status = builder.status;
            this.upBandwidth4G = builder.upBandwidth4G;
            this.upBandwidthWan = builder.upBandwidthWan;
            this.userCount = builder.userCount;
            this.vpnStatus = builder.vpnStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAccessGateway create() {
            return builder().build();
        }

        /**
         * @return accelerateBandwidth
         */
        public Long getAccelerateBandwidth() {
            return this.accelerateBandwidth;
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return aclIds
         */
        public String getAclIds() {
            return this.aclIds;
        }

        /**
         * @return applicationBandwidthPackageId
         */
        public String getApplicationBandwidthPackageId() {
            return this.applicationBandwidthPackageId;
        }

        /**
         * @return associatedCcnId
         */
        public String getAssociatedCcnId() {
            return this.associatedCcnId;
        }

        /**
         * @return associatedCcnName
         */
        public String getAssociatedCcnName() {
            return this.associatedCcnName;
        }

        /**
         * @return backupSoftwareVersion
         */
        public String getBackupSoftwareVersion() {
            return this.backupSoftwareVersion;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataPlan
         */
        public Long getDataPlan() {
            return this.dataPlan;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dpiMonitorStatus
         */
        public String getDpiMonitorStatus() {
            return this.dpiMonitorStatus;
        }

        /**
         * @return dpiStatus
         */
        public String getDpiStatus() {
            return this.dpiStatus;
        }

        /**
         * @return enableAdvancedMonitor
         */
        public Boolean getEnableAdvancedMonitor() {
            return this.enableAdvancedMonitor;
        }

        /**
         * @return enableSoftwareConnectionAudit
         */
        public Boolean getEnableSoftwareConnectionAudit() {
            return this.enableSoftwareConnectionAudit;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return enterpriseCode
         */
        public String getEnterpriseCode() {
            return this.enterpriseCode;
        }

        /**
         * @return hardwareVersion
         */
        public String getHardwareVersion() {
            return this.hardwareVersion;
        }

        /**
         * @return IRIds
         */
        public String getIRIds() {
            return this.IRIds;
        }

        /**
         * @return idaasApplicationId
         */
        public String getIdaasApplicationId() {
            return this.idaasApplicationId;
        }

        /**
         * @return idaasId
         */
        public String getIdaasId() {
            return this.idaasId;
        }

        /**
         * @return ipsecStatus
         */
        public String getIpsecStatus() {
            return this.ipsecStatus;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return links
         */
        public Links getLinks() {
            return this.links;
        }

        /**
         * @return maxBandwidth
         */
        public String getMaxBandwidth() {
            return this.maxBandwidth;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return qosIds
         */
        public String getQosIds() {
            return this.qosIds;
        }

        /**
         * @return resellerInstanceId
         */
        public String getResellerInstanceId() {
            return this.resellerInstanceId;
        }

        /**
         * @return resellerUid
         */
        public String getResellerUid() {
            return this.resellerUid;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        /**
         * @return securityLockThreshold
         */
        public Integer getSecurityLockThreshold() {
            return this.securityLockThreshold;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        /**
         * @return smartAGUid
         */
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

        /**
         * @return softwareVersion
         */
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return upBandwidth4G
         */
        public Integer getUpBandwidth4G() {
            return this.upBandwidth4G;
        }

        /**
         * @return upBandwidthWan
         */
        public Integer getUpBandwidthWan() {
            return this.upBandwidthWan;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        /**
         * @return vpnStatus
         */
        public String getVpnStatus() {
            return this.vpnStatus;
        }

        public static final class Builder {
            private Long accelerateBandwidth; 
            private String accessPointId; 
            private String aclIds; 
            private String applicationBandwidthPackageId; 
            private String associatedCcnId; 
            private String associatedCcnName; 
            private String backupSoftwareVersion; 
            private String backupStatus; 
            private String cidrBlock; 
            private String city; 
            private Long createTime; 
            private Long dataPlan; 
            private String description; 
            private String dpiMonitorStatus; 
            private String dpiStatus; 
            private Boolean enableAdvancedMonitor; 
            private Boolean enableSoftwareConnectionAudit; 
            private Long endTime; 
            private String enterpriseCode; 
            private String hardwareVersion; 
            private String IRIds; 
            private String idaasApplicationId; 
            private String idaasId; 
            private String ipsecStatus; 
            private String isp; 
            private Links links; 
            private String maxBandwidth; 
            private String name; 
            private String position; 
            private String qosIds; 
            private String resellerInstanceId; 
            private String resellerUid; 
            private String resourceGroupId; 
            private String routingStrategy; 
            private Integer securityLockThreshold; 
            private String serialNumber; 
            private String smartAGId; 
            private Long smartAGUid; 
            private String softwareVersion; 
            private String status; 
            private Integer upBandwidth4G; 
            private Integer upBandwidthWan; 
            private Integer userCount; 
            private String vpnStatus; 

            private Builder() {
            } 

            private Builder(SmartAccessGateway model) {
                this.accelerateBandwidth = model.accelerateBandwidth;
                this.accessPointId = model.accessPointId;
                this.aclIds = model.aclIds;
                this.applicationBandwidthPackageId = model.applicationBandwidthPackageId;
                this.associatedCcnId = model.associatedCcnId;
                this.associatedCcnName = model.associatedCcnName;
                this.backupSoftwareVersion = model.backupSoftwareVersion;
                this.backupStatus = model.backupStatus;
                this.cidrBlock = model.cidrBlock;
                this.city = model.city;
                this.createTime = model.createTime;
                this.dataPlan = model.dataPlan;
                this.description = model.description;
                this.dpiMonitorStatus = model.dpiMonitorStatus;
                this.dpiStatus = model.dpiStatus;
                this.enableAdvancedMonitor = model.enableAdvancedMonitor;
                this.enableSoftwareConnectionAudit = model.enableSoftwareConnectionAudit;
                this.endTime = model.endTime;
                this.enterpriseCode = model.enterpriseCode;
                this.hardwareVersion = model.hardwareVersion;
                this.IRIds = model.IRIds;
                this.idaasApplicationId = model.idaasApplicationId;
                this.idaasId = model.idaasId;
                this.ipsecStatus = model.ipsecStatus;
                this.isp = model.isp;
                this.links = model.links;
                this.maxBandwidth = model.maxBandwidth;
                this.name = model.name;
                this.position = model.position;
                this.qosIds = model.qosIds;
                this.resellerInstanceId = model.resellerInstanceId;
                this.resellerUid = model.resellerUid;
                this.resourceGroupId = model.resourceGroupId;
                this.routingStrategy = model.routingStrategy;
                this.securityLockThreshold = model.securityLockThreshold;
                this.serialNumber = model.serialNumber;
                this.smartAGId = model.smartAGId;
                this.smartAGUid = model.smartAGUid;
                this.softwareVersion = model.softwareVersion;
                this.status = model.status;
                this.upBandwidth4G = model.upBandwidth4G;
                this.upBandwidthWan = model.upBandwidthWan;
                this.userCount = model.userCount;
                this.vpnStatus = model.vpnStatus;
            } 

            /**
             * <p>The maximum bandwidth value for application acceleration. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder accelerateBandwidth(Long accelerateBandwidth) {
                this.accelerateBandwidth = accelerateBandwidth;
                return this;
            }

            /**
             * <p>The ID of the access point for the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>238</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The ID of the ACL with which the SAG instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-shfhfhhfbnvkdg****</p>
             */
            public Builder aclIds(String aclIds) {
                this.aclIds = aclIds;
                return this;
            }

            /**
             * <p>The ID of the bandwidth plan for application acceleration that is associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>abwp-7963l7iqnquyj3****</p>
             */
            public Builder applicationBandwidthPackageId(String applicationBandwidthPackageId) {
                this.applicationBandwidthPackageId = applicationBandwidthPackageId;
                return this;
            }

            /**
             * <p>The ID of the CCN instance with which the SAG instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-iz26o9zye6lhoo****</p>
             */
            public Builder associatedCcnId(String associatedCcnId) {
                this.associatedCcnId = associatedCcnId;
                return this;
            }

            /**
             * <p>The name of the CCN instance associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn</p>
             */
            public Builder associatedCcnName(String associatedCcnName) {
                this.associatedCcnName = associatedCcnName;
                return this;
            }

            /**
             * <p>The software version of the standby SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3.0.0</p>
             */
            public Builder backupSoftwareVersion(String backupSoftwareVersion) {
                this.backupSoftwareVersion = backupSoftwareVersion;
                return this;
            }

            /**
             * <p>The status of the SAG backup device.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The private CIDR block of the destination network with which the on-premises network or client needs to communicate.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.9.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The ID of the city where the SAG device is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The timestamp when the SAG instance was created. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1622617250000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data transfer plan of the SAG instance. Unit: GB.</p>
             * <blockquote>
             * <p> Each client account is assigned a free data transfer quota of 5 GB per month.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dataPlan(Long dataPlan) {
                this.dataPlan = dataPlan;
                return this;
            }

            /**
             * <p>The description of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>docdesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The status of the DPI-based monitoring feature. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: enabled</li>
             * <li><strong>Inactive</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inactive</p>
             */
            public Builder dpiMonitorStatus(String dpiMonitorStatus) {
                this.dpiMonitorStatus = dpiMonitorStatus;
                return this;
            }

            /**
             * <p>The status of the deep packet inspection (DPI) feature. Valid values:</p>
             * <ul>
             * <li><strong>On</strong>: enabled</li>
             * <li><strong>Off</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Off</p>
             */
            public Builder dpiStatus(String dpiStatus) {
                this.dpiStatus = dpiStatus;
                return this;
            }

            /**
             * <p>Indicates whether DPI is enabled for the SAG instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAdvancedMonitor(Boolean enableAdvancedMonitor) {
                this.enableAdvancedMonitor = enableAdvancedMonitor;
                return this;
            }

            /**
             * <p>Indicates whether auditing is enabled for the network connection logs of the SAS app instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
                this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
                return this;
            }

            /**
             * <p>The timestamp when the SAG instance expires. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1628265600000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the enterprise code associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12P****</p>
             */
            public Builder enterpriseCode(String enterpriseCode) {
                this.enterpriseCode = enterpriseCode;
                return this;
            }

            /**
             * <p>The type of the SAG instance. Valid values:</p>
             * <ul>
             * <li><strong>sag-1000</strong>: an SAG CPE instance that is associated with an SAG-1000 device.</li>
             * <li><strong>sag-100wm</strong>: an SAG CPE instance that is associated with an SAG-100WM device.</li>
             * <li><strong>sag-software</strong>: an SAG app instance.</li>
             * <li><strong>sag-vcpe</strong>: an SAG vCPE instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sag-100wm</p>
             */
            public Builder hardwareVersion(String hardwareVersion) {
                this.hardwareVersion = hardwareVersion;
                return this;
            }

            /**
             * <p>The IDs of the intelligent routing policies that are associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ir-7unf5nom01ygrg****</p>
             */
            public Builder IRIds(String IRIds) {
                this.IRIds = IRIds;
                return this;
            }

            /**
             * <p>The ID of the Identity as a Service (IDaaS) application associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-cn-hangzhou-l7j0wf0crzea****</p>
             */
            public Builder idaasApplicationId(String idaasApplicationId) {
                this.idaasApplicationId = idaasApplicationId;
                return this;
            }

            /**
             * <p>The ID of the IDaaS instance with which the SAG instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-cn-hangzhou-1ahixtl****</p>
             */
            public Builder idaasId(String idaasId) {
                this.idaasId = idaasId;
                return this;
            }

            /**
             * <p>The status of the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>up</strong>: normal</li>
             * <li><strong>down</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>up</p>
             */
            public Builder ipsecStatus(String ipsecStatus) {
                this.ipsecStatus = ipsecStatus;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>China Telecom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>A list of connections between the on-premises network and Alibaba Cloud.</p>
             */
            public Builder links(Links links) {
                this.links = links;
                return this;
            }

            /**
             * <p>The maximum bandwidth value of the SAG instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50M</p>
             */
            public Builder maxBandwidth(String maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The location information about the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;adcode\&quot;:\&quot;\&quot;,\&quot;label\&quot;:\&quot;Jimo District, Qingdao, Shandong province\&quot;,\&quot;value\&quot;:\&quot;B02140800T\&quot;,\&quot;center\&quot;:\&quot;120.989576,36.487512\&quot;,\&quot;_new\&quot;:\&quot;true\&quot;}]</p>
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * <p>The ID of the QoS policy associated with the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-djh****</p>
             */
            public Builder qosIds(String qosIds) {
                this.qosIds = qosIds;
                return this;
            }

            /**
             * <p>The ID of the SAG instance that belongs to the reseller.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-v0fkpk4akfz5****</p>
             */
            public Builder resellerInstanceId(String resellerInstanceId) {
                this.resellerInstanceId = resellerInstanceId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the third-party reseller.</p>
             * 
             * <strong>example:</strong>
             * <p>25346073170691****</p>
             */
            public Builder resellerUid(String resellerUid) {
                this.resellerUid = resellerUid;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2iu4fnc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The method that the SAG instance uses to advertise routes to Alibaba Cloud.</p>
             * <ul>
             * <li><strong>static</strong>: static routing</li>
             * <li><strong>dynamic</strong>: dynamic routing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * <p>The time threshold. If the SAG device remains offline for the specified period of time, the SAG device is locked.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder securityLockThreshold(Integer securityLockThreshold) {
                this.securityLockThreshold = securityLockThreshold;
                return this;
            }

            /**
             * <p>The serial number of the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>sage6gsdllbid****,sage6nniq3dqa****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-6z21oj0vjjrx6s****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * <p>The ID of the region where the SAG instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder smartAGUid(Long smartAGUid) {
                this.smartAGUid = smartAGUid;
                return this;
            }

            /**
             * <p>The software version of the active SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3.0.0</p>
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            /**
             * <p>The status of the SAG instance. Valid values:</p>
             * <ul>
             * <li><strong>Ordered</strong>: Your order has been placed.</li>
             * <li><strong>Delivered</strong>: Your order has been shipped.</li>
             * <li><strong>Received</strong>: You have received the SAG device.</li>
             * <li><strong>Returning</strong>: The order is being returned.</li>
             * <li><strong>Active</strong>: The SAG device is active.</li>
             * <li><strong>init</strong>: The SAG device is being initialized.</li>
             * <li><strong>Offline</strong>: The SAG device is disconnected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The maximum upstream bandwidth of 4G network connections established by the SAG device. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder upBandwidth4G(Integer upBandwidth4G) {
                this.upBandwidth4G = upBandwidth4G;
                return this;
            }

            /**
             * <p>The maximum upstream bandwidth of network connections established on the WAN port of the SAG device. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder upBandwidthWan(Integer upBandwidthWan) {
                this.upBandwidthWan = upBandwidthWan;
                return this;
            }

            /**
             * <p>The number of client accounts for the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * <p>The status of the VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>up</strong>: normal</li>
             * <li><strong>down</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>down</p>
             */
            public Builder vpnStatus(String vpnStatus) {
                this.vpnStatus = vpnStatus;
                return this;
            }

            public SmartAccessGateway build() {
                return new SmartAccessGateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewaysResponseBody</p>
     */
    public static class SmartAccessGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmartAccessGateway")
        private java.util.List<SmartAccessGateway> smartAccessGateway;

        private SmartAccessGateways(Builder builder) {
            this.smartAccessGateway = builder.smartAccessGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAccessGateways create() {
            return builder().build();
        }

        /**
         * @return smartAccessGateway
         */
        public java.util.List<SmartAccessGateway> getSmartAccessGateway() {
            return this.smartAccessGateway;
        }

        public static final class Builder {
            private java.util.List<SmartAccessGateway> smartAccessGateway; 

            private Builder() {
            } 

            private Builder(SmartAccessGateways model) {
                this.smartAccessGateway = model.smartAccessGateway;
            } 

            /**
             * SmartAccessGateway.
             */
            public Builder smartAccessGateway(java.util.List<SmartAccessGateway> smartAccessGateway) {
                this.smartAccessGateway = smartAccessGateway;
                return this;
            }

            public SmartAccessGateways build() {
                return new SmartAccessGateways(this);
            } 

        } 

    }
}
