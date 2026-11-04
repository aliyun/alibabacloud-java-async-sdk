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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADE68CEE-8E4F-4D0B-9EE9-2C2FFAABF41F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmartAccessGateways.
         */
        public Builder smartAccessGateways(SmartAccessGateways smartAccessGateways) {
            this.smartAccessGateways = smartAccessGateways;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CommodityType.
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RelateInstanceId.
             */
            public Builder relateInstanceId(String relateInstanceId) {
                this.relateInstanceId = relateInstanceId;
                return this;
            }

            /**
             * RelateInstanceRegionId.
             */
            public Builder relateInstanceRegionId(String relateInstanceRegionId) {
                this.relateInstanceRegionId = relateInstanceRegionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
             * AccelerateBandwidth.
             */
            public Builder accelerateBandwidth(Long accelerateBandwidth) {
                this.accelerateBandwidth = accelerateBandwidth;
                return this;
            }

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AclIds.
             */
            public Builder aclIds(String aclIds) {
                this.aclIds = aclIds;
                return this;
            }

            /**
             * ApplicationBandwidthPackageId.
             */
            public Builder applicationBandwidthPackageId(String applicationBandwidthPackageId) {
                this.applicationBandwidthPackageId = applicationBandwidthPackageId;
                return this;
            }

            /**
             * AssociatedCcnId.
             */
            public Builder associatedCcnId(String associatedCcnId) {
                this.associatedCcnId = associatedCcnId;
                return this;
            }

            /**
             * AssociatedCcnName.
             */
            public Builder associatedCcnName(String associatedCcnName) {
                this.associatedCcnName = associatedCcnName;
                return this;
            }

            /**
             * BackupSoftwareVersion.
             */
            public Builder backupSoftwareVersion(String backupSoftwareVersion) {
                this.backupSoftwareVersion = backupSoftwareVersion;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataPlan.
             */
            public Builder dataPlan(Long dataPlan) {
                this.dataPlan = dataPlan;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DpiMonitorStatus.
             */
            public Builder dpiMonitorStatus(String dpiMonitorStatus) {
                this.dpiMonitorStatus = dpiMonitorStatus;
                return this;
            }

            /**
             * DpiStatus.
             */
            public Builder dpiStatus(String dpiStatus) {
                this.dpiStatus = dpiStatus;
                return this;
            }

            /**
             * EnableAdvancedMonitor.
             */
            public Builder enableAdvancedMonitor(Boolean enableAdvancedMonitor) {
                this.enableAdvancedMonitor = enableAdvancedMonitor;
                return this;
            }

            /**
             * EnableSoftwareConnectionAudit.
             */
            public Builder enableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
                this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EnterpriseCode.
             */
            public Builder enterpriseCode(String enterpriseCode) {
                this.enterpriseCode = enterpriseCode;
                return this;
            }

            /**
             * HardwareVersion.
             */
            public Builder hardwareVersion(String hardwareVersion) {
                this.hardwareVersion = hardwareVersion;
                return this;
            }

            /**
             * IRIds.
             */
            public Builder IRIds(String IRIds) {
                this.IRIds = IRIds;
                return this;
            }

            /**
             * IdaasApplicationId.
             */
            public Builder idaasApplicationId(String idaasApplicationId) {
                this.idaasApplicationId = idaasApplicationId;
                return this;
            }

            /**
             * IdaasId.
             */
            public Builder idaasId(String idaasId) {
                this.idaasId = idaasId;
                return this;
            }

            /**
             * IpsecStatus.
             */
            public Builder ipsecStatus(String ipsecStatus) {
                this.ipsecStatus = ipsecStatus;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Links.
             */
            public Builder links(Links links) {
                this.links = links;
                return this;
            }

            /**
             * MaxBandwidth.
             */
            public Builder maxBandwidth(String maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * QosIds.
             */
            public Builder qosIds(String qosIds) {
                this.qosIds = qosIds;
                return this;
            }

            /**
             * ResellerInstanceId.
             */
            public Builder resellerInstanceId(String resellerInstanceId) {
                this.resellerInstanceId = resellerInstanceId;
                return this;
            }

            /**
             * ResellerUid.
             */
            public Builder resellerUid(String resellerUid) {
                this.resellerUid = resellerUid;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RoutingStrategy.
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * SecurityLockThreshold.
             */
            public Builder securityLockThreshold(Integer securityLockThreshold) {
                this.securityLockThreshold = securityLockThreshold;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SmartAGId.
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * SmartAGUid.
             */
            public Builder smartAGUid(Long smartAGUid) {
                this.smartAGUid = smartAGUid;
                return this;
            }

            /**
             * SoftwareVersion.
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpBandwidth4G.
             */
            public Builder upBandwidth4G(Integer upBandwidth4G) {
                this.upBandwidth4G = upBandwidth4G;
                return this;
            }

            /**
             * UpBandwidthWan.
             */
            public Builder upBandwidthWan(Integer upBandwidthWan) {
                this.upBandwidthWan = upBandwidthWan;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * VpnStatus.
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
