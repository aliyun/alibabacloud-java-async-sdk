// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetInterveneRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterveneRuleDetailResponseBody</p>
 */
public class GetInterveneRuleDetailResponseBody extends TeaModel {
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

    private GetInterveneRuleDetailResponseBody(Builder builder) {
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

    public static GetInterveneRuleDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInterveneRuleDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public GetInterveneRuleDetailResponseBody build() {
            return new GetInterveneRuleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInterveneRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterveneRuleDetailResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AnswerConfig model) {
                this.answerType = model.answerType;
                this.message = model.message;
                this.namespace = model.namespace;
            } 

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
     * {@link GetInterveneRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterveneRuleDetailResponseBody</p>
     */
    public static class EffectConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectType")
        private Integer effectType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private EffectConfig(Builder builder) {
            this.effectType = builder.effectType;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectConfig create() {
            return builder().build();
        }

        /**
         * @return effectType
         */
        public Integer getEffectType() {
            return this.effectType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer effectType; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(EffectConfig model) {
                this.effectType = model.effectType;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * EffectType.
             */
            public Builder effectType(Integer effectType) {
                this.effectType = effectType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public EffectConfig build() {
                return new EffectConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInterveneRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterveneRuleDetailResponseBody</p>
     */
    public static class InterveneRuleDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerConfig")
        private java.util.List<AnswerConfig> answerConfig;

        @com.aliyun.core.annotation.NameInMap("EffectConfig")
        private EffectConfig effectConfig;

        @com.aliyun.core.annotation.NameInMap("InterveneType")
        private Integer interveneType;

        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List<String> namespaceList;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private InterveneRuleDetail(Builder builder) {
            this.answerConfig = builder.answerConfig;
            this.effectConfig = builder.effectConfig;
            this.interveneType = builder.interveneType;
            this.namespaceList = builder.namespaceList;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterveneRuleDetail create() {
            return builder().build();
        }

        /**
         * @return answerConfig
         */
        public java.util.List<AnswerConfig> getAnswerConfig() {
            return this.answerConfig;
        }

        /**
         * @return effectConfig
         */
        public EffectConfig getEffectConfig() {
            return this.effectConfig;
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
        public java.util.List<String> getNamespaceList() {
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
            private java.util.List<AnswerConfig> answerConfig; 
            private EffectConfig effectConfig; 
            private Integer interveneType; 
            private java.util.List<String> namespaceList; 
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(InterveneRuleDetail model) {
                this.answerConfig = model.answerConfig;
                this.effectConfig = model.effectConfig;
                this.interveneType = model.interveneType;
                this.namespaceList = model.namespaceList;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * AnswerConfig.
             */
            public Builder answerConfig(java.util.List<AnswerConfig> answerConfig) {
                this.answerConfig = answerConfig;
                return this;
            }

            /**
             * EffectConfig.
             */
            public Builder effectConfig(EffectConfig effectConfig) {
                this.effectConfig = effectConfig;
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
            public Builder namespaceList(java.util.List<String> namespaceList) {
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

            public InterveneRuleDetail build() {
                return new InterveneRuleDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInterveneRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterveneRuleDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("InterveneRuleDetail")
        private InterveneRuleDetail interveneRuleDetail;

        private Data(Builder builder) {
            this.code = builder.code;
            this.interveneRuleDetail = builder.interveneRuleDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return interveneRuleDetail
         */
        public InterveneRuleDetail getInterveneRuleDetail() {
            return this.interveneRuleDetail;
        }

        public static final class Builder {
            private Integer code; 
            private InterveneRuleDetail interveneRuleDetail; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.interveneRuleDetail = model.interveneRuleDetail;
            } 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * InterveneRuleDetail.
             */
            public Builder interveneRuleDetail(InterveneRuleDetail interveneRuleDetail) {
                this.interveneRuleDetail = interveneRuleDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
