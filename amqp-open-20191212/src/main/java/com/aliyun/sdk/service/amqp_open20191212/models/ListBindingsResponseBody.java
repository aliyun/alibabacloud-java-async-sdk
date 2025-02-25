// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link ListBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindingsResponseBody</p>
 */
public class ListBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBindingsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingsResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0A71208-3E87-4732-81CC-B18E0B4B1***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBindingsResponseBody build() {
            return new ListBindingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindingsResponseBody</p>
     */
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
             * <p>The x-match attribute. Valid values:</p>
             * <ul>
             * <li><strong>all:</strong> A headers exchange routes a message to a queue only if all binding attributes of the queue except for x-match match the headers attributes of the message. This value is the default value.</li>
             * <li><strong>any:</strong> A headers exchange routes a message to a queue if one or more binding attributes of the queue except for x-match match the headers attributes of the message.</li>
             * </ul>
             * <p>This parameter is available only for headers exchanges.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * <p>The binding key.</p>
             * <ul>
             * <li><p>If the source exchange is not a topic exchange, the binding key must meet the following conventions:</p>
             * <ul>
             * <li>The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), forward slashes (/), and at signs (@).</li>
             * <li>The binding key must be 1 to 255 characters in length.</li>
             * </ul>
             * </li>
             * <li><p>If the source exchange is a topic exchange, the binding key must meet the following conventions:</p>
             * <ul>
             * <li>The binding key can contain letters, digits, hyphens (-), underscores (_), asterisks (*), periods (.), number signs (#), forward slashes (/), and at signs (@).</li>
             * <li>The binding key cannot start or end with a period (.). If a binding key starts with a number sign (#) or an asterisk (*), the number sign (#) or asterisk (*) must be followed by a period (.). If the binding key ends with a number sign (#) or an asterisk (*), the number sign (#) or asterisk (*) must be preceded by a period (.). If a number sign (#) or an asterisk (*) is used in the middle of a binding key, the number sign (#) or asterisk (*) must be preceded and followed by a period (.).</li>
             * <li>The binding key must be 1 to 255 characters in length.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>amq.test</p>
             */
            public Builder bindingKey(String bindingKey) {
                this.bindingKey = bindingKey;
                return this;
            }

            /**
             * <p>The type of the object to which the source exchange is bound. Valid values:</p>
             * <ul>
             * <li><strong>QUEUE</strong></li>
             * <li><strong>EXCHANGE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>QUEUE</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The name of the object to which the source exchange is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>QueueTest</p>
             */
            public Builder destinationName(String destinationName) {
                this.destinationName = destinationName;
                return this;
            }

            /**
             * <p>The name of the source exchange.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link ListBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bindings")
        private java.util.List<Bindings> bindings;

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
        public java.util.List<Bindings> getBindings() {
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
            private java.util.List<Bindings> bindings; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * <p>The bindings.</p>
             */
            public Builder bindings(java.util.List<Bindings> bindings) {
                this.bindings = bindings;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
             * 
             * <strong>example:</strong>
             * <p>caebacccb2be03f84eb48b699f0a****</p>
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
