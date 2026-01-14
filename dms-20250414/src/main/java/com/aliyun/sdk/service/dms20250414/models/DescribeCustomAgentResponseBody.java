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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
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
         * Success.
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
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
     * {@link DescribeCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunParentUid")
        private String aliyunParentUid;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CreatorUserName")
        private String creatorUserName;

        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("DataJson")
        private String dataJson;

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

        @com.aliyun.core.annotation.NameInMap("Knowledge")
        private String knowledge;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfigList")
        private java.util.List<KnowledgeConfigList> knowledgeConfigList;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierUserName")
        private String modifierUserName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OfflineTime")
        private String offlineTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TextReportConfig")
        private String textReportConfig;

        @com.aliyun.core.annotation.NameInMap("WebReportConfig")
        private String webReportConfig;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.aliyunParentUid = builder.aliyunParentUid;
            this.aliyunUid = builder.aliyunUid;
            this.creatorUserName = builder.creatorUserName;
            this.customAgentId = builder.customAgentId;
            this.dataJson = builder.dataJson;
            this.description = builder.description;
            this.dmsUnit = builder.dmsUnit;
            this.executionConfig = builder.executionConfig;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instruction = builder.instruction;
            this.knowledge = builder.knowledge;
            this.knowledgeConfigList = builder.knowledgeConfigList;
            this.modifier = builder.modifier;
            this.modifierUserName = builder.modifierUserName;
            this.name = builder.name;
            this.offlineTime = builder.offlineTime;
            this.region = builder.region;
            this.releaseTime = builder.releaseTime;
            this.status = builder.status;
            this.textReportConfig = builder.textReportConfig;
            this.webReportConfig = builder.webReportConfig;
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
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
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

        public static final class Builder {
            private String aliyunParentUid; 
            private String aliyunUid; 
            private String creatorUserName; 
            private String customAgentId; 
            private String dataJson; 
            private String description; 
            private String dmsUnit; 
            private ExecutionConfig executionConfig; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instruction; 
            private String knowledge; 
            private java.util.List<KnowledgeConfigList> knowledgeConfigList; 
            private String modifier; 
            private String modifierUserName; 
            private String name; 
            private String offlineTime; 
            private String region; 
            private String releaseTime; 
            private String status; 
            private String textReportConfig; 
            private String webReportConfig; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunParentUid = model.aliyunParentUid;
                this.aliyunUid = model.aliyunUid;
                this.creatorUserName = model.creatorUserName;
                this.customAgentId = model.customAgentId;
                this.dataJson = model.dataJson;
                this.description = model.description;
                this.dmsUnit = model.dmsUnit;
                this.executionConfig = model.executionConfig;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.instruction = model.instruction;
                this.knowledge = model.knowledge;
                this.knowledgeConfigList = model.knowledgeConfigList;
                this.modifier = model.modifier;
                this.modifierUserName = model.modifierUserName;
                this.name = model.name;
                this.offlineTime = model.offlineTime;
                this.region = model.region;
                this.releaseTime = model.releaseTime;
                this.status = model.status;
                this.textReportConfig = model.textReportConfig;
                this.webReportConfig = model.webReportConfig;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * AliyunParentUid.
             */
            public Builder aliyunParentUid(String aliyunParentUid) {
                this.aliyunParentUid = aliyunParentUid;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * CreatorUserName.
             */
            public Builder creatorUserName(String creatorUserName) {
                this.creatorUserName = creatorUserName;
                return this;
            }

            /**
             * CustomAgentId.
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * DataJson.
             */
            public Builder dataJson(String dataJson) {
                this.dataJson = dataJson;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DmsUnit.
             */
            public Builder dmsUnit(String dmsUnit) {
                this.dmsUnit = dmsUnit;
                return this;
            }

            /**
             * ExecutionConfig.
             */
            public Builder executionConfig(ExecutionConfig executionConfig) {
                this.executionConfig = executionConfig;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Instruction.
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * Knowledge.
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
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifierUserName.
             */
            public Builder modifierUserName(String modifierUserName) {
                this.modifierUserName = modifierUserName;
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
             * OfflineTime.
             */
            public Builder offlineTime(String offlineTime) {
                this.offlineTime = offlineTime;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ReleaseTime.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TextReportConfig.
             */
            public Builder textReportConfig(String textReportConfig) {
                this.textReportConfig = textReportConfig;
                return this;
            }

            /**
             * WebReportConfig.
             */
            public Builder webReportConfig(String webReportConfig) {
                this.webReportConfig = webReportConfig;
                return this;
            }

            /**
             * WorkspaceId.
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
