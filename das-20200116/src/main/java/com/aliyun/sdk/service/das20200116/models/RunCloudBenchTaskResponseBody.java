// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCloudBenchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RunCloudBenchTaskResponseBody</p>
 */
public class RunCloudBenchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private RunCloudBenchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCloudBenchTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information, including the error codes and the number of returned entries.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
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
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public RunCloudBenchTaskResponseBody build() {
            return new RunCloudBenchTaskResponseBody(this);
        } 

    } 

    public static class PreCheckItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Details")
        private String details;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PreCheckItem(Builder builder) {
            this.code = builder.code;
            this.details = builder.details;
            this.message = builder.message;
            this.name = builder.name;
            this.order = builder.order;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckItem create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer code; 
            private String details; 
            private String message; 
            private String name; 
            private Integer order; 
            private String status; 

            /**
             * The HTTP status code returned.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The detailed information of the check item.
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * The returned message.
             * <p>
             * 
             * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the check item. Valid values:
             * <p>
             * 
             * * **SqlArchiveStatusChecker**: checks whether SQL Explorer is available.
             * * **BenchClientEnvChecker**: checks whether the runtime environment for programs on the stress testing client is available.
             * * **SpecChecker**: checks whether the destination instance type and the instance type of the stress testing client support this API operation.
             * * **SourceInstanceChecker**: checks whether the account of the source instance is available and whether the source instance is connected to the destination instance.
             * * **BenchTargetChecker**: checks whether the account of the destination instance is available and whether the source instance is connected to the destination instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The sequence number of the check item. Valid values: **0** to **10**.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **SUCCESS**: The task is successful.
             * *   **IGNORED**: The task is ignored.
             * *   **RUNNING**: The task is running.
             * *   **EXCEPTION**: An error occurred.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PreCheckItem build() {
                return new PreCheckItem(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckItem")
        private java.util.List < PreCheckItem> preCheckItem;

        private Data(Builder builder) {
            this.preCheckItem = builder.preCheckItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return preCheckItem
         */
        public java.util.List < PreCheckItem> getPreCheckItem() {
            return this.preCheckItem;
        }

        public static final class Builder {
            private java.util.List < PreCheckItem> preCheckItem; 

            /**
             * PreCheckItem.
             */
            public Builder preCheckItem(java.util.List < PreCheckItem> preCheckItem) {
                this.preCheckItem = preCheckItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
