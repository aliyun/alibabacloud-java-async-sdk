// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupStatesResponseBody</p>
 */
public class ListSkillGroupStatesResponseBody extends TeaModel {
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

    public static class RealTimeSkillGroupState extends TeaModel {
        @NameInMap("BreakingAgents")
        private Long breakingAgents;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @NameInMap("LongestCall")
        private Long longestCall;

        @NameInMap("ReadyAgents")
        private Long readyAgents;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        @NameInMap("TalkingAgents")
        private Long talkingAgents;

        @NameInMap("WaitingCalls")
        private Long waitingCalls;

        @NameInMap("WorkingAgents")
        private Long workingAgents;

        private RealTimeSkillGroupState(Builder builder) {
            this.breakingAgents = builder.breakingAgents;
            this.instanceId = builder.instanceId;
            this.loggedInAgents = builder.loggedInAgents;
            this.longestCall = builder.longestCall;
            this.readyAgents = builder.readyAgents;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.talkingAgents = builder.talkingAgents;
            this.waitingCalls = builder.waitingCalls;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeSkillGroupState create() {
            return builder().build();
        }

        /**
         * @return breakingAgents
         */
        public Long getBreakingAgents() {
            return this.breakingAgents;
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
         * @return workingAgents
         */
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public static final class Builder {
            private Long breakingAgents; 
            private String instanceId; 
            private Long loggedInAgents; 
            private Long longestCall; 
            private Long readyAgents; 
            private String skillGroupId; 
            private String skillGroupName; 
            private Long talkingAgents; 
            private Long waitingCalls; 
            private Long workingAgents; 

            /**
             * BreakingAgents.
             */
            public Builder breakingAgents(Long breakingAgents) {
                this.breakingAgents = breakingAgents;
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
             * WorkingAgents.
             */
            public Builder workingAgents(Long workingAgents) {
                this.workingAgents = workingAgents;
                return this;
            }

            public RealTimeSkillGroupState build() {
                return new RealTimeSkillGroupState(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("RealTimeSkillGroupState")
        private java.util.List < RealTimeSkillGroupState> realTimeSkillGroupState;

        private List(Builder builder) {
            this.realTimeSkillGroupState = builder.realTimeSkillGroupState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return realTimeSkillGroupState
         */
        public java.util.List < RealTimeSkillGroupState> getRealTimeSkillGroupState() {
            return this.realTimeSkillGroupState;
        }

        public static final class Builder {
            private java.util.List < RealTimeSkillGroupState> realTimeSkillGroupState; 

            /**
             * RealTimeSkillGroupState.
             */
            public Builder realTimeSkillGroupState(java.util.List < RealTimeSkillGroupState> realTimeSkillGroupState) {
                this.realTimeSkillGroupState = realTimeSkillGroupState;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public List getList() {
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
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(List list) {
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
