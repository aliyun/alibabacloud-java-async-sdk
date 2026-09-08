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
 * {@link InterceptCallResponseBody} extends {@link TeaModel}
 *
 * <p>InterceptCallResponseBody</p>
 */
public class InterceptCallResponseBody extends TeaModel {
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

    private InterceptCallResponseBody(Builder builder) {
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

    public static InterceptCallResponseBody create() {
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

        private Builder(InterceptCallResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>响应码。</p>
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
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InterceptCallResponseBody build() {
            return new InterceptCallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InterceptCallResponseBody} extends {@link TeaModel}
     *
     * <p>InterceptCallResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Originator")
        private String originator;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ReleaseReason")
        private String releaseReason;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

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
            this.index = builder.index;
            this.jobId = builder.jobId;
            this.originator = builder.originator;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.skillGroupId = builder.skillGroupId;
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
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
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
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
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
            private Integer index; 
            private String jobId; 
            private String originator; 
            private String releaseInitiator; 
            private String releaseReason; 
            private String skillGroupId; 
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
                this.index = model.index;
                this.jobId = model.jobId;
                this.originator = model.originator;
                this.releaseInitiator = model.releaseInitiator;
                this.releaseReason = model.releaseReason;
                this.skillGroupId = model.skillGroupId;
                this.timestamp = model.timestamp;
                this.userExtension = model.userExtension;
                this.userId = model.userId;
            } 

            /**
             * <p>The call type of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERCEPT</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>话务通道标志。</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder channelFlags(String channelFlags) {
                this.channelFlags = channelFlags;
                return this;
            }

            /**
             * <p>话务通道 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_CallType_enumValueTitles_COACH]Coaching</p>
             * 
             * <strong>example:</strong>
             * <p>ANSWERED</p>
             */
            public Builder channelState(String channelState) {
                this.channelState = channelState;
                return this;
            }

            /**
             * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_CallType_enumValueTitles_BARGE]Barge-in</p>
             * 
             * <strong>example:</strong>
             * <p>1390501****</p>
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>An auto-incremented ID assigned by the system. Customers do not need to concern themselves with this value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>通话 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>job-6538214103685****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>话务通道的主叫方。</p>
             * 
             * <strong>example:</strong>
             * <p>0830019****</p>
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_CallType_type]string</p>
             * 
             * <strong>example:</strong>
             * <p>1390501****</p>
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * <p>话务通道的挂断原因，表示当前话务通道为什么会被挂断，取值来自 SIP 协议中定义的响应码，请客户参考 SIP 协议分析挂断原因。</p>
             * 
             * <strong>example:</strong>
             * <p>404 - No destination</p>
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * <p>话务通道关联的技能组 ID，呼入场景下，关联的技能组 ID 由 IVR 中转人工模块配置的技能组决定，呼出场景下，关联的技能组 ID 为座席签入的第一个技能组的 ID。</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>话务通道最近一次状态变化的时间戳，格式是 Unix 时间戳，单位毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1609138903315</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>话务通道关联的坐席的分机号。</p>
             * 
             * <strong>example:</strong>
             * <p>8032****</p>
             */
            public Builder userExtension(String userExtension) {
                this.userExtension = userExtension;
                return this;
            }

            /**
             * <p>话务通道关联的坐席 ID，如果是客户的话务通道，该字段为空。</p>
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
     * {@link InterceptCallResponseBody} extends {@link TeaModel}
     *
     * <p>InterceptCallResponseBody</p>
     */
    public static class CallContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("ChannelContexts")
        private java.util.List<ChannelContexts> channelContexts;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        private CallContext(Builder builder) {
            this.callType = builder.callType;
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
            private java.util.List<ChannelContexts> channelContexts; 
            private String instanceId; 
            private String jobId; 

            private Builder() {
            } 

            private Builder(CallContext model) {
                this.callType = model.callType;
                this.channelContexts = model.channelContexts;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
            } 

            /**
             * <p>The call type of the channel.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERCEPT</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>The list of channels.</p>
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
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-6538214103685****</p>
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
     * {@link InterceptCallResponseBody} extends {@link TeaModel}
     *
     * <p>InterceptCallResponseBody</p>
     */
    public static class UserContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

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
             * <p>Break status code, which can be either System-defined or Custom-defined. System-defined break codes include: Warm-up (temporary break state after an agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent call rejection). There are no restrictions on Custom-defined status codes, and customers can define them according to their business needs.</p>
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
             * <p>8032****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The time when the last heartbeat was received from the agent, formatted as a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1609136956378</p>
             */
            public Builder heartbeat(Long heartbeat) {
                this.heartbeat = heartbeat;
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
             * <p>job-6538214103685****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The agent\&quot;s personal phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1324730****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
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
             * <p>The time when the agent was most recently reserved. Being reserved means an incoming call will be assigned to the agent shortly. The format is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1609136956378</p>
             */
            public Builder reserved(Long reserved) {
                this.reserved = reserved;
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
             * <p>TALKING</p>
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
     * {@link InterceptCallResponseBody} extends {@link TeaModel}
     *
     * <p>InterceptCallResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallContext")
        private CallContext callContext;

        @com.aliyun.core.annotation.NameInMap("UserContext")
        private UserContext userContext;

        private Data(Builder builder) {
            this.callContext = builder.callContext;
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
         * @return userContext
         */
        public UserContext getUserContext() {
            return this.userContext;
        }

        public static final class Builder {
            private CallContext callContext; 
            private UserContext userContext; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callContext = model.callContext;
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
