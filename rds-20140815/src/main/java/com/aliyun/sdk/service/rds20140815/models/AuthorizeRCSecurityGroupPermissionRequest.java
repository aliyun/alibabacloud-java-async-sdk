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
         * <p>The direction of the rule. Valid values:</p>
         * <ul>
         * <li><strong>ingress</strong>: inbound.</li>
         * <li><strong>egress</strong>: outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2ze27hs990o2hn9****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The security group information.</p>
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
        private Integer priority;

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
            private String ipProtocol; 
            private String policy; 
            private String portRange; 
            private Integer priority; 
            private String sourceCidrIp; 
            private String sourcePortRange; 

            private Builder() {
            } 

            private Builder(SecurityGroupPermissions model) {
                this.destCidrIp = model.destCidrIp;
                this.ipProtocol = model.ipProtocol;
                this.policy = model.policy;
                this.portRange = model.portRange;
                this.priority = model.priority;
                this.sourceCidrIp = model.sourceCidrIp;
                this.sourcePortRange = model.sourcePortRange;
            } 

            /**
             * <p>The destination IP address range for outbound authorization. CIDR format and IPv4 IP address ranges are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1/12</p>
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * <p>The protocol type. This parameter is case-insensitive. Valid values: </p>
             * <ul>
             * <li><strong>ICMP</strong></li>
             * <li><strong>GRE</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>ALL</strong>: all protocols.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The authorization policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The range of destination ports for the transport layer protocol. Valid values:</p>
             * <ul>
             * <li>TCP/UDP: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Example of a valid value: <strong>1/200</strong>. Example of an invalid value: <strong>200/1</strong>.</li>
             * <li>ICMP: <strong>-1/-1</strong>.</li>
             * <li>GRE: <strong>-1/-1</strong>.</li>
             * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * <p>The priority of the rule. Valid values: 1 to 100. A smaller value indicates a higher priority. If two security group rules have the same priority, the deny rule takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The source IP address range for inbound authorization. CIDR format and IPv4 IP address ranges are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1/12</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The range of source ports for the transport layer protocol. Valid values:</p>
             * <ul>
             * <li>TCP/UDP: valid values are <strong>1</strong> to <strong>65535</strong>. Separate the start port and the end port with a forward slash (/). Example of a valid value: <strong>1/200</strong>. Example of an invalid value: <strong>200/1</strong>.</li>
             * <li>ICMP: <strong>-1/-1</strong>.</li>
             * <li>GRE: <strong>-1/-1</strong>.</li>
             * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>80/80</p>
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
