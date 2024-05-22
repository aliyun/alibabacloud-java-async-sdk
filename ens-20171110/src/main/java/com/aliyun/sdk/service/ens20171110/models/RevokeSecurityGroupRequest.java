// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupRequest</p>
 */
public class RevokeSecurityGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    private RevokeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.ipProtocol = builder.ipProtocol;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.securityGroupId = builder.securityGroupId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RevokeSecurityGroupRequest, Builder> {
        private String ipProtocol; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String securityGroupId; 
        private String sourceCidrIp; 
        private String sourcePortRange; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupRequest request) {
            super(request);
            this.ipProtocol = request.ipProtocol;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.securityGroupId = request.securityGroupId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.sourcePortRange = request.sourcePortRange;
        } 

        /**
         * The transport layer protocol. The value of this parameter is case-sensitive. Valid values:
         * <p>
         * 
         * *   tcp: TCP.
         * *   udp: UDP.
         * *   icmp: ICMP.
         * *   gre: GRE.
         * *   all: all protocols.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The authorization policy. Valid values:
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
         * The range of destination ports that correspond to the transport layer protocol for the security group rule. Valid values:
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
         * The priority of security group rule N. Valid values: **1** to **100**. Default value: **1**.
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
         * The source CIDR block. CIDR blocks and IPv4 addresses are supported. Default value: 0.0.XX.XX/0.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * The range of source ports that correspond to the transport layer protocol for the security group rule. Valid values:
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
        public RevokeSecurityGroupRequest build() {
            return new RevokeSecurityGroupRequest(this);
        } 

    } 

}
