// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCheckTableDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCheckTableDetailsResponseBody</p>
 */
public class DescribeDataCheckTableDetailsResponseBody extends TeaModel {
    @NameInMap("DiffTableCount")
    private Long diffTableCount;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("FinishedCount")
    private Long finishedCount;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableDetails")
    private java.util.List < TableDetails> tableDetails;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDataCheckTableDetailsResponseBody(Builder builder) {
        this.diffTableCount = builder.diffTableCount;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
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
    public java.util.List < TableDetails> getTableDetails() {
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
        private Long finishedCount; 
        private Integer httpStatusCode; 
        private Integer pageNumber; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TableDetails> tableDetails; 
        private Long totalCount; 

        /**
         * The number of tables that contain inconsistent data.
         */
        public Builder diffTableCount(Long diffTableCount) {
            this.diffTableCount = diffTableCount;
            return this;
        }

        /**
         * The dynamic error code. This parameter will be removed in the future.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the **%s** variable in the value of **ErrMessage**.
         * <p>
         * 
         * >  For example, if the return value of **ErrMessage** is **The Value of Input Parameter %s is not valid** and the return value of **DynamicMessage** is **Type**, the specified value of **Type** is invalid.
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
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The total number of data rows that were verified.
         */
        public Builder finishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
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
         * The details of data verification results.
         */
        public Builder tableDetails(java.util.List < TableDetails> tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }

        /**
         * The total number of tables on which data verification was performed.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataCheckTableDetailsResponseBody build() {
            return new DescribeDataCheckTableDetailsResponseBody(this);
        } 

    } 

    public static class TableDetails extends TeaModel {
        @NameInMap("BootTime")
        private String bootTime;

        @NameInMap("DiffCount")
        private Long diffCount;

        @NameInMap("ErrorCode")
        private Integer errorCode;

        @NameInMap("FinishCount")
        private Long finishCount;

        @NameInMap("Id")
        private Long id;

        @NameInMap("SourceDbName")
        private String sourceDbName;

        @NameInMap("SourceTbName")
        private String sourceTbName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetDbName")
        private String targetDbName;

        @NameInMap("TargetTbName")
        private String targetTbName;

        @NameInMap("TotalCount")
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
             * The time when data verification was performed.
             */
            public Builder bootTime(String bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * The number of data rows that contain inconsistent data.
             */
            public Builder diffCount(Long diffCount) {
                this.diffCount = diffCount;
                return this;
            }

            /**
             * The error code returned if the request failed.
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The number of data rows that were verified.
             */
            public Builder finishCount(Long finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * The auto-increment primary key that is used to identify the data in a verification result.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the source database.
             */
            public Builder sourceDbName(String sourceDbName) {
                this.sourceDbName = sourceDbName;
                return this;
            }

            /**
             * The name of the source table.
             */
            public Builder sourceTbName(String sourceTbName) {
                this.sourceTbName = sourceTbName;
                return this;
            }

            /**
             * The state of the data verification task. Valid values:
             * <p>
             * 
             * *   **0**: The data verification task was complete.
             * *   **2**: The data verification task was being initialized.
             * *   **3**: The data verification task was in progress.
             * *   **5**: The data verification task failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the destination database.
             */
            public Builder targetDbName(String targetDbName) {
                this.targetDbName = targetDbName;
                return this;
            }

            /**
             * The name of the destination table.
             */
            public Builder targetTbName(String targetTbName) {
                this.targetTbName = targetTbName;
                return this;
            }

            /**
             * The total number of data rows.
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
