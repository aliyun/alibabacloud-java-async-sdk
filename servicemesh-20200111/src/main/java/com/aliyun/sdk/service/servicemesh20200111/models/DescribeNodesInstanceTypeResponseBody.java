// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeNodesInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodesInstanceTypeResponseBody</p>
 */
public class DescribeNodesInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<InstanceTypes> instanceTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNodesInstanceTypeResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodesInstanceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<InstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceTypes> instanceTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNodesInstanceTypeResponseBody model) {
            this.instanceTypes = model.instanceTypes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance types of the nodes.</p>
         */
        public Builder instanceTypes(java.util.List<InstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodesInstanceTypeResponseBody build() {
            return new DescribeNodesInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodesInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodesInstanceTypeResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MultiBufferEnabled")
        private Boolean multiBufferEnabled;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceTypes(Builder builder) {
            this.key = builder.key;
            this.multiBufferEnabled = builder.multiBufferEnabled;
            this.nodeType = builder.nodeType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return multiBufferEnabled
         */
        public Boolean getMultiBufferEnabled() {
            return this.multiBufferEnabled;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Boolean multiBufferEnabled; 
            private String nodeType; 
            private String value; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.key = model.key;
                this.multiBufferEnabled = model.multiBufferEnabled;
                this.nodeType = model.nodeType;
                this.value = model.value;
            } 

            /**
             * <p>The label keys of nodes which have MultiBuffer optimization supported. (Enable optimization only if pod being scheduled to node which have a label key specified by this field and its value equals with the value field)</p>
             * 
             * <strong>example:</strong>
             * <p>feature.node.kubernetes.io/mb-feature-enable</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Indicates whether the instance type supports Multi-Buffer acceleration. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
                this.multiBufferEnabled = multiBufferEnabled;
                return this;
            }

            /**
             * <p>The instance type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g7.xlarge</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The label keys of nodes which have MultiBuffer optimization supported. (Enable optimization only if pod being scheduled to node which have a label key specified by the key field and its value equals with this field)</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
