// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntiBruteForceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntiBruteForceRulesResponseBody</p>
 */
public class DescribeAntiBruteForceRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    private DescribeAntiBruteForceRulesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntiBruteForceRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < Rules> rules; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the defense rules returned.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeAntiBruteForceRulesResponseBody build() {
            return new DescribeAntiBruteForceRulesResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("DefaultRule")
        private Boolean defaultRule;

        @NameInMap("EnableSmartRule")
        private Boolean enableSmartRule;

        @NameInMap("FailCount")
        private Integer failCount;

        @NameInMap("ForbiddenTime")
        private Integer forbiddenTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MachineCount")
        private Integer machineCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("Span")
        private Integer span;

        @NameInMap("UuidList")
        private java.util.List < String > uuidList;

        private Rules(Builder builder) {
            this.defaultRule = builder.defaultRule;
            this.enableSmartRule = builder.enableSmartRule;
            this.failCount = builder.failCount;
            this.forbiddenTime = builder.forbiddenTime;
            this.id = builder.id;
            this.machineCount = builder.machineCount;
            this.name = builder.name;
            this.span = builder.span;
            this.uuidList = builder.uuidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return defaultRule
         */
        public Boolean getDefaultRule() {
            return this.defaultRule;
        }

        /**
         * @return enableSmartRule
         */
        public Boolean getEnableSmartRule() {
            return this.enableSmartRule;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return forbiddenTime
         */
        public Integer getForbiddenTime() {
            return this.forbiddenTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return machineCount
         */
        public Integer getMachineCount() {
            return this.machineCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return span
         */
        public Integer getSpan() {
            return this.span;
        }

        /**
         * @return uuidList
         */
        public java.util.List < String > getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private Boolean defaultRule; 
            private Boolean enableSmartRule; 
            private Integer failCount; 
            private Integer forbiddenTime; 
            private Long id; 
            private Integer machineCount; 
            private String name; 
            private Integer span; 
            private java.util.List < String > uuidList; 

            /**
             * Indicates whether the defense rule is the default rule. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             * 
             * >  The default rule takes effect on all servers that are not protected by defense rules against brute-force attacks.
             */
            public Builder defaultRule(Boolean defaultRule) {
                this.defaultRule = defaultRule;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder enableSmartRule(Boolean enableSmartRule) {
                this.enableSmartRule = enableSmartRule;
                return this;
            }

            /**
             * The threshold of logon failures that you specify.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The period of time during which logons from an account are not allowed. Unit: minutes.
             */
            public Builder forbiddenTime(Integer forbiddenTime) {
                this.forbiddenTime = forbiddenTime;
                return this;
            }

            /**
             * The ID of the defense rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of servers to which the defense rule is applied.
             */
            public Builder machineCount(Integer machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            /**
             * The name of the defense rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The period of time during which logon failures from an account are measured. Unit: minutes. If **Span** is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.
             */
            public Builder span(Integer span) {
                this.span = span;
                return this;
            }

            /**
             * An array consisting of the UUIDs of servers to which the defense rule is applied.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
