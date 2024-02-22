// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchJobSubmitResponseBody} extends {@link TeaModel}
 *
 * <p>BatchJobSubmitResponseBody</p>
 */
public class BatchJobSubmitResponseBody extends TeaModel {
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

    private BatchJobSubmitResponseBody(Builder builder) {
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

    public static BatchJobSubmitResponseBody create() {
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
         * The returned message.
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

        public BatchJobSubmitResponseBody build() {
            return new BatchJobSubmitResponseBody(this);
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
             * The error code returned.
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
    public static class ConfigList extends TeaModel {
        @NameInMap("ProductList")
        private java.util.List < ProductList> productList;

        @NameInMap("UserId")
        private Long userId;

        private ConfigList(Builder builder) {
            this.productList = builder.productList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
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

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("ConfigList")
        private java.util.List < ConfigList> configList;

        @NameInMap("SubmitId")
        private String submitId;

        @NameInMap("TaskCount")
        private Integer taskCount;

        private Data(Builder builder) {
            this.configId = builder.configId;
            this.configList = builder.configList;
            this.submitId = builder.submitId;
            this.taskCount = builder.taskCount;
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
         * @return configList
         */
        public java.util.List < ConfigList> getConfigList() {
            return this.configList;
        }

        /**
         * @return submitId
         */
        public String getSubmitId() {
            return this.submitId;
        }

        /**
         * @return taskCount
         */
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public static final class Builder {
            private String configId; 
            private java.util.List < ConfigList> configList; 
            private String submitId; 
            private Integer taskCount; 

            /**
             * The ID of the task configuration.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * The list of task configure.
             */
            public Builder configList(java.util.List < ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * The id of task.
             */
            public Builder submitId(String submitId) {
                this.submitId = submitId;
                return this;
            }

            /**
             * The number of existing tasks that are created to add logs within the data source.
             */
            public Builder taskCount(Integer taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
