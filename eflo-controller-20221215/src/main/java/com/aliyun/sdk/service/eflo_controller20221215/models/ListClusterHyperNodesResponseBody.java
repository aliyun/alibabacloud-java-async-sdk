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
 * {@link ListClusterHyperNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHyperNodesResponseBody</p>
 */
public class ListClusterHyperNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HyperNodes")
    private java.util.List<HyperNodes> hyperNodes;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterHyperNodesResponseBody(Builder builder) {
        this.hyperNodes = builder.hyperNodes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHyperNodesResponseBody create() {
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
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClusterHyperNodesResponseBody model) {
            this.hyperNodes = model.hyperNodes;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The node list.</p>
         */
        public Builder hyperNodes(java.util.List<HyperNodes> hyperNodes) {
            this.hyperNodes = hyperNodes;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>563d42ae0b17572449ec8c97f7f66069</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterHyperNodesResponseBody build() {
            return new ListClusterHyperNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterHyperNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterHyperNodesResponseBody</p>
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
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ali-zeekr-ota-doris-prod-hz-selectdb</p>
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
     * {@link ListClusterHyperNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterHyperNodesResponseBody</p>
     */
    public static class HyperNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemMountEnabled")
        private Boolean fileSystemMountEnabled;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        @Deprecated
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private HyperNodes(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.fileSystemMountEnabled = builder.fileSystemMountEnabled;
            this.hostname = builder.hostname;
            this.hpnZone = builder.hpnZone;
            this.hyperNodeId = builder.hyperNodeId;
            this.machineType = builder.machineType;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.operatingState = builder.operatingState;
            this.status = builder.status;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperNodes create() {
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
         * @return fileSystemMountEnabled
         */
        public Boolean getFileSystemMountEnabled() {
            return this.fileSystemMountEnabled;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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

        public static final class Builder {
            private String commodityCode; 
            private String createTime; 
            private String expireTime; 
            private Boolean fileSystemMountEnabled; 
            private String hostname; 
            private String hpnZone; 
            private String hyperNodeId; 
            private String machineType; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String operatingState; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String taskId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(HyperNodes model) {
                this.commodityCode = model.commodityCode;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.fileSystemMountEnabled = model.fileSystemMountEnabled;
                this.hostname = model.hostname;
                this.hpnZone = model.hpnZone;
                this.hyperNodeId = model.hyperNodeId;
                this.machineType = model.machineType;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeGroupName = model.nodeGroupName;
                this.operatingState = model.operatingState;
                this.status = model.status;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
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
             * <p>2025-07-07T17:38:35.391</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The machine expiration time. The time is in ISO 8601 format. The Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T02:32:48Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether file storage mounting is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder fileSystemMountEnabled(Boolean fileSystemMountEnabled) {
                this.fileSystemMountEnabled = fileSystemMountEnabled;
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
             * <p>B1</p>
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
             * <p>efg2.NH2cn</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i123229811742436895560</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The node group name.</p>
             * 
             * <strong>example:</strong>
             * <p>g1</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>The hypernode status.</p>
             * 
             * <strong>example:</strong>
             * <p>Using</p>
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
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
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i153907661745288876128</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1u4ej4ap8c4yiqfi87c</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jl8gs7qmx89739e210dn</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
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
