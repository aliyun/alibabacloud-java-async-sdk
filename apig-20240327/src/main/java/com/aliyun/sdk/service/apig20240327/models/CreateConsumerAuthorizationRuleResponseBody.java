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
 * {@link CreateConsumerAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConsumerAuthorizationRuleResponseBody</p>
 */
public class CreateConsumerAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateConsumerAuthorizationRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAuthorizationRuleResponseBody create() {
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

        private Builder(CreateConsumerAuthorizationRuleResponseBody model) {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConsumerAuthorizationRuleResponseBody build() {
            return new CreateConsumerAuthorizationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateConsumerAuthorizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateConsumerAuthorizationRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
        private String consumerAuthorizationRuleId;

        private Data(Builder builder) {
            this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerAuthorizationRuleId
         */
        public String getConsumerAuthorizationRuleId() {
            return this.consumerAuthorizationRuleId;
        }

        public static final class Builder {
            private String consumerAuthorizationRuleId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerAuthorizationRuleId = model.consumerAuthorizationRuleId;
            } 

            /**
             * consumerAuthorizationRuleId.
             */
            public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
                this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
