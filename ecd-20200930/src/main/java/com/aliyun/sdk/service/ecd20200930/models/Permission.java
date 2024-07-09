// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Permission} extends {@link TeaModel}
 *
 * <p>Permission</p>
 */
public class Permission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DestCidrIp")
    private String destCidrIp;

    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.NameInMap("NicType")
    private String nicType;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("PortRange")
    private String portRange;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    private Permission(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.ipProtocol = builder.ipProtocol;
        this.nicType = builder.nicType;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourcePortRange = builder.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Permission create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
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
    public String getPriority() {
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
        private String createTime; 
        private String description; 
        private String destCidrIp; 
        private String ipProtocol; 
        private String nicType; 
        private String policy; 
        private String portRange; 
        private String priority; 
        private String sourceCidrIp; 
        private String sourcePortRange; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

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
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * NicType.
         */
        public Builder nicType(String nicType) {
            this.nicType = nicType;
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
         * Priority.
         */
        public Builder priority(String priority) {
            this.priority = priority;
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

        public Permission build() {
            return new Permission(this);
        } 

    } 

}
