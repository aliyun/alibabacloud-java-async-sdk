// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the anti-DDoS diversion instance.</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CC49FF51-612F-429B-AB1E-374B3F115396</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOnDemandInstanceStatusResponseBody build() {
            return new DescribeOnDemandInstanceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOnDemandInstanceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnDemandInstanceStatusResponseBody</p>
     */
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
             * <p>The details of route advertisement for data centers outside the Chinese mainland. This parameter is a JSON string. The following fields are included in the value:</p>
             * <ul>
             * <li><strong>region</strong>: The code of the data center outside the Chinese mainland. The value is of the string type. For more information, see <strong>Codes of data centers outside the Chinese mainland</strong>.</li>
             * <li><strong>declared</strong>: indicates whether the data center advertised the route. The value is of the string type. Valid values: <strong>0</strong> and <strong>1</strong>. The value of 0 indicates that the data center did not advertise the route. The value of 1 indicates that the data center advertised the route.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;region&quot;:&quot;oe24&quot;,&quot;declared&quot;:0},{&quot;region&quot;:&quot;oe26&quot;,&quot;declared&quot;:0},{&quot;region&quot;:&quot;oe28&quot;,&quot;declared&quot;:0},{&quot;region&quot;:&quot;oi39&quot;,&quot;declared&quot;:0},{&quot;region&quot;:&quot;us50&quot;,&quot;declared&quot;:0},{&quot;region&quot;:&quot;jp141&quot;,&quot;declared&quot;:0}]</p>
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * <p>The description of the anti-DDoS diversion instance.</p>
             * <blockquote>
             * <p>This parameter is returned only when the information about multiple anti-DDoS diversion instances are returned. The value of this parameter is not returned because the information about only one anti-DDoS diversion instance is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The ID of the anti-DDoS diversion instance.</p>
             * <blockquote>
             * <p>This parameter is returned only when the information about multiple anti-DDoS diversion instances are returned. The value of this parameter is not returned because the information about only one anti-DDoS diversion instance is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-z2q1qzxb****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The mode that is used to enable traffic rerouting to the anti-DDoS diversion instance. Valid values:</p>
             * <ul>
             * <li><strong>manual</strong>: The instance is manually started.</li>
             * <li><strong>netflow-auto</strong>: The instance is automatically started by using NetFlow that monitors network traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>netflow-auto</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The CIDR block of the anti-DDoS diversion instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.<em><strong>.</strong></em>.0/24</p>
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * <p>The number of the autonomous system (AS). Set the value to <strong>0</strong>, which indicates that AS is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder registedAs(String registedAs) {
                this.registedAs = registedAs;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>171986973287****</p>
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
