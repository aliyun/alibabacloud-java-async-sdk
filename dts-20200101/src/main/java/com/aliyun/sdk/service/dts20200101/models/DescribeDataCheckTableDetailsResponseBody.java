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
 * {@link DescribeDataCheckTableDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCheckTableDetailsResponseBody</p>
 */
public class DescribeDataCheckTableDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiffTableCount")
    private Long diffTableCount;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("FailedTableCount")
    private Long failedTableCount;

    @com.aliyun.core.annotation.NameInMap("FinishedCount")
    private Long finishedCount;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableDetails")
    private java.util.List<TableDetails> tableDetails;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDataCheckTableDetailsResponseBody(Builder builder) {
        this.diffTableCount = builder.diffTableCount;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.failedTableCount = builder.failedTableCount;
        this.finishedCount = builder.finishedCount;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableDetails = builder.tableDetails;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCheckTableDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diffTableCount
     */
    public Long getDiffTableCount() {
        return this.diffTableCount;
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
     * @return failedTableCount
     */
    public Long getFailedTableCount() {
        return this.failedTableCount;
    }

    /**
     * @return finishedCount
     */
    public Long getFinishedCount() {
        return this.finishedCount;
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
     * @return tableDetails
     */
    public java.util.List<TableDetails> getTableDetails() {
        return this.tableDetails;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long diffTableCount; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errCode; 
        private String errMessage; 
        private Long failedTableCount; 
        private Long finishedCount; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TableDetails> tableDetails; 
        private Long totalCount; 

        /**
         * <p>The number of tables that contain inconsistent data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder diffTableCount(Long diffTableCount) {
            this.diffTableCount = diffTableCount;
            return this;
        }

        /**
         * <p>The dynamic error code. This parameter will be discontinued in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>For example, if the returned value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>Type</strong>, the specified <strong>Type</strong> parameter is invalid.</p>
         * </blockquote>
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
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The Value of Input Parameter %s is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * FailedTableCount.
         */
        public Builder failedTableCount(Long failedTableCount) {
            this.failedTableCount = failedTableCount;
            return this;
        }

        /**
         * <p>The total number of data rows that were verified.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder finishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
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
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
         * <p>The details of data verification results.</p>
         */
        public Builder tableDetails(java.util.List<TableDetails> tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }

        /**
         * <p>The total number of tables on which data verification was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataCheckTableDetailsResponseBody build() {
            return new DescribeDataCheckTableDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataCheckTableDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCheckTableDetailsResponseBody</p>
     */
    public static class TableDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private String bootTime;

        @com.aliyun.core.annotation.NameInMap("DiffCount")
        private Long diffCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private Integer errorCode;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Long finishCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SourceDbName")
        private String sourceDbName;

        @com.aliyun.core.annotation.NameInMap("SourceTbName")
        private String sourceTbName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetDbName")
        private String targetDbName;

        @com.aliyun.core.annotation.NameInMap("TargetTbName")
        private String targetTbName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private TableDetails(Builder builder) {
            this.bootTime = builder.bootTime;
            this.diffCount = builder.diffCount;
            this.errorCode = builder.errorCode;
            this.finishCount = builder.finishCount;
            this.id = builder.id;
            this.sourceDbName = builder.sourceDbName;
            this.sourceTbName = builder.sourceTbName;
            this.status = builder.status;
            this.targetDbName = builder.targetDbName;
            this.targetTbName = builder.targetTbName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public String getBootTime() {
            return this.bootTime;
        }

        /**
         * @return diffCount
         */
        public Long getDiffCount() {
            return this.diffCount;
        }

        /**
         * @return errorCode
         */
        public Integer getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return finishCount
         */
        public Long getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sourceDbName
         */
        public String getSourceDbName() {
            return this.sourceDbName;
        }

        /**
         * @return sourceTbName
         */
        public String getSourceTbName() {
            return this.sourceTbName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetDbName
         */
        public String getTargetDbName() {
            return this.targetDbName;
        }

        /**
         * @return targetTbName
         */
        public String getTargetTbName() {
            return this.targetTbName;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String bootTime; 
            private Long diffCount; 
            private Integer errorCode; 
            private Long finishCount; 
            private Long id; 
            private String sourceDbName; 
            private String sourceTbName; 
            private String status; 
            private String targetDbName; 
            private String targetTbName; 
            private Long totalCount; 

            /**
             * <p>The time when data verification was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-18 11:26:59</p>
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>The number of data rows that contain inconsistent data.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diffCount(Long diffCount) {
                this.diffCount = diffCount;
                return this;
            }

            /**
             * <p>The error code returned if the data verification task failed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The number of tables that do not contain primary keys exceeds the limit.</li>
             * <li><strong>2</strong>: The number of data rows that contain inconsistent data exceeds 300.</li>
             * <li><strong>3</strong>: One or more tables to be verified do not exist.</li>
             * <li><strong>4</strong>: The SQL statements used for verifying data contain a syntax error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The number of data rows that were verified.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder finishCount(Long finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The auto-increment primary key that is used to identify the data in a verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>167401241974****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the source database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder sourceDbName(String sourceDbName) {
                this.sourceDbName = sourceDbName;
                return this;
            }

            /**
             * <p>The name of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>student</p>
             */
            public Builder sourceTbName(String sourceTbName) {
                this.sourceTbName = sourceTbName;
                return this;
            }

            /**
             * <p>The status of data verification results. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The data verification task was complete.</li>
             * <li><strong>2</strong>: The data verification task was being initialized.</li>
             * <li><strong>3</strong>: The data verification task was in progress.</li>
             * <li><strong>5</strong>: The data verification task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder targetDbName(String targetDbName) {
                this.targetDbName = targetDbName;
                return this;
            }

            /**
             * <p>The name of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>person</p>
             */
            public Builder targetTbName(String targetTbName) {
                this.targetTbName = targetTbName;
                return this;
            }

            /**
             * <p>The total number of data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
}
