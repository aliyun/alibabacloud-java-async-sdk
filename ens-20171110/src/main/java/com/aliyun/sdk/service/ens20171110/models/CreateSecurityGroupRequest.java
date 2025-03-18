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
 * {@link CreateSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityGroupRequest</p>
 */
public class CreateSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<Permissions> permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String securityGroupName;

    private CreateSecurityGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.permissions = builder.permissions;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupRequest create() {
        return builder().build();
    }

@Override
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
    public java.util.List<Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<CreateSecurityGroupRequest, Builder> {
        private String description; 
        private java.util.List<Permissions> permissions; 
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityGroupRequest request) {
            super(request);
            this.description = request.description;
            this.permissions = request.permissions;
            this.securityGroupName = request.securityGroupName;
        } 

        /**
         * <p>The description. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Schema of Response</p>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            String permissionsShrink = shrink(permissions, "Permissions", "json");
            this.putQueryParameter("Permissions", permissionsShrink);
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The name of the security group. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (<em>), and hyphens (-). It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (</em>), and hyphens (-). By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Dcdn1:2_3-4</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        @Override
        public CreateSecurityGroupRequest build() {
            return new CreateSecurityGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateSecurityGroupRequest</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("Direction")
        @com.aliyun.core.annotation.Validation(required = true)
        private String direction;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ipProtocol;

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

        public static Permissions create() {
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

            private Builder() {
            } 

            private Builder(Permissions model) {
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
             * <p>The description of the SDG.</p>
             * <blockquote>
             * <p> We recommend that you specify this parameter in details for subsequent queries.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
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
             * <p>The protocol. The values of this parameter are case-insensitive. Valid values:</p>
             * <ul>
             * <li>TCP.</li>
             * <li>UDP.</li>
             * <li>ICMP.</li>
             * <li>ICMPv6.</li>
             * <li>GRE.</li>
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
             * <p>The action of the security group rule. Valid values:</p>
             * <ul>
             * <li>accept: allows inbound access.</li>
             * <li>drop: denies inbound access and returns no responses. In this case, the request times out or the connection cannot be established.</li>
             * </ul>
             * <p>Default value: accept.</p>
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
             * <p>The range of destination port numbers for the protocols specified in the security group rule. Valid values:</p>
             * <ul>
             * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of &lt;Start port number&gt;/&lt;End port number&gt;. Example: 1/200.</li>
             * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
             * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
             * <li>If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.</li>
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
             * <p>Default value: 1.</p>
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
             * <p>The source IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * <p>The range of source port numbers for the protocols specified in the security group rule. Valid values:</p>
             * <ul>
             * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port number range in the format of &lt;Start port number&gt;/&lt;End port number&gt;. Example: 1/200.</li>
             * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
             * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
             * <li>If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.</li>
             * </ul>
             * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
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
