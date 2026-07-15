// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchRemoveConsumerGroupConsumersResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRemoveConsumerGroupConsumersResponseBody</p>
 */
public class BatchRemoveConsumerGroupConsumersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BatchRemoveConsumerGroupConsumersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRemoveConsumerGroupConsumersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchRemoveConsumerGroupConsumersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchRemoveConsumerGroupConsumersResponseBody build() {
            return new BatchRemoveConsumerGroupConsumersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchRemoveConsumerGroupConsumersResponseBody} extends {@link TeaModel}
     *
     * <p>BatchRemoveConsumerGroupConsumersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failedConsumerIds")
        private java.util.List<String> failedConsumerIds;

        @com.aliyun.core.annotation.NameInMap("skippedConsumerIds")
        private java.util.List<String> skippedConsumerIds;

        @com.aliyun.core.annotation.NameInMap("successConsumerIds")
        private java.util.List<String> successConsumerIds;

        private Data(Builder builder) {
            this.failedConsumerIds = builder.failedConsumerIds;
            this.skippedConsumerIds = builder.skippedConsumerIds;
            this.successConsumerIds = builder.successConsumerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedConsumerIds
         */
        public java.util.List<String> getFailedConsumerIds() {
            return this.failedConsumerIds;
        }

        /**
         * @return skippedConsumerIds
         */
        public java.util.List<String> getSkippedConsumerIds() {
            return this.skippedConsumerIds;
        }

        /**
         * @return successConsumerIds
         */
        public java.util.List<String> getSuccessConsumerIds() {
            return this.successConsumerIds;
        }

        public static final class Builder {
            private java.util.List<String> failedConsumerIds; 
            private java.util.List<String> skippedConsumerIds; 
            private java.util.List<String> successConsumerIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedConsumerIds = model.failedConsumerIds;
                this.skippedConsumerIds = model.skippedConsumerIds;
                this.successConsumerIds = model.successConsumerIds;
            } 

            /**
             * failedConsumerIds.
             */
            public Builder failedConsumerIds(java.util.List<String> failedConsumerIds) {
                this.failedConsumerIds = failedConsumerIds;
                return this;
            }

            /**
             * skippedConsumerIds.
             */
            public Builder skippedConsumerIds(java.util.List<String> skippedConsumerIds) {
                this.skippedConsumerIds = skippedConsumerIds;
                return this;
            }

            /**
             * successConsumerIds.
             */
            public Builder successConsumerIds(java.util.List<String> successConsumerIds) {
                this.successConsumerIds = successConsumerIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
