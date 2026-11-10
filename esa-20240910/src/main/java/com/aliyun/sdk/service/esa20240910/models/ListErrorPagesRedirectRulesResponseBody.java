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
 * {@link ListErrorPagesRedirectRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListErrorPagesRedirectRulesResponseBody</p>
 */
public class ListErrorPagesRedirectRulesResponseBody extends TeaModel {
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

    private ListErrorPagesRedirectRulesResponseBody(Builder builder) {
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

    public static ListErrorPagesRedirectRulesResponseBody create() {
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

        private Builder(ListErrorPagesRedirectRulesResponseBody model) {
            this.configs = model.configs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The error code redirection configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 500. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListErrorPagesRedirectRulesResponseBody build() {
            return new ListErrorPagesRedirectRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListErrorPagesRedirectRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListErrorPagesRedirectRulesResponseBody</p>
     */
    public static class ErrorPagesRedirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetURL")
        private String targetURL;

        private ErrorPagesRedirect(Builder builder) {
            this.statusCode = builder.statusCode;
            this.targetURL = builder.targetURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorPagesRedirect create() {
            return builder().build();
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return targetURL
         */
        public String getTargetURL() {
            return this.targetURL;
        }

        public static final class Builder {
            private String statusCode; 
            private String targetURL; 

            private Builder() {
            } 

            private Builder(ErrorPagesRedirect model) {
                this.statusCode = model.statusCode;
                this.targetURL = model.targetURL;
            } 

            /**
             * <p>The response status code used by the node when responding to the client with a redirect address. Valid values:</p>
             * <ul>
             * <li>400</li>
             * <li>403</li>
             * <li>404</li>
             * <li>405</li>
             * <li>414</li>
             * <li>416</li>
             * <li>500</li>
             * <li>501</li>
             * <li>502</li>
             * <li>503</li>
             * <li>504</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The target URL after redirection.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/test">http://example.com/test</a></p>
             */
            public Builder targetURL(String targetURL) {
                this.targetURL = targetURL;
                return this;
            }

            public ErrorPagesRedirect build() {
                return new ErrorPagesRedirect(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListErrorPagesRedirectRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListErrorPagesRedirectRulesResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("ErrorPagesRedirect")
        private java.util.List<ErrorPagesRedirect> errorPagesRedirect;

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

        private Configs(Builder builder) {
            this.configId = builder.configId;
            this.configType = builder.configType;
            this.errorPagesRedirect = builder.errorPagesRedirect;
            this.rule = builder.rule;
            this.ruleEnable = builder.ruleEnable;
            this.ruleName = builder.ruleName;
            this.sequence = builder.sequence;
            this.siteVersion = builder.siteVersion;
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
         * @return errorPagesRedirect
         */
        public java.util.List<ErrorPagesRedirect> getErrorPagesRedirect() {
            return this.errorPagesRedirect;
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

        public static final class Builder {
            private Long configId; 
            private String configType; 
            private java.util.List<ErrorPagesRedirect> errorPagesRedirect; 
            private String rule; 
            private String ruleEnable; 
            private String ruleName; 
            private Integer sequence; 
            private Integer siteVersion; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.configId = model.configId;
                this.configType = model.configType;
                this.errorPagesRedirect = model.errorPagesRedirect;
                this.rule = model.rule;
                this.ruleEnable = model.ruleEnable;
                this.ruleName = model.ruleName;
                this.sequence = model.sequence;
                this.siteVersion = model.siteVersion;
            } 

            /**
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>395386449776640</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The configuration type. Valid values:</p>
             * <ul>
             * <li>global: global configuration.</li>
             * <li>rule: rule configuration.</li>
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
             * <p>The error code redirection.</p>
             */
            public Builder errorPagesRedirect(java.util.List<ErrorPagesRedirect> errorPagesRedirect) {
                this.errorPagesRedirect = errorPagesRedirect;
                return this;
            }

            /**
             * <p>The rule content. A conditional expression is used to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
             * <ul>
             * <li>Match all incoming requests: Set the value to true.</li>
             * <li>Match specific requests: Set the value to a custom expression, such as (http.host eq &quot;video.example.com&quot;).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
             * <ul>
             * <li>on: enables the rule.</li>
             * <li>off: disables the rule.</li>
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
             * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>rule_example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The execution sequence of the rule. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
