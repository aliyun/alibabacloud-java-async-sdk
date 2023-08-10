// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterOperateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterOperateLogsResponseBody</p>
 */
public class DescribeClusterOperateLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DataPoints")
    private java.util.List < DataPoints> dataPoints;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeClusterOperateLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataPoints = builder.dataPoints;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterOperateLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataPoints
     */
    public java.util.List < DataPoints> getDataPoints() {
        return this.dataPoints;
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
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DataPoints> dataPoints; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Boolean success; 
        private Long totalRecordCount; 

        /**
         * The error code returned by the backend service. The number is incremented.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the operation logs.
         */
        public Builder dataPoints(java.util.List < DataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace %s in the ErrMessage parameter.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The HTTP status code returned for an exception.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of records.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeClusterOperateLogsResponseBody build() {
            return new DescribeClusterOperateLogsResponseBody(this);
        } 

    } 

    public static class DataPoints extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Id")
        private String id;

        @NameInMap("LogDatetime")
        private Long logDatetime;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("OperationName")
        private String operationName;

        @NameInMap("OperationUser")
        private String operationUser;

        @NameInMap("Success")
        private Integer success;

        private DataPoints(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.logDatetime = builder.logDatetime;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.operationName = builder.operationName;
            this.operationUser = builder.operationUser;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logDatetime
         */
        public Long getLogDatetime() {
            return this.logDatetime;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return operationUser
         */
        public String getOperationUser() {
            return this.operationUser;
        }

        /**
         * @return success
         */
        public Integer getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String content; 
            private String id; 
            private Long logDatetime; 
            private String newValue; 
            private String oldValue; 
            private String operationName; 
            private String operationUser; 
            private Integer success; 

            /**
             * Other description of the operation.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The primary key of the log table.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The time when the operation is recorded. The value is in the UNIX timestamp format. Unit: milliseconds.
             */
            public Builder logDatetime(Long logDatetime) {
                this.logDatetime = logDatetime;
                return this;
            }

            /**
             * The value of the parameter after the operation if the operation is an UPDATE operation.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * The value of the parameter before the operation if the operation is an UPDATE operation.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * The type of the operation.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * The user who performed the operation.
             */
            public Builder operationUser(String operationUser) {
                this.operationUser = operationUser;
                return this;
            }

            /**
             * Indicates whether the request was successful. A value of **1** indicates that the request was successful.
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
}
