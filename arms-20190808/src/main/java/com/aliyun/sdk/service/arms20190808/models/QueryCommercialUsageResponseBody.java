// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommercialUsageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommercialUsageResponseBody</p>
 */
public class QueryCommercialUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCommercialUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommercialUsageResponseBody create() {
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
         * RequestId.
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

        public QueryCommercialUsageResponseBody build() {
            return new QueryCommercialUsageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < java.util.Map<String, ?>> items;

        private Data(Builder builder) {
            this.complete = builder.complete;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return complete
         */
        public Boolean getComplete() {
            return this.complete;
        }

        /**
         * @return items
         */
        public java.util.List < java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public static final class Builder {
            private Boolean complete; 
            private java.util.List < java.util.Map<String, ?>> items; 

            /**
             * Complete.
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
