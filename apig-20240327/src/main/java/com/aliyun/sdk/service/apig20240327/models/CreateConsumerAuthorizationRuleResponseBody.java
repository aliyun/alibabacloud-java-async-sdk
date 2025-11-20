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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response payload.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CC83C32-3B5A-57EE-9AFE-D0D51822C7BA</p>
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
             * <p>Filters the list of operations based on a specific consumer authorization rule ID. Only authorized operations are returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>car-d06p196m1hkg9ukum5pg</p>
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
