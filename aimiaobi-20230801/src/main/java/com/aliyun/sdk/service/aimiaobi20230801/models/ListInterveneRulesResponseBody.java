// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInterveneRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterveneRulesResponseBody</p>
 */
public class ListInterveneRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInterveneRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterveneRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInterveneRulesResponseBody build() {
            return new ListInterveneRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterveneRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterveneRulesResponseBody</p>
     */
    public static class AnswerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerType")
        private Integer answerType;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private AnswerConfig(Builder builder) {
            this.answerType = builder.answerType;
            this.message = builder.message;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerConfig create() {
            return builder().build();
        }

        /**
         * @return answerType
         */
        public Integer getAnswerType() {
            return this.answerType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private Integer answerType; 
            private String message; 
            private String namespace; 

            /**
             * AnswerType.
             */
            public Builder answerType(Integer answerType) {
                this.answerType = answerType;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public AnswerConfig build() {
                return new AnswerConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInterveneRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterveneRulesResponseBody</p>
     */
    public static class InterveneRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerConfig")
        private java.util.List < AnswerConfig> answerConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private String effectTime;

        @com.aliyun.core.annotation.NameInMap("InterveneType")
        private Integer interveneType;

        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List < String > namespaceList;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private InterveneRuleList(Builder builder) {
            this.answerConfig = builder.answerConfig;
            this.createTime = builder.createTime;
            this.effectTime = builder.effectTime;
            this.interveneType = builder.interveneType;
            this.namespaceList = builder.namespaceList;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterveneRuleList create() {
            return builder().build();
        }

        /**
         * @return answerConfig
         */
        public java.util.List < AnswerConfig> getAnswerConfig() {
            return this.answerConfig;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return effectTime
         */
        public String getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return interveneType
         */
        public Integer getInterveneType() {
            return this.interveneType;
        }

        /**
         * @return namespaceList
         */
        public java.util.List < String > getNamespaceList() {
            return this.namespaceList;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List < AnswerConfig> answerConfig; 
            private String createTime; 
            private String effectTime; 
            private Integer interveneType; 
            private java.util.List < String > namespaceList; 
            private Long ruleId; 
            private String ruleName; 

            /**
             * AnswerConfig.
             */
            public Builder answerConfig(java.util.List < AnswerConfig> answerConfig) {
                this.answerConfig = answerConfig;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * InterveneType.
             */
            public Builder interveneType(Integer interveneType) {
                this.interveneType = interveneType;
                return this;
            }

            /**
             * NamespaceList.
             */
            public Builder namespaceList(java.util.List < String > namespaceList) {
                this.namespaceList = namespaceList;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public InterveneRuleList build() {
                return new InterveneRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInterveneRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterveneRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("InterveneRuleList")
        private java.util.List < InterveneRuleList> interveneRuleList;

        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Integer pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private Data(Builder builder) {
            this.count = builder.count;
            this.interveneRuleList = builder.interveneRuleList;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return interveneRuleList
         */
        public java.util.List < InterveneRuleList> getInterveneRuleList() {
            return this.interveneRuleList;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private Long count; 
            private java.util.List < InterveneRuleList> interveneRuleList; 
            private Integer pageIndex; 
            private Integer pageSize; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * InterveneRuleList.
             */
            public Builder interveneRuleList(java.util.List < InterveneRuleList> interveneRuleList) {
                this.interveneRuleList = interveneRuleList;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
