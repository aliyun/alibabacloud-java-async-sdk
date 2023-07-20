// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SecurityGroupRule} extends {@link TeaModel}
 *
 * <p>SecurityGroupRule</p>
 */
public class SecurityGroupRule extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @NameInMap("Direction")
    private String direction;

    @NameInMap("IpProtocol")
    private String ipProtocol;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("PortRange")
    private String portRange;

    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @NameInMap("priority")
    @Validation(maximum = 100, minimum = 1)
    private Integer priority;

    private SecurityGroupRule(Builder builder) {
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.direction = builder.direction;
        this.ipProtocol = builder.ipProtocol;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
        this.priority = builder.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecurityGroupRule create() {
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static final class Builder {
        private String description; 
        private String destCidrIp; 
        private String direction; 
        private String ipProtocol; 
        private String policy; 
        private String portRange; 
        private String sourceCidrIp; 
        private String sourcePortRange; 
        private Integer priority; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DestCidrIp.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * PortRange.
         */
        public Builder portRange(String portRange) {
            this.portRange = portRange;
            return this;
        }

        /**
         * SourceCidrIp.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * SourcePortRange.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        public SecurityGroupRule build() {
            return new SecurityGroupRule(this);
        } 

    } 

}
