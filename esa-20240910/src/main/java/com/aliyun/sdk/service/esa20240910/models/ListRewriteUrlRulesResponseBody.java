// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRewriteUrlRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRewriteUrlRulesResponseBody</p>
 */
public class ListRewriteUrlRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListRewriteUrlRulesResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRewriteUrlRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
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
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListRewriteUrlRulesResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>List of rewrite URL configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The size of the page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListRewriteUrlRulesResponseBody build() {
            return new ListRewriteUrlRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRewriteUrlRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRewriteUrlRulesResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("QueryString")
        private String queryString;

        @com.aliyun.core.annotation.NameInMap("RewriteQueryStringType")
        private String rewriteQueryStringType;

        @com.aliyun.core.annotation.NameInMap("RewriteUriType")
        private String rewriteUriType;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("RuleEnable")
        private String ruleEnable;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Configs(Builder builder) {
            this.configId = builder.configId;
            this.configType = builder.configType;
            this.queryString = builder.queryString;
            this.rewriteQueryStringType = builder.rewriteQueryStringType;
            this.rewriteUriType = builder.rewriteUriType;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.siteVersion = builder.siteVersion;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return queryString
         */
        public String getQueryString() {
            return this.queryString;
        }

        /**
         * @return rewriteQueryStringType
         */
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        /**
         * @return rewriteUriType
         */
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return ruleEnable
         */
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private Long configId; 
            private String configType; 
            private String queryString; 
            private String rewriteQueryStringType; 
            private String rewriteUriType; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Integer siteVersion; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.configId = model.configId;
                this.configType = model.configType;
                this.queryString = model.queryString;
                this.rewriteQueryStringType = model.rewriteQueryStringType;
                this.rewriteUriType = model.rewriteUriType;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.siteVersion = model.siteVersion;
                this.uri = model.uri;
            } 

            /**
             * <p>Configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>39538644977****</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>Configuration type. Value range:</p>
             * <ul>
             * <li>global: Global configuration;</li>
             * <li>rule: Rule configuration;</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The rewritten query string.</p>
             * 
             * <strong>example:</strong>
             * <p>example=123</p>
             */
            public Builder queryString(String queryString) {
                this.queryString = queryString;
                return this;
            }

            /**
             * <p>Query string rewrite type. Value range:</p>
             * <ul>
             * <li>static: Static mode.</li>
             * <li>dynamic: Dynamic mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder rewriteQueryStringType(String rewriteQueryStringType) {
                this.rewriteQueryStringType = rewriteQueryStringType;
                return this;
            }

            /**
             * <p>URI rewrite type. Value range:</p>
             * <ul>
             * <li>static: Static mode.</li>
             * <li>dynamic: Dynamic mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
             */
            public Builder rewriteUriType(String rewriteUriType) {
                this.rewriteUriType = rewriteUriType;
                return this;
            }

            /**
             * <p>Rule content, using conditional expressions to match user requests. Not required when adding a global configuration. There are two usage scenarios:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true</li>
             * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq &quot;video.example.com&quot;)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(http.host eq &quot;video.example.com&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>Rule switch. Not required when adding a global configuration. Value range:</p>
             * <ul>
             * <li>on: Enabled.</li>
             * <li>off: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleEnable(String ruleEnable) {
                this.ruleEnable = ruleEnable;
                return this;
            }

            /**
             * <p>Rule name. Not required when adding a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Rule execution order. The smaller the value, the higher the priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the configuration, defaulting to version 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * <p>Target URI after rewriting.</p>
             * 
             * <strong>example:</strong>
             * <p>/image.example.com/index.html</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
