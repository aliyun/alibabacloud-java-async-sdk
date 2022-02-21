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

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private RevokeSecurityGroupEgressRequest(Builder builder) {
        super(builder);
        this.destCidrIp = builder.destCidrIp;
        this.ipProtocol = builder.ipProtocol;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.securityGroupId = builder.securityGroupId;
        this.sourcePortRange = builder.sourcePortRange;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<RevokeSecurityGroupEgressRequest, Builder> {
        private String destCidrIp; 
        private String ipProtocol; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String securityGroupId; 
        private String sourcePortRange; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupEgressRequest response) {
            super(response);
            this.destCidrIp = response.destCidrIp;
            this.ipProtocol = response.ipProtocol;
            this.policy = response.policy;
            this.portRange = response.portRange;
            this.priority = response.priority;
            this.securityGroupId = response.securityGroupId;
            this.sourcePortRange = response.sourcePortRange;
            this.version = response.version;
        } 

        /**
         * DestCidrIp.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * PortRange.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * SourcePortRange.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public RevokeSecurityGroupEgressRequest build() {
            return new RevokeSecurityGroupEgressRequest(this);
        } 

    } 

}
