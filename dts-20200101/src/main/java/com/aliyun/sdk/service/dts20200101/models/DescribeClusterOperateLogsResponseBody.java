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
 * {@link DescribeClusterOperateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterOperateLogsResponseBody</p>
 */
public class DescribeClusterOperateLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataPoints")
    private java.util.List<DataPoints> dataPoints;

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

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
    public java.util.List<DataPoints> getDataPoints() {
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
        private java.util.List<DataPoints> dataPoints; 
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
         * <p>The error code returned by the backend service. The number is incremented.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the operation logs.</p>
         */
        public Builder dataPoints(java.util.List<DataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace %s in the ErrMessage parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Type</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned for an exception.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeClusterOperateLogsResponseBody build() {
            return new DescribeClusterOperateLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterOperateLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterOperateLogsResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LogDatetime")
        private Long logDatetime;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        @com.aliyun.core.annotation.NameInMap("OperationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("OperationUser")
        private String operationUser;

        @com.aliyun.core.annotation.NameInMap("Success")
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
             * <p>Other description of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The primary key of the log table.</p>
             * 
             * <strong>example:</strong>
             * <p>237827</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the operation is recorded. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1642077211574</p>
             */
            public Builder logDatetime(Long logDatetime) {
                this.logDatetime = logDatetime;
                return this;
            }

            /**
             * <p>The value of the parameter after the operation if the operation is an UPDATE operation.</p>
             * 
             * <strong>example:</strong>
             * <p>105</p>
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * <p>The value of the parameter before the operation if the operation is an UPDATE operation.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * <p>The type of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>modify-oversold-ratio</p>
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * <p>The user who performed the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder operationUser(String operationUser) {
                this.operationUser = operationUser;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. A value of <strong>1</strong> indicates that the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
