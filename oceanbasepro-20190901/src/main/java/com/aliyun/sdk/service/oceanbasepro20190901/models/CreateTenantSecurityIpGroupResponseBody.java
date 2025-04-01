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
 * {@link CreateTenantSecurityIpGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantSecurityIpGroupResponseBody</p>
 */
public class CreateTenantSecurityIpGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpGroup")
    private SecurityIpGroup securityIpGroup;

    private CreateTenantSecurityIpGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityIpGroup = builder.securityIpGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantSecurityIpGroupResponseBody create() {
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

        private Builder(CreateTenantSecurityIpGroupResponseBody model) {
            this.requestId = model.requestId;
            this.securityIpGroup = model.securityIpGroup;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the whitelist group.</p>
         */
        public Builder securityIpGroup(SecurityIpGroup securityIpGroup) {
            this.securityIpGroup = securityIpGroup;
            return this;
        }

        public CreateTenantSecurityIpGroupResponseBody build() {
            return new CreateTenantSecurityIpGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTenantSecurityIpGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTenantSecurityIpGroupResponseBody</p>
     */
    public static class SecurityIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
        private String securityIpGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIps")
        private String securityIps;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private SecurityIpGroup(Builder builder) {
            this.instanceId = builder.instanceId;
            this.securityIpGroupName = builder.securityIpGroupName;
            this.securityIps = builder.securityIps;
            this.tenantId = builder.tenantId;
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

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String instanceId; 
            private String securityIpGroupName; 
            private String securityIps; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(SecurityIpGroup model) {
                this.instanceId = model.instanceId;
                this.securityIpGroupName = model.securityIpGroupName;
                this.securityIps = model.securityIps;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ob317v4uif****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the whitelist group.</p>
             * 
             * <strong>example:</strong>
             * <p>paytest</p>
             */
            public Builder securityIpGroupName(String securityIpGroupName) {
                this.securityIpGroupName = securityIpGroupName;
                return this;
            }

            /**
             * <p>The list of IP addresses in the IP address whitelist group.   </p>
             * <p>It is a string separated by commas, and each object is an IP address or CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.***.<em>.</em></p>
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t4louaeei****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public SecurityIpGroup build() {
                return new SecurityIpGroup(this);
            } 

        } 

    }
}
