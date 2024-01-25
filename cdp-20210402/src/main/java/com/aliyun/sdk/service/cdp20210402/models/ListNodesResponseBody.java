// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
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

    private ListNodesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

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

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    public static class EcsNodeDtoList extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("CpuCount")
        private Integer cpuCount;

        @NameInMap("DiskCapacity")
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MemorySize")
        private Integer memorySize;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("NodeGroupType")
        private String nodeGroupType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeResourceType")
        private String nodeResourceType;

        @NameInMap("NodeStatus")
        private String nodeStatus;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("RunningTime")
        private Long runningTime;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("SystemDiskCapacity")
        private Integer systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        private Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        private String systemDiskType;

        private EcsNodeDtoList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.cpuCount = builder.cpuCount;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.index = builder.index;
            this.instanceType = builder.instanceType;
            this.memorySize = builder.memorySize;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodeGroupType = builder.nodeGroupType;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeResourceType = builder.nodeResourceType;
            this.nodeStatus = builder.nodeStatus;
            this.privateIp = builder.privateIp;
            this.publicIp = builder.publicIp;
            this.runningTime = builder.runningTime;
            this.serialNumber = builder.serialNumber;
            this.systemDiskCapacity = builder.systemDiskCapacity;
            this.systemDiskCount = builder.systemDiskCount;
            this.systemDiskType = builder.systemDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsNodeDtoList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
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
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
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
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return nodeGroupType
         */
        public String getNodeGroupType() {
            return this.nodeGroupType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeResourceType
         */
        public String getNodeResourceType() {
            return this.nodeResourceType;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return systemDiskCapacity
         */
        public Integer getSystemDiskCapacity() {
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
            private String beginTime; 
            private Integer cpuCount; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private Long expireTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer index; 
            private String instanceType; 
            private Integer memorySize; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String nodeGroupType; 
            private String nodeId; 
            private String nodeName; 
            private String nodeResourceType; 
            private String nodeStatus; 
            private String privateIp; 
            private String publicIp; 
            private Long runningTime; 
            private String serialNumber; 
            private Integer systemDiskCapacity; 
            private Integer systemDiskCount; 
            private String systemDiskType; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

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
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * NodeGroupName.
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * NodeGroupType.
             */
            public Builder nodeGroupType(String nodeGroupType) {
                this.nodeGroupType = nodeGroupType;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeResourceType.
             */
            public Builder nodeResourceType(String nodeResourceType) {
                this.nodeResourceType = nodeResourceType;
                return this;
            }

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
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
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SystemDiskCapacity.
             */
            public Builder systemDiskCapacity(Integer systemDiskCapacity) {
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

            public EcsNodeDtoList build() {
                return new EcsNodeDtoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EcsNodeDtoList")
        private java.util.List < EcsNodeDtoList> ecsNodeDtoList;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceConf")
        private java.util.Map < String, ? > instanceConf;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.ecsNodeDtoList = builder.ecsNodeDtoList;
            this.expireTime = builder.expireTime;
            this.instanceConf = builder.instanceConf;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ecsNodeDtoList
         */
        public java.util.List < EcsNodeDtoList> getEcsNodeDtoList() {
            return this.ecsNodeDtoList;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceConf
         */
        public java.util.Map < String, ? > getInstanceConf() {
            return this.instanceConf;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List < EcsNodeDtoList> ecsNodeDtoList; 
            private Long expireTime; 
            private java.util.Map < String, ? > instanceConf; 
            private String instanceId; 
            private String instanceName; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EcsNodeDtoList.
             */
            public Builder ecsNodeDtoList(java.util.List < EcsNodeDtoList> ecsNodeDtoList) {
                this.ecsNodeDtoList = ecsNodeDtoList;
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
             * InstanceConf.
             */
            public Builder instanceConf(java.util.Map < String, ? > instanceConf) {
                this.instanceConf = instanceConf;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
