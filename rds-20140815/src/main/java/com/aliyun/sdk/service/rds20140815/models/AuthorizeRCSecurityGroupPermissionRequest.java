// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link AuthorizeRCSecurityGroupPermissionRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeRCSecurityGroupPermissionRequest</p>
 */
public class AuthorizeRCSecurityGroupPermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupPermissions")
    private java.util.List<SecurityGroupPermissions> securityGroupPermissions;

    private AuthorizeRCSecurityGroupPermissionRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupPermissions = builder.securityGroupPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeRCSecurityGroupPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupPermissions
     */
    public java.util.List<SecurityGroupPermissions> getSecurityGroupPermissions() {
        return this.securityGroupPermissions;
    }

    public static final class Builder extends Request.Builder<AuthorizeRCSecurityGroupPermissionRequest, Builder> {
        private String direction; 
        private String regionId; 
        private String securityGroupId; 
        private java.util.List<SecurityGroupPermissions> securityGroupPermissions; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeRCSecurityGroupPermissionRequest request) {
            super(request);
            this.direction = request.direction;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupPermissions = request.securityGroupPermissions;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupPermissions.
         */
        public Builder securityGroupPermissions(java.util.List<SecurityGroupPermissions> securityGroupPermissions) {
            String securityGroupPermissionsShrink = shrink(securityGroupPermissions, "SecurityGroupPermissions", "json");
            this.putQueryParameter("SecurityGroupPermissions", securityGroupPermissionsShrink);
            this.securityGroupPermissions = securityGroupPermissions;
            return this;
        }

        @Override
        public AuthorizeRCSecurityGroupPermissionRequest build() {
            return new AuthorizeRCSecurityGroupPermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeRCSecurityGroupPermissionRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeRCSecurityGroupPermissionRequest</p>
     */
    public static class SecurityGroupPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private SecurityGroupPermissions(Builder builder) {
            this.destCidrIp = builder.destCidrIp;
            this.ipProtocol = builder.ipProtocol;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupPermissions create() {
            return builder().build();
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public static final class Builder {
            private String destCidrIp; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            /**
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public SecurityGroupPermissions build() {
                return new SecurityGroupPermissions(this);
            } 

        } 

    }
}
