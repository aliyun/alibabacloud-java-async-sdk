// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeGroupExecutingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupExecutingInfoResponseBody</p>
 */
public class DescribeGroupExecutingInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ExecutingInfo")
    private ExecutingInfo executingInfo;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(DescribeGroupExecutingInfoResponseBody model) {
            this.code = model.code;
            this.executingInfo = model.executingInfo;
            this.groupId = model.groupId;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceId = model.instanceId;
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

    /**
     * 
     * {@link DescribeGroupExecutingInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupExecutingInfoResponseBody</p>
     */
    public static class JobsProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelledNum")
        private Integer cancelledNum;

        @com.aliyun.core.annotation.NameInMap("ExecutingNum")
        private Integer executingNum;

        @com.aliyun.core.annotation.NameInMap("FailedNum")
        private Integer failedNum;

        @com.aliyun.core.annotation.NameInMap("PausedNum")
        private Integer pausedNum;

        @com.aliyun.core.annotation.NameInMap("SchedulingNum")
        private Integer schedulingNum;

        @com.aliyun.core.annotation.NameInMap("TotalCompletedNum")
        private Integer totalCompletedNum;

        @com.aliyun.core.annotation.NameInMap("TotalJobs")
        private Integer totalJobs;

        @com.aliyun.core.annotation.NameInMap("TotalNotAnsweredNum")
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

            private Builder() {
            } 

            private Builder(JobsProgress model) {
                this.cancelledNum = model.cancelledNum;
                this.executingNum = model.executingNum;
                this.failedNum = model.failedNum;
                this.pausedNum = model.pausedNum;
                this.schedulingNum = model.schedulingNum;
                this.totalCompletedNum = model.totalCompletedNum;
                this.totalJobs = model.totalJobs;
                this.totalNotAnsweredNum = model.totalNotAnsweredNum;
            } 

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
    /**
     * 
     * {@link DescribeGroupExecutingInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupExecutingInfoResponseBody</p>
     */
    public static class ExecutingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallFailedNum")
        private Integer callFailedNum;

        @com.aliyun.core.annotation.NameInMap("CallNum")
        private Integer callNum;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FinishedNum")
        private Integer finishedNum;

        @com.aliyun.core.annotation.NameInMap("HangUpByClientNum")
        private Integer hangUpByClientNum;

        @com.aliyun.core.annotation.NameInMap("JobsProgress")
        private JobsProgress jobsProgress;

        @com.aliyun.core.annotation.NameInMap("NoInteractionNum")
        private Integer noInteractionNum;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TransferByIntentNum")
        private Integer transferByIntentNum;

        @com.aliyun.core.annotation.NameInMap("TransferByNoAnswer")
        private Integer transferByNoAnswer;

        private ExecutingInfo(Builder builder) {
            this.callFailedNum = builder.callFailedNum;
            this.callNum = builder.callNum;
            this.creatorName = builder.creatorName;
            this.endTime = builder.endTime;
            this.finishedNum = builder.finishedNum;
            this.hangUpByClientNum = builder.hangUpByClientNum;
            this.jobsProgress = builder.jobsProgress;
            this.noInteractionNum = builder.noInteractionNum;
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
         * @return noInteractionNum
         */
        public Integer getNoInteractionNum() {
            return this.noInteractionNum;
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
            private Integer noInteractionNum; 
            private Long startTime; 
            private Integer transferByIntentNum; 
            private Integer transferByNoAnswer; 

            private Builder() {
            } 

            private Builder(ExecutingInfo model) {
                this.callFailedNum = model.callFailedNum;
                this.callNum = model.callNum;
                this.creatorName = model.creatorName;
                this.endTime = model.endTime;
                this.finishedNum = model.finishedNum;
                this.hangUpByClientNum = model.hangUpByClientNum;
                this.jobsProgress = model.jobsProgress;
                this.noInteractionNum = model.noInteractionNum;
                this.startTime = model.startTime;
                this.transferByIntentNum = model.transferByIntentNum;
                this.transferByNoAnswer = model.transferByNoAnswer;
            } 

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
             * NoInteractionNum.
             */
            public Builder noInteractionNum(Integer noInteractionNum) {
                this.noInteractionNum = noInteractionNum;
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
