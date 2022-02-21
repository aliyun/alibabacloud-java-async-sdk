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
         * FirewallRules.
         */
        public Builder firewallRules(java.util.List < FirewallRules> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("Port")
        private String port;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleProtocol")
        private String ruleProtocol;

        private FirewallRules(Builder builder) {
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleId = builder.ruleId;
            this.ruleProtocol = builder.ruleProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallRules create() {
            return builder().build();
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

        public static final class Builder {
            private String port; 
            private String remark; 
            private String ruleId; 
            private String ruleProtocol; 

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleProtocol.
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            public FirewallRules build() {
                return new FirewallRules(this);
            } 

        } 

    }
}
