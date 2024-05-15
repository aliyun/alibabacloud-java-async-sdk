// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnDemandInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnDemandInstanceStatusResponseBody</p>
 */
public class DescribeOnDemandInstanceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOnDemandInstanceStatusResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * The details of the on-demand instance.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOnDemandInstanceStatusResponseBody build() {
            return new DescribeOnDemandInstanceStatusResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Declared")
        private String declared;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Net")
        private String net;

        @com.aliyun.core.annotation.NameInMap("RegistedAs")
        private String registedAs;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Instances(Builder builder) {
            this.declared = builder.declared;
            this.desc = builder.desc;
            this.instanceId = builder.instanceId;
            this.mode = builder.mode;
            this.net = builder.net;
            this.registedAs = builder.registedAs;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return declared
         */
        public String getDeclared() {
            return this.declared;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return net
         */
        public String getNet() {
            return this.net;
        }

        /**
         * @return registedAs
         */
        public String getRegistedAs() {
            return this.registedAs;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String declared; 
            private String desc; 
            private String instanceId; 
            private String mode; 
            private String net; 
            private String registedAs; 
            private String userId; 

            /**
             * The details of route advertisement for data centers outside the Chinese mainland. This parameter is a JSON string. The following fields are included in the value:
             * <p>
             * 
             * *   **region**: The code of the data center outside the Chinese mainland. The value is of the STRING type. For more information, see **Codes of data centers outside the Chinese mainland**.
             * *   **declared**: indicates whether the data center advertised the route. The value is of the STRING type. Valid values: **0** and **1**. The value of 0 indicates that the data center did not advertise the route. The value of 1 indicates that the data center advertised the route.
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * The description of the on-demand instance.
             * <p>
             * 
             * >  The value of this parameter is returned only when the information about multiple on-demand instances is returned. The value of this parameter is not returned because the information about only one on-demand instance is returned.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The ID of the on-demand instance.
             * <p>
             * 
             * >  The value of this parameter is returned only when the information about multiple on-demand instances is returned. The value of this parameter is not returned because the information about only one on-demand instance is returned.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The mode used to start the on-demand instance. Valid values:
             * <p>
             * 
             * *   **manual**: The instance is manually started.
             * *   **netflow-auto**: The instance is automatically started by using NetFlow that monitors network traffic.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The CIDR block of the on-demand instance.
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * The number of the autonomous system (AS). Set the value to **0**, which indicates that AS is disabled.
             */
            public Builder registedAs(String registedAs) {
                this.registedAs = registedAs;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
