// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductTopicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductTopicResponseBody</p>
 */
public class QueryProductTopicResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryProductTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductTopicResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryProductTopicResponseBody build() {
            return new QueryProductTopicResponseBody(this);
        } 

    } 

    public static class ProductTopicInfo extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Id")
        private String id;

        @NameInMap("Operation")
        private String operation;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("TopicShortName")
        private String topicShortName;

        private ProductTopicInfo(Builder builder) {
            this.desc = builder.desc;
            this.id = builder.id;
            this.operation = builder.operation;
            this.productKey = builder.productKey;
            this.topicShortName = builder.topicShortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductTopicInfo create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return topicShortName
         */
        public String getTopicShortName() {
            return this.topicShortName;
        }

        public static final class Builder {
            private String desc; 
            private String id; 
            private String operation; 
            private String productKey; 
            private String topicShortName; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * TopicShortName.
             */
            public Builder topicShortName(String topicShortName) {
                this.topicShortName = topicShortName;
                return this;
            }

            public ProductTopicInfo build() {
                return new ProductTopicInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ProductTopicInfo")
        private java.util.List < ProductTopicInfo> productTopicInfo;

        private Data(Builder builder) {
            this.productTopicInfo = builder.productTopicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return productTopicInfo
         */
        public java.util.List < ProductTopicInfo> getProductTopicInfo() {
            return this.productTopicInfo;
        }

        public static final class Builder {
            private java.util.List < ProductTopicInfo> productTopicInfo; 

            /**
             * ProductTopicInfo.
             */
            public Builder productTopicInfo(java.util.List < ProductTopicInfo> productTopicInfo) {
                this.productTopicInfo = productTopicInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
