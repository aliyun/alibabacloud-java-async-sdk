// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDownStreamBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDownStreamBindingsResponseBody</p>
 */
public class ListDownStreamBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDownStreamBindingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDownStreamBindingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDownStreamBindingsResponseBody build() {
            return new ListDownStreamBindingsResponseBody(this);
        } 

    } 

    public static class Bindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Argument")
        private String argument;

        @com.aliyun.core.annotation.NameInMap("BindingKey")
        private String bindingKey;

        @com.aliyun.core.annotation.NameInMap("BindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("DestinationName")
        private String destinationName;

        @com.aliyun.core.annotation.NameInMap("SourceExchange")
        private String sourceExchange;

        private Bindings(Builder builder) {
            this.argument = builder.argument;
            this.bindingKey = builder.bindingKey;
            this.bindingType = builder.bindingType;
            this.destinationName = builder.destinationName;
            this.sourceExchange = builder.sourceExchange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bindings create() {
            return builder().build();
        }

        /**
         * @return argument
         */
        public String getArgument() {
            return this.argument;
        }

        /**
         * @return bindingKey
         */
        public String getBindingKey() {
            return this.bindingKey;
        }

        /**
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
        }

        /**
         * @return destinationName
         */
        public String getDestinationName() {
            return this.destinationName;
        }

        /**
         * @return sourceExchange
         */
        public String getSourceExchange() {
            return this.sourceExchange;
        }

        public static final class Builder {
            private String argument; 
            private String bindingKey; 
            private String bindingType; 
            private String destinationName; 
            private String sourceExchange; 

            /**
             * The x-match attribute. Valid values:
             * <p>
             * 
             * *   **all:** A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.
             * *   **any:** A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.
             * 
             * This parameter is available only for headers exchanges.
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * The binding key.
             * <p>
             * 
             * *   If the source exchange is not a topic exchange, the binding key must meet the following conventions:
             * 
             *     *   The binding key can contain only letters, digits, hyphens (-), underscores (\_), periods (.), forward slashes (/), and at signs (@).
             *     *   The binding key must be 1 to 255 characters in length.
             * 
             * *   If the source exchange is a topic exchange, the binding key must meet the following conventions:
             * 
             *     *   The binding key can contain letters, digits, hyphens (-), underscores (\_), periods (.), number signs (#), forward slashes (/), and at signs (@).
             *     *   The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (\*), the number sign (#) or asterisk (\*) must be preceded by a period (.). If a number sign (#) or an asterisk (\*) is used in the middle of a binding key, the number sign (#) or asterisk (\*) must be preceded and followed by a period (.).
             *     *   The binding key must be 1 to 255 characters in length.
             */
            public Builder bindingKey(String bindingKey) {
                this.bindingKey = bindingKey;
                return this;
            }

            /**
             * The type of the object to which the source exchange is bound. Valid values:
             * <p>
             * 
             * *   **QUEUE**
             * *   **EXCHANGE**
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * The name of the object to which the source exchange is bound.
             */
            public Builder destinationName(String destinationName) {
                this.destinationName = destinationName;
                return this;
            }

            /**
             * The name of the source exchange.
             */
            public Builder sourceExchange(String sourceExchange) {
                this.sourceExchange = sourceExchange;
                return this;
            }

            public Bindings build() {
                return new Bindings(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bindings")
        private java.util.List < Bindings> bindings;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.bindings = builder.bindings;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindings
         */
        public java.util.List < Bindings> getBindings() {
            return this.bindings;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        public static final class Builder {
            private java.util.List < Bindings> bindings; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The bindings.
             */
            public Builder bindings(java.util.List < Bindings> bindings) {
                this.bindings = bindings;
                return this;
            }

            /**
             * The maximum number of entries returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
