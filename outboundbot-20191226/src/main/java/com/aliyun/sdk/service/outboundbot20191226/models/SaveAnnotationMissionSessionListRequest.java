// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SaveAnnotationMissionSessionListRequest} extends {@link RequestModel}
 *
 * <p>SaveAnnotationMissionSessionListRequest</p>
 */
public class SaveAnnotationMissionSessionListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionDataSourceType")
    private Long annotationMissionDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionList")
    private java.util.List<AnnotationMissionSessionList> annotationMissionSessionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionListJsonString")
    private String annotationMissionSessionListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private Long environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserNick")
    private String userNick;

    private SaveAnnotationMissionSessionListRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentKey = builder.agentKey;
        this.annotationMissionDataSourceType = builder.annotationMissionDataSourceType;
        this.annotationMissionSessionList = builder.annotationMissionSessionList;
        this.annotationMissionSessionListJsonString = builder.annotationMissionSessionListJsonString;
        this.environment = builder.environment;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAnnotationMissionSessionListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return annotationMissionDataSourceType
     */
    public Long getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    /**
     * @return annotationMissionSessionList
     */
    public java.util.List<AnnotationMissionSessionList> getAnnotationMissionSessionList() {
        return this.annotationMissionSessionList;
    }

    /**
     * @return annotationMissionSessionListJsonString
     */
    public String getAnnotationMissionSessionListJsonString() {
        return this.annotationMissionSessionListJsonString;
    }

    /**
     * @return environment
     */
    public Long getEnvironment() {
        return this.environment;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<SaveAnnotationMissionSessionListRequest, Builder> {
        private String agentId; 
        private String agentKey; 
        private Long annotationMissionDataSourceType; 
        private java.util.List<AnnotationMissionSessionList> annotationMissionSessionList; 
        private String annotationMissionSessionListJsonString; 
        private Long environment; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(SaveAnnotationMissionSessionListRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentKey = request.agentKey;
            this.annotationMissionDataSourceType = request.annotationMissionDataSourceType;
            this.annotationMissionSessionList = request.annotationMissionSessionList;
            this.annotationMissionSessionListJsonString = request.annotationMissionSessionListJsonString;
            this.environment = request.environment;
            this.userNick = request.userNick;
        } 

        /**
         * <p>The ID of the agent.</p>
         * <blockquote>
         * <p>You can obtain this value by calling the DescribeInstance API operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1198938</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The key of the workspace. If you do not specify this parameter, the default workspace is accessed. You can obtain the key value on the Business Management page of the Alibaba Cloud account.</p>
         * <blockquote>
         * <p>You can obtain this value by calling the DescribeInstance API operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The data source of the annotation task. Valid values:</p>
         * <ul>
         * <li>1: outbound call</li>
         * <li>2: voice navigation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder annotationMissionDataSourceType(Long annotationMissionDataSourceType) {
            this.putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType);
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }

        /**
         * <p>The session list.</p>
         * <blockquote>
         * <p>This parameter serves the same purpose as the AnnotationMissionSessionListJsonString parameter. Specify only one of them.</p>
         * </blockquote>
         */
        public Builder annotationMissionSessionList(java.util.List<AnnotationMissionSessionList> annotationMissionSessionList) {
            this.putQueryParameter("AnnotationMissionSessionList", annotationMissionSessionList);
            this.annotationMissionSessionList = annotationMissionSessionList;
            return this;
        }

        /**
         * <p>The JSON string of the session list.</p>
         * <blockquote>
         * <p>This parameter serves the same purpose as AnnotationMissionSessionList. Specify only one of them.
         * The JSON fields correspond to the parameters of AnnotationMissionSessionList.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;jobGroupId&quot;:&quot;4093e364-57dc-4a89-83e0-a88454642596&quot;,&quot;modifiedTime&quot;:1744971010000,&quot;instanceId&quot;:&quot;00b37342-e759-4fe5-b296-aef775933af0&quot;,&quot;version&quot;:0,&quot;annotationMissionId&quot;:&quot;3d4bfd93-0d16-4873-9d77-e4fb1771e5cf&quot;,&quot;createTime&quot;:1744971010000,&quot;annotationMissionSessionId&quot;:&quot;42032063-8ef2-48e1-bc99-587b51581742&quot;,&quot;scriptId&quot;:&quot;bc50d543-6d52-4df8-8fb0-50f31ee9c1ff&quot;,&quot;sessionId&quot;:&quot;641a2c43-5e2a-4535-8a4d-c66d4b4258d6&quot;,&quot;jobId&quot;:&quot;fa54c5bb-d8a7-40ae-a32e-9a4a0c734ce5&quot;,&quot;annotationStatus&quot;:2,&quot;debugConversation&quot;:false}]</p>
         */
        public Builder annotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
            this.putQueryParameter("AnnotationMissionSessionListJsonString", annotationMissionSessionListJsonString);
            this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
            return this;
        }

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li>0: NONE</li>
         * <li>1: private cloud</li>
         * <li>2: public cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder environment(Long environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder userNick(String userNick) {
            this.putQueryParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public SaveAnnotationMissionSessionListRequest build() {
            return new SaveAnnotationMissionSessionListRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionChatCustomizationDataInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatCustomizationDataInfoId")
        private String annotationMissionChatCustomizationDataInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataDescription")
        private String customizationDataDescription;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataId")
        private String customizationDataId;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataName")
        private String customizationDataName;

        @com.aliyun.core.annotation.NameInMap("CustomizationDataWeight")
        private Integer customizationDataWeight;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatCustomizationDataInfoList(Builder builder) {
            this.annotationMissionChatCustomizationDataInfoId = builder.annotationMissionChatCustomizationDataInfoId;
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.content = builder.content;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.customizationDataDescription = builder.customizationDataDescription;
            this.customizationDataId = builder.customizationDataId;
            this.customizationDataName = builder.customizationDataName;
            this.customizationDataWeight = builder.customizationDataWeight;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatCustomizationDataInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatCustomizationDataInfoId
         */
        public String getAnnotationMissionChatCustomizationDataInfoId() {
            return this.annotationMissionChatCustomizationDataInfoId;
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customizationDataDescription
         */
        public String getCustomizationDataDescription() {
            return this.customizationDataDescription;
        }

        /**
         * @return customizationDataId
         */
        public String getCustomizationDataId() {
            return this.customizationDataId;
        }

        /**
         * @return customizationDataName
         */
        public String getCustomizationDataName() {
            return this.customizationDataName;
        }

        /**
         * @return customizationDataWeight
         */
        public Integer getCustomizationDataWeight() {
            return this.customizationDataWeight;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatCustomizationDataInfoId; 
            private String annotationMissionChatId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String content; 
            private Boolean create; 
            private Long createTime; 
            private String customizationDataDescription; 
            private String customizationDataId; 
            private String customizationDataName; 
            private Integer customizationDataWeight; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatCustomizationDataInfoList model) {
                this.annotationMissionChatCustomizationDataInfoId = model.annotationMissionChatCustomizationDataInfoId;
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.content = model.content;
                this.create = model.create;
                this.createTime = model.createTime;
                this.customizationDataDescription = model.customizationDataDescription;
                this.customizationDataId = model.customizationDataId;
                this.customizationDataName = model.customizationDataName;
                this.customizationDataWeight = model.customizationDataWeight;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>b598a47a-7c03-45fb-af6b-343950dd9512</p>
             */
            public Builder annotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
                this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
                return this;
            }

            /**
             * <p>chat ID</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>The annotation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>03f56192-fa8a-40dc-9558-39b357f0618f</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>You are now proactively invited to apply. This is a rare opportunity. The credit limit is free of charge if left unused and can be used as your reserve fund. The funds can be credited to your account in as fast as 5 minutes. We recommend that you claim the credit limit for free first</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Specifies whether to create the item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1682316909210</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Default data description</p>
             */
            public Builder customizationDataDescription(String customizationDataDescription) {
                this.customizationDataDescription = customizationDataDescription;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder customizationDataId(String customizationDataId) {
                this.customizationDataId = customizationDataId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default data</p>
             */
            public Builder customizationDataName(String customizationDataName) {
                this.customizationDataName = customizationDataName;
                return this;
            }

            /**
             * <p>The language model data weight.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customizationDataWeight(Integer customizationDataWeight) {
                this.customizationDataWeight = customizationDataWeight;
                return this;
            }

            /**
             * <p>Specifies whether to delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b598a47a-7c03-45fb-af6b-343950dd9512</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1673438100000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatCustomizationDataInfoList build() {
                return new AnnotationMissionChatCustomizationDataInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionChatIntentUserSayInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatIntentUserSayInfoId")
        private String annotationMissionChatIntentUserSayInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("DialogId")
        private Long dialogId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatIntentUserSayInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatIntentUserSayInfoId = builder.annotationMissionChatIntentUserSayInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.botId = builder.botId;
            this.content = builder.content;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.dialogId = builder.dialogId;
            this.instanceId = builder.instanceId;
            this.intentId = builder.intentId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatIntentUserSayInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatIntentUserSayInfoId
         */
        public String getAnnotationMissionChatIntentUserSayInfoId() {
            return this.annotationMissionChatIntentUserSayInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return dialogId
         */
        public Long getDialogId() {
            return this.dialogId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatIntentUserSayInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String botId; 
            private String content; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private Long dialogId; 
            private String instanceId; 
            private Long intentId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatIntentUserSayInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatIntentUserSayInfoId = model.annotationMissionChatIntentUserSayInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.botId = model.botId;
                this.content = model.content;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.dialogId = model.dialogId;
                this.instanceId = model.instanceId;
                this.intentId = model.intentId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>chat ID</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
                this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
                return this;
            }

            /**
             * <p>The annotation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>The robot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Specifies whether to create the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683858248778</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The dialog ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2991201</p>
             */
            public Builder dialogId(Long dialogId) {
                this.dialogId = dialogId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>119839</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683858248778</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatIntentUserSayInfoList build() {
                return new AnnotationMissionChatIntentUserSayInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionChatTagInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatTagInfoId")
        private String annotationMissionChatTagInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoId")
        private String annotationMissionTagInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionTagInfoName")
        private String annotationMissionTagInfoName;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        private AnnotationMissionChatTagInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatTagInfoId = builder.annotationMissionChatTagInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationMissionTagInfoId = builder.annotationMissionTagInfoId;
            this.annotationMissionTagInfoName = builder.annotationMissionTagInfoName;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatTagInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatTagInfoId
         */
        public String getAnnotationMissionChatTagInfoId() {
            return this.annotationMissionChatTagInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationMissionTagInfoId
         */
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        /**
         * @return annotationMissionTagInfoName
         */
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatTagInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private String annotationMissionTagInfoId; 
            private String annotationMissionTagInfoName; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatTagInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatTagInfoId = model.annotationMissionChatTagInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationMissionTagInfoId = model.annotationMissionTagInfoId;
                this.annotationMissionTagInfoName = model.annotationMissionTagInfoName;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
            } 

            /**
             * <p>chat ID</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder annotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
                this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>tag ID</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionTagInfoId(String annotationMissionTagInfoId) {
                this.annotationMissionTagInfoId = annotationMissionTagInfoId;
                return this;
            }

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder annotationMissionTagInfoName(String annotationMissionTagInfoName) {
                this.annotationMissionTagInfoName = annotationMissionTagInfoName;
                return this;
            }

            /**
             * <p>Specifies whether to create the item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The end time of the annotation mission group.</p>
             * 
             * <strong>example:</strong>
             * <p>1679710866060</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>32be9d94-1346-4c4a-a4d0-ccd379f87013</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679710866060</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public AnnotationMissionChatTagInfoList build() {
                return new AnnotationMissionChatTagInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionChatVocabularyInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatVocabularyInfoId")
        private String annotationMissionChatVocabularyInfoId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("Create")
        private Boolean create;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Vocabulary")
        private String vocabulary;

        @com.aliyun.core.annotation.NameInMap("VocabularyDescription")
        private String vocabularyDescription;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        @com.aliyun.core.annotation.NameInMap("VocabularyName")
        private String vocabularyName;

        @com.aliyun.core.annotation.NameInMap("VocabularyWeight")
        private Integer vocabularyWeight;

        private AnnotationMissionChatVocabularyInfoList(Builder builder) {
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatVocabularyInfoId = builder.annotationMissionChatVocabularyInfoId;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.create = builder.create;
            this.createTime = builder.createTime;
            this.delete = builder.delete;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.vocabulary = builder.vocabulary;
            this.vocabularyDescription = builder.vocabularyDescription;
            this.vocabularyId = builder.vocabularyId;
            this.vocabularyName = builder.vocabularyName;
            this.vocabularyWeight = builder.vocabularyWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatVocabularyInfoList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatVocabularyInfoId
         */
        public String getAnnotationMissionChatVocabularyInfoId() {
            return this.annotationMissionChatVocabularyInfoId;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return create
         */
        public Boolean getCreate() {
            return this.create;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return vocabulary
         */
        public String getVocabulary() {
            return this.vocabulary;
        }

        /**
         * @return vocabularyDescription
         */
        public String getVocabularyDescription() {
            return this.vocabularyDescription;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        /**
         * @return vocabularyName
         */
        public String getVocabularyName() {
            return this.vocabularyName;
        }

        /**
         * @return vocabularyWeight
         */
        public Integer getVocabularyWeight() {
            return this.vocabularyWeight;
        }

        public static final class Builder {
            private String annotationMissionChatId; 
            private String annotationMissionChatVocabularyInfoId; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Boolean create; 
            private Long createTime; 
            private Boolean delete; 
            private String instanceId; 
            private Long modifiedTime; 
            private String vocabulary; 
            private String vocabularyDescription; 
            private String vocabularyId; 
            private String vocabularyName; 
            private Integer vocabularyWeight; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatVocabularyInfoList model) {
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatVocabularyInfoId = model.annotationMissionChatVocabularyInfoId;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.create = model.create;
                this.createTime = model.createTime;
                this.delete = model.delete;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.vocabulary = model.vocabulary;
                this.vocabularyDescription = model.vocabularyDescription;
                this.vocabularyId = model.vocabularyId;
                this.vocabularyName = model.vocabularyName;
                this.vocabularyWeight = model.vocabularyWeight;
            } 

            /**
             * <p>chat ID</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>ID</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder annotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
                this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
                return this;
            }

            /**
             * <p>The annotation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>977a45dc-b636-4407-9e98-9f572c709ada</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>Specifies whether to create the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder create(Boolean create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1677552860720</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Specifies whether to delete the item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679283408230</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The hot word annotation content.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder vocabulary(String vocabulary) {
                this.vocabulary = vocabulary;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>After-sales consultation</p>
             */
            public Builder vocabularyDescription(String vocabularyDescription) {
                this.vocabularyDescription = vocabularyDescription;
                return this;
            }

            /**
             * <p>The hot word ID.</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            /**
             * <p>The processing scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>Consultation</p>
             */
            public Builder vocabularyName(String vocabularyName) {
                this.vocabularyName = vocabularyName;
                return this;
            }

            /**
             * <p>The hot word weight. Valid values: -6 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vocabularyWeight(Integer vocabularyWeight) {
                this.vocabularyWeight = vocabularyWeight;
                return this;
            }

            public AnnotationMissionChatVocabularyInfoList build() {
                return new AnnotationMissionChatVocabularyInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionChatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationAsrResult")
        private String annotationAsrResult;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatCustomizationDataInfoList")
        private java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatId")
        private String annotationMissionChatId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatIntentUserSayInfoList")
        private java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatTagInfoList")
        private java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatVocabularyInfoList")
        private java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
        private Integer annotationStatus;

        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("AsrAnnotationStatus")
        private Integer asrAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IntentAnnotationStatus")
        private Integer intentAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OccurTime")
        private Long occurTime;

        @com.aliyun.core.annotation.NameInMap("OriginalAsrResult")
        private String originalAsrResult;

        @com.aliyun.core.annotation.NameInMap("SequenceId")
        private String sequenceId;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
        private Integer subStatus;

        @com.aliyun.core.annotation.NameInMap("TagAnnotationStatus")
        private Integer tagAnnotationStatus;

        @com.aliyun.core.annotation.NameInMap("TranslationError")
        private Integer translationError;

        private AnnotationMissionChatList(Builder builder) {
            this.annotationAsrResult = builder.annotationAsrResult;
            this.annotationMissionChatCustomizationDataInfoList = builder.annotationMissionChatCustomizationDataInfoList;
            this.annotationMissionChatId = builder.annotationMissionChatId;
            this.annotationMissionChatIntentUserSayInfoList = builder.annotationMissionChatIntentUserSayInfoList;
            this.annotationMissionChatTagInfoList = builder.annotationMissionChatTagInfoList;
            this.annotationMissionChatVocabularyInfoList = builder.annotationMissionChatVocabularyInfoList;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationStatus = builder.annotationStatus;
            this.answer = builder.answer;
            this.asrAnnotationStatus = builder.asrAnnotationStatus;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.intentAnnotationStatus = builder.intentAnnotationStatus;
            this.modifiedTime = builder.modifiedTime;
            this.occurTime = builder.occurTime;
            this.originalAsrResult = builder.originalAsrResult;
            this.sequenceId = builder.sequenceId;
            this.subStatus = builder.subStatus;
            this.tagAnnotationStatus = builder.tagAnnotationStatus;
            this.translationError = builder.translationError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionChatList create() {
            return builder().build();
        }

        /**
         * @return annotationAsrResult
         */
        public String getAnnotationAsrResult() {
            return this.annotationAsrResult;
        }

        /**
         * @return annotationMissionChatCustomizationDataInfoList
         */
        public java.util.List<AnnotationMissionChatCustomizationDataInfoList> getAnnotationMissionChatCustomizationDataInfoList() {
            return this.annotationMissionChatCustomizationDataInfoList;
        }

        /**
         * @return annotationMissionChatId
         */
        public String getAnnotationMissionChatId() {
            return this.annotationMissionChatId;
        }

        /**
         * @return annotationMissionChatIntentUserSayInfoList
         */
        public java.util.List<AnnotationMissionChatIntentUserSayInfoList> getAnnotationMissionChatIntentUserSayInfoList() {
            return this.annotationMissionChatIntentUserSayInfoList;
        }

        /**
         * @return annotationMissionChatTagInfoList
         */
        public java.util.List<AnnotationMissionChatTagInfoList> getAnnotationMissionChatTagInfoList() {
            return this.annotationMissionChatTagInfoList;
        }

        /**
         * @return annotationMissionChatVocabularyInfoList
         */
        public java.util.List<AnnotationMissionChatVocabularyInfoList> getAnnotationMissionChatVocabularyInfoList() {
            return this.annotationMissionChatVocabularyInfoList;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationStatus
         */
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return asrAnnotationStatus
         */
        public Integer getAsrAnnotationStatus() {
            return this.asrAnnotationStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return intentAnnotationStatus
         */
        public Integer getIntentAnnotationStatus() {
            return this.intentAnnotationStatus;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return occurTime
         */
        public Long getOccurTime() {
            return this.occurTime;
        }

        /**
         * @return originalAsrResult
         */
        public String getOriginalAsrResult() {
            return this.originalAsrResult;
        }

        /**
         * @return sequenceId
         */
        public String getSequenceId() {
            return this.sequenceId;
        }

        /**
         * @return subStatus
         */
        public Integer getSubStatus() {
            return this.subStatus;
        }

        /**
         * @return tagAnnotationStatus
         */
        public Integer getTagAnnotationStatus() {
            return this.tagAnnotationStatus;
        }

        /**
         * @return translationError
         */
        public Integer getTranslationError() {
            return this.translationError;
        }

        public static final class Builder {
            private String annotationAsrResult; 
            private java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList; 
            private String annotationMissionChatId; 
            private java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList; 
            private java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList; 
            private java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Integer annotationStatus; 
            private String answer; 
            private Integer asrAnnotationStatus; 
            private Long createTime; 
            private String instanceId; 
            private Integer intentAnnotationStatus; 
            private Long modifiedTime; 
            private Long occurTime; 
            private String originalAsrResult; 
            private String sequenceId; 
            private Integer subStatus; 
            private Integer tagAnnotationStatus; 
            private Integer translationError; 

            private Builder() {
            } 

            private Builder(AnnotationMissionChatList model) {
                this.annotationAsrResult = model.annotationAsrResult;
                this.annotationMissionChatCustomizationDataInfoList = model.annotationMissionChatCustomizationDataInfoList;
                this.annotationMissionChatId = model.annotationMissionChatId;
                this.annotationMissionChatIntentUserSayInfoList = model.annotationMissionChatIntentUserSayInfoList;
                this.annotationMissionChatTagInfoList = model.annotationMissionChatTagInfoList;
                this.annotationMissionChatVocabularyInfoList = model.annotationMissionChatVocabularyInfoList;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationStatus = model.annotationStatus;
                this.answer = model.answer;
                this.asrAnnotationStatus = model.asrAnnotationStatus;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.intentAnnotationStatus = model.intentAnnotationStatus;
                this.modifiedTime = model.modifiedTime;
                this.occurTime = model.occurTime;
                this.originalAsrResult = model.originalAsrResult;
                this.sequenceId = model.sequenceId;
                this.subStatus = model.subStatus;
                this.tagAnnotationStatus = model.tagAnnotationStatus;
                this.translationError = model.translationError;
            } 

            /**
             * <p>The manual ASR annotation text result, which is used to calculate the character accuracy rate.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder annotationAsrResult(String annotationAsrResult) {
                this.annotationAsrResult = annotationAsrResult;
                return this;
            }

            /**
             * <p>The language model annotation information table for the annotation task chat.</p>
             */
            public Builder annotationMissionChatCustomizationDataInfoList(java.util.List<AnnotationMissionChatCustomizationDataInfoList> annotationMissionChatCustomizationDataInfoList) {
                this.annotationMissionChatCustomizationDataInfoList = annotationMissionChatCustomizationDataInfoList;
                return this;
            }

            /**
             * <p>chat ID</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionChatId(String annotationMissionChatId) {
                this.annotationMissionChatId = annotationMissionChatId;
                return this;
            }

            /**
             * <p>The list.</p>
             */
            public Builder annotationMissionChatIntentUserSayInfoList(java.util.List<AnnotationMissionChatIntentUserSayInfoList> annotationMissionChatIntentUserSayInfoList) {
                this.annotationMissionChatIntentUserSayInfoList = annotationMissionChatIntentUserSayInfoList;
                return this;
            }

            /**
             * <p>The mapping list of bound tags for the annotation information chat.</p>
             */
            public Builder annotationMissionChatTagInfoList(java.util.List<AnnotationMissionChatTagInfoList> annotationMissionChatTagInfoList) {
                this.annotationMissionChatTagInfoList = annotationMissionChatTagInfoList;
                return this;
            }

            /**
             * <p>The hot word annotation information table for the annotation task chat.</p>
             */
            public Builder annotationMissionChatVocabularyInfoList(java.util.List<AnnotationMissionChatVocabularyInfoList> annotationMissionChatVocabularyInfoList) {
                this.annotationMissionChatVocabularyInfoList = annotationMissionChatVocabularyInfoList;
                return this;
            }

            /**
             * <p>The annotation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>The annotation status. Valid values:</p>
             * <ul>
             * <li>0: Not completed (UNDO).</li>
             * <li>1: In progress (DOING).</li>
             * <li>2: Completed (DONE).</li>
             * <li>3: Canceled (CLOSED).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * <p>The reply content of the robot.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Answer\&quot;: u\&quot;\u53c2\u8003\u6587\u6863\uff1a<a href="https://help.aliyun.com/document_detail/181325.html%5C%5C">https://help.aliyun.com/document_detail/181325.html\\</a>&quot;, \&quot;QuestionId\&quot;: 372858, \&quot;Uuid\&quot;: \&quot;ac14000516762684770197536d0044\&quot;}</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The ASR annotation status. Valid values:</p>
             * <ul>
             * <li>0: Not completed (UNDO).</li>
             * <li>1: In progress (DOING).</li>
             * <li>2: Completed (DONE).</li>
             * <li>3: Canceled (CLOSED).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder asrAnnotationStatus(Integer asrAnnotationStatus) {
                this.asrAnnotationStatus = asrAnnotationStatus;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679629770336</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5ec263fa-c8de-46f4-b844-6fb8275bb645</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The intent annotation status. Valid values:</p>
             * <ul>
             * <li>0: Not completed (UNDO).</li>
             * <li>1: In progress (DOING).</li>
             * <li>2: Completed (DONE).</li>
             * <li>3: Canceled (CLOSED).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder intentAnnotationStatus(Integer intentAnnotationStatus) {
                this.intentAnnotationStatus = intentAnnotationStatus;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1629360780000</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The trigger time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1682493047418</p>
             */
            public Builder occurTime(Long occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * <p>The ASR recognition result.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder originalAsrResult(String originalAsrResult) {
                this.originalAsrResult = originalAsrResult;
                return this;
            }

            /**
             * <p>The sequence number of the current session interaction round.</p>
             * 
             * <strong>example:</strong>
             * <p>1475140522</p>
             */
            public Builder sequenceId(String sequenceId) {
                this.sequenceId = sequenceId;
                return this;
            }

            /**
             * <p>The annotation action. Valid values:</p>
             * <ul>
             * <li>1: Correct.</li>
             * <li>20: Match error, not optimized.</li>
             * <li>21: Match error, optimized.</li>
             * <li>3: Not covered.</li>
             * <li>4: Invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subStatus(Integer subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            /**
             * <p>The tag annotation status. Valid values:</p>
             * <ul>
             * <li>0: Not completed (UNDO).</li>
             * <li>1: In progress (DOING).</li>
             * <li>2: Completed (DONE).</li>
             * <li>3: Canceled (CLOSED).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagAnnotationStatus(Integer tagAnnotationStatus) {
                this.tagAnnotationStatus = tagAnnotationStatus;
                return this;
            }

            /**
             * <p>Indicates whether a translation error occurred. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>1: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder translationError(Integer translationError) {
                this.translationError = translationError;
                return this;
            }

            public AnnotationMissionChatList build() {
                return new AnnotationMissionChatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListRequest} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListRequest</p>
     */
    public static class AnnotationMissionSessionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionChatList")
        private java.util.List<AnnotationMissionChatList> annotationMissionChatList;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
        private String annotationMissionSessionId;

        @com.aliyun.core.annotation.NameInMap("AnnotationStatus")
        private Integer annotationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private AnnotationMissionSessionList(Builder builder) {
            this.annotationMissionChatList = builder.annotationMissionChatList;
            this.annotationMissionId = builder.annotationMissionId;
            this.annotationMissionSessionId = builder.annotationMissionSessionId;
            this.annotationStatus = builder.annotationStatus;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.modifiedTime = builder.modifiedTime;
            this.scriptId = builder.scriptId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationMissionSessionList create() {
            return builder().build();
        }

        /**
         * @return annotationMissionChatList
         */
        public java.util.List<AnnotationMissionChatList> getAnnotationMissionChatList() {
            return this.annotationMissionChatList;
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return annotationMissionSessionId
         */
        public String getAnnotationMissionSessionId() {
            return this.annotationMissionSessionId;
        }

        /**
         * @return annotationStatus
         */
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private java.util.List<AnnotationMissionChatList> annotationMissionChatList; 
            private String annotationMissionId; 
            private String annotationMissionSessionId; 
            private Integer annotationStatus; 
            private Long createTime; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long modifiedTime; 
            private String scriptId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(AnnotationMissionSessionList model) {
                this.annotationMissionChatList = model.annotationMissionChatList;
                this.annotationMissionId = model.annotationMissionId;
                this.annotationMissionSessionId = model.annotationMissionSessionId;
                this.annotationStatus = model.annotationStatus;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.jobGroupId = model.jobGroupId;
                this.jobId = model.jobId;
                this.modifiedTime = model.modifiedTime;
                this.scriptId = model.scriptId;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>The chat list.</p>
             */
            public Builder annotationMissionChatList(java.util.List<AnnotationMissionChatList> annotationMissionChatList) {
                this.annotationMissionChatList = annotationMissionChatList;
                return this;
            }

            /**
             * <p>The annotation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
             */
            public Builder annotationMissionSessionId(String annotationMissionSessionId) {
                this.annotationMissionSessionId = annotationMissionSessionId;
                return this;
            }

            /**
             * <p>The annotation status. Valid values:</p>
             * <ul>
             * <li>0: Not completed (UNDO).</li>
             * <li>1: In progress (DOING).</li>
             * <li>2: Completed (DONE).</li>
             * <li>3: Canceled (CLOSED).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder annotationStatus(Integer annotationStatus) {
                this.annotationStatus = annotationStatus;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-14T02:01:23Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>77343553-cbc2-4487-a35c-869f1e86c573</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The job group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>29e669bd-a9d1-4529-98cd-c2b0549bcf53</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>593aaf5e-1275-4add-9990-22696385dc6e</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683858248778</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e4f32632-2e56-4399-9fec-47bdbaeefdf6</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The session ID. The value is taskId for outbound robots and conversationId for voice navigator robots.</p>
             * 
             * <strong>example:</strong>
             * <p>e6271044-b4b2-4ad8-ade4-c720be023538</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public AnnotationMissionSessionList build() {
                return new AnnotationMissionSessionList(this);
            } 

        } 

    }
}
