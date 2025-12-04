// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListAINodePoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAINodePoolsResponseBody</p>
 */
public class ListAINodePoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AINodePoolInfos")
    private java.util.List<AINodePoolInfos> AINodePoolInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAINodePoolsResponseBody(Builder builder) {
        this.AINodePoolInfos = builder.AINodePoolInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAINodePoolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AINodePoolInfos
     */
    public java.util.List<AINodePoolInfos> getAINodePoolInfos() {
        return this.AINodePoolInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AINodePoolInfos> AINodePoolInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAINodePoolsResponseBody model) {
            this.AINodePoolInfos = model.AINodePoolInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the AI node resource pool.</p>
         */
        public Builder AINodePoolInfos(java.util.List<AINodePoolInfos> AINodePoolInfos) {
            this.AINodePoolInfos = AINodePoolInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAINodePoolsResponseBody build() {
            return new ListAINodePoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAINodePoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAINodePoolsResponseBody</p>
     */
    public static class AINodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindObject")
        private String bindObject;

        @com.aliyun.core.annotation.NameInMap("BindStatus")
        private String bindStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeSpec")
        private String nodeSpec;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AINodeInfos(Builder builder) {
            this.bindObject = builder.bindObject;
            this.bindStatus = builder.bindStatus;
            this.createTime = builder.createTime;
            this.namespace = builder.namespace;
            this.nodeName = builder.nodeName;
            this.nodeSpec = builder.nodeSpec;
            this.updateTime = builder.updateTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AINodeInfos create() {
            return builder().build();
        }

        /**
         * @return bindObject
         */
        public String getBindObject() {
            return this.bindObject;
        }

        /**
         * @return bindStatus
         */
        public String getBindStatus() {
            return this.bindStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeSpec
         */
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String bindObject; 
            private String bindStatus; 
            private String createTime; 
            private String namespace; 
            private String nodeName; 
            private String nodeSpec; 
            private String updateTime; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AINodeInfos model) {
                this.bindObject = model.bindObject;
                this.bindStatus = model.bindStatus;
                this.createTime = model.createTime;
                this.namespace = model.namespace;
                this.nodeName = model.nodeName;
                this.nodeSpec = model.nodeSpec;
                this.updateTime = model.updateTime;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The binding type of the AI node.</p>
             * 
             * <strong>example:</strong>
             * <p>model_serving</p>
             */
            public Builder bindObject(String bindObject) {
                this.bindObject = bindObject;
                return this;
            }

            /**
             * <p>The status of the AI node.</p>
             * <ul>
             * <li>unbound: The node is not bound.</li>
             * <li>bound: The node is bound.</li>
             * </ul>
             */
            public Builder bindStatus(String bindStatus) {
                this.bindStatus = bindStatus;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-09T02:07:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpg-ainode</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the AI node.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-xxxxxxxxx</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The AI node specifications. The list of supported specifications is shown below.</p>
             * <pre><code>ADB.AIMedium.1
             * ADB.AILarge.1
             * ADB.AIStandard.2
             * ADB.AIMedium.2
             * ADB.AILarge.2
             * ADB.AIXLarge.2
             * ADB.AIStandard.6
             * ADB.AIMedium.6
             * ADB.AILarge.6
             * ADB.AIXLarge.6
             * ADB.AIStandard.3
             * ADB.AIMedium.3
             * ADB.AILarge.3
             * ADB.AIXLarge.3
             * ADB.AIStandard.4
             * ADB.AIMedium.4
             * ADB.AILarge.4
             * ADB.AIXLarge.4
             * ADB.AIStandard.5
             * ADB.AIMedium.5
             * ADB.AILarge.5
             * ADB.AIXLarge.5
             * ADB.AIStandard.8
             * ADB.AIMedium.8
             * ADB.AILarge.8
             * ADB.AIXLarge.8
             * ADB.AI2XLarge.8
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>ADB.AIStandard.1</p>
             */
            public Builder nodeSpec(String nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-16T02:04:42Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AINodeInfos build() {
                return new AINodeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAINodePoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAINodePoolsResponseBody</p>
     */
    public static class AINodePoolInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AINodeInfos")
        private java.util.List<AINodeInfos> AINodeInfos;

        @com.aliyun.core.annotation.NameInMap("AINodePoolId")
        private String AINodePoolId;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private String nodeNum;

        private AINodePoolInfos(Builder builder) {
            this.AINodeInfos = builder.AINodeInfos;
            this.AINodePoolId = builder.AINodePoolId;
            this.nodeNum = builder.nodeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AINodePoolInfos create() {
            return builder().build();
        }

        /**
         * @return AINodeInfos
         */
        public java.util.List<AINodeInfos> getAINodeInfos() {
            return this.AINodeInfos;
        }

        /**
         * @return AINodePoolId
         */
        public String getAINodePoolId() {
            return this.AINodePoolId;
        }

        /**
         * @return nodeNum
         */
        public String getNodeNum() {
            return this.nodeNum;
        }

        public static final class Builder {
            private java.util.List<AINodeInfos> AINodeInfos; 
            private String AINodePoolId; 
            private String nodeNum; 

            private Builder() {
            } 

            private Builder(AINodePoolInfos model) {
                this.AINodeInfos = model.AINodeInfos;
                this.AINodePoolId = model.AINodePoolId;
                this.nodeNum = model.nodeNum;
            } 

            /**
             * <p>AI node details.</p>
             */
            public Builder AINodeInfos(java.util.List<AINodeInfos> AINodeInfos) {
                this.AINodeInfos = AINodeInfos;
                return this;
            }

            /**
             * <p>The ID of the resource pool to which the AI node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aipool-xxxxxxxxx</p>
             */
            public Builder AINodePoolId(String AINodePoolId) {
                this.AINodePoolId = AINodePoolId;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeNum(String nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            public AINodePoolInfos build() {
                return new AINodePoolInfos(this);
            } 

        } 

    }
}
