// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < WebCCRules> webCCRules;

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
    public java.util.List < WebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static final class Builder {
        private String domain; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < WebCCRules> webCCRules; 

        /**
         * The domain name of the website.
         */
        public Builder domain(String domain) {
            this.domain = domain;
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
         * The total number of returned custom frequency control rules.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The custom frequency control rules.
         */
        public Builder webCCRules(java.util.List < WebCCRules> webCCRules) {
            this.webCCRules = webCCRules;
            return this;
        }

        public DescribeWebCCRulesV2ResponseBody build() {
            return new DescribeWebCCRulesV2ResponseBody(this);
        } 

    } 

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
             * The match content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The match content when the match method is Equals to One of Multiple Values.
             */
            public Builder contentList(String contentList) {
                this.contentList = contentList;
                return this;
            }

            /**
             * The match field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * The custom HTTP request header.
             * <p>
             * 
             * >  This parameter takes effect only when **Field** is set to **header**.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * The match method.
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
             * The statistical period. Unit: seconds.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The name of the field. This parameter is required only when the Target parameter is set to header.
             */
            public Builder subKey(String subKey) {
                this.subKey = subKey;
                return this;
            }

            /**
             * The statistical method. Valid values:
             * <p>
             * 
             * *   **ip**
             * *   **header**
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The trigger threshold.
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * The blocking duration. Unit: seconds.
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
             * The statistical method. Valid values:
             * <p>
             * 
             * *   **ip**
             * *   **header**
             * *   **uri**
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * The name of the header. This parameter is required only when the Field parameter is set to header.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * Indicates whether the system collects statistics after deduplication. Valid values:
             * <p>
             * 
             * *   **count**: The system collects statistics before deduplication.
             * *   **distinct**: The system collects statistics after deduplication.
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
             * The status code. Valid values: **100** to **599**.
             * <p>
             * 
             * *   **200**: The request was successful.
             * *   Other codes: The request failed.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * If a ratio is not used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of **CountThreshold**. Valid values: **2** to **50000**.
             */
            public Builder countThreshold(Integer countThreshold) {
                this.countThreshold = countThreshold;
                return this;
            }

            /**
             * Indicates whether the status code is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * If a ratio is used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of **RatioThreshold**. Valid values: **1** to **100**.
             */
            public Builder ratioThreshold(Integer ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * Indicates whether to use a ratio.
             * <p>
             * 
             * *   **true**
             * *   **false**
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
    public static class RuleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private java.util.List < Condition> condition;

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
        public java.util.List < Condition> getCondition() {
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
            private java.util.List < Condition> condition; 
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
             * The action triggered if the rule is matched. Valid values:
             * <p>
             * 
             * *   **accept**: The requests that match the rule are allowed.
             * *   **block**: The requests that match the rule are blocked.
             * *   **challenge**: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.
             * *   **watch**: The requests that match the rule are recorded in logs and allowed.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The match conditions.
             */
            public Builder condition(java.util.List < Condition> condition) {
                this.condition = condition;
                return this;
            }

            /**
             * The parameter is deprecated.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The parameter is deprecated.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The parameter is deprecated.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The frequency statistics.
             */
            public Builder rateLimit(RateLimit rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            /**
             * The statistics after deduplication. By default, the system collects statistics before deduplication.
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The status codes.
             */
            public Builder statusCode(StatusCode statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The parameter is deprecated.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * The parameter is deprecated.
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
             * The validity period of the rule. Unit: seconds. If the Action parameter is set to block, the system blocks the requests that match the rule within the validity period of the rule. The value 0 indicates that the rule is permanently valid.
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The method used to create the rule. Valid values:
             * <p>
             * 
             * *   **manual** (default): manually created.
             * *   **clover**: automatically created.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The details of the rule.
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
