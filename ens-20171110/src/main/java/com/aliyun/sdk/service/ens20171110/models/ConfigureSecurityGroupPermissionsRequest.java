// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSecurityGroupPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSecurityGroupPermissionsRequest</p>
 */
public class ConfigureSecurityGroupPermissionsRequest extends Request {
    @Query
    @NameInMap("AuthorizePermissions")
    private java.util.List < AuthorizePermissions> authorizePermissions;

    @Query
    @NameInMap("RevokePermissions")
    private java.util.List < RevokePermissions> revokePermissions;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    private ConfigureSecurityGroupPermissionsRequest(Builder builder) {
        super(builder);
        this.authorizePermissions = builder.authorizePermissions;
        this.revokePermissions = builder.revokePermissions;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSecurityGroupPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizePermissions
     */
    public java.util.List < AuthorizePermissions> getAuthorizePermissions() {
        return this.authorizePermissions;
    }

    /**
     * @return revokePermissions
     */
    public java.util.List < RevokePermissions> getRevokePermissions() {
        return this.revokePermissions;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<ConfigureSecurityGroupPermissionsRequest, Builder> {
        private java.util.List < AuthorizePermissions> authorizePermissions; 
        private java.util.List < RevokePermissions> revokePermissions; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSecurityGroupPermissionsRequest response) {
            super(response);
            this.authorizePermissions = response.authorizePermissions;
            this.revokePermissions = response.revokePermissions;
            this.securityGroupId = response.securityGroupId;
        } 

        /**
         * AuthorizePermissions.
         */
        public Builder authorizePermissions(java.util.List < AuthorizePermissions> authorizePermissions) {
            this.putQueryParameter("AuthorizePermissions", authorizePermissions);
            this.authorizePermissions = authorizePermissions;
            return this;
        }

        /**
         * RevokePermissions.
         */
        public Builder revokePermissions(java.util.List < RevokePermissions> revokePermissions) {
            this.putQueryParameter("RevokePermissions", revokePermissions);
            this.revokePermissions = revokePermissions;
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

        @Override
        public ConfigureSecurityGroupPermissionsRequest build() {
            return new ConfigureSecurityGroupPermissionsRequest(this);
        } 

    } 

    public static class AuthorizePermissions extends TeaModel {
        @NameInMap("Description")
        @Validation(maxLength = 256, minLength = 2)
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("Direction")
        @Validation(required = true)
        private String direction;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        private String ipProtocol;

        @NameInMap("Policy")
        @Validation(required = true)
        private String policy;

        @NameInMap("PortRange")
        @Validation(required = true)
        private String portRange;

        @NameInMap("Priority")
        @Validation(required = true)
        private Integer priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private AuthorizePermissions(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.direction = builder.direction;
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

        public static AuthorizePermissions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
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
        public Integer getPriority() {
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
            private String description; 
            private String destCidrIp; 
            private String direction; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DestCidrIp.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
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
            public Builder priority(Integer priority) {
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

            public AuthorizePermissions build() {
                return new AuthorizePermissions(this);
            } 

        } 

    }
    public static class RevokePermissions extends TeaModel {
        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("Direction")
        @Validation(required = true)
        private String direction;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        private String ipProtocol;

        @NameInMap("Policy")
        @Validation(required = true)
        private String policy;

        @NameInMap("PortRange")
        @Validation(required = true)
        private String portRange;

        @NameInMap("Priority")
        @Validation(required = true)
        private Integer priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        private RevokePermissions(Builder builder) {
            this.destCidrIp = builder.destCidrIp;
            this.direction = builder.direction;
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

        public static RevokePermissions create() {
            return builder().build();
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
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
        public Integer getPriority() {
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
            private String direction; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
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
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
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
            public Builder priority(Integer priority) {
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

            public RevokePermissions build() {
                return new RevokePermissions(this);
            } 

        } 

    }
}
