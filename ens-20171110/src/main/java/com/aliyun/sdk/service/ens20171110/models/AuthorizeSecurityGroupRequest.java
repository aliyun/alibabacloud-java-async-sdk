// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupRequest</p>
 */
public class AuthorizeSecurityGroupRequest extends Request {
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
    @NameInMap("SourceCidrIp")
    @Validation(required = true)
    private String sourceCidrIp;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private AuthorizeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.ipProtocol = builder.ipProtocol;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.securityGroupId = builder.securityGroupId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupRequest create() {
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupRequest, Builder> {
        private String ipProtocol; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String securityGroupId; 
        private String sourceCidrIp; 
        private String sourcePortRange; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupRequest request) {
            super(request);
            this.ipProtocol = request.ipProtocol;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.securityGroupId = request.securityGroupId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.sourcePortRange = request.sourcePortRange;
            this.version = request.version;
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
         * SourceCidrIp.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
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
         * 2017-11-10
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupRequest build() {
            return new AuthorizeSecurityGroupRequest(this);
        } 

    } 

}
