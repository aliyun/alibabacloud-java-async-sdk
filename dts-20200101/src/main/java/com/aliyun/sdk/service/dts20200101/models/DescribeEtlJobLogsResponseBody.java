// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeEtlJobLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEtlJobLogsResponseBody</p>
 */
public class DescribeEtlJobLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("EtlRunningLogs")
    private java.util.List<EtlRunningLogs> etlRunningLogs;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<EtlRunningLogs> getEtlRunningLogs() {
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
        private java.util.List<EtlRunningLogs> etlRunningLogs; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeEtlJobLogsResponseBody model) {
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.etlRunningLogs = model.etlRunningLogs;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>present environment is not support,so skip.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code. This example indicates that the specified ETL task ID is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidJobId</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. This example indicates that the specified ETL task ID does not exist. In this case, the ETL task may be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified dts job id %s is not exists.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The logs of ETL tasks.</p>
         */
        public Builder etlRunningLogs(java.util.List<EtlRunningLogs> etlRunningLogs) {
            this.etlRunningLogs = etlRunningLogs;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. If the call failed, false is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEtlJobLogsResponseBody build() {
            return new DescribeEtlJobLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEtlJobLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEtlJobLogsResponseBody</p>
     */
    public static class EtlRunningLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentKey")
        private String contentKey;

        @com.aliyun.core.annotation.NameInMap("EtlId")
        private String etlId;

        @com.aliyun.core.annotation.NameInMap("LogDatetime")
        private String logDatetime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(EtlRunningLogs model) {
                this.content = model.content;
                this.contentKey = model.contentKey;
                this.etlId = model.etlId;
                this.logDatetime = model.logDatetime;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * <p>The state of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>Starting DTS-ETL...</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The module for which the logs are generated, such as the conversion module of ETL tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-ETL</p>
             */
            public Builder contentKey(String contentKey) {
                this.contentKey = contentKey;
                return this;
            }

            /**
             * <p>The ID of the ETL task.</p>
             * 
             * <strong>example:</strong>
             * <p>u**********5</p>
             */
            public Builder etlId(String etlId) {
                this.etlId = etlId;
                return this;
            }

            /**
             * <p>The time when the log was generated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1637306503000</p>
             */
            public Builder logDatetime(String logDatetime) {
                this.logDatetime = logDatetime;
                return this;
            }

            /**
             * <p>The log level. Valid values: ERROR, WARN, INFO, and DEBUG.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>121323*******454512</p>
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
