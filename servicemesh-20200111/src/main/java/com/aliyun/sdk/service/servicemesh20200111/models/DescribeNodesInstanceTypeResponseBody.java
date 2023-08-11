// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodesInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodesInstanceTypeResponseBody</p>
 */
public class DescribeNodesInstanceTypeResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    private java.util.List < InstanceTypes> instanceTypes;

    @NameInMap("RequestId")
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

    /**
     * @return instanceTypes
     */
    public java.util.List < InstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceTypes> instanceTypes; 
        private String requestId; 

        /**
         * The instance types of the nodes.
         */
        public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodesInstanceTypeResponseBody build() {
            return new DescribeNodesInstanceTypeResponseBody(this);
        } 

    } 

    public static class InstanceTypes extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("MultiBufferEnabled")
        private Boolean multiBufferEnabled;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Indicates whether the instance type supports Multi-Buffer acceleration. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
                this.multiBufferEnabled = multiBufferEnabled;
                return this;
            }

            /**
             * The instance type of the node.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Value.
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
