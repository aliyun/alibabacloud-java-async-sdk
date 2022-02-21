// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWatchItemsResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveWatchItemsResponseBody</p>
 */
public class RemoveWatchItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private RemoveWatchItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveWatchItemsResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RemoveWatchItemsResponseBody build() {
            return new RemoveWatchItemsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DeletedItemIds")
        private String deletedItemIds;

        @NameInMap("FailedItemIds")
        private String failedItemIds;

        private Data(Builder builder) {
            this.deletedItemIds = builder.deletedItemIds;
            this.failedItemIds = builder.failedItemIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deletedItemIds
         */
        public String getDeletedItemIds() {
            return this.deletedItemIds;
        }

        /**
         * @return failedItemIds
         */
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

        public static final class Builder {
            private String deletedItemIds; 
            private String failedItemIds; 

            /**
             * DeletedItemIds.
             */
            public Builder deletedItemIds(String deletedItemIds) {
                this.deletedItemIds = deletedItemIds;
                return this;
            }

            /**
             * FailedItemIds.
             */
            public Builder failedItemIds(String failedItemIds) {
                this.failedItemIds = failedItemIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
