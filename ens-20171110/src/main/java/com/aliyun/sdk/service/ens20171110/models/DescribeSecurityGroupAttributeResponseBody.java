// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupAttributeResponseBody</p>
 */
public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Permissions")
    private Permissions permissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    private DescribeSecurityGroupAttributeResponseBody(Builder builder) {
        this.description = builder.description;
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return permissions
     */
    public Permissions getPermissions() {
        return this.permissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder {
        private String description; 
        private Permissions permissions; 
        private String requestId; 
        private String securityGroupId; 
        private String securityGroupName; 

        private Builder() {
        } 

        private Builder(DescribeSecurityGroupAttributeResponseBody model) {
            this.description = model.description;
            this.permissions = model.permissions;
            this.requestId = model.requestId;
            this.securityGroupId = model.securityGroupId;
            this.securityGroupName = model.securityGroupName;
        } 

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription1</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Details about the rules.</p>
         */
        public Builder permissions(Permissions permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the destination security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1gxw6bznjjvhu3****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The name of the destination security group.</p>
         * 
         * <strong>example:</strong>
         * <p>testSecurityGroupName2</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }

        public DescribeSecurityGroupAttributeResponseBody build() {
            return new DescribeSecurityGroupAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupAttributeResponseBody</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private Permission(Builder builder) {
            this.creationTime = builder.creationTime;
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

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
            private String creationTime; 
            private String description; 
            private String destCidrIp; 
            private String direction; 
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(Permission model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.destCidrIp = model.destCidrIp;
                this.direction = model.direction;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * <p>The time at which the security group rule was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T07:28:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The range of destination IP addresses for outbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The direction in which the security group rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>ingress</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The transport layer protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The source port range.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The range of source IP addresses for inbound access control.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The source port number range for the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupAttributeResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Permission")
        private java.util.List<Permission> permission;

        private Permissions(Builder builder) {
            this.permission = builder.permission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return permission
         */
        public java.util.List<Permission> getPermission() {
            return this.permission;
        }

        public static final class Builder {
            private java.util.List<Permission> permission; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.permission = model.permission;
            } 

            /**
             * Permission.
             */
            public Builder permission(java.util.List<Permission> permission) {
                this.permission = permission;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
