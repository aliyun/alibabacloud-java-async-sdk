// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DeleteSecurityIpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecurityIpGroupResponseBody</p>
 */
public class DeleteSecurityIpGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroup")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteSecurityIpGroupResponseBody model) {
            this.requestId = model.requestId;
            this.securityIpGroup = model.securityIpGroup;
        } 

        /**
         * <p>Example 1</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityIpGroup.
         */
        public Builder securityIpGroup(SecurityIpGroup securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }

        public DeleteSecurityIpGroupResponseBody build() {
            return new DeleteSecurityIpGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityIpGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSecurityIpGroupResponseBody</p>
     */
    public static class SecurityIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
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

            private Builder() {
            } 

            private Builder(SecurityIpGroup model) {
                this.instanceId = model.instanceId;
                this.securityIpGroupName = model.securityIpGroupName;
            } 

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

            public SecurityIpGroup build() {
                return new SecurityIpGroup(this);
            } 

        } 

    }
}
