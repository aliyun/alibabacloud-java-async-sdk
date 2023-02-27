// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteAttendedTransferResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteAttendedTransferResponseBody</p>
 */
public class CompleteAttendedTransferResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Params")
    private java.util.List < String > params;

    @NameInMap("RequestId")
    private String requestId;

    private CompleteAttendedTransferResponseBody(Builder builder) {
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

    public static CompleteAttendedTransferResponseBody create() {
        return builder().build();
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
    public java.util.List < String > getParams() {
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
        private java.util.List < String > params; 
        private String requestId; 

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
        public Builder params(java.util.List < String > params) {
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

        public CompleteAttendedTransferResponseBody build() {
            return new CompleteAttendedTransferResponseBody(this);
        } 

    } 

    public static class ChannelContexts extends TeaModel {
        @NameInMap("CallType")
        private String callType;

        @NameInMap("ChannelFlags")
        private String channelFlags;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ChannelState")
        private String channelState;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Originator")
        private String originator;

        @NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @NameInMap("ReleaseReason")
        private String releaseReason;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("UserExtension")
        private String userExtension;

        @NameInMap("UserId")
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

            /**
             * CallType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * ChannelFlags.
             */
            public Builder channelFlags(String channelFlags) {
                this.channelFlags = channelFlags;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelState.
             */
            public Builder channelState(String channelState) {
                this.channelState = channelState;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * Originator.
             */
            public Builder originator(String originator) {
                this.originator = originator;
                return this;
            }

            /**
             * ReleaseInitiator.
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * ReleaseReason.
             */
            public Builder releaseReason(String releaseReason) {
                this.releaseReason = releaseReason;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * UserExtension.
             */
            public Builder userExtension(String userExtension) {
                this.userExtension = userExtension;
                return this;
            }

            /**
             * UserId.
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
    public static class CallContext extends TeaModel {
        @NameInMap("CallType")
        private String callType;

        @NameInMap("ChannelContexts")
        private java.util.List < ChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobId")
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
        public java.util.List < ChannelContexts> getChannelContexts() {
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
            private java.util.List < ChannelContexts> channelContexts; 
            private String instanceId; 
            private String jobId; 

            /**
             * CallType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * ChannelContexts.
             */
            public Builder channelContexts(java.util.List < ChannelContexts> channelContexts) {
                this.channelContexts = channelContexts;
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

            public CallContext build() {
                return new CallContext(this);
            } 

        } 

    }
    public static class UserContext extends TeaModel {
        @NameInMap("BreakCode")
        private String breakCode;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("Heartbeat")
        private Long heartbeat;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @NameInMap("Reserved")
        private Long reserved;

        @NameInMap("SignedSkillGroupIdList")
        private java.util.List < String > signedSkillGroupIdList;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserState")
        private String userState;

        @NameInMap("WorkMode")
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
        public java.util.List < String > getSignedSkillGroupIdList() {
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
            private java.util.List < String > signedSkillGroupIdList; 
            private String userId; 
            private String userState; 
            private String workMode; 

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
            public Builder signedSkillGroupIdList(java.util.List < String > signedSkillGroupIdList) {
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
    public static class Data extends TeaModel {
        @NameInMap("CallContext")
        private CallContext callContext;

        @NameInMap("ContextId")
        private Long contextId;

        @NameInMap("UserContext")
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

            /**
             * CallContext.
             */
            public Builder callContext(CallContext callContext) {
                this.callContext = callContext;
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
