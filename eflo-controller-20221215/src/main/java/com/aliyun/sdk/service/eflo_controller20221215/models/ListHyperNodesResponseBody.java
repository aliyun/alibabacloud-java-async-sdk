// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListHyperNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHyperNodesResponseBody</p>
 */
public class ListHyperNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HyperNodes")
    private java.util.List<HyperNodes> hyperNodes;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHyperNodesResponseBody(Builder builder) {
        this.hyperNodes = builder.hyperNodes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHyperNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hyperNodes
     */
    public java.util.List<HyperNodes> getHyperNodes() {
        return this.hyperNodes;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<HyperNodes> hyperNodes; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListHyperNodesResponseBody model) {
            this.hyperNodes = model.hyperNodes;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of nodes.</p>
         */
        public Builder hyperNodes(java.util.List<HyperNodes> hyperNodes) {
            this.hyperNodes = hyperNodes;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Maximum value: 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If this parameter is not specified or is set to a value less than 20, the default value is 20.</p>
         * </li>
         * <li><p>If this parameter is set to a value greater than 100, the default value is 100.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The NextToken for the next page. Include this value when requesting the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>7ed93fda-5e7f-436a-ae5a-bd8e6b04e36b</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E64F9128-E2FC-5998-B769-199B0CB18138</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHyperNodesResponseBody build() {
            return new ListHyperNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHyperNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHyperNodesResponseBody</p>
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
             * <p>The tag key of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>alarm_xdc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>97</p>
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
     * {@link ListHyperNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHyperNodesResponseBody</p>
     */
    public static class HyperNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        @com.aliyun.core.annotation.NameInMap("HyperNodeId")
        private String hyperNodeId;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("OperatingState")
        private String operatingState;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        @Deprecated
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private HyperNodes(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.hostname = builder.hostname;
            this.hpnZone = builder.hpnZone;
            this.hyperNodeId = builder.hyperNodeId;
            this.machineType = builder.machineType;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.operatingState = builder.operatingState;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperNodes create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
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
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return hyperNodeId
         */
        public String getHyperNodeId() {
            return this.hyperNodeId;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
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
         * @return operatingState
         */
        public String getOperatingState() {
            return this.operatingState;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String commodityCode; 
            private String createTime; 
            private String expireTime; 
            private String hostname; 
            private String hpnZone; 
            private String hyperNodeId; 
            private String machineType; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String operatingState; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String taskId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(HyperNodes model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.commodityCode = model.commodityCode;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.hostname = model.hostname;
                this.hpnZone = model.hpnZone;
                this.hyperNodeId = model.hyperNodeId;
                this.machineType = model.machineType;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeGroupName = model.nodeGroupName;
                this.operatingState = model.operatingState;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i115226661755786900341</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-ack</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>bccluster_eflocomputing_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The creation time. The time is in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-09T10:41:56.577</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time. The time is in ISO 8601 format. The Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-28T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>alywlcb-lingjun-gpu-0025</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The cluster number.</p>
             * 
             * <strong>example:</strong>
             * <p>A1</p>
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-2r42tmj4z02</p>
             */
            public Builder hyperNodeId(String hyperNodeId) {
                this.hyperNodeId = hyperNodeId;
                return this;
            }

            /**
             * <p>The machine type.</p>
             * 
             * <strong>example:</strong>
             * <p>efg2.GN9C.cn8</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i121135081698451727812</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The node group.</p>
             * 
             * <strong>example:</strong>
             * <p>l20c-0801</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>The hyper node status.</p>
             * 
             * <strong>example:</strong>
             * <p>Using</p>
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmwfm33rlt6zi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The node status.</p>
             * 
             * <strong>example:</strong>
             * <p>Extending</p>
             */
            public Builder status(String status) {
                this.status = status;
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
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i153333771756952392398</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public HyperNodes build() {
                return new HyperNodes(this);
            } 

        } 

    }
}
