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
         * <p>The destination IP address range. CIDR blocks and IPv4 address ranges are supported.</p>
         * <p>Default value: none.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX/8</p>
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * <p>The transport layer protocol. The value is case-sensitive. Valid values:</p>
         * <ul>
         * <li>tcp: TCP.</li>
         * <li>udp: UDP.</li>
         * <li>icmp: ICMP.</li>
         * <li>gre: GRE.</li>
         * <li>all: All protocols.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>Settings for access permissions. Valid values:</p>
         * <ul>
         * <li>accept (default): accept access.</li>
         * <li>drop: deny access without returning a deny message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The range of ports enabled for the transport layer protocol in the security group. Valid values:</p>
         * <ul>
         * <li>For TCP or UDP: <strong>1</strong> to <strong>65535</strong>. Use a forward slash (/) to separate the start port and the end port. Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
         * <li>For ICMP: <strong>-1/-1</strong>.</li>
         * <li>For GRE: <strong>-1/-1</strong>.</li>
         * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p>The priority of the security group rule. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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

        /**
         * <p>The range of ports enabled for the transport layer protocol in the source security group. Valid values:</p>
         * <ul>
         * <li>For TCP or UDP: <strong>1</strong> to <strong>65535</strong>. Use a forward slash (/) to separate the start port and the end port. Correct example: <strong>1/200</strong>. Incorrect example: <strong>200/1</strong>.</li>
         * <li>For ICMP: <strong>-1/-1</strong>.</li>
         * <li>For GRE: <strong>-1/-1</strong>.</li>
         * <li>If IpProtocol is set to all: <strong>-1/-1</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
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
