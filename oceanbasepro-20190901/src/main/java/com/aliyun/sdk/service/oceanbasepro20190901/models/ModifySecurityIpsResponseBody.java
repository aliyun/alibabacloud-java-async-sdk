// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityIpsResponseBody</p>
 */
public class ModifySecurityIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroup")
    private SecurityIpGroup securityIpGroup;

    private ModifySecurityIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroup = builder.securityIpGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Example 1
         */
        public Builder securityIpGroup(SecurityIpGroup securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }

        public ModifySecurityIpsResponseBody build() {
            return new ModifySecurityIpsResponseBody(this);
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SecurityIpGroupName.
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
