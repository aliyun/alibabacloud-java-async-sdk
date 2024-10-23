// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunContractResultGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunContractResultGenerationRequest</p>
 */
public class RunContractResultGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistant")
    private Assistant assistant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    private RunContractResultGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.assistant = builder.assistant;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunContractResultGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return assistant
     */
    public Assistant getAssistant() {
        return this.assistant;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<RunContractResultGenerationRequest, Builder> {
        private String workspaceId; 
        private String appId; 
        private Assistant assistant; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(RunContractResultGenerationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.assistant = request.assistant;
            this.stream = request.stream;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-kqtrcpdee4xm29xc</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * assistant.
         */
        public Builder assistant(Assistant assistant) {
            String assistantShrink = shrink(assistant, "assistant", "json");
            this.putBodyParameter("assistant", assistantShrink);
            this.assistant = assistant;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public RunContractResultGenerationRequest build() {
            return new RunContractResultGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunContractResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationRequest</p>
     */
    public static class CustomRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("ruleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("ruleTitle")
        private String ruleTitle;

        private CustomRules(Builder builder) {
            this.riskLevel = builder.riskLevel;
            this.ruleDesc = builder.ruleDesc;
            this.ruleTitle = builder.ruleTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomRules create() {
            return builder().build();
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleTitle
         */
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        public static final class Builder {
            private String riskLevel; 
            private String ruleDesc; 
            private String ruleTitle; 

            /**
             * riskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * ruleDesc.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * ruleTitle.
             */
            public Builder ruleTitle(String ruleTitle) {
                this.ruleTitle = ruleTitle;
                return this;
            }

            public CustomRules build() {
                return new CustomRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationRequest</p>
     */
    public static class CustomRuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customRules")
        private java.util.List < CustomRules> customRules;

        private CustomRuleConfig(Builder builder) {
            this.customRules = builder.customRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomRuleConfig create() {
            return builder().build();
        }

        /**
         * @return customRules
         */
        public java.util.List < CustomRules> getCustomRules() {
            return this.customRules;
        }

        public static final class Builder {
            private java.util.List < CustomRules> customRules; 

            /**
             * customRules.
             */
            public Builder customRules(java.util.List < CustomRules> customRules) {
                this.customRules = customRules;
                return this;
            }

            public CustomRuleConfig build() {
                return new CustomRuleConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("ruleSequence")
        private String ruleSequence;

        @com.aliyun.core.annotation.NameInMap("ruleTag")
        private String ruleTag;

        @com.aliyun.core.annotation.NameInMap("ruleTitle")
        private String ruleTitle;

        private Rules(Builder builder) {
            this.riskLevel = builder.riskLevel;
            this.ruleSequence = builder.ruleSequence;
            this.ruleTag = builder.ruleTag;
            this.ruleTitle = builder.ruleTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleSequence
         */
        public String getRuleSequence() {
            return this.ruleSequence;
        }

        /**
         * @return ruleTag
         */
        public String getRuleTag() {
            return this.ruleTag;
        }

        /**
         * @return ruleTitle
         */
        public String getRuleTitle() {
            return this.ruleTitle;
        }

        public static final class Builder {
            private String riskLevel; 
            private String ruleSequence; 
            private String ruleTag; 
            private String ruleTitle; 

            /**
             * riskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * ruleSequence.
             */
            public Builder ruleSequence(String ruleSequence) {
                this.ruleSequence = ruleSequence;
                return this;
            }

            /**
             * ruleTag.
             */
            public Builder ruleTag(String ruleTag) {
                this.ruleTag = ruleTag;
                return this;
            }

            /**
             * ruleTitle.
             */
            public Builder ruleTitle(String ruleTitle) {
                this.ruleTitle = ruleTitle;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationRequest</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customRuleConfig")
        private CustomRuleConfig customRuleConfig;

        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("ruleTaskId")
        private String ruleTaskId;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List < Rules> rules;

        private MetaData(Builder builder) {
            this.customRuleConfig = builder.customRuleConfig;
            this.fileId = builder.fileId;
            this.position = builder.position;
            this.ruleTaskId = builder.ruleTaskId;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return customRuleConfig
         */
        public CustomRuleConfig getCustomRuleConfig() {
            return this.customRuleConfig;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return ruleTaskId
         */
        public String getRuleTaskId() {
            return this.ruleTaskId;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private CustomRuleConfig customRuleConfig; 
            private String fileId; 
            private String position; 
            private String ruleTaskId; 
            private java.util.List < Rules> rules; 

            /**
             * customRuleConfig.
             */
            public Builder customRuleConfig(CustomRuleConfig customRuleConfig) {
                this.customRuleConfig = customRuleConfig;
                return this;
            }

            /**
             * fileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * ruleTaskId.
             */
            public Builder ruleTaskId(String ruleTaskId) {
                this.ruleTaskId = ruleTaskId;
                return this;
            }

            /**
             * rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunContractResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunContractResultGenerationRequest</p>
     */
    public static class Assistant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Assistant(Builder builder) {
            this.metaData = builder.metaData;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assistant create() {
            return builder().build();
        }

        /**
         * @return metaData
         */
        public MetaData getMetaData() {
            return this.metaData;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private MetaData metaData; 
            private String type; 
            private String version; 

            /**
             * metaData.
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Assistant build() {
                return new Assistant(this);
            } 

        } 

    }
}
