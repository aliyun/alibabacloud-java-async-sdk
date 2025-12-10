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
 * {@link DeleteSecurityGroupPermissionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityGroupPermissionsRequest</p>
 */
public class DeleteSecurityGroupPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    private DeleteSecurityGroupPermissionsRequest(Builder builder) {
        super(builder);
        this.permissions = builder.permissions;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityGroupPermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return permissions
     */
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityGroupPermissionsRequest, Builder> {
        private java.util.List<Permissions> permissions; 
        private String securityGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityGroupPermissionsRequest request) {
            super(request);
            this.permissions = request.permissions;
            this.securityGroupId = request.securityGroupId;
        } 

        /**
         * <p>The security group rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putQueryParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        @Override
        public DeleteSecurityGroupPermissionsRequest build() {
            return new DeleteSecurityGroupPermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityGroupPermissionsRequest} extends {@link TeaModel}
     *
     * <p>DeleteSecurityGroupPermissionsRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("Direction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String direction;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("Policy")
        @com.aliyun.core.annotation.Validation(required = true)
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        @com.aliyun.core.annotation.Validation(required = true)
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        private Permissions(Builder builder) {
            this.destCidrIp = builder.destCidrIp;
            this.direction = builder.direction;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourcePortRange = builder.sourcePortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
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
         * @return ipv6DestCidrIp
         */
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        /**
         * @return ipv6SourceCidrIp
         */
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
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
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.destCidrIp = model.destCidrIp;
                this.direction = model.direction;
                this.ipProtocol = model.ipProtocol;
                this.ipv6DestCidrIp = model.ipv6DestCidrIp;
                this.ipv6SourceCidrIp = model.ipv6SourceCidrIp;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>10.XX.XX.91</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The direction in which the security group rule is applied.</p>
             * <ul>
             * <li>egress</li>
             * <li>ingress</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ingress</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>Protocol type. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>ICMP: the ICMP protocol</li>
             * <li>ICMPv6: the IPv6 ICMP protocol.</li>
             * <li>ALL: All protocols are supported.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The destination IPv6 CIDR block. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
             * <blockquote>
             * <p> This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>::/0</p>
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * <p>The source IPv6 CIDR block of the security group rule. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
             * <blockquote>
             * <p> This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>::/0</p>
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * <p>The action specified in the security group rule. Valid values:</p>
             * <ul>
             * <li>Accept</li>
             * <li>Drop</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The destination port range of the security group rule. Valid values:</p>
             * <ul>
             * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of &lt;Start port number&gt;/&lt;End port number&gt;. Example: 1/200.</li>
             * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
             * <li>If you set IpProtocol to ALL, the port number range is -1/-1.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the security group rule. A smaller value specifies a higher priority. Valid values: 1 to 100.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0.XX.XX.0/0</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The range of source port numbers for the protocols specified in the security group rule. Valid values:</p>
             * <ul>
             * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of &lt;Start port number&gt;/&lt;End port number&gt;. Example: 1/200.</li>
             * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
             * <li>If you set IpProtocol to ALL, the port range is -1/-1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>22/22</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
