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
 * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomAgentResponseBody</p>
 */
public class DescribeCustomAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomAgentResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomAgentResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.                                 </li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomAgentResponseBody build() {
            return new DescribeCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
             * CallbackArgs.
             */
            public Builder callbackArgs(String callbackArgs) {
                this.callbackArgs = callbackArgs;
                return this;
            }

            /**
             * CallbackPrompt.
             */
            public Builder callbackPrompt(String callbackPrompt) {
                this.callbackPrompt = callbackPrompt;
                return this;
            }

            /**
             * CallbackTime.
             */
            public Builder callbackTime(Integer callbackTime) {
                this.callbackTime = callbackTime;
                return this;
            }

            /**
             * ToolId.
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            /**
             * Type.
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
             * ForbiddenAppendDataSource.
             */
            public Builder forbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
                this.forbiddenAppendDataSource = forbiddenAppendDataSource;
                return this;
            }

            /**
             * <p>Specifies whether to disable user inquiries during the process.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>Specifies whether to skip the web report rendering confirmation.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * KbUuid.
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
             * DbId.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * KnowledgeUuid.
             */
            public Builder knowledgeUuid(String knowledgeUuid) {
                this.knowledgeUuid = knowledgeUuid;
                return this;
            }

            /**
             * Type.
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
             * <p>The cron expression for timed scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 ? * 1-7</p>
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
             * <p>The referenced historical session ID.</p>
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
    /**
     * 
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunParentUid")
        private String aliyunParentUid;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CallbackConfig")
        private CallbackConfig callbackConfig;

        @com.aliyun.core.annotation.NameInMap("CreatorUserName")
        private String creatorUserName;

        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("DMSUnit")
        private String DMSUnit;

        @com.aliyun.core.annotation.NameInMap("DataJson")
        private String dataJson;

        @com.aliyun.core.annotation.NameInMap("DefaultAgent")
        private Integer defaultAgent;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DmsUnit")
        private String dmsUnit;

        @com.aliyun.core.annotation.NameInMap("ExecutionConfig")
        private ExecutionConfig executionConfig;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("IsScheduleTask")
        private Boolean isScheduleTask;

        @com.aliyun.core.annotation.NameInMap("Knowledge")
        private String knowledge;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfigList")
        private java.util.List<KnowledgeConfigList> knowledgeConfigList;

        @com.aliyun.core.annotation.NameInMap("KnowledgeSemanticConfigList")
        private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierUserName")
        private String modifierUserName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextRuntime")
        private Long nextRuntime;

        @com.aliyun.core.annotation.NameInMap("OfflineTime")
        private String offlineTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RelatedSessionId")
        private String relatedSessionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleTaskConfig")
        private ScheduleTaskConfig scheduleTaskConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TextReportConfig")
        private String textReportConfig;

        @com.aliyun.core.annotation.NameInMap("UserSpecifiedSkillList")
        private java.util.List<String> userSpecifiedSkillList;

        @com.aliyun.core.annotation.NameInMap("WebReportConfig")
        private String webReportConfig;

        @com.aliyun.core.annotation.NameInMap("WebReportTheme")
        private String webReportTheme;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.aliyunParentUid = builder.aliyunParentUid;
            this.aliyunUid = builder.aliyunUid;
            this.callbackConfig = builder.callbackConfig;
            this.creatorUserName = builder.creatorUserName;
            this.customAgentId = builder.customAgentId;
            this.DMSUnit = builder.DMSUnit;
            this.dataJson = builder.dataJson;
            this.defaultAgent = builder.defaultAgent;
            this.description = builder.description;
            this.dmsUnit = builder.dmsUnit;
            this.executionConfig = builder.executionConfig;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instruction = builder.instruction;
            this.isScheduleTask = builder.isScheduleTask;
            this.knowledge = builder.knowledge;
            this.knowledgeConfigList = builder.knowledgeConfigList;
            this.knowledgeSemanticConfigList = builder.knowledgeSemanticConfigList;
            this.modifier = builder.modifier;
            this.modifierUserName = builder.modifierUserName;
            this.name = builder.name;
            this.nextRuntime = builder.nextRuntime;
            this.offlineTime = builder.offlineTime;
            this.region = builder.region;
            this.relatedSessionId = builder.relatedSessionId;
            this.releaseTime = builder.releaseTime;
            this.scheduleTaskConfig = builder.scheduleTaskConfig;
            this.status = builder.status;
            this.textReportConfig = builder.textReportConfig;
            this.userSpecifiedSkillList = builder.userSpecifiedSkillList;
            this.webReportConfig = builder.webReportConfig;
            this.webReportTheme = builder.webReportTheme;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunParentUid
         */
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return callbackConfig
         */
        public CallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

        /**
         * @return creatorUserName
         */
        public String getCreatorUserName() {
            return this.creatorUserName;
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
         * @return defaultAgent
         */
        public Integer getDefaultAgent() {
            return this.defaultAgent;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dmsUnit
         */
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        /**
         * @return executionConfig
         */
        public ExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return isScheduleTask
         */
        public Boolean getIsScheduleTask() {
            return this.isScheduleTask;
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
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierUserName
         */
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextRuntime
         */
        public Long getNextRuntime() {
            return this.nextRuntime;
        }

        /**
         * @return offlineTime
         */
        public String getOfflineTime() {
            return this.offlineTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relatedSessionId
         */
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return scheduleTaskConfig
         */
        public ScheduleTaskConfig getScheduleTaskConfig() {
            return this.scheduleTaskConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String aliyunParentUid; 
            private String aliyunUid; 
            private CallbackConfig callbackConfig; 
            private String creatorUserName; 
            private String customAgentId; 
            private String DMSUnit; 
            private String dataJson; 
            private Integer defaultAgent; 
            private String description; 
            private String dmsUnit; 
            private ExecutionConfig executionConfig; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instruction; 
            private Boolean isScheduleTask; 
            private String knowledge; 
            private java.util.List<KnowledgeConfigList> knowledgeConfigList; 
            private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList; 
            private String modifier; 
            private String modifierUserName; 
            private String name; 
            private Long nextRuntime; 
            private String offlineTime; 
            private String region; 
            private String relatedSessionId; 
            private String releaseTime; 
            private ScheduleTaskConfig scheduleTaskConfig; 
            private String status; 
            private String textReportConfig; 
            private java.util.List<String> userSpecifiedSkillList; 
            private String webReportConfig; 
            private String webReportTheme; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunParentUid = model.aliyunParentUid;
                this.aliyunUid = model.aliyunUid;
                this.callbackConfig = model.callbackConfig;
                this.creatorUserName = model.creatorUserName;
                this.customAgentId = model.customAgentId;
                this.DMSUnit = model.DMSUnit;
                this.dataJson = model.dataJson;
                this.defaultAgent = model.defaultAgent;
                this.description = model.description;
                this.dmsUnit = model.dmsUnit;
                this.executionConfig = model.executionConfig;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.instruction = model.instruction;
                this.isScheduleTask = model.isScheduleTask;
                this.knowledge = model.knowledge;
                this.knowledgeConfigList = model.knowledgeConfigList;
                this.knowledgeSemanticConfigList = model.knowledgeSemanticConfigList;
                this.modifier = model.modifier;
                this.modifierUserName = model.modifierUserName;
                this.name = model.name;
                this.nextRuntime = model.nextRuntime;
                this.offlineTime = model.offlineTime;
                this.region = model.region;
                this.relatedSessionId = model.relatedSessionId;
                this.releaseTime = model.releaseTime;
                this.scheduleTaskConfig = model.scheduleTaskConfig;
                this.status = model.status;
                this.textReportConfig = model.textReportConfig;
                this.userSpecifiedSkillList = model.userSpecifiedSkillList;
                this.webReportConfig = model.webReportConfig;
                this.webReportTheme = model.webReportTheme;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The Alibaba Cloud primary account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16738266********</p>
             */
            public Builder aliyunParentUid(String aliyunParentUid) {
                this.aliyunParentUid = aliyunParentUid;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20372822********</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * CallbackConfig.
             */
            public Builder callbackConfig(CallbackConfig callbackConfig) {
                this.callbackConfig = callbackConfig;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>HaoY*****</p>
             */
            public Builder creatorUserName(String creatorUserName) {
                this.creatorUserName = creatorUserName;
                return this;
            }

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-4y3ca4khkcu**********ysf</p>
             */
            public Builder customAgentId(String customAgentId) {
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
                this.DMSUnit = DMSUnit;
                return this;
            }

            /**
             * <p>The specified data scope in JSON string format.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;tableFlag&quot; : true,
             *   &quot;scope&quot; : &quot;personal&quot;,
             *   &quot;personal&quot; : {
             *     &quot;DataSourceType&quot; : &quot;remote_data_center&quot;,
             *     &quot;FileId&quot; : &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
             *     &quot;Database&quot; : &quot;TestTable</strong></strong></strong>.xlsx&quot;,
             *     &quot;Tables&quot; : [ &quot;Sheet1&quot; ],
             *     &quot;TableIds&quot; : [ &quot;</strong>****&quot; ],
             *     &quot;RegionId&quot; : &quot;cn-hangzhou&quot;
             *   }
             * }</p>
             */
            public Builder dataJson(String dataJson) {
                this.dataJson = dataJson;
                return this;
            }

            /**
             * DefaultAgent.
             */
            public Builder defaultAgent(Integer defaultAgent) {
                this.defaultAgent = defaultAgent;
                return this;
            }

            /**
             * <p>The description of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The current DMS unit.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder dmsUnit(String dmsUnit) {
                this.dmsUnit = dmsUnit;
                return this;
            }

            /**
             * <p>The execution configuration.</p>
             */
            public Builder executionConfig(ExecutionConfig executionConfig) {
                this.executionConfig = executionConfig;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>Analysis framework:</p>
             * <ol>
             * <li>Monitor core metrics (GMV, order volume, UV, conversion rate) by day, week, and month dimensions, and analyze trends and year-over-year/month-over-month fluctuations;</li>
             * <li>Segment by new/existing customers, channels, and regions to identify growth sources and weaknesses;</li>
             * <li>Conduct funnel analysis based on user behavior paths (browse → add to cart → payment) to locate drop-off points;</li>
             * </ol>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>Specifies whether a scheduled task is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isScheduleTask(Boolean isScheduleTask) {
                this.isScheduleTask = isScheduleTask;
                return this;
            }

            /**
             * <p>The knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>Core metric definitions:</p>
             * <ol>
             * <li>GMV (Gross Merchandise Volume) refers to the total order amount, including paid and unpaid orders;</li>
             * <li>Order volume is the number of valid orders placed per day;</li>
             * <li>UV (Unique Visitors) refers to the deduplicated number of users who visit the website or app;</li>
             * <li>Conversion rate = number of paid orders / UV, reflecting traffic conversion efficiency;</li>
             * </ol>
             */
            public Builder knowledge(String knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * KnowledgeConfigList.
             */
            public Builder knowledgeConfigList(java.util.List<KnowledgeConfigList> knowledgeConfigList) {
                this.knowledgeConfigList = knowledgeConfigList;
                return this;
            }

            /**
             * KnowledgeSemanticConfigList.
             */
            public Builder knowledgeSemanticConfigList(java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
                this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
                return this;
            }

            /**
             * <p>The modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>20372822********</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>HaoY*****</p>
             */
            public Builder modifierUserName(String modifierUserName) {
                this.modifierUserName = modifierUserName;
                return this;
            }

            /**
             * <p>The name of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent test name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next run time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>1767715200</p>
             */
            public Builder nextRuntime(Long nextRuntime) {
                this.nextRuntime = nextRuntime;
                return this;
            }

            /**
             * <p>The offline time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder offlineTime(String offlineTime) {
                this.offlineTime = offlineTime;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The referenced historical session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5xyz...</p>
             */
            public Builder relatedSessionId(String relatedSessionId) {
                this.relatedSessionId = relatedSessionId;
                return this;
            }

            /**
             * <p>The publish time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The scheduled task configuration.</p>
             */
            public Builder scheduleTaskConfig(ScheduleTaskConfig scheduleTaskConfig) {
                this.scheduleTaskConfig = scheduleTaskConfig;
                return this;
            }

            /**
             * <p>The status of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The text report format.</p>
             * 
             * <strong>example:</strong>
             * <p>The text report requires all numbers to be converted from Arabic numerals to Chinese numerals</p>
             */
            public Builder textReportConfig(String textReportConfig) {
                this.textReportConfig = textReportConfig;
                return this;
            }

            /**
             * UserSpecifiedSkillList.
             */
            public Builder userSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
                this.userSpecifiedSkillList = userSpecifiedSkillList;
                return this;
            }

            /**
             * <p>The web report format.</p>
             * 
             * <strong>example:</strong>
             * <p>The web report requires all numbers to be converted from Arabic numerals to Chinese numerals</p>
             */
            public Builder webReportConfig(String webReportConfig) {
                this.webReportConfig = webReportConfig;
                return this;
            }

            /**
             * WebReportTheme.
             */
            public Builder webReportTheme(String webReportTheme) {
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
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
