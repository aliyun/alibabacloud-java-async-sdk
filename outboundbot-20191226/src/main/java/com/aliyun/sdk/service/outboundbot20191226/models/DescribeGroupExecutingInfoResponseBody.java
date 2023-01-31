// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupExecutingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupExecutingInfoResponseBody</p>
 */
public class DescribeGroupExecutingInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ExecutingInfo")
    private ExecutingInfo executingInfo;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGroupExecutingInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.executingInfo = builder.executingInfo;
        this.groupId = builder.groupId;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupExecutingInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return executingInfo
     */
    public ExecutingInfo getExecutingInfo() {
        return this.executingInfo;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private ExecutingInfo executingInfo; 
        private String groupId; 
        private Integer httpStatusCode; 
        private String instanceId; 
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
         * ExecutingInfo.
         */
        public Builder executingInfo(ExecutingInfo executingInfo) {
            this.executingInfo = executingInfo;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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

        public DescribeGroupExecutingInfoResponseBody build() {
            return new DescribeGroupExecutingInfoResponseBody(this);
        } 

    } 

    public static class JobsProgress extends TeaModel {
        @NameInMap("CancelledNum")
        private Integer cancelledNum;

        @NameInMap("ExecutingNum")
        private Integer executingNum;

        @NameInMap("FailedNum")
        private Integer failedNum;

        @NameInMap("PausedNum")
        private Integer pausedNum;

        @NameInMap("SchedulingNum")
        private Integer schedulingNum;

        @NameInMap("TotalCompletedNum")
        private Integer totalCompletedNum;

        @NameInMap("TotalJobs")
        private Integer totalJobs;

        @NameInMap("TotalNotAnsweredNum")
        private Integer totalNotAnsweredNum;

        private JobsProgress(Builder builder) {
            this.cancelledNum = builder.cancelledNum;
            this.executingNum = builder.executingNum;
            this.failedNum = builder.failedNum;
            this.pausedNum = builder.pausedNum;
            this.schedulingNum = builder.schedulingNum;
            this.totalCompletedNum = builder.totalCompletedNum;
            this.totalJobs = builder.totalJobs;
            this.totalNotAnsweredNum = builder.totalNotAnsweredNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobsProgress create() {
            return builder().build();
        }

        /**
         * @return cancelledNum
         */
        public Integer getCancelledNum() {
            return this.cancelledNum;
        }

        /**
         * @return executingNum
         */
        public Integer getExecutingNum() {
            return this.executingNum;
        }

        /**
         * @return failedNum
         */
        public Integer getFailedNum() {
            return this.failedNum;
        }

        /**
         * @return pausedNum
         */
        public Integer getPausedNum() {
            return this.pausedNum;
        }

        /**
         * @return schedulingNum
         */
        public Integer getSchedulingNum() {
            return this.schedulingNum;
        }

        /**
         * @return totalCompletedNum
         */
        public Integer getTotalCompletedNum() {
            return this.totalCompletedNum;
        }

        /**
         * @return totalJobs
         */
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        /**
         * @return totalNotAnsweredNum
         */
        public Integer getTotalNotAnsweredNum() {
            return this.totalNotAnsweredNum;
        }

        public static final class Builder {
            private Integer cancelledNum; 
            private Integer executingNum; 
            private Integer failedNum; 
            private Integer pausedNum; 
            private Integer schedulingNum; 
            private Integer totalCompletedNum; 
            private Integer totalJobs; 
            private Integer totalNotAnsweredNum; 

            /**
             * CancelledNum.
             */
            public Builder cancelledNum(Integer cancelledNum) {
                this.cancelledNum = cancelledNum;
                return this;
            }

            /**
             * ExecutingNum.
             */
            public Builder executingNum(Integer executingNum) {
                this.executingNum = executingNum;
                return this;
            }

            /**
             * FailedNum.
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * PausedNum.
             */
            public Builder pausedNum(Integer pausedNum) {
                this.pausedNum = pausedNum;
                return this;
            }

            /**
             * SchedulingNum.
             */
            public Builder schedulingNum(Integer schedulingNum) {
                this.schedulingNum = schedulingNum;
                return this;
            }

            /**
             * TotalCompletedNum.
             */
            public Builder totalCompletedNum(Integer totalCompletedNum) {
                this.totalCompletedNum = totalCompletedNum;
                return this;
            }

            /**
             * TotalJobs.
             */
            public Builder totalJobs(Integer totalJobs) {
                this.totalJobs = totalJobs;
                return this;
            }

            /**
             * TotalNotAnsweredNum.
             */
            public Builder totalNotAnsweredNum(Integer totalNotAnsweredNum) {
                this.totalNotAnsweredNum = totalNotAnsweredNum;
                return this;
            }

            public JobsProgress build() {
                return new JobsProgress(this);
            } 

        } 

    }
    public static class ExecutingInfo extends TeaModel {
        @NameInMap("CallFailedNum")
        private Integer callFailedNum;

        @NameInMap("CallNum")
        private Integer callNum;

        @NameInMap("CreatorName")
        private String creatorName;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FinishedNum")
        private Integer finishedNum;

        @NameInMap("HangUpByClientNum")
        private Integer hangUpByClientNum;

        @NameInMap("JobsProgress")
        private JobsProgress jobsProgress;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TransferByIntentNum")
        private Integer transferByIntentNum;

        @NameInMap("TransferByNoAnswer")
        private Integer transferByNoAnswer;

        private ExecutingInfo(Builder builder) {
            this.callFailedNum = builder.callFailedNum;
            this.callNum = builder.callNum;
            this.creatorName = builder.creatorName;
            this.endTime = builder.endTime;
            this.finishedNum = builder.finishedNum;
            this.hangUpByClientNum = builder.hangUpByClientNum;
            this.jobsProgress = builder.jobsProgress;
            this.startTime = builder.startTime;
            this.transferByIntentNum = builder.transferByIntentNum;
            this.transferByNoAnswer = builder.transferByNoAnswer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutingInfo create() {
            return builder().build();
        }

        /**
         * @return callFailedNum
         */
        public Integer getCallFailedNum() {
            return this.callFailedNum;
        }

        /**
         * @return callNum
         */
        public Integer getCallNum() {
            return this.callNum;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedNum
         */
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        /**
         * @return hangUpByClientNum
         */
        public Integer getHangUpByClientNum() {
            return this.hangUpByClientNum;
        }

        /**
         * @return jobsProgress
         */
        public JobsProgress getJobsProgress() {
            return this.jobsProgress;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return transferByIntentNum
         */
        public Integer getTransferByIntentNum() {
            return this.transferByIntentNum;
        }

        /**
         * @return transferByNoAnswer
         */
        public Integer getTransferByNoAnswer() {
            return this.transferByNoAnswer;
        }

        public static final class Builder {
            private Integer callFailedNum; 
            private Integer callNum; 
            private String creatorName; 
            private Long endTime; 
            private Integer finishedNum; 
            private Integer hangUpByClientNum; 
            private JobsProgress jobsProgress; 
            private Long startTime; 
            private Integer transferByIntentNum; 
            private Integer transferByNoAnswer; 

            /**
             * CallFailedNum.
             */
            public Builder callFailedNum(Integer callFailedNum) {
                this.callFailedNum = callFailedNum;
                return this;
            }

            /**
             * CallNum.
             */
            public Builder callNum(Integer callNum) {
                this.callNum = callNum;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FinishedNum.
             */
            public Builder finishedNum(Integer finishedNum) {
                this.finishedNum = finishedNum;
                return this;
            }

            /**
             * HangUpByClientNum.
             */
            public Builder hangUpByClientNum(Integer hangUpByClientNum) {
                this.hangUpByClientNum = hangUpByClientNum;
                return this;
            }

            /**
             * JobsProgress.
             */
            public Builder jobsProgress(JobsProgress jobsProgress) {
                this.jobsProgress = jobsProgress;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TransferByIntentNum.
             */
            public Builder transferByIntentNum(Integer transferByIntentNum) {
                this.transferByIntentNum = transferByIntentNum;
                return this;
            }

            /**
             * TransferByNoAnswer.
             */
            public Builder transferByNoAnswer(Integer transferByNoAnswer) {
                this.transferByNoAnswer = transferByNoAnswer;
                return this;
            }

            public ExecutingInfo build() {
                return new ExecutingInfo(this);
            } 

        } 

    }
}
