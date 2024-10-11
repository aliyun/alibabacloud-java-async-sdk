// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRealtimeSkillGroupStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRealtimeSkillGroupStatesResponseBody</p>
 */
public class ListRealtimeSkillGroupStatesResponseBody extends TeaModel {
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

    private ListRealtimeSkillGroupStatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeSkillGroupStatesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRealtimeSkillGroupStatesResponseBody build() {
            return new ListRealtimeSkillGroupStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRealtimeSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeSkillGroupStatesResponseBody</p>
     */
    public static class BreakCodeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private BreakCodeDetailList(Builder builder) {
            this.breakCode = builder.breakCode;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BreakCodeDetailList create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String breakCode; 
            private Long count; 

            /**
             * BreakCode.
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public BreakCodeDetailList build() {
                return new BreakCodeDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealtimeSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeSkillGroupStatesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCodeDetailList")
        private java.util.List < BreakCodeDetailList> breakCodeDetailList;

        @com.aliyun.core.annotation.NameInMap("BreakingAgents")
        private Long breakingAgents;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @com.aliyun.core.annotation.NameInMap("LongestWaitingTime")
        private Long longestWaitingTime;

        @com.aliyun.core.annotation.NameInMap("OutboundScenarioReadyAgents")
        private Long outboundScenarioReadyAgents;

        @com.aliyun.core.annotation.NameInMap("ReadyAgents")
        private Long readyAgents;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("TalkingAgents")
        private Long talkingAgents;

        @com.aliyun.core.annotation.NameInMap("TotalAgents")
        private Long totalAgents;

        @com.aliyun.core.annotation.NameInMap("WaitingCalls")
        private Long waitingCalls;

        @com.aliyun.core.annotation.NameInMap("WorkingAgents")
        private Long workingAgents;

        private List(Builder builder) {
            this.breakCodeDetailList = builder.breakCodeDetailList;
            this.breakingAgents = builder.breakingAgents;
            this.instanceId = builder.instanceId;
            this.loggedInAgents = builder.loggedInAgents;
            this.longestWaitingTime = builder.longestWaitingTime;
            this.outboundScenarioReadyAgents = builder.outboundScenarioReadyAgents;
            this.readyAgents = builder.readyAgents;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.talkingAgents = builder.talkingAgents;
            this.totalAgents = builder.totalAgents;
            this.waitingCalls = builder.waitingCalls;
            this.workingAgents = builder.workingAgents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return breakCodeDetailList
         */
        public java.util.List < BreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
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
         * @return longestWaitingTime
         */
        public Long getLongestWaitingTime() {
            return this.longestWaitingTime;
        }

        /**
         * @return outboundScenarioReadyAgents
         */
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
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
         * @return totalAgents
         */
        public Long getTotalAgents() {
            return this.totalAgents;
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
            private java.util.List < BreakCodeDetailList> breakCodeDetailList; 
            private Long breakingAgents; 
            private String instanceId; 
            private Long loggedInAgents; 
            private Long longestWaitingTime; 
            private Long outboundScenarioReadyAgents; 
            private Long readyAgents; 
            private String skillGroupId; 
            private String skillGroupName; 
            private Long talkingAgents; 
            private Long totalAgents; 
            private Long waitingCalls; 
            private Long workingAgents; 

            /**
             * BreakCodeDetailList.
             */
            public Builder breakCodeDetailList(java.util.List < BreakCodeDetailList> breakCodeDetailList) {
                this.breakCodeDetailList = breakCodeDetailList;
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
             * LongestWaitingTime.
             */
            public Builder longestWaitingTime(Long longestWaitingTime) {
                this.longestWaitingTime = longestWaitingTime;
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
             * TotalAgents.
             */
            public Builder totalAgents(Long totalAgents) {
                this.totalAgents = totalAgents;
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRealtimeSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRealtimeSkillGroupStatesResponseBody</p>
     */
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
