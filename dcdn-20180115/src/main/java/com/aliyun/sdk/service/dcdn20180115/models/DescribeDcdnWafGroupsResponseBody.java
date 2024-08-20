// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafGroupsResponseBody</p>
 */
public class DescribeDcdnWafGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WafGroups")
    private java.util.List < WafGroups> wafGroups;

    private DescribeDcdnWafGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.wafGroups = builder.wafGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafGroupsResponseBody create() {
        return builder().build();
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

    /**
     * @return wafGroups
     */
    public java.util.List < WafGroups> getWafGroups() {
        return this.wafGroups;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WafGroups> wafGroups; 

        /**
         * The page number of the returned page. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
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
         * The number of WAF rule groups.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of WAF rule groups.
         */
        public Builder wafGroups(java.util.List < WafGroups> wafGroups) {
            this.wafGroups = wafGroups;
            return this;
        }

        public DescribeDcdnWafGroupsResponseBody build() {
            return new DescribeDcdnWafGroupsResponseBody(this);
        } 

    } 

    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Policies(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String type; 

            /**
             * The ID of the policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the policy. Valid values:
             * <p>
             * 
             * *   **custom**: a custom policy
             * *   **default**: the default policy
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    public static class WafGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List < Policies> policies;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("Subscribe")
        private String subscribe;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private WafGroups(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.policies = builder.policies;
            this.ruleCount = builder.ruleCount;
            this.subscribe = builder.subscribe;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafGroups create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policies
         */
        public java.util.List < Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return subscribe
         */
        public String getSubscribe() {
            return this.subscribe;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String gmtModified; 
            private Long id; 
            private String name; 
            private java.util.List < Policies> policies; 
            private Integer ruleCount; 
            private String subscribe; 
            private Long templateId; 

            /**
             * The time when the WAF rule group was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the custom WAF rule group.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the WAF rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The policy that is associated with the WAF rule group.
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * The number of WAF rules.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * Indicates whether to enable subscription. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder subscribe(String subscribe) {
                this.subscribe = subscribe;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public WafGroups build() {
                return new WafGroups(this);
            } 

        } 

    }
}
