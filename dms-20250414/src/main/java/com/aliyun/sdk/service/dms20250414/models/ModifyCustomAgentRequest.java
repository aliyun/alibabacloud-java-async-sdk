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
 * {@link ModifyCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomAgentRequest</p>
 */
public class ModifyCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackConfig")
    private CallbackConfig callbackConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customAgentId;

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
    @com.aliyun.core.annotation.NameInMap("KnowledgeSemanticConfigList")
    private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecommendQuestionList")
    private java.util.List<String> recommendQuestionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSessionId")
    private String relatedSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTaskConfig")
    private ScheduleTaskConfig scheduleTaskConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextReportConfig")
    private String textReportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSpecifiedSkillList")
    private java.util.List<String> userSpecifiedSkillList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebReportConfig")
    private String webReportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebReportTheme")
    private String webReportTheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ModifyCustomAgentRequest(Builder builder) {
        super(builder);
        this.callbackConfig = builder.callbackConfig;
        this.customAgentId = builder.customAgentId;
        this.DMSUnit = builder.DMSUnit;
        this.dataJson = builder.dataJson;
        this.description = builder.description;
        this.executionConfig = builder.executionConfig;
        this.instruction = builder.instruction;
        this.knowledge = builder.knowledge;
        this.knowledgeConfigList = builder.knowledgeConfigList;
        this.knowledgeSemanticConfigList = builder.knowledgeSemanticConfigList;
        this.name = builder.name;
        this.recommendQuestionList = builder.recommendQuestionList;
        this.relatedSessionId = builder.relatedSessionId;
        this.scheduleTaskConfig = builder.scheduleTaskConfig;
        this.textReportConfig = builder.textReportConfig;
        this.userSpecifiedSkillList = builder.userSpecifiedSkillList;
        this.webReportConfig = builder.webReportConfig;
        this.webReportTheme = builder.webReportTheme;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackConfig
     */
    public CallbackConfig getCallbackConfig() {
        return this.callbackConfig;
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
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
     * @return knowledgeSemanticConfigList
     */
    public java.util.List<KnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
        return this.knowledgeSemanticConfigList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recommendQuestionList
     */
    public java.util.List<String> getRecommendQuestionList() {
        return this.recommendQuestionList;
    }

    /**
     * @return relatedSessionId
     */
    public String getRelatedSessionId() {
        return this.relatedSessionId;
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
     * @return userSpecifiedSkillList
     */
    public java.util.List<String> getUserSpecifiedSkillList() {
        return this.userSpecifiedSkillList;
    }

    /**
     * @return webReportConfig
     */
    public String getWebReportConfig() {
        return this.webReportConfig;
    }

    /**
     * @return webReportTheme
     */
    public String getWebReportTheme() {
        return this.webReportTheme;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ModifyCustomAgentRequest, Builder> {
        private CallbackConfig callbackConfig; 
        private String customAgentId; 
        private String DMSUnit; 
        private String dataJson; 
        private String description; 
        private ExecutionConfig executionConfig; 
        private String instruction; 
        private String knowledge; 
        private java.util.List<KnowledgeConfigList> knowledgeConfigList; 
        private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList; 
        private String name; 
        private java.util.List<String> recommendQuestionList; 
        private String relatedSessionId; 
        private ScheduleTaskConfig scheduleTaskConfig; 
        private String textReportConfig; 
        private java.util.List<String> userSpecifiedSkillList; 
        private String webReportConfig; 
        private String webReportTheme; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomAgentRequest request) {
            super(request);
            this.callbackConfig = request.callbackConfig;
            this.customAgentId = request.customAgentId;
            this.DMSUnit = request.DMSUnit;
            this.dataJson = request.dataJson;
            this.description = request.description;
            this.executionConfig = request.executionConfig;
            this.instruction = request.instruction;
            this.knowledge = request.knowledge;
            this.knowledgeConfigList = request.knowledgeConfigList;
            this.knowledgeSemanticConfigList = request.knowledgeSemanticConfigList;
            this.name = request.name;
            this.recommendQuestionList = request.recommendQuestionList;
            this.relatedSessionId = request.relatedSessionId;
            this.scheduleTaskConfig = request.scheduleTaskConfig;
            this.textReportConfig = request.textReportConfig;
            this.userSpecifiedSkillList = request.userSpecifiedSkillList;
            this.webReportConfig = request.webReportConfig;
            this.webReportTheme = request.webReportTheme;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The callback feature configuration.</p>
         */
        public Builder callbackConfig(CallbackConfig callbackConfig) {
            String callbackConfigShrink = shrink(callbackConfig, "CallbackConfig", "json");
            this.putQueryParameter("CallbackConfig", callbackConfigShrink);
            this.callbackConfig = callbackConfig;
            return this;
        }

        /**
         * <p>The ID of the custom agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The specified data scope in <strong>JSON character string format</strong>.</p>
         * <ul>
         * <li>General metric descriptions:<ul>
         * <li>tableFlag: true indicates that a data scope is specified.</li>
         * <li>scope: The fixed value personal.</li>
         * <li>personal: The parameters for file and database types.</li>
         * </ul>
         * </li>
         * </ul>
         * <p><strong>File type</strong>: Pass parameters in the following format:</p>
         * <ul>
         * <li>DataSourceType: The fixed value remote_data_center.</li>
         * <li>FileId: The file ID.</li>
         * <li>Database: The database name returned by the ListDataCenterTable operation, which is usually the file name.</li>
         * <li>Tables: The table names returned by the ListDataCenterTable operation.</li>
         * <li>TableIds: The table IDs returned by the ListDataCenterTable operation.</li>
         * <li>RegionId: The current region.</li>
         * </ul>
         * <pre><code>{
         *   &quot;tableFlag&quot;: true,
         *   &quot;scope&quot;: &quot;personal&quot;,
         *   &quot;personal&quot;: {
         *     &quot;DataSourceType&quot;: &quot;remote_data_center&quot;,
         *     &quot;FileId&quot;: &quot;f-f0jksn001ibmkoo********6v2zn6&quot;,
         *     &quot;Database&quot;: &quot;diamonds.csv&quot;,
         *     &quot;Tables&quot;: [
         *       &quot;diamonds&quot;
         *     ],
         *     &quot;TableIds&quot;: [
         *       &quot;35hfn94pxl********50pi&quot;
         *     ],
         *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
         *   }
         * }
         * </code></pre>
         * <p><strong>Database type</strong>: Pass parameters in the following format:</p>
         * <ul>
         * <li>DataSourceType: The fixed value database.</li>
         * <li>DmsInstanceId: The DMS instance ID returned by the data center operation.</li>
         * <li>DmsDatabaseId: The DMS database ID returned by the data center operation.</li>
         * <li>FileId: The instance name. <strong>[Deprecated]</strong></li>
         * <li>DbName: The database name returned by the data center operation.</li>
         * <li>Database: The database name returned by the data center operation.</li>
         * <li>Tables: The table names returned by the data center operation.</li>
         * <li>TableIds: The table IDs returned by the data center operation.</li>
         * <li>Engine: The DPI engine type (mysql or postgresql).</li>
         * <li>RegionId: The current region.</li>
         * </ul>
         * <pre><code>{
         *   &quot;tableFlag&quot;: true,
         *   &quot;scope&quot;: &quot;personal&quot;,
         *   &quot;personal&quot;: {
         *     &quot;DataSourceType&quot;: &quot;database&quot;,
         *     &quot;DmsInstanceId&quot;: &quot;284***8&quot;,
         *     &quot;DmsDatabaseId&quot;: &quot;769***45&quot;,
         *     &quot;FileId&quot;: &quot;pgm-bp15095e*******6t&quot;,
         *     &quot;DbName&quot;: &quot;pg_catalog&quot;,
         *     &quot;Database&quot;: &quot;pg_catalog&quot;,
         *     &quot;Tables&quot;: [
         *       &quot;pg_aggregate&quot;
         *     ],
         *     &quot;TableIds&quot;: [
         *       &quot;5263****31&quot;
         *     ],
         *     &quot;Engine&quot;: &quot;postgresql&quot;,
         *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
         *   }
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;tableFlag&quot; : true,
         *   &quot;scope&quot; : &quot;personal&quot;,
         *   &quot;personal&quot; : {
         *     &quot;DataSourceType&quot; : &quot;remote_data_center&quot;,
         *     &quot;FileId&quot; : &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
         *     &quot;Database&quot; : &quot;Test table</strong></strong></strong>.xlsx&quot;,
         *     &quot;Tables&quot; : [ &quot;Sheet1&quot; ],
         *     &quot;TableIds&quot; : [ &quot;</strong>****&quot; ],
         *     &quot;RegionId&quot; : &quot;cn-hangzhou&quot;
         *   }
         * }</p>
         */
        public Builder dataJson(String dataJson) {
            this.putQueryParameter("DataJson", dataJson);
            this.dataJson = dataJson;
            return this;
        }

        /**
         * <p>The description of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Test agent description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution configuration.</p>
         */
        public Builder executionConfig(ExecutionConfig executionConfig) {
            String executionConfigShrink = shrink(executionConfig, "ExecutionConfig", "json");
            this.putQueryParameter("ExecutionConfig", executionConfigShrink);
            this.executionConfig = executionConfig;
            return this;
        }

        /**
         * <p>The instructions.</p>
         * <ul>
         * <li>Input limit: Maximum of 10,000 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Analysis framework:</p>
         * <ol>
         * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) on a daily, weekly, and monthly basis, and analyze trend changes and year-over-year or month-over-month fluctuations.</li>
         * <li>Segment by new and existing customers, channels, and regions to identify growth drivers and weaknesses.</li>
         * <li>Conduct funnel analysis based on user behavior paths (browse → add to cart → pay) to locate churn points</li>
         * </ol>
         */
        public Builder instruction(String instruction) {
            this.putQueryParameter("Instruction", instruction);
            this.instruction = instruction;
            return this;
        }

        /**
         * <p>The knowledge.</p>
         * <ul>
         * <li>Input limit: Maximum of 10,000 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Core metric definitions:</p>
         * <ol>
         * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including both successfully paid and unpaid orders.</li>
         * <li>Order volume is the number of valid orders placed per day.</li>
         * <li>UV (Unique Visitors) refers to the number of deduplicated users who visit the website or app.</li>
         * <li>Conversion rate = Number of paid orders / UV, reflecting the traffic conversion efficiency</li>
         * </ol>
         */
        public Builder knowledge(String knowledge) {
            this.putQueryParameter("Knowledge", knowledge);
            this.knowledge = knowledge;
            return this;
        }

        /**
         * <p>The external knowledge bases.</p>
         */
        public Builder knowledgeConfigList(java.util.List<KnowledgeConfigList> knowledgeConfigList) {
            String knowledgeConfigListShrink = shrink(knowledgeConfigList, "KnowledgeConfigList", "json");
            this.putQueryParameter("KnowledgeConfigList", knowledgeConfigListShrink);
            this.knowledgeConfigList = knowledgeConfigList;
            return this;
        }

        /**
         * <p>The knowledge semantic configuration list.</p>
         */
        public Builder knowledgeSemanticConfigList(java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
            String knowledgeSemanticConfigListShrink = shrink(knowledgeSemanticConfigList, "KnowledgeSemanticConfigList", "json");
            this.putQueryParameter("KnowledgeSemanticConfigList", knowledgeSemanticConfigListShrink);
            this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
            return this;
        }

        /**
         * <p>The name of the custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Test agent name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of recommended questions.</p>
         * <ul>
         * <li>You can configure up to 10 recommended questions.</li>
         * </ul>
         */
        public Builder recommendQuestionList(java.util.List<String> recommendQuestionList) {
            String recommendQuestionListShrink = shrink(recommendQuestionList, "RecommendQuestionList", "json");
            this.putQueryParameter("RecommendQuestionList", recommendQuestionListShrink);
            this.recommendQuestionList = recommendQuestionList;
            return this;
        }

        /**
         * <p>The ID of the referenced historical session.</p>
         * 
         * <strong>example:</strong>
         * <p>ski-sldk8v******3owd</p>
         */
        public Builder relatedSessionId(String relatedSessionId) {
            this.putQueryParameter("RelatedSessionId", relatedSessionId);
            this.relatedSessionId = relatedSessionId;
            return this;
        }

        /**
         * <p>The scheduled task configuration.</p>
         */
        public Builder scheduleTaskConfig(ScheduleTaskConfig scheduleTaskConfig) {
            String scheduleTaskConfigShrink = shrink(scheduleTaskConfig, "ScheduleTaskConfig", "json");
            this.putQueryParameter("ScheduleTaskConfig", scheduleTaskConfigShrink);
            this.scheduleTaskConfig = scheduleTaskConfig;
            return this;
        }

        /**
         * <p>The text report format.</p>
         * <ul>
         * <li>Input limit: Maximum of 10,000 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The text report requires that all numbers be spelled out in words instead of using Arabic numerals</p>
         */
        public Builder textReportConfig(String textReportConfig) {
            this.putQueryParameter("TextReportConfig", textReportConfig);
            this.textReportConfig = textReportConfig;
            return this;
        }

        /**
         * <p>The list of user-specified skills.</p>
         */
        public Builder userSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
            String userSpecifiedSkillListShrink = shrink(userSpecifiedSkillList, "UserSpecifiedSkillList", "json");
            this.putQueryParameter("UserSpecifiedSkillList", userSpecifiedSkillListShrink);
            this.userSpecifiedSkillList = userSpecifiedSkillList;
            return this;
        }

        /**
         * <p>The web report format.</p>
         * <ul>
         * <li>Input limit: Maximum of 50,000 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The web report requires that all numbers be spelled out in words instead of using Arabic numerals</p>
         */
        public Builder webReportConfig(String webReportConfig) {
            this.putQueryParameter("WebReportConfig", webReportConfig);
            this.webReportConfig = webReportConfig;
            return this;
        }

        /**
         * <p>The web report theme. Valid values:</p>
         * <ul>
         * <li>default: Default.</li>
         * <li>journal: Journal.</li>
         * <li>legacy: Legacy.</li>
         * <li>neobrutalism: Neobrutalism.</li>
         * <li>infographic: Infographic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder webReportTheme(String webReportTheme) {
            this.putQueryParameter("WebReportTheme", webReportTheme);
            this.webReportTheme = webReportTheme;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56kv1pvl9uvt9**********bb</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ModifyCustomAgentRequest build() {
            return new ModifyCustomAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomAgentRequest</p>
     */
    public static class CallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackArgs")
        private String callbackArgs;

        @com.aliyun.core.annotation.NameInMap("CallbackPrompt")
        private String callbackPrompt;

        @com.aliyun.core.annotation.NameInMap("CallbackTime")
        private Integer callbackTime;

        @com.aliyun.core.annotation.NameInMap("ToolId")
        private String toolId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CallbackConfig(Builder builder) {
            this.callbackArgs = builder.callbackArgs;
            this.callbackPrompt = builder.callbackPrompt;
            this.callbackTime = builder.callbackTime;
            this.toolId = builder.toolId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackConfig create() {
            return builder().build();
        }

        /**
         * @return callbackArgs
         */
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        /**
         * @return callbackPrompt
         */
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        /**
         * @return callbackTime
         */
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        /**
         * @return toolId
         */
        public String getToolId() {
            return this.toolId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String callbackArgs; 
            private String callbackPrompt; 
            private Integer callbackTime; 
            private String toolId; 
            private String type; 

            private Builder() {
            } 

            private Builder(CallbackConfig model) {
                this.callbackArgs = model.callbackArgs;
                this.callbackPrompt = model.callbackPrompt;
                this.callbackTime = model.callbackTime;
                this.toolId = model.toolId;
                this.type = model.type;
            } 

            /**
             * <p>The invoke parameters for callback tool calling.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ID&quot;:&quot;test&quot;}</p>
             */
            public Builder callbackArgs(String callbackArgs) {
                this.callbackArgs = callbackArgs;
                return this;
            }

            /**
             * <p>The prompt for generating invoke parameters for callback tool calling.</p>
             * 
             * <strong>example:</strong>
             * <p>send web report to <a href="mailto:123456@163.com">123456@163.com</a></p>
             */
            public Builder callbackPrompt(String callbackPrompt) {
                this.callbackPrompt = callbackPrompt;
                return this;
            }

            /**
             * <p>The invoke timing for callback tool calling.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callbackTime(Integer callbackTime) {
                this.callbackTime = callbackTime;
                return this;
            }

            /**
             * <p>The callback tool identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Mcp serverId (6te...g7a)</p>
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            /**
             * <p>The callback tool type.</p>
             * 
             * <strong>example:</strong>
             * <p>Mcp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CallbackConfig build() {
                return new CallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomAgentRequest</p>
     */
    public static class ExecutionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForbiddenAppendDataSource")
        private Boolean forbiddenAppendDataSource;

        @com.aliyun.core.annotation.NameInMap("SkipAskHuman")
        private Boolean skipAskHuman;

        @com.aliyun.core.annotation.NameInMap("SkipPlan")
        private Boolean skipPlan;

        @com.aliyun.core.annotation.NameInMap("SkipSqlConfirm")
        private Boolean skipSqlConfirm;

        @com.aliyun.core.annotation.NameInMap("SkipWebReportConfirm")
        private Boolean skipWebReportConfirm;

        private ExecutionConfig(Builder builder) {
            this.forbiddenAppendDataSource = builder.forbiddenAppendDataSource;
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
         * @return forbiddenAppendDataSource
         */
        public Boolean getForbiddenAppendDataSource() {
            return this.forbiddenAppendDataSource;
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
            private Boolean forbiddenAppendDataSource; 
            private Boolean skipAskHuman; 
            private Boolean skipPlan; 
            private Boolean skipSqlConfirm; 
            private Boolean skipWebReportConfirm; 

            private Builder() {
            } 

            private Builder(ExecutionConfig model) {
                this.forbiddenAppendDataSource = model.forbiddenAppendDataSource;
                this.skipAskHuman = model.skipAskHuman;
                this.skipPlan = model.skipPlan;
                this.skipSqlConfirm = model.skipSqlConfirm;
                this.skipWebReportConfirm = model.skipWebReportConfirm;
            } 

            /**
             * <p>Specifies whether to prohibit appending data sources in a session.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
                this.forbiddenAppendDataSource = forbiddenAppendDataSource;
                return this;
            }

            /**
             * <p>Specifies whether to disable user inquiries during the process.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipAskHuman(Boolean skipAskHuman) {
                this.skipAskHuman = skipAskHuman;
                return this;
            }

            /**
             * <p>Specifies whether to skip the plan confirmation step.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipPlan(Boolean skipPlan) {
                this.skipPlan = skipPlan;
                return this;
            }

            /**
             * <p>Specifies whether to skip all SQL confirmations.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipSqlConfirm(Boolean skipSqlConfirm) {
                this.skipSqlConfirm = skipSqlConfirm;
                return this;
            }

            /**
             * <p>Specifies whether to skip the confirmation for generating a web report.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link ModifyCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomAgentRequest</p>
     */
    public static class KnowledgeConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("KbUuid")
        private String kbUuid;

        @com.aliyun.core.annotation.NameInMap("McpServerId")
        private String mcpServerId;

        private KnowledgeConfigList(Builder builder) {
            this.accessType = builder.accessType;
            this.kbUuid = builder.kbUuid;
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
         * @return kbUuid
         */
        public String getKbUuid() {
            return this.kbUuid;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public static final class Builder {
            private String accessType; 
            private String kbUuid; 
            private String mcpServerId; 

            private Builder() {
            } 

            private Builder(KnowledgeConfigList model) {
                this.accessType = model.accessType;
                this.kbUuid = model.kbUuid;
                this.mcpServerId = model.mcpServerId;
            } 

            /**
             * <p>The access type. If you do not specify this parameter, the default value is mcp. Valid values:</p>
             * <ul>
             * <li>mcp: Access through MCP. You must pass the McpServerId parameter.</li>
             * <li>dms_kb: Access through DMS knowledge base. You must pass the KbUuid parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mcp</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-HZ-6anhdzx7hddf9*******obx</p>
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
                return this;
            }

            /**
             * <p>The ID of the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>nhdpt9adf6ac**********ca</p>
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
     * {@link ModifyCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomAgentRequest</p>
     */
    public static class KnowledgeSemanticConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
        private String knowledgeUuid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KnowledgeSemanticConfigList(Builder builder) {
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.knowledgeUuid = builder.knowledgeUuid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeSemanticConfigList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return knowledgeUuid
         */
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String dbId; 
            private String instanceId; 
            private String knowledgeUuid; 
            private String type; 

            private Builder() {
            } 

            private Builder(KnowledgeSemanticConfigList model) {
                this.dbId = model.dbId;
                this.instanceId = model.instanceId;
                this.knowledgeUuid = model.knowledgeUuid;
                this.type = model.type;
            } 

            /**
             * <p>The DMS database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69305251</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The DMS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2086427</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The knowledge UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>7ca8f50d78*****1f4b8410f02e87</p>
             */
            public Builder knowledgeUuid(String knowledgeUuid) {
                this.knowledgeUuid = knowledgeUuid;
                return this;
            }

            /**
             * <p>The knowledge semantic type. Valid values:</p>
             * <ul>
             * <li>sql_template: SQL template.</li>
             * <li>ossie_model: Ossie semantic view.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sql_template</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KnowledgeSemanticConfigList build() {
                return new KnowledgeSemanticConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyCustomAgentRequest} extends {@link TeaModel}
     *
     * <p>ModifyCustomAgentRequest</p>
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
             * <p>The cron expression for time-based scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0,1 ? * 1-7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The query for the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyze this data and provide a brief report</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The ID of the referenced historical session.</p>
             * 
             * <strong>example:</strong>
             * <p>4m24*****mg7j2v</p>
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
