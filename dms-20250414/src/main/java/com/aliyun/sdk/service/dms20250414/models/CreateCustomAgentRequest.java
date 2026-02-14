// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomAgentRequest</p>
 */
public class CreateCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataJson")
    private String dataJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionConfig")
    private ExecutionConfig executionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instruction")
    private String instruction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Knowledge")
    private String knowledge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeConfigList")
    private java.util.List<KnowledgeConfigList> knowledgeConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTaskConfig")
    private ScheduleTaskConfig scheduleTaskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextReportConfig")
    private String textReportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebReportConfig")
    private String webReportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateCustomAgentRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.dataJson = builder.dataJson;
        this.description = builder.description;
        this.executionConfig = builder.executionConfig;
        this.instruction = builder.instruction;
        this.knowledge = builder.knowledge;
        this.knowledgeConfigList = builder.knowledgeConfigList;
        this.name = builder.name;
        this.scheduleTaskConfig = builder.scheduleTaskConfig;
        this.textReportConfig = builder.textReportConfig;
        this.webReportConfig = builder.webReportConfig;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return dataJson
     */
    public String getDataJson() {
        return this.dataJson;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionConfig
     */
    public ExecutionConfig getExecutionConfig() {
        return this.executionConfig;
    }

    /**
     * @return instruction
     */
    public String getInstruction() {
        return this.instruction;
    }

    /**
     * @return knowledge
     */
    public String getKnowledge() {
        return this.knowledge;
    }

    /**
     * @return knowledgeConfigList
     */
    public java.util.List<KnowledgeConfigList> getKnowledgeConfigList() {
        return this.knowledgeConfigList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scheduleTaskConfig
     */
    public ScheduleTaskConfig getScheduleTaskConfig() {
        return this.scheduleTaskConfig;
    }

    /**
     * @return textReportConfig
     */
    public String getTextReportConfig() {
        return this.textReportConfig;
    }

    /**
     * @return webReportConfig
     */
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCustomAgentRequest, Builder> {
        private String DMSUnit; 
        private String dataJson; 
        private String description; 
        private ExecutionConfig executionConfig; 
        private String instruction; 
        private String knowledge; 
        private java.util.List<KnowledgeConfigList> knowledgeConfigList; 
        private String name; 
        private ScheduleTaskConfig scheduleTaskConfig; 
        private String textReportConfig; 
        private String webReportConfig; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomAgentRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.dataJson = request.dataJson;
            this.description = request.description;
            this.executionConfig = request.executionConfig;
            this.instruction = request.instruction;
            this.knowledge = request.knowledge;
            this.knowledgeConfigList = request.knowledgeConfigList;
            this.name = request.name;
            this.scheduleTaskConfig = request.scheduleTaskConfig;
            this.textReportConfig = request.textReportConfig;
            this.webReportConfig = request.webReportConfig;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * DataJson.
         */
        public Builder dataJson(String dataJson) {
            this.putQueryParameter("DataJson", dataJson);
            this.dataJson = dataJson;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExecutionConfig.
         */
        public Builder executionConfig(ExecutionConfig executionConfig) {
            String executionConfigShrink = shrink(executionConfig, "ExecutionConfig", "json");
            this.putQueryParameter("ExecutionConfig", executionConfigShrink);
            this.executionConfig = executionConfig;
            return this;
        }

        /**
         * Instruction.
         */
        public Builder instruction(String instruction) {
            this.putQueryParameter("Instruction", instruction);
            this.instruction = instruction;
            return this;
        }

        /**
         * Knowledge.
         */
        public Builder knowledge(String knowledge) {
            this.putQueryParameter("Knowledge", knowledge);
            this.knowledge = knowledge;
            return this;
        }

        /**
         * KnowledgeConfigList.
         */
        public Builder knowledgeConfigList(java.util.List<KnowledgeConfigList> knowledgeConfigList) {
            String knowledgeConfigListShrink = shrink(knowledgeConfigList, "KnowledgeConfigList", "json");
            this.putQueryParameter("KnowledgeConfigList", knowledgeConfigListShrink);
            this.knowledgeConfigList = knowledgeConfigList;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ScheduleTaskConfig.
         */
        public Builder scheduleTaskConfig(ScheduleTaskConfig scheduleTaskConfig) {
            String scheduleTaskConfigShrink = shrink(scheduleTaskConfig, "ScheduleTaskConfig", "json");
            this.putQueryParameter("ScheduleTaskConfig", scheduleTaskConfigShrink);
            this.scheduleTaskConfig = scheduleTaskConfig;
            return this;
        }

        /**
         * TextReportConfig.
         */
        public Builder textReportConfig(String textReportConfig) {
            this.putQueryParameter("TextReportConfig", textReportConfig);
            this.textReportConfig = textReportConfig;
            return this;
        }

        /**
         * WebReportConfig.
         */
        public Builder webReportConfig(String webReportConfig) {
            this.putQueryParameter("WebReportConfig", webReportConfig);
            this.webReportConfig = webReportConfig;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCustomAgentRequest build() {
            return new CreateCustomAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class ExecutionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkipAskHuman")
        private Boolean skipAskHuman;

        @com.aliyun.core.annotation.NameInMap("SkipPlan")
        private Boolean skipPlan;

        @com.aliyun.core.annotation.NameInMap("SkipSqlConfirm")
        private Boolean skipSqlConfirm;

        @com.aliyun.core.annotation.NameInMap("SkipWebReportConfirm")
        private Boolean skipWebReportConfirm;

        private ExecutionConfig(Builder builder) {
            this.skipAskHuman = builder.skipAskHuman;
            this.skipPlan = builder.skipPlan;
            this.skipSqlConfirm = builder.skipSqlConfirm;
            this.skipWebReportConfirm = builder.skipWebReportConfirm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionConfig create() {
            return builder().build();
        }

        /**
         * @return skipAskHuman
         */
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        /**
         * @return skipPlan
         */
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        /**
         * @return skipSqlConfirm
         */
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        /**
         * @return skipWebReportConfirm
         */
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

        public static final class Builder {
            private Boolean skipAskHuman; 
            private Boolean skipPlan; 
            private Boolean skipSqlConfirm; 
            private Boolean skipWebReportConfirm; 

            private Builder() {
            } 

            private Builder(ExecutionConfig model) {
                this.skipAskHuman = model.skipAskHuman;
                this.skipPlan = model.skipPlan;
                this.skipSqlConfirm = model.skipSqlConfirm;
                this.skipWebReportConfirm = model.skipWebReportConfirm;
            } 

            /**
             * SkipAskHuman.
             */
            public Builder skipAskHuman(Boolean skipAskHuman) {
                this.skipAskHuman = skipAskHuman;
                return this;
            }

            /**
             * SkipPlan.
             */
            public Builder skipPlan(Boolean skipPlan) {
                this.skipPlan = skipPlan;
                return this;
            }

            /**
             * SkipSqlConfirm.
             */
            public Builder skipSqlConfirm(Boolean skipSqlConfirm) {
                this.skipSqlConfirm = skipSqlConfirm;
                return this;
            }

            /**
             * SkipWebReportConfirm.
             */
            public Builder skipWebReportConfirm(Boolean skipWebReportConfirm) {
                this.skipWebReportConfirm = skipWebReportConfirm;
                return this;
            }

            public ExecutionConfig build() {
                return new ExecutionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class KnowledgeConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("McpServerId")
        private String mcpServerId;

        private KnowledgeConfigList(Builder builder) {
            this.accessType = builder.accessType;
            this.mcpServerId = builder.mcpServerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeConfigList create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public static final class Builder {
            private String accessType; 
            private String mcpServerId; 

            private Builder() {
            } 

            private Builder(KnowledgeConfigList model) {
                this.accessType = model.accessType;
                this.mcpServerId = model.mcpServerId;
            } 

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * McpServerId.
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            public KnowledgeConfigList build() {
                return new KnowledgeConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomAgentRequest</p>
     */
    public static class ScheduleTaskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("RelatedSessionId")
        private String relatedSessionId;

        private ScheduleTaskConfig(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.query = builder.query;
            this.relatedSessionId = builder.relatedSessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleTaskConfig create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return relatedSessionId
         */
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        public static final class Builder {
            private String cronExpression; 
            private String query; 
            private String relatedSessionId; 

            private Builder() {
            } 

            private Builder(ScheduleTaskConfig model) {
                this.cronExpression = model.cronExpression;
                this.query = model.query;
                this.relatedSessionId = model.relatedSessionId;
            } 

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * RelatedSessionId.
             */
            public Builder relatedSessionId(String relatedSessionId) {
                this.relatedSessionId = relatedSessionId;
                return this;
            }

            public ScheduleTaskConfig build() {
                return new ScheduleTaskConfig(this);
            } 

        } 

    }
}
