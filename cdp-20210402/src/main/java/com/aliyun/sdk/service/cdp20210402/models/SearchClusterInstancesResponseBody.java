// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchClusterInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchClusterInstancesResponseBody</p>
 */
public class SearchClusterInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private SearchClusterInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchClusterInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public SearchClusterInstancesResponseBody build() {
            return new SearchClusterInstancesResponseBody(this);
        } 

    } 

    public static class ClusterInstanceInfo extends TeaModel {
        @NameInMap("ControlCenterLoginName")
        private String controlCenterLoginName;

        @NameInMap("ControlCenterUrl")
        private String controlCenterUrl;

        @NameInMap("SgId")
        private String sgId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswId")
        private String vswId;

        private ClusterInstanceInfo(Builder builder) {
            this.controlCenterLoginName = builder.controlCenterLoginName;
            this.controlCenterUrl = builder.controlCenterUrl;
            this.sgId = builder.sgId;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInstanceInfo create() {
            return builder().build();
        }

        /**
         * @return controlCenterLoginName
         */
        public String getControlCenterLoginName() {
            return this.controlCenterLoginName;
        }

        /**
         * @return controlCenterUrl
         */
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private String controlCenterLoginName; 
            private String controlCenterUrl; 
            private String sgId; 
            private String vpcId; 
            private String vswId; 

            /**
             * ControlCenterLoginName.
             */
            public Builder controlCenterLoginName(String controlCenterLoginName) {
                this.controlCenterLoginName = controlCenterLoginName;
                return this;
            }

            /**
             * ControlCenterUrl.
             */
            public Builder controlCenterUrl(String controlCenterUrl) {
                this.controlCenterUrl = controlCenterUrl;
                return this;
            }

            /**
             * SgId.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswId.
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            public ClusterInstanceInfo build() {
                return new ClusterInstanceInfo(this);
            } 

        } 

    }
    public static class EcsGroupList extends TeaModel {
        @NameInMap("CpuCount")
        private Integer cpuCount;

        @NameInMap("DiskCapacity")
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostGroupType")
        private String hostGroupType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MemorySize")
        private Integer memorySize;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("SystemDiskCapacity")
        private String systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        private Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        private String systemDiskType;

        private EcsGroupList(Builder builder) {
            this.cpuCount = builder.cpuCount;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupType = builder.hostGroupType;
            this.instanceType = builder.instanceType;
            this.memorySize = builder.memorySize;
            this.nodeCount = builder.nodeCount;
            this.systemDiskCapacity = builder.systemDiskCapacity;
            this.systemDiskCount = builder.systemDiskCount;
            this.systemDiskType = builder.systemDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsGroupList create() {
            return builder().build();
        }

        /**
         * @return cpuCount
         */
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return diskCapacity
         */
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return systemDiskCapacity
         */
        public String getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        /**
         * @return systemDiskCount
         */
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        /**
         * @return systemDiskType
         */
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

        public static final class Builder {
            private Integer cpuCount; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String instanceType; 
            private Integer memorySize; 
            private Integer nodeCount; 
            private String systemDiskCapacity; 
            private Integer systemDiskCount; 
            private String systemDiskType; 

            /**
             * CpuCount.
             */
            public Builder cpuCount(Integer cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * DiskCapacity.
             */
            public Builder diskCapacity(Integer diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * DiskCount.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * SystemDiskCapacity.
             */
            public Builder systemDiskCapacity(String systemDiskCapacity) {
                this.systemDiskCapacity = systemDiskCapacity;
                return this;
            }

            /**
             * SystemDiskCount.
             */
            public Builder systemDiskCount(Integer systemDiskCount) {
                this.systemDiskCount = systemDiskCount;
                return this;
            }

            /**
             * SystemDiskType.
             */
            public Builder systemDiskType(String systemDiskType) {
                this.systemDiskType = systemDiskType;
                return this;
            }

            public EcsGroupList build() {
                return new EcsGroupList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterInstanceInfo")
        private ClusterInstanceInfo clusterInstanceInfo;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterStatus")
        private String clusterStatus;

        @NameInMap("ClusterStatusValue")
        private Integer clusterStatusValue;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ControlCenterUrl")
        private String controlCenterUrl;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EcsGroupList")
        private java.util.List < EcsGroupList> ecsGroupList;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("FailReason")
        private String failReason;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("InstanceConf")
        private java.util.Map < String, ? > instanceConf;

        @NameInMap("NoticeConfirmed")
        private Boolean noticeConfirmed;

        @NameInMap("OrderBizId")
        private String orderBizId;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningTime")
        private Long runningTime;

        @NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.beginTime = builder.beginTime;
            this.clusterBizId = builder.clusterBizId;
            this.clusterId = builder.clusterId;
            this.clusterInstanceInfo = builder.clusterInstanceInfo;
            this.clusterName = builder.clusterName;
            this.clusterStatus = builder.clusterStatus;
            this.clusterStatusValue = builder.clusterStatusValue;
            this.clusterType = builder.clusterType;
            this.controlCenterUrl = builder.controlCenterUrl;
            this.duration = builder.duration;
            this.ecsGroupList = builder.ecsGroupList;
            this.expireTime = builder.expireTime;
            this.failReason = builder.failReason;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceConf = builder.instanceConf;
            this.noticeConfirmed = builder.noticeConfirmed;
            this.orderBizId = builder.orderBizId;
            this.packageType = builder.packageType;
            this.pricingCycle = builder.pricingCycle;
            this.regionId = builder.regionId;
            this.runningTime = builder.runningTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterInstanceInfo
         */
        public ClusterInstanceInfo getClusterInstanceInfo() {
            return this.clusterInstanceInfo;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return clusterStatusValue
         */
        public Integer getClusterStatusValue() {
            return this.clusterStatusValue;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return controlCenterUrl
         */
        public String getControlCenterUrl() {
            return this.controlCenterUrl;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return ecsGroupList
         */
        public java.util.List < EcsGroupList> getEcsGroupList() {
            return this.ecsGroupList;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceConf
         */
        public java.util.Map < String, ? > getInstanceConf() {
            return this.instanceConf;
        }

        /**
         * @return noticeConfirmed
         */
        public Boolean getNoticeConfirmed() {
            return this.noticeConfirmed;
        }

        /**
         * @return orderBizId
         */
        public String getOrderBizId() {
            return this.orderBizId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long beginTime; 
            private String clusterBizId; 
            private String clusterId; 
            private ClusterInstanceInfo clusterInstanceInfo; 
            private String clusterName; 
            private String clusterStatus; 
            private Integer clusterStatusValue; 
            private String clusterType; 
            private String controlCenterUrl; 
            private Integer duration; 
            private java.util.List < EcsGroupList> ecsGroupList; 
            private Long expireTime; 
            private String failReason; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private java.util.Map < String, ? > instanceConf; 
            private Boolean noticeConfirmed; 
            private String orderBizId; 
            private String packageType; 
            private String pricingCycle; 
            private String regionId; 
            private Long runningTime; 
            private String zoneId; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterInstanceInfo.
             */
            public Builder clusterInstanceInfo(ClusterInstanceInfo clusterInstanceInfo) {
                this.clusterInstanceInfo = clusterInstanceInfo;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * ClusterStatusValue.
             */
            public Builder clusterStatusValue(Integer clusterStatusValue) {
                this.clusterStatusValue = clusterStatusValue;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * ControlCenterUrl.
             */
            public Builder controlCenterUrl(String controlCenterUrl) {
                this.controlCenterUrl = controlCenterUrl;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EcsGroupList.
             */
            public Builder ecsGroupList(java.util.List < EcsGroupList> ecsGroupList) {
                this.ecsGroupList = ecsGroupList;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceConf.
             */
            public Builder instanceConf(java.util.Map < String, ? > instanceConf) {
                this.instanceConf = instanceConf;
                return this;
            }

            /**
             * NoticeConfirmed.
             */
            public Builder noticeConfirmed(Boolean noticeConfirmed) {
                this.noticeConfirmed = noticeConfirmed;
                return this;
            }

            /**
             * OrderBizId.
             */
            public Builder orderBizId(String orderBizId) {
                this.orderBizId = orderBizId;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RunningTime.
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
