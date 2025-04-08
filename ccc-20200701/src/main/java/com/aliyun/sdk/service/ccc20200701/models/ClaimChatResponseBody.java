// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ClaimChatResponseBody} extends {@link TeaModel}
 *
 * <p>ClaimChatResponseBody</p>
 */
public class ClaimChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClaimChatResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClaimChatResponseBody create() {
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClaimChatResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClaimChatResponseBody build() {
            return new ClaimChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClaimChatResponseBody} extends {@link TeaModel}
     *
     * <p>ClaimChatResponseBody</p>
     */
    public static class ChatContexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessChannelId")
        private String accessChannelId;

        @com.aliyun.core.annotation.NameInMap("AccessChannelName")
        private String accessChannelName;

        @com.aliyun.core.annotation.NameInMap("AccessChannelType")
        private String accessChannelType;

        @com.aliyun.core.annotation.NameInMap("BeingAssigned")
        private Boolean beingAssigned;

        @com.aliyun.core.annotation.NameInMap("CallVariables")
        private String callVariables;

        @com.aliyun.core.annotation.NameInMap("ChatType")
        private String chatType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private ChatContexts(Builder builder) {
            this.accessChannelId = builder.accessChannelId;
            this.accessChannelName = builder.accessChannelName;
            this.accessChannelType = builder.accessChannelType;
            this.beingAssigned = builder.beingAssigned;
            this.callVariables = builder.callVariables;
            this.chatType = builder.chatType;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatContexts create() {
            return builder().build();
        }

        /**
         * @return accessChannelId
         */
        public String getAccessChannelId() {
            return this.accessChannelId;
        }

        /**
         * @return accessChannelName
         */
        public String getAccessChannelName() {
            return this.accessChannelName;
        }

        /**
         * @return accessChannelType
         */
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        /**
         * @return beingAssigned
         */
        public Boolean getBeingAssigned() {
            return this.beingAssigned;
        }

        /**
         * @return callVariables
         */
        public String getCallVariables() {
            return this.callVariables;
        }

        /**
         * @return chatType
         */
        public String getChatType() {
            return this.chatType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String accessChannelId; 
            private String accessChannelName; 
            private String accessChannelType; 
            private Boolean beingAssigned; 
            private String callVariables; 
            private String chatType; 
            private String instanceId; 
            private String jobId; 

            private Builder() {
            } 

            private Builder(ChatContexts model) {
                this.accessChannelId = model.accessChannelId;
                this.accessChannelName = model.accessChannelName;
                this.accessChannelType = model.accessChannelType;
                this.beingAssigned = model.beingAssigned;
                this.callVariables = model.callVariables;
                this.chatType = model.chatType;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
            } 

            /**
             * AccessChannelId.
             */
            public Builder accessChannelId(String accessChannelId) {
                this.accessChannelId = accessChannelId;
                return this;
            }

            /**
             * AccessChannelName.
             */
            public Builder accessChannelName(String accessChannelName) {
                this.accessChannelName = accessChannelName;
                return this;
            }

            /**
             * AccessChannelType.
             */
            public Builder accessChannelType(String accessChannelType) {
                this.accessChannelType = accessChannelType;
                return this;
            }

            /**
             * BeingAssigned.
             */
            public Builder beingAssigned(Boolean beingAssigned) {
                this.beingAssigned = beingAssigned;
                return this;
            }

            /**
             * CallVariables.
             */
            public Builder callVariables(String callVariables) {
                this.callVariables = callVariables;
                return this;
            }

            /**
             * ChatType.
             */
            public Builder chatType(String chatType) {
                this.chatType = chatType;
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public ChatContexts build() {
                return new ChatContexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClaimChatResponseBody} extends {@link TeaModel}
     *
     * <p>ClaimChatResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceState")
        private String deviceState;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("Heartbeat")
        private Long heartbeat;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("SignedSkillGroupIdList")
        private java.util.List<String> signedSkillGroupIdList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserState")
        private String userState;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private UserContext(Builder builder) {
            this.breakCode = builder.breakCode;
            this.deviceId = builder.deviceId;
            this.deviceState = builder.deviceState;
            this.extension = builder.extension;
            this.heartbeat = builder.heartbeat;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.mobile = builder.mobile;
            this.outboundScenario = builder.outboundScenario;
            this.reserved = builder.reserved;
            this.signedSkillGroupIdList = builder.signedSkillGroupIdList;
            this.userId = builder.userId;
            this.userState = builder.userState;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserContext create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceState
         */
        public String getDeviceState() {
            return this.deviceState;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return heartbeat
         */
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        /**
         * @return reserved
         */
        public Long getReserved() {
            return this.reserved;
        }

        /**
         * @return signedSkillGroupIdList
         */
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userState
         */
        public String getUserState() {
            return this.userState;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String breakCode; 
            private String deviceId; 
            private String deviceState; 
            private String extension; 
            private Long heartbeat; 
            private String instanceId; 
            private String jobId; 
            private String mobile; 
            private Boolean outboundScenario; 
            private Long reserved; 
            private java.util.List<String> signedSkillGroupIdList; 
            private String userId; 
            private String userState; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(UserContext model) {
                this.breakCode = model.breakCode;
                this.deviceId = model.deviceId;
                this.deviceState = model.deviceState;
                this.extension = model.extension;
                this.heartbeat = model.heartbeat;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.mobile = model.mobile;
                this.outboundScenario = model.outboundScenario;
                this.reserved = model.reserved;
                this.signedSkillGroupIdList = model.signedSkillGroupIdList;
                this.userId = model.userId;
                this.userState = model.userState;
                this.workMode = model.workMode;
            } 

            /**
             * BreakCode.
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceState.
             */
            public Builder deviceState(String deviceState) {
                this.deviceState = deviceState;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Heartbeat.
             */
            public Builder heartbeat(Long heartbeat) {
                this.heartbeat = heartbeat;
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OutboundScenario.
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * SignedSkillGroupIdList.
             */
            public Builder signedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
                this.signedSkillGroupIdList = signedSkillGroupIdList;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserState.
             */
            public Builder userState(String userState) {
                this.userState = userState;
                return this;
            }

            /**
             * WorkMode.
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public UserContext build() {
                return new UserContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClaimChatResponseBody} extends {@link TeaModel}
     *
     * <p>ClaimChatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatContexts")
        private java.util.List<ChatContexts> chatContexts;

        @com.aliyun.core.annotation.NameInMap("ContextId")
        private Long contextId;

        @com.aliyun.core.annotation.NameInMap("UserContext")
        private UserContext userContext;

        private Data(Builder builder) {
            this.chatContexts = builder.chatContexts;
            this.contextId = builder.contextId;
            this.userContext = builder.userContext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chatContexts
         */
        public java.util.List<ChatContexts> getChatContexts() {
            return this.chatContexts;
        }

        /**
         * @return contextId
         */
        public Long getContextId() {
            return this.contextId;
        }

        /**
         * @return userContext
         */
        public UserContext getUserContext() {
            return this.userContext;
        }

        public static final class Builder {
            private java.util.List<ChatContexts> chatContexts; 
            private Long contextId; 
            private UserContext userContext; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chatContexts = model.chatContexts;
                this.contextId = model.contextId;
                this.userContext = model.userContext;
            } 

            /**
             * ChatContexts.
             */
            public Builder chatContexts(java.util.List<ChatContexts> chatContexts) {
                this.chatContexts = chatContexts;
                return this;
            }

            /**
             * ContextId.
             */
            public Builder contextId(Long contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * UserContext.
             */
            public Builder userContext(UserContext userContext) {
                this.userContext = userContext;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
