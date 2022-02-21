// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEtlJobLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEtlJobLogsResponseBody</p>
 */
public class DescribeEtlJobLogsResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("EtlRunningLogs")
    private java.util.List < EtlRunningLogs> etlRunningLogs;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeEtlJobLogsResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.etlRunningLogs = builder.etlRunningLogs;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEtlJobLogsResponseBody create() {
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
     * @return etlRunningLogs
     */
    public java.util.List < EtlRunningLogs> getEtlRunningLogs() {
        return this.etlRunningLogs;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private java.util.List < EtlRunningLogs> etlRunningLogs; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

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
         * EtlRunningLogs.
         */
        public Builder etlRunningLogs(java.util.List < EtlRunningLogs> etlRunningLogs) {
            this.etlRunningLogs = etlRunningLogs;
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

        public DescribeEtlJobLogsResponseBody build() {
            return new DescribeEtlJobLogsResponseBody(this);
        } 

    } 

    public static class EtlRunningLogs extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentKey")
        private String contentKey;

        @NameInMap("EtlId")
        private String etlId;

        @NameInMap("LogDatetime")
        private String logDatetime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        private EtlRunningLogs(Builder builder) {
            this.content = builder.content;
            this.contentKey = builder.contentKey;
            this.etlId = builder.etlId;
            this.logDatetime = builder.logDatetime;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlRunningLogs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentKey
         */
        public String getContentKey() {
            return this.contentKey;
        }

        /**
         * @return etlId
         */
        public String getEtlId() {
            return this.etlId;
        }

        /**
         * @return logDatetime
         */
        public String getLogDatetime() {
            return this.logDatetime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String content; 
            private String contentKey; 
            private String etlId; 
            private String logDatetime; 
            private String status; 
            private String userId; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentKey.
             */
            public Builder contentKey(String contentKey) {
                this.contentKey = contentKey;
                return this;
            }

            /**
             * EtlId.
             */
            public Builder etlId(String etlId) {
                this.etlId = etlId;
                return this;
            }

            /**
             * LogDatetime.
             */
            public Builder logDatetime(String logDatetime) {
                this.logDatetime = logDatetime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EtlRunningLogs build() {
                return new EtlRunningLogs(this);
            } 

        } 

    }
}
