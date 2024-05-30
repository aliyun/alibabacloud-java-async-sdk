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
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WebCCRules.
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

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("HeaderName")
        private String headerName;

        @com.aliyun.core.annotation.NameInMap("MatchMethod")
        private String matchMethod;

        private Condition(Builder builder) {
            this.content = builder.content;
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
            private String field; 
            private String headerName; 
            private String matchMethod; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * HeaderName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * MatchMethod.
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
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * SubKey.
             */
            public Builder subKey(String subKey) {
                this.subKey = subKey;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Ttl.
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
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * HeaderName.
             */
            public Builder headerName(String headerName) {
                this.headerName = headerName;
                return this;
            }

            /**
             * Mode.
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
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * CountThreshold.
             */
            public Builder countThreshold(Integer countThreshold) {
                this.countThreshold = countThreshold;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * RatioThreshold.
             */
            public Builder ratioThreshold(Integer ratioThreshold) {
                this.ratioThreshold = ratioThreshold;
                return this;
            }

            /**
             * UseRatio.
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Condition.
             */
            public Builder condition(java.util.List < Condition> condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RateLimit.
             */
            public Builder rateLimit(RateLimit rateLimit) {
                this.rateLimit = rateLimit;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * StatusCode.
             */
            public Builder statusCode(StatusCode statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * Uri.
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
             * Expires.
             */
            public Builder expires(Long expires) {
                this.expires = expires;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RuleDetail.
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
