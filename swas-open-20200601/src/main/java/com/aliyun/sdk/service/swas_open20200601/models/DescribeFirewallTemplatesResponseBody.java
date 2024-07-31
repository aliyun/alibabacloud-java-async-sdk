// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFirewallTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallTemplatesResponseBody</p>
 */
public class DescribeFirewallTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallTemplates")
    private java.util.List < FirewallTemplates> firewallTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFirewallTemplatesResponseBody(Builder builder) {
        this.firewallTemplates = builder.firewallTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallTemplates
     */
    public java.util.List < FirewallTemplates> getFirewallTemplates() {
        return this.firewallTemplates;
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
        private java.util.List < FirewallTemplates> firewallTemplates; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the queried firewall templates.
         */
        public Builder firewallTemplates(java.util.List < FirewallTemplates> firewallTemplates) {
            this.firewallTemplates = firewallTemplates;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20.
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

        public DescribeFirewallTemplatesResponseBody build() {
            return new DescribeFirewallTemplatesResponseBody(this);
        } 

    } 

    public static class FirewallTemplateRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallTemplateRuleId")
        private String firewallTemplateRuleId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private FirewallTemplateRules(Builder builder) {
            this.firewallTemplateRuleId = builder.firewallTemplateRuleId;
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallTemplateRules create() {
            return builder().build();
        }

        /**
         * @return firewallTemplateRuleId
         */
        public String getFirewallTemplateRuleId() {
            return this.firewallTemplateRuleId;
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
            private String firewallTemplateRuleId; 
            private String port; 
            private String remark; 
            private String ruleProtocol; 
            private String sourceCidrIp; 

            /**
             * The ID of the firewall template rule.
             */
            public Builder firewallTemplateRuleId(String firewallTemplateRuleId) {
                this.firewallTemplateRuleId = firewallTemplateRuleId;
                return this;
            }

            /**
             * The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 1024 to 1055.
             * <p>
             * 
             * >  If you set RuleProtocol to ICMP, you must set Port to -1/-1.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The remarks of the firewall template rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The transport layer protocol that the rule supports. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             * *   TCP+UDP
             * *   ICMP
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public FirewallTemplateRules build() {
                return new FirewallTemplateRules(this);
            } 

        } 

    }
    public static class FirewallTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
        private String firewallTemplateId;

        @com.aliyun.core.annotation.NameInMap("FirewallTemplateRules")
        private java.util.List < FirewallTemplateRules> firewallTemplateRules;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private FirewallTemplates(Builder builder) {
            this.createTime = builder.createTime;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.firewallTemplateId = builder.firewallTemplateId;
            this.firewallTemplateRules = builder.firewallTemplateRules;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallTemplates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return firewallTemplateId
         */
        public String getFirewallTemplateId() {
            return this.firewallTemplateId;
        }

        /**
         * @return firewallTemplateRules
         */
        public java.util.List < FirewallTemplateRules> getFirewallTemplateRules() {
            return this.firewallTemplateRules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String createTime; 
            private String creationTime; 
            private String description; 
            private String firewallTemplateId; 
            private java.util.List < FirewallTemplateRules> firewallTemplateRules; 
            private String name; 

            /**
             * The time when the firewall template was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the Simple Application Server console is in the format of UTC+8.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the firewall template was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the firewall template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the firewall template.
             */
            public Builder firewallTemplateId(String firewallTemplateId) {
                this.firewallTemplateId = firewallTemplateId;
                return this;
            }

            /**
             * The details of the firewall template rules.
             */
            public Builder firewallTemplateRules(java.util.List < FirewallTemplateRules> firewallTemplateRules) {
                this.firewallTemplateRules = firewallTemplateRules;
                return this;
            }

            /**
             * The name of the firewall template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FirewallTemplates build() {
                return new FirewallTemplates(this);
            } 

        } 

    }
}
