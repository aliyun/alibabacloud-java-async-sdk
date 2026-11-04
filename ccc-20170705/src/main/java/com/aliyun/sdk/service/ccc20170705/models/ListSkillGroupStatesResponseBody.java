// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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

        private Builder() {
        } 

        private Builder(ListSkillGroupStatesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

    /**
     * 
     * {@link ListSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupStatesResponseBody</p>
     */
    public static class RealTimeSkillGroupState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakingAgents")
        private Long breakingAgents;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoggedInAgents")
        private Long loggedInAgents;

        @com.aliyun.core.annotation.NameInMap("LongestCall")
        private Long longestCall;

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

        @com.aliyun.core.annotation.NameInMap("WorkingAgents")
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

            private Builder() {
            } 

            private Builder(RealTimeSkillGroupState model) {
                this.breakingAgents = model.breakingAgents;
                this.instanceId = model.instanceId;
                this.loggedInAgents = model.loggedInAgents;
                this.longestCall = model.longestCall;
                this.readyAgents = model.readyAgents;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
                this.talkingAgents = model.talkingAgents;
                this.waitingCalls = model.waitingCalls;
                this.workingAgents = model.workingAgents;
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
    /**
     * 
     * {@link ListSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupStatesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealTimeSkillGroupState")
        private java.util.List<RealTimeSkillGroupState> realTimeSkillGroupState;

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
        public java.util.List<RealTimeSkillGroupState> getRealTimeSkillGroupState() {
            return this.realTimeSkillGroupState;
        }

        public static final class Builder {
            private java.util.List<RealTimeSkillGroupState> realTimeSkillGroupState; 

            private Builder() {
            } 

            private Builder(List model) {
                this.realTimeSkillGroupState = model.realTimeSkillGroupState;
            } 

            /**
             * RealTimeSkillGroupState.
             */
            public Builder realTimeSkillGroupState(java.util.List<RealTimeSkillGroupState> realTimeSkillGroupState) {
                this.realTimeSkillGroupState = realTimeSkillGroupState;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillGroupStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillGroupStatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

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

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

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
