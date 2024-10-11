// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PollUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>PollUserStatusResponseBody</p>
 */
public class PollUserStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List < String > params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PollUserStatusResponseBody(Builder builder) {
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

    public static PollUserStatusResponseBody create() {
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

        public PollUserStatusResponseBody build() {
            return new PollUserStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ChannelVariables")
        private String channelVariables;

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
            this.channelVariables = builder.channelVariables;
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
         * @return channelVariables
         */
        public String getChannelVariables() {
            return this.channelVariables;
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
            private String channelVariables; 
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
             * ChannelVariables.
             */
            public Builder channelVariables(String channelVariables) {
                this.channelVariables = channelVariables;
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
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
     */
    public static class CallContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("CallVariables")
        private String callVariables;

        @com.aliyun.core.annotation.NameInMap("ChannelContexts")
        private java.util.List < ChannelContexts> channelContexts;

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
            private String callVariables; 
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
             * CallVariables.
             */
            public Builder callVariables(String callVariables) {
                this.callVariables = callVariables;
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
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ReleaseReason")
        private String releaseReason;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private Members(Builder builder) {
            this.index = builder.index;
            this.releaseInitiator = builder.releaseInitiator;
            this.releaseReason = builder.releaseReason;
            this.skillGroupId = builder.skillGroupId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Integer index; 
            private String releaseInitiator; 
            private String releaseReason; 
            private String skillGroupId; 
            private String status; 
            private String userId; 
            private String userType; 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
     */
    public static class ChatContexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallVariables")
        private String callVariables;

        @com.aliyun.core.annotation.NameInMap("ChatType")
        private String chatType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Members")
        private java.util.List < Members> members;

        private ChatContexts(Builder builder) {
            this.callVariables = builder.callVariables;
            this.chatType = builder.chatType;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.members = builder.members;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatContexts create() {
            return builder().build();
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

        /**
         * @return members
         */
        public java.util.List < Members> getMembers() {
            return this.members;
        }

        public static final class Builder {
            private String callVariables; 
            private String chatType; 
            private String instanceId; 
            private String jobId; 
            private java.util.List < Members> members; 

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

            /**
             * Members.
             */
            public Builder members(java.util.List < Members> members) {
                this.members = members;
                return this;
            }

            public ChatContexts build() {
                return new ChatContexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
     */
    public static class ParallelJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private ParallelJobList(Builder builder) {
            this.jobId = builder.jobId;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParallelJobList create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String jobId; 
            private String status; 
            private Long timestamp; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
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
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ParallelJobList build() {
                return new ParallelJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ParallelJobList")
        private java.util.List < ParallelJobList> parallelJobList;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Long reserved;

        @com.aliyun.core.annotation.NameInMap("SignedSkillGroupIdList")
        private java.util.List < String > signedSkillGroupIdList;

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
            this.parallelJobList = builder.parallelJobList;
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
         * @return parallelJobList
         */
        public java.util.List < ParallelJobList> getParallelJobList() {
            return this.parallelJobList;
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
            private java.util.List < ParallelJobList> parallelJobList; 
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
             * ParallelJobList.
             */
            public Builder parallelJobList(java.util.List < ParallelJobList> parallelJobList) {
                this.parallelJobList = parallelJobList;
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
    /**
     * 
     * {@link PollUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>PollUserStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallContext")
        private CallContext callContext;

        @com.aliyun.core.annotation.NameInMap("ChatContexts")
        private java.util.List < ChatContexts> chatContexts;

        @com.aliyun.core.annotation.NameInMap("ContextId")
        private Long contextId;

        @com.aliyun.core.annotation.NameInMap("UserContext")
        private UserContext userContext;

        private Data(Builder builder) {
            this.callContext = builder.callContext;
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
         * @return callContext
         */
        public CallContext getCallContext() {
            return this.callContext;
        }

        /**
         * @return chatContexts
         */
        public java.util.List < ChatContexts> getChatContexts() {
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
            private CallContext callContext; 
            private java.util.List < ChatContexts> chatContexts; 
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
             * ChatContexts.
             */
            public Builder chatContexts(java.util.List < ChatContexts> chatContexts) {
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
