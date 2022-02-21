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
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("MultiBufferEnabled")
        private Boolean multiBufferEnabled;

        @NameInMap("NodeType")
        private String nodeType;

        private InstanceTypes(Builder builder) {
            this.multiBufferEnabled = builder.multiBufferEnabled;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
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

        public static final class Builder {
            private Boolean multiBufferEnabled; 
            private String nodeType; 

            /**
             * MultiBufferEnabled.
             */
            public Builder multiBufferEnabled(Boolean multiBufferEnabled) {
                this.multiBufferEnabled = multiBufferEnabled;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
