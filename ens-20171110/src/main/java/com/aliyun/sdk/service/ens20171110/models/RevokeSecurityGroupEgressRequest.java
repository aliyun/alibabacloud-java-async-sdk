// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupEgressRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupEgressRequest</p>
 */
public class RevokeSecurityGroupEgressRequest extends Request {
    @Query
    @NameInMap("DestCidrIp")
    @Validation(required = true)
    private String destCidrIp;

    @Query
    @NameInMap("IpProtocol")
    @Validation(required = true)
    private String ipProtocol;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("PortRange")
    @Validation(required = true)
    private String portRange;

    @Query
    @NameInMap("Priority")
    @Validation(maximum = 100, minimum = 1)
    private Integer priority;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    private RevokeSecurityGroupEgressRequest(Builder builder) {
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

    public static RevokeSecurityGroupEgressRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeSecurityGroupEgressRequest, Builder> {
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

        private Builder(RevokeSecurityGroupEgressRequest request) {
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
         * By default, this parameter is empty.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * The transport layer protocol. The value of this parameter is case-sensitive. Valid values:
         * <p>
         * 
         * *   tcp
         * *   udp
         * *   icmp
         * *   gre
         * *   all: All protocols are supported.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The action of the security group rule. Valid values:
         * <p>
         * 
         * *   **accept**: allows access.
         * *   **drop**: denies access and returns no responses.
         * 
         * Default value: **accept**.
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
         * *   If you set the IpProtocol parameter to tcp or udp, the port number ranges from **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.
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
         * The priority of the security group rule. Valid values: **1** to **100**. A smaller value indicates a higher priority.
         * <p>
         * 
         * Default value: **1**.
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
         * *   If you set the IpProtocol parameter to tcp or udp, the port number ranges from **1** to **65535**. The start port number and the end port number are separated by a forward slash (/). Correct example: **1/200**. Incorrect example: **200/1**.
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
        public RevokeSecurityGroupEgressRequest build() {
            return new RevokeSecurityGroupEgressRequest(this);
        } 

    } 

}
