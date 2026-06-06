// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link GetTaskExecutionStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskExecutionStatisticsResponseBody</p>
 */
public class GetTaskExecutionStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetTaskExecutionStatisticsResponseBody(Builder builder) {
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

    public static GetTaskExecutionStatisticsResponseBody create() {
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

        private Builder(GetTaskExecutionStatisticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-GHIJ-KLMNOPQRST</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTaskExecutionStatisticsResponseBody build() {
            return new GetTaskExecutionStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskExecutionStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskExecutionStatisticsResponseBody</p>
     */
    public static class TpmPerMinute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        private TpmPerMinute(Builder builder) {
            this.count = builder.count;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TpmPerMinute create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long count; 
            private String time; 

            private Builder() {
            } 

            private Builder(TpmPerMinute model) {
                this.count = model.count;
                this.time = model.time;
            } 

            /**
             * count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public TpmPerMinute build() {
                return new TpmPerMinute(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskExecutionStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskExecutionStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("runningCount")
        private Long runningCount;

        @com.aliyun.core.annotation.NameInMap("tpmPerMinute")
        private java.util.List<TpmPerMinute> tpmPerMinute;

        @com.aliyun.core.annotation.NameInMap("waitingCount")
        private Long waitingCount;

        private Data(Builder builder) {
            this.completedCount = builder.completedCount;
            this.runningCount = builder.runningCount;
            this.tpmPerMinute = builder.tpmPerMinute;
            this.waitingCount = builder.waitingCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completedCount
         */
        public Long getCompletedCount() {
            return this.completedCount;
        }

        /**
         * @return runningCount
         */
        public Long getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return tpmPerMinute
         */
        public java.util.List<TpmPerMinute> getTpmPerMinute() {
            return this.tpmPerMinute;
        }

        /**
         * @return waitingCount
         */
        public Long getWaitingCount() {
            return this.waitingCount;
        }

        public static final class Builder {
            private Long completedCount; 
            private Long runningCount; 
            private java.util.List<TpmPerMinute> tpmPerMinute; 
            private Long waitingCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.completedCount = model.completedCount;
                this.runningCount = model.runningCount;
                this.tpmPerMinute = model.tpmPerMinute;
                this.waitingCount = model.waitingCount;
            } 

            /**
             * completedCount.
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * runningCount.
             */
            public Builder runningCount(Long runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * tpmPerMinute.
             */
            public Builder tpmPerMinute(java.util.List<TpmPerMinute> tpmPerMinute) {
                this.tpmPerMinute = tpmPerMinute;
                return this;
            }

            /**
             * waitingCount.
             */
            public Builder waitingCount(Long waitingCount) {
                this.waitingCount = waitingCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
