// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAntiBruteForceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntiBruteForceRulesResponseBody</p>
 */
public class DescribeAntiBruteForceRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

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
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<Rules> rules; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the defense rule.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeAntiBruteForceRulesResponseBody build() {
            return new DescribeAntiBruteForceRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAntiBruteForceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAntiBruteForceRulesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeAntiBruteForceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAntiBruteForceRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DefaultRule")
        private Boolean defaultRule;

        @com.aliyun.core.annotation.NameInMap("EnableSmartRule")
        private Boolean enableSmartRule;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("ForbiddenTime")
        private Integer forbiddenTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MachineCount")
        private Integer machineCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Span")
        private Integer span;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        private Rules(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
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
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private Boolean defaultRule; 
            private Boolean enableSmartRule; 
            private Integer failCount; 
            private Integer forbiddenTime; 
            private Long id; 
            private Integer machineCount; 
            private String name; 
            private Integer span; 
            private java.util.List<String> uuidList; 

            /**
             * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669800181000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether the defense rule is the default rule. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The defense rule is the default rule.</li>
             * <li><strong>false</strong>: The defense rule is not the default rule.</li>
             * </ul>
             * <blockquote>
             * <p>The default rule takes effect on all servers that are not protected by defense rules against brute-force attacks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultRule(Boolean defaultRule) {
                this.defaultRule = defaultRule;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSmartRule(Boolean enableSmartRule) {
                this.enableSmartRule = enableSmartRule;
                return this;
            }

            /**
             * <p>The threshold of logon failures that is specified in the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The period of time during which logons from an account are not allowed. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>360</p>
             */
            public Builder forbiddenTime(Integer forbiddenTime) {
                this.forbiddenTime = forbiddenTime;
                return this;
            }

            /**
             * <p>The ID of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1629</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of servers to which the defense rule is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder machineCount(Integer machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            /**
             * <p>The name of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>AntiBruteForceRule01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The period of time during which logon failures from an account are measured. Unit: minutes. If <strong>Span</strong> is set to 10, the defense rule takes effect when the logon failures measured within 10 minutes reaches the specified threshold. The IP address of attackers cannot be used to log on to the server in the specified period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder span(Integer span) {
                this.span = span;
                return this;
            }

            /**
             * <p>An array consisting of the UUIDs of servers to which the defense rule is applied.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
