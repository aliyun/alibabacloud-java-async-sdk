// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeploySDGResponseBody} extends {@link TeaModel}
 *
 * <p>DeploySDGResponseBody</p>
 */
public class DeploySDGResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DeploySDGResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploySDGResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeploySDGResponseBody build() {
            return new DeploySDGResponseBody(this);
        } 

    } 

    public static class FailedItems extends TeaModel {
        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("InstanceId")
        private String instanceId;

        private FailedItems(Builder builder) {
            this.errMessage = builder.errMessage;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItems create() {
            return builder().build();
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String errMessage; 
            private String instanceId; 

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("FailedCount")
        private Long failedCount;

        @NameInMap("FailedItems")
        private java.util.List < FailedItems> failedItems;

        @NameInMap("SuccessCount")
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
             * FailedCount.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * FailedItems.
             */
            public Builder failedItems(java.util.List < FailedItems> failedItems) {
                this.failedItems = failedItems;
                return this;
            }

            /**
             * SuccessCount.
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
        @NameInMap("Message")
        private String message;

        @NameInMap("Result")
        private Result result;

        @NameInMap("Success")
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Success.
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
