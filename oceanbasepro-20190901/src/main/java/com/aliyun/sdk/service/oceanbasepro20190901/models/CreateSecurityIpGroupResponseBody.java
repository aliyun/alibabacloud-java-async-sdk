// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityIpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityIpGroupResponseBody</p>
 */
public class CreateSecurityIpGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroup")
    private SecurityIpGroup securityIpGroup;

    private CreateSecurityIpGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroup = builder.securityIpGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityIpGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpGroup
     */
    public SecurityIpGroup getSecurityIpGroup() {
        return this.securityIpGroup;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityIpGroup securityIpGroup; 

        /**
         * The IP addresses or CIDR blocks in the IP address whitelist group.   
         * <p>
         * The return values of SecurityIps are strings that are separated with commas (,).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **CreateSecurityIpGroup**.
         */
        public Builder securityIpGroup(SecurityIpGroup securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }

        public CreateSecurityIpGroupResponseBody build() {
            return new CreateSecurityIpGroupResponseBody(this);
        } 

    } 

    public static class SecurityIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIps")
        private String securityIps;

        private SecurityIpGroup(Builder builder) {
            this.instanceId = builder.instanceId;
            this.securityIpGroupName = builder.securityIpGroupName;
            this.securityIps = builder.securityIps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroup create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return securityIpGroupName
         */
        public String getSecurityIpGroupName() {
            return this.securityIpGroupName;
        }

        /**
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        public static final class Builder {
            private String instanceId; 
            private String securityIpGroupName; 
            private String securityIps; 

            /**
             * ```
             * <p>
             * http(s)://[Endpoint]/?Action=CreateSecurityIpGroup
             * &InstanceId=ob317v4uif****
             * &SecurityIps=192.168.1.1,192.168.0.0.1/8
             * &SecurityIpGroupName=pay_online
             * &Common request parameters
             * ```
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * You can call this operation to create an IP address whitelist group.
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * SecurityIps.
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            public SecurityIpGroup build() {
                return new SecurityIpGroup(this);
            } 

        } 

    }
}
