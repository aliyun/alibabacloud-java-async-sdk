// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchJobCheckResponseBody} extends {@link TeaModel}
 *
 * <p>BatchJobCheckResponseBody</p>
 */
public class BatchJobCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchJobCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchJobCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
        private Integer code; 
        private Data data; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchJobCheckResponseBody build() {
            return new BatchJobCheckResponseBody(this);
        } 

    } 

    public static class LogList extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("LogCode")
        private String logCode;

        @NameInMap("LogStoreNamePattern")
        private String logStoreNamePattern;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProjectNamePattern")
        private String projectNamePattern;

        @NameInMap("RegionCode")
        private String regionCode;

        private LogList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.logCode = builder.logCode;
            this.logStoreNamePattern = builder.logStoreNamePattern;
            this.productCode = builder.productCode;
            this.projectNamePattern = builder.projectNamePattern;
            this.regionCode = builder.regionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logStoreNamePattern
         */
        public String getLogStoreNamePattern() {
            return this.logStoreNamePattern;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return projectNamePattern
         */
        public String getProjectNamePattern() {
            return this.projectNamePattern;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        public static final class Builder {
            private String errorCode; 
            private String logCode; 
            private String logStoreNamePattern; 
            private String productCode; 
            private String projectNamePattern; 
            private String regionCode; 

            /**
             * The error code returned if the request failed.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The log code.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * The pattern of SLS log store name.
             */
            public Builder logStoreNamePattern(String logStoreNamePattern) {
                this.logStoreNamePattern = logStoreNamePattern;
                return this;
            }

            /**
             * The code of product.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The pattern of SLS project name.
             */
            public Builder projectNamePattern(String projectNamePattern) {
                this.projectNamePattern = projectNamePattern;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
    public static class ProductList extends TeaModel {
        @NameInMap("LogList")
        private java.util.List < LogList> logList;

        @NameInMap("ProductCode")
        private String productCode;

        private ProductList(Builder builder) {
            this.logList = builder.logList;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return logList
         */
        public java.util.List < LogList> getLogList() {
            return this.logList;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List < LogList> logList; 
            private String productCode; 

            /**
             * The list of log.
             */
            public Builder logList(java.util.List < LogList> logList) {
                this.logList = logList;
                return this;
            }

            /**
             * The code of the product.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    public static class ErrTaskList extends TeaModel {
        @NameInMap("ProductList")
        private java.util.List < ProductList> productList;

        @NameInMap("UserId")
        private Long userId;

        private ErrTaskList(Builder builder) {
            this.productList = builder.productList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrTaskList create() {
            return builder().build();
        }

        /**
         * @return productList
         */
        public java.util.List < ProductList> getProductList() {
            return this.productList;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < ProductList> productList; 
            private Long userId; 

            /**
             * The list of product.
             */
            public Builder productList(java.util.List < ProductList> productList) {
                this.productList = productList;
                return this;
            }

            /**
             * The account id of aliyun.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ErrTaskList build() {
                return new ErrTaskList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("ErrTaskList")
        private java.util.List < ErrTaskList> errTaskList;

        @NameInMap("FailedCount")
        private Integer failedCount;

        @NameInMap("FinishCount")
        private Integer finishCount;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("TaskCount")
        private Integer taskCount;

        @NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.configId = builder.configId;
            this.errTaskList = builder.errTaskList;
            this.failedCount = builder.failedCount;
            this.finishCount = builder.finishCount;
            this.folderId = builder.folderId;
            this.taskCount = builder.taskCount;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return errTaskList
         */
        public java.util.List < ErrTaskList> getErrTaskList() {
            return this.errTaskList;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return taskCount
         */
        public Integer getTaskCount() {
            return this.taskCount;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String configId; 
            private java.util.List < ErrTaskList> errTaskList; 
            private Integer failedCount; 
            private Integer finishCount; 
            private String folderId; 
            private Integer taskCount; 
            private String taskStatus; 

            /**
             * The ID of the task configuration.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * The list of error task.
             */
            public Builder errTaskList(java.util.List < ErrTaskList> errTaskList) {
                this.errTaskList = errTaskList;
                return this;
            }

            /**
             * The number of custom route entries that failed to be added.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * The number of scan tasks that are complete.
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * The ID of the folder.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The number of existing tasks that are created to add logs within the data source.
             */
            public Builder taskCount(Integer taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            /**
             * The status of task.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
