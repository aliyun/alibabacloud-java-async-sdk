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
         * AINodePoolInfos.
         */
        public Builder AINodePoolInfos(java.util.List<AINodePoolInfos> AINodePoolInfos) {
            this.AINodePoolInfos = AINodePoolInfos;
            return this;
        }

        /**
         * RequestId.
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

        private AINodeInfos(Builder builder) {
            this.bindObject = builder.bindObject;
            this.bindStatus = builder.bindStatus;
            this.createTime = builder.createTime;
            this.namespace = builder.namespace;
            this.nodeName = builder.nodeName;
            this.nodeSpec = builder.nodeSpec;
            this.updateTime = builder.updateTime;
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

        public static final class Builder {
            private String bindObject; 
            private String bindStatus; 
            private String createTime; 
            private String namespace; 
            private String nodeName; 
            private String nodeSpec; 
            private String updateTime; 

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
            } 

            /**
             * BindObject.
             */
            public Builder bindObject(String bindObject) {
                this.bindObject = bindObject;
                return this;
            }

            /**
             * BindStatus.
             */
            public Builder bindStatus(String bindStatus) {
                this.bindStatus = bindStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * NodeSpec.
             */
            public Builder nodeSpec(String nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
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
             * AINodeInfos.
             */
            public Builder AINodeInfos(java.util.List<AINodeInfos> AINodeInfos) {
                this.AINodeInfos = AINodeInfos;
                return this;
            }

            /**
             * AINodePoolId.
             */
            public Builder AINodePoolId(String AINodePoolId) {
                this.AINodePoolId = AINodePoolId;
                return this;
            }

            /**
             * NodeNum.
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
