// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncStatusResponseBody</p>
 */
public class DescribeSyncStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SyncStatusList")
    private java.util.List < SyncStatusList> syncStatusList;

    private DescribeSyncStatusResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.syncStatusList = builder.syncStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return syncStatusList
     */
    public java.util.List < SyncStatusList> getSyncStatusList() {
        return this.syncStatusList;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < SyncStatusList> syncStatusList; 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        /**
         * SyncStatusList.
         */
        public Builder syncStatusList(java.util.List < SyncStatusList> syncStatusList) {
            this.syncStatusList = syncStatusList;
            return this;
        }

        public DescribeSyncStatusResponseBody build() {
            return new DescribeSyncStatusResponseBody(this);
        } 

    } 

    public static class SyncStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private Long checkpoint;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SyncStatusList(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.code = builder.code;
            this.delay = builder.delay;
            this.jobId = builder.jobId;
            this.rate = builder.rate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncStatusList create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public Long getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long checkpoint; 
            private String code; 
            private Long delay; 
            private String jobId; 
            private String rate; 
            private String status; 

            /**
             * Checkpoint.
             */
            public Builder checkpoint(Long checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SyncStatusList build() {
                return new SyncStatusList(this);
            } 

        } 

    }
}
