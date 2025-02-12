// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCCRulesV2ResponseBody</p>
 */
public class DescribeWebCCRulesV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("WebCCRules")
    private java.util.List<WebCCRules> webCCRules;

    private DescribeWebCCRulesV2ResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.webCCRules = builder.webCCRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCCRulesV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return webCCRules
     */
    public java.util.List<WebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static final class Builder {
        private String domain; 
        private String requestId; 
        private String totalCount; 
        private java.util.List<WebCCRules> webCCRules; 

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned custom frequency control rules.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The custom frequency control rules.</p>
         */
        public Builder webCCRules(java.util.List<WebCCRules> webCCRules) {
            this.webCCRules = webCCRules;
            return this;
        }

        public DescribeWebCCRulesV2ResponseBody build() {
            return new DescribeWebCCRulesV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentList")
        private String contentList;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("MatchMethod")
        private String matchMethod;

        private Condition(Builder builder) {
            this.content = builder.content;
            this.contentList = builder.contentList;
            this.field = builder.field;
            this.headerName = builder.headerName;
            this.matchMethod = builder.matchMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentList
         */
        public String getContentList() {
            return this.contentList;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return matchMethod
         */
        public String getMatchMethod() {
            return this.matchMethod;
        }

        public static final class Builder {
            private String content; 
            private String contentList; 
            private String field; 
            private String headerName; 
            private String matchMethod; 

            /**
             * <p>The match content.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The match content when the match method is Equals to One of Multiple Values.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;2&quot;,&quot;3&quot;,&quot;ad&quot;]</p>
             */
            public Builder contentList(String contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * <p>The match field.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The custom HTTP request header.</p>
             * <blockquote>
             * <p> This parameter takes effect only when <strong>Field</strong> is set to <strong>header</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>The match method.</p>
             * 
             * <strong>example:</strong>
             * <p>belong</p>
             */
            public Builder matchMethod(String matchMethod) {
                this.matchMethod = matchMethod;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class RateLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("SubKey")
        private String subKey;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Integer threshold;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private RateLimit(Builder builder) {
            this.interval = builder.interval;
            this.subKey = builder.subKey;
            this.target = builder.target;
            this.threshold = builder.threshold;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RateLimit create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return subKey
         */
        public String getSubKey() {
            return this.subKey;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private Integer interval; 
            private String subKey; 
            private String target; 
            private Integer threshold; 
            private Integer ttl; 

            /**
             * <p>The statistical period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The name of the field. This parameter is required only when the Target parameter is set to header.</p>
             * 
             * <strong>example:</strong>
             * <p>action</p>
             */
            public Builder subKey(String subKey) {
                this.subKey = subKey;
                return this;
            }

            /**
             * <p>The statistical method. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong></li>
             * <li><strong>header</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The trigger threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The blocking duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public RateLimit build() {
                return new RateLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private Statistics(Builder builder) {
            this.field = builder.field;
            this.headerName = builder.headerName;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return headerName
         */
        public String getHeaderName() {
            return this.headerName;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private String field; 
            private String headerName; 
            private String mode; 

            /**
             * <p>The statistical method. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong></li>
             * <li><strong>header</strong></li>
             * <li><strong>uri</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uri</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The name of the header. This parameter is required only when the Field parameter is set to header.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * <p>Indicates whether the system collects statistics after deduplication. Valid values:</p>
             * <ul>
             * <li><strong>count</strong>: The system collects statistics before deduplication.</li>
             * <li><strong>distinct</strong>: The system collects statistics after deduplication.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>count</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class StatusCode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("CountThreshold")
        private Integer countThreshold;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("RatioThreshold")
        private Integer ratioThreshold;

        @com.aliyun.core.annotation.NameInMap("UseRatio")
        private Boolean useRatio;

        private StatusCode(Builder builder) {
            this.code = builder.code;
            this.countThreshold = builder.countThreshold;
            this.enabled = builder.enabled;
            this.ratioThreshold = builder.ratioThreshold;
            this.useRatio = builder.useRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusCode create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return countThreshold
         */
        public Integer getCountThreshold() {
            return this.countThreshold;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return ratioThreshold
         */
        public Integer getRatioThreshold() {
            return this.ratioThreshold;
        }

        /**
         * @return useRatio
         */
        public Boolean getUseRatio() {
            return this.useRatio;
        }

        public static final class Builder {
            private Integer code; 
            private Integer countThreshold; 
            private Boolean enabled; 
            private Integer ratioThreshold; 
            private Boolean useRatio; 

            /**
             * <p>The status code. Valid values: <strong>100</strong> to <strong>599</strong>.</p>
             * <ul>
             * <li><strong>200</strong>: The request was successful.</li>
             * <li>Other codes: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>If a ratio is not used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of <strong>CountThreshold</strong>. Valid values: <strong>2</strong> to <strong>50000</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder countThreshold(Integer countThreshold) {
                this.countThreshold = countThreshold;
                return this;
            }

            /**
             * <p>Indicates whether the status code is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>If a ratio is used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of <strong>RatioThreshold</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ratioThreshold(Integer ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * <p>Indicates whether to use a ratio.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useRatio(Boolean useRatio) {
                this.useRatio = useRatio;
                return this;
            }

            public StatusCode build() {
                return new StatusCode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class RuleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private java.util.List<Condition> condition;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RateLimit")
        private RateLimit rateLimit;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private Statistics statistics;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private StatusCode statusCode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private RuleDetail(Builder builder) {
            this.action = builder.action;
            this.condition = builder.condition;
            this.count = builder.count;
            this.interval = builder.interval;
            this.mode = builder.mode;
            this.name = builder.name;
            this.rateLimit = builder.rateLimit;
            this.statistics = builder.statistics;
            this.statusCode = builder.statusCode;
            this.ttl = builder.ttl;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleDetail create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return condition
         */
        public java.util.List<Condition> getCondition() {
            return this.condition;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rateLimit
         */
        public RateLimit getRateLimit() {
            return this.rateLimit;
        }

        /**
         * @return statistics
         */
        public Statistics getStatistics() {
            return this.statistics;
        }

        /**
         * @return statusCode
         */
        public StatusCode getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<Condition> condition; 
            private Integer count; 
            private Integer interval; 
            private String mode; 
            private String name; 
            private RateLimit rateLimit; 
            private Statistics statistics; 
            private StatusCode statusCode; 
            private Integer ttl; 
            private String uri; 

            /**
             * <p>The action triggered if the rule is matched. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong>: The requests that match the rule are allowed.</li>
             * <li><strong>block</strong>: The requests that match the rule are blocked.</li>
             * <li><strong>challenge</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
             * <li><strong>watch</strong>: The requests that match the rule are recorded in logs and allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The match conditions.</p>
             */
            public Builder condition(java.util.List<Condition> condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The parameter is deprecated.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The parameter is deprecated.</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ccauto14</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The frequency statistics.</p>
             */
            public Builder rateLimit(RateLimit rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            /**
             * <p>The statistics after deduplication. By default, the system collects statistics before deduplication.</p>
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The status codes.</p>
             */
            public Builder statusCode(StatusCode statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>/p3shijihao</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public RuleDetail build() {
                return new RuleDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebCCRulesV2ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCCRulesV2ResponseBody</p>
     */
    public static class WebCCRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expires")
        private Long expires;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RuleDetail")
        private RuleDetail ruleDetail;

        private WebCCRules(Builder builder) {
            this.expires = builder.expires;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ruleDetail = builder.ruleDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebCCRules create() {
            return builder().build();
        }

        /**
         * @return expires
         */
        public Long getExpires() {
            return this.expires;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ruleDetail
         */
        public RuleDetail getRuleDetail() {
            return this.ruleDetail;
        }

        public static final class Builder {
            private Long expires; 
            private String name; 
            private String owner; 
            private RuleDetail ruleDetail; 

            /**
             * <p>The validity period of the rule. Unit: seconds. If the Action parameter is set to block, the system blocks the requests that match the rule within the validity period of the rule. The value 0 indicates that the rule is permanently valid.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>wq</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The method used to create the rule. Valid values:</p>
             * <ul>
             * <li><strong>manual</strong> (default): manually created.</li>
             * <li><strong>clover</strong>: automatically created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The details of the rule.</p>
             */
            public Builder ruleDetail(RuleDetail ruleDetail) {
                this.ruleDetail = ruleDetail;
                return this;
            }

            public WebCCRules build() {
                return new WebCCRules(this);
            } 

        } 

    }
}
