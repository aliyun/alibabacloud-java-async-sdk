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
 * {@link GetHiMarketConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>GetHiMarketConsumerResponseBody</p>
 */
public class GetHiMarketConsumerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetHiMarketConsumerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHiMarketConsumerResponseBody create() {
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

        private Builder(GetHiMarketConsumerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHiMarketConsumerResponseBody build() {
            return new GetHiMarketConsumerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHiMarketConsumerResponseBody} extends {@link TeaModel}
     *
     * <p>GetHiMarketConsumerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("isPrimary")
        private Boolean isPrimary;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Data(Builder builder) {
            this.consumerId = builder.consumerId;
            this.description = builder.description;
            this.isPrimary = builder.isPrimary;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isPrimary
         */
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String consumerId; 
            private String description; 
            private Boolean isPrimary; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerId = model.consumerId;
                this.description = model.description;
                this.isPrimary = model.isPrimary;
                this.name = model.name;
            } 

            /**
             * <p>The consumer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-xxxxxxxxxxxx</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The description of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>Dedicated test consumer</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the consumer is the primary consumer.</p>
             */
            public Builder isPrimary(Boolean isPrimary) {
                this.isPrimary = isPrimary;
                return this;
            }

            /**
             * <p>The name of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>consumer-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
