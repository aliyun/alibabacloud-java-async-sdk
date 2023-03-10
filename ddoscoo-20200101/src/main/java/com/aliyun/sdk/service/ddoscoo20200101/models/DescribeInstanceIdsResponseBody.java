// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIdsResponseBody</p>
 */
public class DescribeInstanceIdsResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    private java.util.List < InstanceIds> instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceIdsResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public java.util.List < InstanceIds> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceIds> instanceIds; 
        private String requestId; 

        /**
         * An array that consists of the ID, version, description, and IP address type of the instance.
         */
        public Builder instanceIds(java.util.List < InstanceIds> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceIdsResponseBody build() {
            return new DescribeInstanceIdsResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("Edition")
        private Integer edition;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpMode")
        private String ipMode;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("Remark")
        private String remark;

        private InstanceIds(Builder builder) {
            this.edition = builder.edition;
            this.instanceId = builder.instanceId;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public Integer getEdition() {
            return this.edition;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer edition; 
            private String instanceId; 
            private String ipMode; 
            private String ipVersion; 
            private String remark; 

            /**
             * The mitigation plan of the instance. Valid values:
             * <p>
             * 
             * *   **0**: Anti-DDoS Premium instance of the Insurance mitigation plan
             * *   **1**: Anti-DDoS Premium instance of the Unlimited mitigation plan
             * *   **2**: Anti-DDoS Premium instance of the CMA mitigation plan
             * *   **3**: Anti-DDoS Premium instance of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan
             * *   **9**: Anti-DDoS Pro instance of the Profession mitigation plan
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address-based forwarding mode of the instance. Valid values:
             * <p>
             * 
             * *   **fnat**: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.
             * *   **v6tov4**: All requests are forwarded to origin servers that use IPv4 addresses.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * The IP version of the protocol of the instance. Valid values:
             * <p>
             * 
             * *   **Ipv4**
             * *   **Ipv6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
