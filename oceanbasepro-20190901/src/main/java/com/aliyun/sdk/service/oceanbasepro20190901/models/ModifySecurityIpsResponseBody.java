// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityIpsResponseBody</p>
 */
public class ModifySecurityIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpGroup")
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * IP白名单分组信息。
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
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @NameInMap("SecurityIps")
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
             * Oceanbase集群ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 安全组名称。
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * IP安全白名单列表。其为一个Json格式的数组，数组中每个对象为一个IP字符串或者IP段。
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
