// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFirewallRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFirewallRulesResponseBody</p>
 */
public class ListFirewallRulesResponseBody extends TeaModel {
    @NameInMap("FirewallRules")
    private java.util.List < FirewallRules> firewallRules;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListFirewallRulesResponseBody(Builder builder) {
        this.firewallRules = builder.firewallRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFirewallRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallRules
     */
    public java.util.List < FirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FirewallRules> firewallRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the firewall rules.
         */
        public Builder firewallRules(java.util.List < FirewallRules> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFirewallRulesResponseBody build() {
            return new ListFirewallRulesResponseBody(this);
        } 

    } 

    public static class FirewallRules extends TeaModel {
        @NameInMap("Policy")
        private String policy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleProtocol")
        private String ruleProtocol;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private FirewallRules(Builder builder) {
            this.policy = builder.policy;
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleId = builder.ruleId;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallRules create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleProtocol
         */
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String policy; 
            private String port; 
            private String remark; 
            private String ruleId; 
            private String ruleProtocol; 
            private String sourceCidrIp; 

            /**
             * The firewall policy.
             * <p>
             * 
             * *   accept: Access is allowed.
             * *   drop: Access is refused.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The port range.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The remarks of the firewall rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the firewall rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The transport layer protocol. Valid values:
             * <p>
             * 
             * *   TCP: the TCP protocol.
             * *   UDP: the UDP protocol
             * *   TCP+UDP: the TCP and UDP protocols
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * The IP address or CIDR block that is allowed by the firewall rule.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public FirewallRules build() {
                return new FirewallRules(this);
            } 

        } 

    }
}
