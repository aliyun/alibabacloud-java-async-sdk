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
 * {@link InsertInterveneRuleRequest} extends {@link RequestModel}
 *
 * <p>InsertInterveneRuleRequest</p>
 */
public class InsertInterveneRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InterveneRuleConfig")
    private InterveneRuleConfig interveneRuleConfig;

    private InsertInterveneRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.interveneRuleConfig = builder.interveneRuleConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertInterveneRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return interveneRuleConfig
     */
    public InterveneRuleConfig getInterveneRuleConfig() {
        return this.interveneRuleConfig;
    }

    public static final class Builder extends Request.Builder<InsertInterveneRuleRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private InterveneRuleConfig interveneRuleConfig; 

        private Builder() {
            super();
        } 

        private Builder(InsertInterveneRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.interveneRuleConfig = request.interveneRuleConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * InterveneRuleConfig.
         */
        public Builder interveneRuleConfig(InterveneRuleConfig interveneRuleConfig) {
            String interveneRuleConfigShrink = shrink(interveneRuleConfig, "InterveneRuleConfig", "json");
            this.putBodyParameter("InterveneRuleConfig", interveneRuleConfigShrink);
            this.interveneRuleConfig = interveneRuleConfig;
            return this;
        }

        @Override
        public InsertInterveneRuleRequest build() {
            return new InsertInterveneRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link InsertInterveneRuleRequest} extends {@link TeaModel}
     *
     * <p>InsertInterveneRuleRequest</p>
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
     * {@link InsertInterveneRuleRequest} extends {@link TeaModel}
     *
     * <p>InsertInterveneRuleRequest</p>
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
     * {@link InsertInterveneRuleRequest} extends {@link TeaModel}
     *
     * <p>InsertInterveneRuleRequest</p>
     */
    public static class InterveneConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private Integer operationType;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        private InterveneConfigList(Builder builder) {
            this.id = builder.id;
            this.operationType = builder.operationType;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterveneConfigList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return operationType
         */
        public Integer getOperationType() {
            return this.operationType;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String id; 
            private Integer operationType; 
            private String query; 

            private Builder() {
            } 

            private Builder(InterveneConfigList model) {
                this.id = model.id;
                this.operationType = model.operationType;
                this.query = model.query;
            } 

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>37249</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(Integer operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public InterveneConfigList build() {
                return new InterveneConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InsertInterveneRuleRequest} extends {@link TeaModel}
     *
     * <p>InsertInterveneRuleRequest</p>
     */
    public static class InterveneRuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerConfig")
        private java.util.List<AnswerConfig> answerConfig;

        @com.aliyun.core.annotation.NameInMap("EffectConfig")
        private EffectConfig effectConfig;

        @com.aliyun.core.annotation.NameInMap("InterveneConfigList")
        private java.util.List<InterveneConfigList> interveneConfigList;

        @com.aliyun.core.annotation.NameInMap("InterveneType")
        private Integer interveneType;

        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List<String> namespaceList;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private InterveneRuleConfig(Builder builder) {
            this.answerConfig = builder.answerConfig;
            this.effectConfig = builder.effectConfig;
            this.interveneConfigList = builder.interveneConfigList;
            this.interveneType = builder.interveneType;
            this.namespaceList = builder.namespaceList;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterveneRuleConfig create() {
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
         * @return interveneConfigList
         */
        public java.util.List<InterveneConfigList> getInterveneConfigList() {
            return this.interveneConfigList;
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
            private java.util.List<InterveneConfigList> interveneConfigList; 
            private Integer interveneType; 
            private java.util.List<String> namespaceList; 
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(InterveneRuleConfig model) {
                this.answerConfig = model.answerConfig;
                this.effectConfig = model.effectConfig;
                this.interveneConfigList = model.interveneConfigList;
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
             * InterveneConfigList.
             */
            public Builder interveneConfigList(java.util.List<InterveneConfigList> interveneConfigList) {
                this.interveneConfigList = interveneConfigList;
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

            public InterveneRuleConfig build() {
                return new InterveneRuleConfig(this);
            } 

        } 

    }
}
