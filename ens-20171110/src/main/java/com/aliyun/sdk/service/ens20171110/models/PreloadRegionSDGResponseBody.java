// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadRegionSDGResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadRegionSDGResponseBody</p>
 */
public class PreloadRegionSDGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreloadRegionSDGResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadRegionSDGResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data object.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreloadRegionSDGResponseBody build() {
            return new PreloadRegionSDGResponseBody(this);
        } 

    } 

    public static class FailedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private FailedItems(Builder builder) {
            this.destinationRegionId = builder.destinationRegionId;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItems create() {
            return builder().build();
        }

        /**
         * @return destinationRegionId
         */
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String destinationRegionId; 
            private String errorMessage; 

            /**
             * The ID of the destination node.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * The error message that is returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("FailedItems")
        private java.util.List < FailedItems> failedItems;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        private Result(Builder builder) {
            this.failedCount = builder.failedCount;
            this.failedItems = builder.failedItems;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return failedItems
         */
        public java.util.List < FailedItems> getFailedItems() {
            return this.failedItems;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Long failedCount; 
            private java.util.List < FailedItems> failedItems; 
            private Long successCount; 

            /**
             * The number of failed tasks.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * Details about failed tasks.
             */
            public Builder failedItems(java.util.List < FailedItems> failedItems) {
                this.failedItems = failedItems;
                return this;
            }

            /**
             * The number of successful tasks.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.message = builder.message;
            this.result = builder.result;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String message; 
            private Result result; 
            private Boolean success; 

            /**
             * The message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The execution result of the synchronization request.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Indicates whether all tasks are successful. Valid values:
             * <p>
             * 
             * *   true: All tasks are successful.
             * *   false: Failed tasks exist.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
