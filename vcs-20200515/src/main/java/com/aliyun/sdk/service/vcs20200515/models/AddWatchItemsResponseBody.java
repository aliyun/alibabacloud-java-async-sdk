// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatchItemsResponseBody} extends {@link TeaModel}
 *
 * <p>AddWatchItemsResponseBody</p>
 */
public class AddWatchItemsResponseBody extends TeaModel {
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

    private AddWatchItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWatchItemsResponseBody create() {
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

        public AddWatchItemsResponseBody build() {
            return new AddWatchItemsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AddedItemIds")
        private String addedItemIds;

        @NameInMap("FailedItemIds")
        private String failedItemIds;

        private Data(Builder builder) {
            this.addedItemIds = builder.addedItemIds;
            this.failedItemIds = builder.failedItemIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addedItemIds
         */
        public String getAddedItemIds() {
            return this.addedItemIds;
        }

        /**
         * @return failedItemIds
         */
        public String getFailedItemIds() {
            return this.failedItemIds;
        }

        public static final class Builder {
            private String addedItemIds; 
            private String failedItemIds; 

            /**
             * AddedItemIds.
             */
            public Builder addedItemIds(String addedItemIds) {
                this.addedItemIds = addedItemIds;
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
