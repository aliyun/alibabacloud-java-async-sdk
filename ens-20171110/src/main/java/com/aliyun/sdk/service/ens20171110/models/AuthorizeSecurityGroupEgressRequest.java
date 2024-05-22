// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupEgressRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupEgressRequest</p>
 */
public class AuthorizeSecurityGroupEgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidrIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    private AuthorizeSecurityGroupEgressRequest(Builder builder) {
        super(builder);
        this.destCidrIp = builder.destCidrIp;
        this.ipProtocol = builder.ipProtocol;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.securityGroupId = builder.securityGroupId;
        this.sourcePortRange = builder.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupEgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupEgressRequest, Builder> {
        private String destCidrIp; 
        private String ipProtocol; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String securityGroupId; 
        private String sourcePortRange; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupEgressRequest request) {
            super(request);
            this.destCidrIp = request.destCidrIp;
            this.ipProtocol = request.ipProtocol;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.securityGroupId = request.securityGroupId;
            this.sourcePortRange = request.sourcePortRange;
        } 

        /**
         * The destination IP addresses. CIDR blocks and IPv4 addresses are supported.
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * The transport layer protocol. The values of this parameter are case-sensitive. Valid values:
         * <p>
         * 
         * *   tcp: TCP.
         * *   udp: UDP.
         * *   icmp: ICMP.
         * *   gre: GRE.
         * *   all: All protocols are supported.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The action of security group rule N that determines whether to allow inbound access. Valid values:
         * <p>
         * 
         * *   accept: allows access. This is the default value.
         * *   drop: denies access and returns no responses.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:
         * <p>
         * 
         * *   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.
         * *   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.
         * *   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.
         * *   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * The priority of the security group rule. Valid values: **1 to 100**. Default value: **1**.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The range of port numbers that correspond to the transport layer protocol for the source security group. Valid values:
         * <p>
         * 
         * *   When the IpProtocol parameter is set to tcp or udp, the port number range is **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.
         * *   When the IpProtocol parameter is set to icmp, the port number range is **-1/-1**, which indicates all ports.
         * *   When the IpProtocol parameter is set to gre, the port number range is **-1/-1**, which indicates all ports.
         * *   When the IpProtocol parameter is set to all, the port number range is **-1/-1**, which indicates all ports.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupEgressRequest build() {
            return new AuthorizeSecurityGroupEgressRequest(this);
        } 

    } 

}
