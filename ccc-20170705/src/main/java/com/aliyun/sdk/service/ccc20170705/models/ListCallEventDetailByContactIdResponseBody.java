// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallEventDetailByContactIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallEventDetailByContactIdResponseBody</p>
 */
public class ListCallEventDetailByContactIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCallEventDetailByContactIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallEventDetailByContactIdResponseBody create() {
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * RequestId.
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

        public ListCallEventDetailByContactIdResponseBody build() {
            return new ListCallEventDetailByContactIdResponseBody(this);
        } 

    } 

    public static class DetailData extends TeaModel {
        @NameInMap("EventType")
        private String eventType;

        @NameInMap("HangUper")
        private String hangUper;

        @NameInMap("Helper")
        private String helper;

        @NameInMap("SatisfactionalResearch")
        private String satisfactionalResearch;

        @NameInMap("SkillGroup")
        private String skillGroup;

        private DetailData(Builder builder) {
            this.eventType = builder.eventType;
            this.hangUper = builder.hangUper;
            this.helper = builder.helper;
            this.satisfactionalResearch = builder.satisfactionalResearch;
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailData create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return hangUper
         */
        public String getHangUper() {
            return this.hangUper;
        }

        /**
         * @return helper
         */
        public String getHelper() {
            return this.helper;
        }

        /**
         * @return satisfactionalResearch
         */
        public String getSatisfactionalResearch() {
            return this.satisfactionalResearch;
        }

        /**
         * @return skillGroup
         */
        public String getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private String eventType; 
            private String hangUper; 
            private String helper; 
            private String satisfactionalResearch; 
            private String skillGroup; 

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * HangUper.
             */
            public Builder hangUper(String hangUper) {
                this.hangUper = hangUper;
                return this;
            }

            /**
             * Helper.
             */
            public Builder helper(String helper) {
                this.helper = helper;
                return this;
            }

            /**
             * SatisfactionalResearch.
             */
            public Builder satisfactionalResearch(String satisfactionalResearch) {
                this.satisfactionalResearch = satisfactionalResearch;
                return this;
            }

            /**
             * SkillGroup.
             */
            public Builder skillGroup(String skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public DetailData build() {
                return new DetailData(this);
            } 

        } 

    }
    public static class CallEventDetail extends TeaModel {
        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("CallMode")
        private String callMode;

        @NameInMap("DetailData")
        private DetailData detailData;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("Event")
        private String event;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private CallEventDetail(Builder builder) {
            this.agentName = builder.agentName;
            this.callMode = builder.callMode;
            this.detailData = builder.detailData;
            this.duration = builder.duration;
            this.event = builder.event;
            this.status = builder.status;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallEventDetail create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return callMode
         */
        public String getCallMode() {
            return this.callMode;
        }

        /**
         * @return detailData
         */
        public DetailData getDetailData() {
            return this.detailData;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String agentName; 
            private String callMode; 
            private DetailData detailData; 
            private Integer duration; 
            private String event; 
            private String status; 
            private String timeStamp; 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * CallMode.
             */
            public Builder callMode(String callMode) {
                this.callMode = callMode;
                return this;
            }

            /**
             * DetailData.
             */
            public Builder detailData(DetailData detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
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
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public CallEventDetail build() {
                return new CallEventDetail(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("CallEventDetail")
        private java.util.List < CallEventDetail> callEventDetail;

        private Events(Builder builder) {
            this.callEventDetail = builder.callEventDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return callEventDetail
         */
        public java.util.List < CallEventDetail> getCallEventDetail() {
            return this.callEventDetail;
        }

        public static final class Builder {
            private java.util.List < CallEventDetail> callEventDetail; 

            /**
             * CallEventDetail.
             */
            public Builder callEventDetail(java.util.List < CallEventDetail> callEventDetail) {
                this.callEventDetail = callEventDetail;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CallType")
        private String callType;

        @NameInMap("Callee")
        private String callee;

        @NameInMap("Caller")
        private String caller;

        @NameInMap("Events")
        private Events events;

        @NameInMap("PrivacyNumber")
        private String privacyNumber;

        @NameInMap("ReleaseAgent")
        private String releaseAgent;

        @NameInMap("ReleaseReason")
        private String releaseReason;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.callType = builder.callType;
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.events = builder.events;
            this.privacyNumber = builder.privacyNumber;
            this.releaseAgent = builder.releaseAgent;
            this.releaseReason = builder.releaseReason;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return events
         */
        public Events getEvents() {
            return this.events;
        }

        /**
         * @return privacyNumber
         */
        public String getPrivacyNumber() {
            return this.privacyNumber;
        }

        /**
         * @return releaseAgent
         */
        public String getReleaseAgent() {
            return this.releaseAgent;
        }

        /**
         * @return releaseReason
         */
        public String getReleaseReason() {
            return this.releaseReason;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String callType; 
            private String callee; 
            private String caller; 
            private Events events; 
            private String privacyNumber; 
            private String releaseAgent; 
            private String releaseReason; 
            private String startTime; 

            /**
             * CallType.
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(Events events) {
                this.events = events;
                return this;
            }

            /**
             * PrivacyNumber.
             */
            public Builder privacyNumber(String privacyNumber) {
                this.privacyNumber = privacyNumber;
                return this;
            }

            /**
             * ReleaseAgent.
             */
            public Builder releaseAgent(String releaseAgent) {
                this.releaseAgent = releaseAgent;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
