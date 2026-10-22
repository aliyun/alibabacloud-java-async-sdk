// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAIStaffChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIStaffChatMessagesResponseBody</p>
 */
public class ListAIStaffChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAIStaffChatMessagesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIStaffChatMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAIStaffChatMessagesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The access denial details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether a retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not in use and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>System error</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAIStaffChatMessagesResponseBody build() {
            return new ListAIStaffChatMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIStaffChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIStaffChatMessagesResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("ChatId")
        private String chatId;

        @com.aliyun.core.annotation.NameInMap("ChatStatus")
        private String chatStatus;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private java.util.Map<String, ?> metaData;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SectionId")
        private String sectionId;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Messages(Builder builder) {
            this.botId = builder.botId;
            this.chatId = builder.chatId;
            this.chatStatus = builder.chatStatus;
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.conversationId = builder.conversationId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.messageId = builder.messageId;
            this.metaData = builder.metaData;
            this.role = builder.role;
            this.sectionId = builder.sectionId;
            this.siteId = builder.siteId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return chatId
         */
        public String getChatId() {
            return this.chatId;
        }

        /**
         * @return chatStatus
         */
        public String getChatStatus() {
            return this.chatStatus;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return metaData
         */
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return sectionId
         */
        public String getSectionId() {
            return this.sectionId;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String botId; 
            private String chatId; 
            private String chatStatus; 
            private String content; 
            private String contentType; 
            private String conversationId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String messageId; 
            private java.util.Map<String, ?> metaData; 
            private String role; 
            private String sectionId; 
            private String siteId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.botId = model.botId;
                this.chatId = model.chatId;
                this.chatStatus = model.chatStatus;
                this.content = model.content;
                this.contentType = model.contentType;
                this.conversationId = model.conversationId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.messageId = model.messageId;
                this.metaData = model.metaData;
                this.role = model.role;
                this.sectionId = model.sectionId;
                this.siteId = model.siteId;
                this.type = model.type;
            } 

            /**
             * <p>The bot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Zero2</p>
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * <p>The ID of the current conversation turn.</p>
             * 
             * <strong>example:</strong>
             * <p>54a0bfa0-41bd-4e96-acd9-fb13c0474452</p>
             */
            public Builder chatId(String chatId) {
                this.chatId = chatId;
                return this;
            }

            /**
             * <p>The current conversation status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder chatStatus(String chatStatus) {
                this.chatStatus = chatStatus;
                return this;
            }

            /**
             * <p>The ID of the invoked data API.</p>
             * 
             * <strong>example:</strong>
             * <p>domain cnamen<a href="http://www.buyhao8.com">www.buyhao8.com</a> <a href="http://www.buyhao8.com.a1.initrr.comn">www.buyhao8.com.a1.initrr.comn</a></p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>application/octet-stream</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-675163021891846144</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1723532098</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1591339051000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1dafa033-e72b-44c2-99b7-bc202c5b6198</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The business extension metadata. The value must be a JSON string in map format.</p>
             */
            public Builder metaData(java.util.Map<String, ?> metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The role of the conversation participant. Valid values:</p>
             * <ul>
             * <li><p>user: User.</p>
             * </li>
             * <li><p>assistant: Assistant.</p>
             * </li>
             * <li><p>system: System.</p>
             * </li>
             * <li><p>function: Function.</p>
             * </li>
             * <li><p>plugin: Plug-in.</p>
             * </li>
             * <li><p>tool: Tool.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The section ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>324</p>
             */
            public Builder sectionId(String sectionId) {
                this.sectionId = sectionId;
                return this;
            }

            /**
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>928636774795776</p>
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>SINGLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIStaffChatMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIStaffChatMessagesResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        private Module(Builder builder) {
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List<Messages> messages; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.messages = model.messages;
            } 

            /**
             * <p>The sender type. Valid values:</p>
             * <ul>
             * <li><strong>ADMIN</strong>: System.</li>
             * <li><strong>CUSTOMER</strong>: Visitor.</li>
             * <li><strong>AGENT</strong>: Agent.</li>
             * </ul>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
