// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupStatesResponseBody</p>
 */
public class ListSkillGroupStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSkillGroupStatesResponseBody(Builder builder) {
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

    public static ListSkillGroupStatesResponseBody create() {
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

        public ListSkillGroupStatesResponseBody build() {
            return new ListSkillGroupStatesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageWaitingTime")
        private Long averageWaitingTime;

        @com.aliyun.core.annotation.NameInMap("BreakingAgents")
        private Long breakingAgents;

        @com.aliyun.core.annotation.NameInMap("InboundTalkingAgents")
        private Long inboundTalkingAgents;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @com.aliyun.core.annotation.NameInMap("LongestCall")
        private Long longestCall;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioReadyAgents")
        private Long outboundScenarioReadyAgents;

        @com.aliyun.core.annotation.NameInMap("OutboundTalkingAgents")
        private Long outboundTalkingAgents;

        @com.aliyun.core.annotation.NameInMap("ReadyAgents")
        private Long readyAgents;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("TalkingAgents")
        private Long talkingAgents;

        @com.aliyun.core.annotation.NameInMap("WaitingCalls")
        private Long waitingCalls;

        @com.aliyun.core.annotation.NameInMap("WaitingCallsLevel10")
        private Long waitingCallsLevel10;

        @com.aliyun.core.annotation.NameInMap("WaitingCallsLevel20")
        private Long waitingCallsLevel20;

        @com.aliyun.core.annotation.NameInMap("WaitingCallsLevel30")
        private Long waitingCallsLevel30;

        @com.aliyun.core.annotation.NameInMap("WorkingAgents")
        private Long workingAgents;

        private List(Builder builder) {
            this.averageWaitingTime = builder.averageWaitingTime;
            this.breakingAgents = builder.breakingAgents;
            this.inboundTalkingAgents = builder.inboundTalkingAgents;
            this.instanceId = builder.instanceId;
            this.loggedInAgents = builder.loggedInAgents;
            this.longestCall = builder.longestCall;
            this.outboundScenarioReadyAgents = builder.outboundScenarioReadyAgents;
            this.outboundTalkingAgents = builder.outboundTalkingAgents;
            this.readyAgents = builder.readyAgents;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.talkingAgents = builder.talkingAgents;
            this.waitingCalls = builder.waitingCalls;
            this.waitingCallsLevel10 = builder.waitingCallsLevel10;
            this.waitingCallsLevel20 = builder.waitingCallsLevel20;
            this.waitingCallsLevel30 = builder.waitingCallsLevel30;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return averageWaitingTime
         */
        public Long getAverageWaitingTime() {
            return this.averageWaitingTime;
        }

        /**
         * @return breakingAgents
         */
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        /**
         * @return inboundTalkingAgents
         */
        public Long getInboundTalkingAgents() {
            return this.inboundTalkingAgents;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loggedInAgents
         */
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        /**
         * @return longestCall
         */
        public Long getLongestCall() {
            return this.longestCall;
        }

        /**
         * @return outboundScenarioReadyAgents
         */
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        /**
         * @return outboundTalkingAgents
         */
        public Long getOutboundTalkingAgents() {
            return this.outboundTalkingAgents;
        }

        /**
         * @return readyAgents
         */
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        /**
         * @return talkingAgents
         */
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        /**
         * @return waitingCalls
         */
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        /**
         * @return waitingCallsLevel10
         */
        public Long getWaitingCallsLevel10() {
            return this.waitingCallsLevel10;
        }

        /**
         * @return waitingCallsLevel20
         */
        public Long getWaitingCallsLevel20() {
            return this.waitingCallsLevel20;
        }

        /**
         * @return waitingCallsLevel30
         */
        public Long getWaitingCallsLevel30() {
            return this.waitingCallsLevel30;
        }

        /**
         * @return workingAgents
         */
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public static final class Builder {
            private Long averageWaitingTime; 
            private Long breakingAgents; 
            private Long inboundTalkingAgents; 
            private String instanceId; 
            private Long loggedInAgents; 
            private Long longestCall; 
            private Long outboundScenarioReadyAgents; 
            private Long outboundTalkingAgents; 
            private Long readyAgents; 
            private String skillGroupId; 
            private String skillGroupName; 
            private Long talkingAgents; 
            private Long waitingCalls; 
            private Long waitingCallsLevel10; 
            private Long waitingCallsLevel20; 
            private Long waitingCallsLevel30; 
            private Long workingAgents; 

            /**
             * AverageWaitingTime.
             */
            public Builder averageWaitingTime(Long averageWaitingTime) {
                this.averageWaitingTime = averageWaitingTime;
                return this;
            }

            /**
             * BreakingAgents.
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
                return this;
            }

            /**
             * InboundTalkingAgents.
             */
            public Builder inboundTalkingAgents(Long inboundTalkingAgents) {
                this.inboundTalkingAgents = inboundTalkingAgents;
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
             * LoggedInAgents.
             */
            public Builder loggedInAgents(Long loggedInAgents) {
                this.loggedInAgents = loggedInAgents;
                return this;
            }

            /**
             * LongestCall.
             */
            public Builder longestCall(Long longestCall) {
                this.longestCall = longestCall;
                return this;
            }

            /**
             * OutboundScenarioReadyAgents.
             */
            public Builder outboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
                this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
                return this;
            }

            /**
             * OutboundTalkingAgents.
             */
            public Builder outboundTalkingAgents(Long outboundTalkingAgents) {
                this.outboundTalkingAgents = outboundTalkingAgents;
                return this;
            }

            /**
             * ReadyAgents.
             */
            public Builder readyAgents(Long readyAgents) {
                this.readyAgents = readyAgents;
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
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            /**
             * TalkingAgents.
             */
            public Builder talkingAgents(Long talkingAgents) {
                this.talkingAgents = talkingAgents;
                return this;
            }

            /**
             * WaitingCalls.
             */
            public Builder waitingCalls(Long waitingCalls) {
                this.waitingCalls = waitingCalls;
                return this;
            }

            /**
             * WaitingCallsLevel10.
             */
            public Builder waitingCallsLevel10(Long waitingCallsLevel10) {
                this.waitingCallsLevel10 = waitingCallsLevel10;
                return this;
            }

            /**
             * WaitingCallsLevel20.
             */
            public Builder waitingCallsLevel20(Long waitingCallsLevel20) {
                this.waitingCallsLevel20 = waitingCallsLevel20;
                return this;
            }

            /**
             * WaitingCallsLevel30.
             */
            public Builder waitingCallsLevel30(Long waitingCallsLevel30) {
                this.waitingCallsLevel30 = waitingCallsLevel30;
                return this;
            }

            /**
             * WorkingAgents.
             */
            public Builder workingAgents(Long workingAgents) {
                this.workingAgents = workingAgents;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
