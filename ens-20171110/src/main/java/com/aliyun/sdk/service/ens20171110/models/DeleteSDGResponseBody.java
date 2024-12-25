// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteSDGResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSDGResponseBody</p>
 */
public class DeleteSDGResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteSDGResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSDGResponseBody create() {
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
         * <p>The returned data object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86A6D421-A0C7-4C01-8648-47377CA6A2CE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteSDGResponseBody build() {
            return new DeleteSDGResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSDGResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SdgId")
        private String sdgId;

        private Item(Builder builder) {
            this.sdgId = builder.sdgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return sdgId
         */
        public String getSdgId() {
            return this.sdgId;
        }

        public static final class Builder {
            private String sdgId; 

            /**
             * <p>The ID of the shared data group (SDG).</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-dfet5vvvgy</p>
             */
            public Builder sdgId(String sdgId) {
                this.sdgId = sdgId;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSDGResponseBody</p>
     */
    public static class FailedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("Item")
        private Item item;

        private FailedItems(Builder builder) {
            this.errMessage = builder.errMessage;
            this.item = builder.item;
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
         * @return item
         */
        public Item getItem() {
            return this.item;
        }

        public static final class Builder {
            private String errMessage; 
            private Item item; 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg not found</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>Description</p>
             */
            public Builder item(Item item) {
                this.item = item;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSDGResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("FailedItems")
        private java.util.List<FailedItems> failedItems;

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
        public java.util.List<FailedItems> getFailedItems() {
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
            private java.util.List<FailedItems> failedItems; 
            private Long successCount; 

            /**
             * <p>The number of failed tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>Details about the failed tasks.</p>
             */
            public Builder failedItems(java.util.List<FailedItems> failedItems) {
                this.failedItems = failedItems;
                return this;
            }

            /**
             * <p>The number of successful tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DeleteSDGResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSDGResponseBody</p>
     */
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
             * <p>The response message. Success is returned for a successful request.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The execution result of the synchronization request.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Indicates whether all tasks are successful. Valid values:</p>
             * <ul>
             * <li>true: All tasks are successful.</li>
             * <li>false: Failed tasks exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
