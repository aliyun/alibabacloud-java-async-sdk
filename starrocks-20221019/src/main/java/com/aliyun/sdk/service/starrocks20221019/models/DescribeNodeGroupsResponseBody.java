// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeNodeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeGroupsResponseBody</p>
 */
public class DescribeNodeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeNodeGroupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static DescribeNodeGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeNodeGroupsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public DescribeNodeGroupsResponseBody build() {
            return new DescribeNodeGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupsResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodeInfo(Builder builder) {
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String nodeId; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.nodeId = model.nodeId;
            } 

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNodeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
        private String billingInstanceId;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("DefaultGroup")
        private Boolean defaultGroup;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("ElasticNodeNumber")
        private Integer elasticNodeNumber;

        @com.aliyun.core.annotation.NameInMap("EnablePublicNetwork")
        private Boolean enablePublicNetwork;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private Integer httpPort;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LocalStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("MemoryCpuRatio")
        private Integer memoryCpuRatio;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<NodeInfo> nodeInfo;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PublicAddress")
        private String publicAddress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResidentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("RunningTime")
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StoragePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        @com.aliyun.core.annotation.NameInMap("TargetElasticNodeNumber")
        private Integer targetElasticNodeNumber;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.accountStatus = builder.accountStatus;
            this.architecture = builder.architecture;
            this.beginTime = builder.beginTime;
            this.billingInstanceId = builder.billingInstanceId;
            this.commodityCode = builder.commodityCode;
            this.componentType = builder.componentType;
            this.cu = builder.cu;
            this.defaultGroup = builder.defaultGroup;
            this.description = builder.description;
            this.diskNumber = builder.diskNumber;
            this.elasticNodeNumber = builder.elasticNodeNumber;
            this.enablePublicNetwork = builder.enablePublicNetwork;
            this.endpoint = builder.endpoint;
            this.expireTime = builder.expireTime;
            this.httpPort = builder.httpPort;
            this.instanceId = builder.instanceId;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.memoryCpuRatio = builder.memoryCpuRatio;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodeInfo = builder.nodeInfo;
            this.payType = builder.payType;
            this.publicAddress = builder.publicAddress;
            this.regionId = builder.regionId;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.runningTime = builder.runningTime;
            this.specType = builder.specType;
            this.status = builder.status;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
            this.targetElasticNodeNumber = builder.targetElasticNodeNumber;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return billingInstanceId
         */
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return defaultGroup
         */
        public Boolean getDefaultGroup() {
            return this.defaultGroup;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return elasticNodeNumber
         */
        public Integer getElasticNodeNumber() {
            return this.elasticNodeNumber;
        }

        /**
         * @return enablePublicNetwork
         */
        public Boolean getEnablePublicNetwork() {
            return this.enablePublicNetwork;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return httpPort
         */
        public Integer getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return memoryCpuRatio
         */
        public Integer getMemoryCpuRatio() {
            return this.memoryCpuRatio;
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
         * @return nodeInfo
         */
        public java.util.List<NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return publicAddress
         */
        public String getPublicAddress() {
            return this.publicAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return targetElasticNodeNumber
         */
        public Integer getTargetElasticNodeNumber() {
            return this.targetElasticNodeNumber;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountStatus; 
            private String architecture; 
            private Long beginTime; 
            private String billingInstanceId; 
            private String commodityCode; 
            private String componentType; 
            private Integer cu; 
            private Boolean defaultGroup; 
            private String description; 
            private Integer diskNumber; 
            private Integer elasticNodeNumber; 
            private Boolean enablePublicNetwork; 
            private String endpoint; 
            private Long expireTime; 
            private Integer httpPort; 
            private String instanceId; 
            private String localStorageInstanceType; 
            private Integer memoryCpuRatio; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private java.util.List<NodeInfo> nodeInfo; 
            private String payType; 
            private String publicAddress; 
            private String regionId; 
            private Integer residentNodeNumber; 
            private Long runningTime; 
            private String specType; 
            private String status; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 
            private Integer targetElasticNodeNumber; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountStatus = model.accountStatus;
                this.architecture = model.architecture;
                this.beginTime = model.beginTime;
                this.billingInstanceId = model.billingInstanceId;
                this.commodityCode = model.commodityCode;
                this.componentType = model.componentType;
                this.cu = model.cu;
                this.defaultGroup = model.defaultGroup;
                this.description = model.description;
                this.diskNumber = model.diskNumber;
                this.elasticNodeNumber = model.elasticNodeNumber;
                this.enablePublicNetwork = model.enablePublicNetwork;
                this.endpoint = model.endpoint;
                this.expireTime = model.expireTime;
                this.httpPort = model.httpPort;
                this.instanceId = model.instanceId;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.memoryCpuRatio = model.memoryCpuRatio;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeGroupName = model.nodeGroupName;
                this.nodeInfo = model.nodeInfo;
                this.payType = model.payType;
                this.publicAddress = model.publicAddress;
                this.regionId = model.regionId;
                this.residentNodeNumber = model.residentNodeNumber;
                this.runningTime = model.runningTime;
                this.specType = model.specType;
                this.status = model.status;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
                this.targetElasticNodeNumber = model.targetElasticNodeNumber;
                this.zoneId = model.zoneId;
            } 

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * BillingInstanceId.
             */
            public Builder billingInstanceId(String billingInstanceId) {
                this.billingInstanceId = billingInstanceId;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * DefaultGroup.
             */
            public Builder defaultGroup(Boolean defaultGroup) {
                this.defaultGroup = defaultGroup;
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
             * DiskNumber.
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * ElasticNodeNumber.
             */
            public Builder elasticNodeNumber(Integer elasticNodeNumber) {
                this.elasticNodeNumber = elasticNodeNumber;
                return this;
            }

            /**
             * EnablePublicNetwork.
             */
            public Builder enablePublicNetwork(Boolean enablePublicNetwork) {
                this.enablePublicNetwork = enablePublicNetwork;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
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
             * HttpPort.
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
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
             * LocalStorageInstanceType.
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * MemoryCpuRatio.
             */
            public Builder memoryCpuRatio(Integer memoryCpuRatio) {
                this.memoryCpuRatio = memoryCpuRatio;
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
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * PublicAddress.
             */
            public Builder publicAddress(String publicAddress) {
                this.publicAddress = publicAddress;
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
             * ResidentNodeNumber.
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
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
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
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
             * StoragePerformanceLevel.
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * TargetElasticNodeNumber.
             */
            public Builder targetElasticNodeNumber(Integer targetElasticNodeNumber) {
                this.targetElasticNodeNumber = targetElasticNodeNumber;
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
