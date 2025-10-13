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
 * {@link CreateConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConsumerAuthorizationRulesResponseBody</p>
 */
public class CreateConsumerAuthorizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateConsumerAuthorizationRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAuthorizationRulesResponseBody create() {
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

        private Builder(CreateConsumerAuthorizationRulesResponseBody model) {
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
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateConsumerAuthorizationRulesResponseBody build() {
            return new CreateConsumerAuthorizationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateConsumerAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateConsumerAuthorizationRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleIds")
        private java.util.List<String> consumerAuthorizationRuleIds;

        private Data(Builder builder) {
            this.consumerAuthorizationRuleIds = builder.consumerAuthorizationRuleIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerAuthorizationRuleIds
         */
        public java.util.List<String> getConsumerAuthorizationRuleIds() {
            return this.consumerAuthorizationRuleIds;
        }

        public static final class Builder {
            private java.util.List<String> consumerAuthorizationRuleIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerAuthorizationRuleIds = model.consumerAuthorizationRuleIds;
            } 

            /**
             * <p>The authentication rule IDs.</p>
             */
            public Builder consumerAuthorizationRuleIds(java.util.List<String> consumerAuthorizationRuleIds) {
                this.consumerAuthorizationRuleIds = consumerAuthorizationRuleIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
