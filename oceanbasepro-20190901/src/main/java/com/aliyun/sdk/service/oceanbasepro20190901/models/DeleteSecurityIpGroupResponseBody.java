// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityIpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecurityIpGroupResponseBody</p>
 */
public class DeleteSecurityIpGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIpGroup")
    private SecurityIpGroup securityIpGroup;

    private DeleteSecurityIpGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroup = builder.securityIpGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityIpGroupResponseBody create() {
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
         * 删除的IP白名单分组信息。
         */
        public Builder securityIpGroup(SecurityIpGroup securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }

        public DeleteSecurityIpGroupResponseBody build() {
            return new DeleteSecurityIpGroupResponseBody(this);
        } 

    } 

    public static class SecurityIpGroup extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        private SecurityIpGroup(Builder builder) {
            this.instanceId = builder.instanceId;
            this.securityIpGroupName = builder.securityIpGroupName;
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

        public static final class Builder {
            private String instanceId; 
            private String securityIpGroupName; 

            /**
             * Oceanbase集群ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 删除的IP安全白名单组的组名。
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            public SecurityIpGroup build() {
                return new SecurityIpGroup(this);
            } 

        } 

    }
}
