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
 * {@link MakeCallResponseBody} extends {@link TeaModel}
 *
 * <p>MakeCallResponseBody</p>
 */
public class MakeCallResponseBody extends TeaModel {
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

    private MakeCallResponseBody(Builder builder) {
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

    public static MakeCallResponseBody create() {
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

        private Builder(MakeCallResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>List of response parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MakeCallResponseBody build() {
            return new MakeCallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MakeCallResponseBody} extends {@link TeaModel}
     *
     * <p>MakeCallResponseBody</p>
     */
    public static class ChannelContexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("ChannelFlags")
        private String channelFlags;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelState")
        private String channelState;

        @com.aliyun.core.annotation.NameInMap("Destination")
        private String destination;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private String originator;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ReleaseReason")
        private String releaseReason;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("UserExtension")
        private String userExtension;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ChannelContexts(Builder builder) {
            this.callType = builder.callType;
            this.channelFlags = builder.channelFlags;
            this.channelId = builder.channelId;
            this.channelState = builder.channelState;
            this.destination = builder.destination;
            this.jobId = builder.jobId;
            this.mediaType = builder.mediaType;
            this.originator = builder.originator;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.timestamp = builder.timestamp;
            this.userExtension = builder.userExtension;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelContexts create() {
            return builder().build();
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return channelFlags
         */
        public String getChannelFlags() {
            return this.channelFlags;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelState
         */
        public String getChannelState() {
            return this.channelState;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return originator
         */
        public String getOriginator() {
            return this.originator;
        }

        /**
         * @return releaseInitiator
         */
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        /**
         * @return releaseReason
         */
        public String getReleaseReason() {
            return this.releaseReason;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userExtension
         */
        public String getUserExtension() {
            return this.userExtension;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String callType; 
            private String channelFlags; 
            private String channelId; 
            private String channelState; 
            private String destination; 
            private String jobId; 
            private String mediaType; 
            private String originator; 
            private String releaseInitiator; 
            private String releaseReason; 
            private Long timestamp; 
            private String userExtension; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ChannelContexts model) {
                this.callType = model.callType;
                this.channelFlags = model.channelFlags;
                this.channelId = model.channelId;
                this.channelState = model.channelState;
                this.destination = model.destination;
                this.jobId = model.jobId;
                this.mediaType = model.mediaType;
                this.originator = model.originator;
                this.releaseInitiator = model.releaseInitiator;
                this.releaseReason = model.releaseReason;
                this.timestamp = model.timestamp;
                this.userExtension = model.userExtension;
                this.userId = model.userId;
            } 

            /**
             * <p>The call type of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>OUTBOUND</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>Channel flags.</p>
             * 
             * <strong>example:</strong>
             * <p>MONITORING</p>
             */
            public Builder channelFlags(String channelFlags) {
                this.channelFlags = channelFlags;
                return this;
            }

            /**
             * <p>The channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The status of the call channel.</p>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder channelState(String channelState) {
                this.channelState = channelState;
                return this;
            }

            /**
             * <p>Callee of the call channel.</p>
             * 
             * <strong>example:</strong>
             * <p>8001****</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-6570007401392****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Media type. The default value is AUDIO. Other valid values include VIDEO.</p>
             * 
             * <strong>example:</strong>
             * <p>Audio</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>The originator of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>1318888****</p>
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * <p>The party that initiated the release of the call channel, indicating who hung up first.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * <p>The reason for releasing the channel. This value indicates why the current channel was disconnected and corresponds to a response code defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the disconnection reason.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * <p>The UNIX timestamp indicating the most recent status change of the channel, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1609225718295</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The extension number of the agent associated with the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>8001****</p>
             */
            public Builder userExtension(String userExtension) {
                this.userExtension = userExtension;
                return this;
            }

            /**
             * <p>The agent ID associated with the channel. This field is empty for customer channels.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChannelContexts build() {
                return new ChannelContexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link MakeCallResponseBody} extends {@link TeaModel}
     *
     * <p>MakeCallResponseBody</p>
     */
    public static class CallContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CallVariables")
        private String callVariables;

        @com.aliyun.core.annotation.NameInMap("ChannelContexts")
        private java.util.List<ChannelContexts> channelContexts;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private CallContext(Builder builder) {
            this.callType = builder.callType;
            this.callVariables = builder.callVariables;
            this.channelContexts = builder.channelContexts;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallContext create() {
            return builder().build();
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return callVariables
         */
        public String getCallVariables() {
            return this.callVariables;
        }

        /**
         * @return channelContexts
         */
        public java.util.List<ChannelContexts> getChannelContexts() {
            return this.channelContexts;
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
            private String callType; 
            private String callVariables; 
            private java.util.List<ChannelContexts> channelContexts; 
            private String instanceId; 
            private String jobId; 

            private Builder() {
            } 

            private Builder(CallContext model) {
                this.callType = model.callType;
                this.callVariables = model.callVariables;
                this.channelContexts = model.channelContexts;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
            } 

            /**
             * <p>Call type.</p>
             * 
             * <strong>example:</strong>
             * <p>OUTBOUND</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>Ingest endpoint data. Custom data passed through SIP signaling.</p>
             * 
             * <strong>example:</strong>
             * <p>a=b;c=d</p>
             */
            public Builder callVariables(String callVariables) {
                this.callVariables = callVariables;
                return this;
            }

            /**
             * <p>List of call channels.</p>
             */
            public Builder channelContexts(java.util.List<ChannelContexts> channelContexts) {
                this.channelContexts = channelContexts;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-6570007401392****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public CallContext build() {
                return new CallContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link MakeCallResponseBody} extends {@link TeaModel}
     *
     * <p>MakeCallResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

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
            this.extension = builder.extension;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.outboundScenario = builder.outboundScenario;
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
         * @return extension
         */
        public String getExtension() {
            return this.extension;
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
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
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
            private String extension; 
            private String instanceId; 
            private String jobId; 
            private Boolean outboundScenario; 
            private java.util.List<String> signedSkillGroupIdList; 
            private String userId; 
            private String userState; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(UserContext model) {
                this.breakCode = model.breakCode;
                this.deviceId = model.deviceId;
                this.extension = model.extension;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.outboundScenario = model.outboundScenario;
                this.signedSkillGroupIdList = model.signedSkillGroupIdList;
                this.userId = model.userId;
                this.userState = model.userState;
                this.workMode = model.workMode;
            } 

            /**
             * <p>Break status code, which can be either System-defined or Custom-defined. System-defined break codes include: Warm-up (temporary break state after agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent call rejection). There are no restrictions on Custom-defined status codes, and Customers can define them according to their business needs.</p>
             * 
             * <strong>example:</strong>
             * <p>Warm-up</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>Device ID, which is the identity ID of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>ACC-YUNBS-1.0.10-****</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>Agent extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8001****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-6570007401392****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Indicates whether the agent is in outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * <p>List of skill group IDs that the agent has signed into.</p>
             */
            public Builder signedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
                this.signedSkillGroupIdList = signedSkillGroupIdList;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Agent status.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder userState(String userState) {
                this.userState = userState;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
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
     * {@link MakeCallResponseBody} extends {@link TeaModel}
     *
     * <p>MakeCallResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallContext")
        private CallContext callContext;

        @com.aliyun.core.annotation.NameInMap("ContextId")
        private Long contextId;

        @com.aliyun.core.annotation.NameInMap("UserContext")
        private UserContext userContext;

        private Data(Builder builder) {
            this.callContext = builder.callContext;
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
         * @return callContext
         */
        public CallContext getCallContext() {
            return this.callContext;
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
            private CallContext callContext; 
            private Long contextId; 
            private UserContext userContext; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callContext = model.callContext;
                this.contextId = model.contextId;
                this.userContext = model.userContext;
            } 

            /**
             * <p>Call context environment.</p>
             */
            public Builder callContext(CallContext callContext) {
                this.callContext = callContext;
                return this;
            }

            /**
             * <p>System auto-increment ID. Customers do not need to concern themselves with this.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder contextId(Long contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * <p>Agent context environment.</p>
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
