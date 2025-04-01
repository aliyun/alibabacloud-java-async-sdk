// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link GetInspectProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetInspectProgressResponseBody</p>
 */
public class GetInspectProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInspectProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInspectProgressResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInspectProgressResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>566331F9-****-550F-B745-A730331F97A9</p>
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

        public GetInspectProgressResponseBody build() {
            return new GetInspectProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInspectProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetInspectProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllSubtaskCount")
        private Integer allSubtaskCount;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private Boolean finish;

        @com.aliyun.core.annotation.NameInMap("FinishRate")
        private Double finishRate;

        @com.aliyun.core.annotation.NameInMap("FinishSubtaskCount")
        private Integer finishSubtaskCount;

        @com.aliyun.core.annotation.NameInMap("LastInspectDate")
        private Long lastInspectDate;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        private Data(Builder builder) {
            this.allSubtaskCount = builder.allSubtaskCount;
            this.finish = builder.finish;
            this.finishRate = builder.finishRate;
            this.finishSubtaskCount = builder.finishSubtaskCount;
            this.lastInspectDate = builder.lastInspectDate;
            this.taskId = builder.taskId;
            this.usedTime = builder.usedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allSubtaskCount
         */
        public Integer getAllSubtaskCount() {
            return this.allSubtaskCount;
        }

        /**
         * @return finish
         */
        public Boolean getFinish() {
            return this.finish;
        }

        /**
         * @return finishRate
         */
        public Double getFinishRate() {
            return this.finishRate;
        }

        /**
         * @return finishSubtaskCount
         */
        public Integer getFinishSubtaskCount() {
            return this.finishSubtaskCount;
        }

        /**
         * @return lastInspectDate
         */
        public Long getLastInspectDate() {
            return this.lastInspectDate;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        public static final class Builder {
            private Integer allSubtaskCount; 
            private Boolean finish; 
            private Double finishRate; 
            private Integer finishSubtaskCount; 
            private Long lastInspectDate; 
            private Long taskId; 
            private Long usedTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allSubtaskCount = model.allSubtaskCount;
                this.finish = model.finish;
                this.finishRate = model.finishRate;
                this.finishSubtaskCount = model.finishSubtaskCount;
                this.lastInspectDate = model.lastInspectDate;
                this.taskId = model.taskId;
                this.usedTime = model.usedTime;
            } 

            /**
             * AllSubtaskCount.
             */
            public Builder allSubtaskCount(Integer allSubtaskCount) {
                this.allSubtaskCount = allSubtaskCount;
                return this;
            }

            /**
             * Finish.
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * FinishRate.
             */
            public Builder finishRate(Double finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * FinishSubtaskCount.
             */
            public Builder finishSubtaskCount(Integer finishSubtaskCount) {
                this.finishSubtaskCount = finishSubtaskCount;
                return this;
            }

            /**
             * LastInspectDate.
             */
            public Builder lastInspectDate(Long lastInspectDate) {
                this.lastInspectDate = lastInspectDate;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
