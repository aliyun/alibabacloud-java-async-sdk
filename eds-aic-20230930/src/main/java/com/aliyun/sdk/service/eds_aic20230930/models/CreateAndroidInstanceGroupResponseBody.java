// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndroidInstanceGroupResponseBody</p>
 */
public class CreateAndroidInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceGroupIds")
    private java.util.List<String> instanceGroupIds;

    @com.aliyun.core.annotation.NameInMap("InstanceGroupInfos")
    private java.util.List<InstanceGroupInfos> instanceGroupInfos;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAndroidInstanceGroupResponseBody(Builder builder) {
        this.instanceGroupIds = builder.instanceGroupIds;
        this.instanceGroupInfos = builder.instanceGroupInfos;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndroidInstanceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceGroupIds
     */
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    /**
     * @return instanceGroupInfos
     */
    public java.util.List<InstanceGroupInfos> getInstanceGroupInfos() {
        return this.instanceGroupInfos;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> instanceGroupIds; 
        private java.util.List<InstanceGroupInfos> instanceGroupInfos; 
        private String orderId; 
        private String requestId; 

        /**
         * <p>List of instance group IDs.</p>
         */
        public Builder instanceGroupIds(java.util.List<String> instanceGroupIds) {
            this.instanceGroupIds = instanceGroupIds;
            return this;
        }

        /**
         * <p>Instance group information.</p>
         */
        public Builder instanceGroupInfos(java.util.List<InstanceGroupInfos> instanceGroupInfos) {
            this.instanceGroupInfos = instanceGroupInfos;
            return this;
        }

        /**
         * <p>Order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22365781890****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAndroidInstanceGroupResponseBody build() {
            return new CreateAndroidInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndroidInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAndroidInstanceGroupResponseBody</p>
     */
    public static class InstanceGroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        private InstanceGroupInfos(Builder builder) {
            this.instanceGroupId = builder.instanceGroupId;
            this.instanceIds = builder.instanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceGroupInfos create() {
            return builder().build();
        }

        /**
         * @return instanceGroupId
         */
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public static final class Builder {
            private String instanceGroupId; 
            private java.util.List<String> instanceIds; 

            /**
             * <p>Instance group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ag-cuv4scs4obxch****</p>
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * <p>List of instance IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            public InstanceGroupInfos build() {
                return new InstanceGroupInfos(this);
            } 

        } 

    }
}
