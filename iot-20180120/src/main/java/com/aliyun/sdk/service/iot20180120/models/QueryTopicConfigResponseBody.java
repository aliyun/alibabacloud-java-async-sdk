// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryTopicConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTopicConfigResponseBody</p>
 */
public class QueryTopicConfigResponseBody extends TeaModel {
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

    private QueryTopicConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTopicConfigResponseBody create() {
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

        private Builder() {
        } 

        private Builder(QueryTopicConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public QueryTopicConfigResponseBody build() {
            return new QueryTopicConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTopicConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTopicConfigResponseBody</p>
     */
    public static class TopicConfigInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableBroadcast")
        private Boolean enableBroadcast;

        @com.aliyun.core.annotation.NameInMap("EnableProxySubscribe")
        private Boolean enableProxySubscribe;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("TopicFullName")
        private String topicFullName;

        private TopicConfigInfo(Builder builder) {
            this.codec = builder.codec;
            this.description = builder.description;
            this.enableBroadcast = builder.enableBroadcast;
            this.enableProxySubscribe = builder.enableProxySubscribe;
            this.operation = builder.operation;
            this.productKey = builder.productKey;
            this.topicFullName = builder.topicFullName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicConfigInfo create() {
            return builder().build();
        }

        /**
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableBroadcast
         */
        public Boolean getEnableBroadcast() {
            return this.enableBroadcast;
        }

        /**
         * @return enableProxySubscribe
         */
        public Boolean getEnableProxySubscribe() {
            return this.enableProxySubscribe;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return topicFullName
         */
        public String getTopicFullName() {
            return this.topicFullName;
        }

        public static final class Builder {
            private String codec; 
            private String description; 
            private Boolean enableBroadcast; 
            private Boolean enableProxySubscribe; 
            private String operation; 
            private String productKey; 
            private String topicFullName; 

            private Builder() {
            } 

            private Builder(TopicConfigInfo model) {
                this.codec = model.codec;
                this.description = model.description;
                this.enableBroadcast = model.enableBroadcast;
                this.enableProxySubscribe = model.enableProxySubscribe;
                this.operation = model.operation;
                this.productKey = model.productKey;
                this.topicFullName = model.topicFullName;
            } 

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableBroadcast.
             */
            public Builder enableBroadcast(Boolean enableBroadcast) {
                this.enableBroadcast = enableBroadcast;
                return this;
            }

            /**
             * EnableProxySubscribe.
             */
            public Builder enableProxySubscribe(Boolean enableProxySubscribe) {
                this.enableProxySubscribe = enableProxySubscribe;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * TopicFullName.
             */
            public Builder topicFullName(String topicFullName) {
                this.topicFullName = topicFullName;
                return this;
            }

            public TopicConfigInfo build() {
                return new TopicConfigInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTopicConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTopicConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicConfigInfo")
        private java.util.List<TopicConfigInfo> topicConfigInfo;

        private Data(Builder builder) {
            this.topicConfigInfo = builder.topicConfigInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return topicConfigInfo
         */
        public java.util.List<TopicConfigInfo> getTopicConfigInfo() {
            return this.topicConfigInfo;
        }

        public static final class Builder {
            private java.util.List<TopicConfigInfo> topicConfigInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.topicConfigInfo = model.topicConfigInfo;
            } 

            /**
             * TopicConfigInfo.
             */
            public Builder topicConfigInfo(java.util.List<TopicConfigInfo> topicConfigInfo) {
                this.topicConfigInfo = topicConfigInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
