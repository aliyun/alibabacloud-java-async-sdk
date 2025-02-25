// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetContentDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetContentDetectResultResponseBody</p>
 */
public class GetContentDetectResultResponseBody extends TeaModel {
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

    private GetContentDetectResultResponseBody(Builder builder) {
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

    public static GetContentDetectResultResponseBody create() {
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

        public GetContentDetectResultResponseBody build() {
            return new GetContentDetectResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetContentDetectResultResponseBody</p>
     */
    public static class DetectResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskInfo")
        private String riskInfo;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private DetectResultList(Builder builder) {
            this.riskInfo = builder.riskInfo;
            this.riskResult = builder.riskResult;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectResultList create() {
            return builder().build();
        }

        /**
         * @return riskInfo
         */
        public String getRiskInfo() {
            return this.riskInfo;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String riskInfo; 
            private Integer riskResult; 
            private Integer status; 

            /**
             * RiskInfo.
             */
            public Builder riskInfo(String riskInfo) {
                this.riskInfo = riskInfo;
                return this;
            }

            /**
             * RiskResult.
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DetectResultList build() {
                return new DetectResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetContentDetectResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectResultList")
        private java.util.List<DetectResultList> detectResultList;

        @com.aliyun.core.annotation.NameInMap("ProcessedCount")
        private Integer processedCount;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.detectResultList = builder.detectResultList;
            this.processedCount = builder.processedCount;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detectResultList
         */
        public java.util.List<DetectResultList> getDetectResultList() {
            return this.detectResultList;
        }

        /**
         * @return processedCount
         */
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DetectResultList> detectResultList; 
            private Integer processedCount; 
            private String taskId; 
            private Integer taskStatus; 
            private Integer totalCount; 

            /**
             * DetectResultList.
             */
            public Builder detectResultList(java.util.List<DetectResultList> detectResultList) {
                this.detectResultList = detectResultList;
                return this;
            }

            /**
             * ProcessedCount.
             */
            public Builder processedCount(Integer processedCount) {
                this.processedCount = processedCount;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
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
