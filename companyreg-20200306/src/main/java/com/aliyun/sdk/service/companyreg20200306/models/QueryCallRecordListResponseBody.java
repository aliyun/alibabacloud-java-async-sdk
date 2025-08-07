// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link QueryCallRecordListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallRecordListResponseBody</p>
 */
public class QueryCallRecordListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCallRecordListResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallRecordListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCallRecordListResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public QueryCallRecordListResponseBody build() {
            return new QueryCallRecordListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCallRecordListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCallRecordListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactDisposition")
        private String contactDisposition;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("SignatureUrl")
        private String signatureUrl;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.contactDisposition = builder.contactDisposition;
            this.duration = builder.duration;
            this.signatureUrl = builder.signatureUrl;
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
         * @return contactDisposition
         */
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return signatureUrl
         */
        public String getSignatureUrl() {
            return this.signatureUrl;
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
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String contactDisposition; 
            private Integer duration; 
            private String signatureUrl; 
            private Long startTime; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactDisposition = model.contactDisposition;
                this.duration = model.duration;
                this.signatureUrl = model.signatureUrl;
                this.startTime = model.startTime;
                this.taskId = model.taskId;
            } 

            /**
             * ContactDisposition.
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * SignatureUrl.
             */
            public Builder signatureUrl(String signatureUrl) {
                this.signatureUrl = signatureUrl;
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
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
