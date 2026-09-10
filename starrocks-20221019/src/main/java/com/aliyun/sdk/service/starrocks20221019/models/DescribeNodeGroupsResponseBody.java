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
         * <p>The details of the permission verification failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F285E0EC-E928-5E0B-B2C3-7F3FE42F2BE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-e1733d44-0</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.tags = builder.tags;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 
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
                this.tags = model.tags;
                this.targetElasticNodeNumber = model.targetElasticNodeNumber;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The account status. Valid values:</p>
             * <ul>
             * <li>NORMAL: The account is in a normal state.</li>
             * <li>OVERDUE: The account has an overdue payment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OVERDUE</p>
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * <p>The compute group architecture. Valid values:</p>
             * <ul>
             * <li>onEci: Deployed on ECI.</li>
             * <li>onECS: Deployed on ECS.</li>
             * <li>onBareMetal: Deployed on a bare metal resource pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>onEci</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The creation time of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The instance ID associated with the bill. For default compute groups (FE compute group and the default BE compute group), this value is the instance ID. Otherwise, it is the compute group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-96f3bc7f04b2****</p>
             */
            public Builder billingInstanceId(String billingInstanceId) {
                this.billingInstanceId = billingInstanceId;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>emapreduce_starrockspost_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The compute group type. Valid values:</p>
             * <ul>
             * <li>FE</li>
             * <li>BE</li>
             * <li>CN</li>
             * <li>OBSERVER</li>
             * <li>AGENT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FE</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory. When SpecType is memory-enhanced instance family, 1 CU = 1 CPU core + 8 GiB memory.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>Indicates whether this is the default compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultGroup(Boolean defaultGroup) {
                this.defaultGroup = defaultGroup;
                return this;
            }

            /**
             * <p>The compute group description.</p>
             * 
             * <strong>example:</strong>
             * <p>ETL compute group</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of disks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * <p>The number of elastic nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder elasticNodeNumber(Integer elasticNodeNumber) {
                this.elasticNodeNumber = elasticNodeNumber;
                return this;
            }

            /**
             * <p>Indicates whether public network access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePublicNetwork(Boolean enablePublicNetwork) {
                this.enablePublicNetwork = enablePublicNetwork;
                return this;
            }

            /**
             * <p>The compute group endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>be-c-79b0bb9f58ef****-internal.starrocks.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The expiration time of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>1742179008000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The HTTP port of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>8030</p>
             */
            public Builder httpPort(Integer httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-96f3bc7f04b2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The local SSD instance type of the node group. This value is meaningful only when the deployment is based on ECS instances and SpecType is local SSD or large-scale storage.</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd_4_4xlarge</p>
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * <p>The ratio of memory size to the number of CUs. The value is 8 when SpecType is memory-enhanced instance family, and 4 for other specification types.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memoryCpuRatio(Integer memoryCpuRatio) {
                this.memoryCpuRatio = memoryCpuRatio;
                return this;
            }

            /**
             * <p>The compute group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-5e2ba600fee3****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The compute group name.</p>
             * 
             * <strong>example:</strong>
             * <p>ng_1</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>The information about nodes in the compute group.</p>
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            /**
             * <p>The billing type:</p>
             * <ol>
             * <li>Subscription (prePaid).</li>
             * <li>Pay-as-you-go (postPaid).</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>prePaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The public network address. This field has a value only when EnablePublicNetwork is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>fe-c-79b0bb9f58ef****.starrocks.aliyuncs.com</p>
             */
            public Builder publicAddress(String publicAddress) {
                this.publicAddress = publicAddress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * <p>The running time of the compute group. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>The compute group specification type. Valid values:</p>
             * <ul>
             * <li>standard: Standard.</li>
             * <li>localSSD: Local SSD.</li>
             * <li>bigData: Large-scale storage.</li>
             * <li>ramEnhanced: Memory-enhanced instance family.</li>
             * <li>networkEnhanced: Network-enhanced.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The compute group status. Valid values:</p>
             * <ul>
             * <li>UNPAID: Unpaid.</li>
             * <li>PAID: Paid.</li>
             * <li>CREATING_FAILED: Creation failed.</li>
             * <li>CREATING: Being created.</li>
             * <li>RUNNING: Running.</li>
             * <li>MODIFYING_CONFIG: Configuration being modified.</li>
             * <li>MODIFYING_TIMEZONE: Time zone being modified.</li>
             * <li>ELASTIC_SCALING_OUT: Elastic scale-out in progress.</li>
             * <li>ELASTIC_SCALING_IN: Elastic scale-in in progress.</li>
             * <li>SCALING_OUT: Scale-out in progress.</li>
             * <li>RESTARTING: Restarting.</li>
             * <li>SCALING_IN: Scale-in in progress.</li>
             * <li>SCALING_UP: Scaling up.</li>
             * <li>SCALING_DOWN: Scaling down.</li>
             * <li>UPGRADING: Upgrading.</li>
             * <li>ENABLE_PUBLIC_NETWORK: Enabling public network access.</li>
             * <li>DISABLE_PUBLIC_NETWORK: Disabling public network access.</li>
             * <li>SWITCH_AZ: Switching zone.</li>
             * <li>DISABLE: Disabled.</li>
             * <li>DELETING: Being deleted.</li>
             * <li>DELETED: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk. Valid values:</p>
             * <ul>
             * <li>pl0: Maximum random read/write IOPS of 10,000 per disk.</li>
             * <li>pl1: Maximum random read/write IOPS of 50,000 per disk.</li>
             * <li>pl2: Maximum random read/write IOPS of 100,000 per disk.</li>
             * <li>pl3: Maximum random read/write IOPS of 1,000,000 per disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pl1</p>
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * <p>The storage size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The target number of elastic nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder targetElasticNodeNumber(Integer targetElasticNodeNumber) {
                this.targetElasticNodeNumber = targetElasticNodeNumber;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
