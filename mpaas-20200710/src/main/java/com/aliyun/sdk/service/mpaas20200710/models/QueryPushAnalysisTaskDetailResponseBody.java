// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link QueryPushAnalysisTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushAnalysisTaskDetailResponseBody</p>
 */
public class QueryPushAnalysisTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private QueryPushAnalysisTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushAnalysisTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(QueryPushAnalysisTaskDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryPushAnalysisTaskDetailResponseBody build() {
            return new QueryPushAnalysisTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPushAnalysisTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushAnalysisTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("PushArrivalNum")
        private Float pushArrivalNum;

        @com.aliyun.core.annotation.NameInMap("PushNum")
        private Float pushNum;

        @com.aliyun.core.annotation.NameInMap("PushSuccessNum")
        private Float pushSuccessNum;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.pushArrivalNum = builder.pushArrivalNum;
            this.pushNum = builder.pushNum;
            this.pushSuccessNum = builder.pushSuccessNum;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return pushArrivalNum
         */
        public Float getPushArrivalNum() {
            return this.pushArrivalNum;
        }

        /**
         * @return pushNum
         */
        public Float getPushNum() {
            return this.pushNum;
        }

        /**
         * @return pushSuccessNum
         */
        public Float getPushSuccessNum() {
            return this.pushSuccessNum;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String duration; 
            private Long endTime; 
            private Float pushArrivalNum; 
            private Float pushNum; 
            private Float pushSuccessNum; 
            private Long startTime; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.pushArrivalNum = model.pushArrivalNum;
                this.pushNum = model.pushNum;
                this.pushSuccessNum = model.pushSuccessNum;
                this.startTime = model.startTime;
                this.taskId = model.taskId;
            } 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
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
             * PushArrivalNum.
             */
            public Builder pushArrivalNum(Float pushArrivalNum) {
                this.pushArrivalNum = pushArrivalNum;
                return this;
            }

            /**
             * PushNum.
             */
            public Builder pushNum(Float pushNum) {
                this.pushNum = pushNum;
                return this;
            }

            /**
             * PushSuccessNum.
             */
            public Builder pushSuccessNum(Float pushSuccessNum) {
                this.pushSuccessNum = pushSuccessNum;
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
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPushAnalysisTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushAnalysisTaskDetailResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        private ResultContent(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        public static final class Builder {
            private Data data; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
