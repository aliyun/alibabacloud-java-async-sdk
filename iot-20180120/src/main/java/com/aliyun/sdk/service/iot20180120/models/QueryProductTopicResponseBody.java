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
 * {@link QueryProductTopicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductTopicResponseBody</p>
 */
public class QueryProductTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryProductTopicResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of topic categories returned if the call is successful. For more information, see <strong>ProductTopicInfo</strong>.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B953EAFF-CFF6-4FF8-BC94-8B89F018E4DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryProductTopicResponseBody build() {
            return new QueryProductTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductTopicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductTopicResponseBody</p>
     */
    public static class ProductTopicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Codec")
        private String codec;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EnableProxySubscribe")
        private Boolean enableProxySubscribe;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("TopicShortName")
        private String topicShortName;

        private ProductTopicInfo(Builder builder) {
            this.codec = builder.codec;
            this.desc = builder.desc;
            this.enableProxySubscribe = builder.enableProxySubscribe;
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
         * @return codec
         */
        public String getCodec() {
            return this.codec;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enableProxySubscribe
         */
        public Boolean getEnableProxySubscribe() {
            return this.enableProxySubscribe;
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
            private String codec; 
            private String desc; 
            private Boolean enableProxySubscribe; 
            private String id; 
            private String operation; 
            private String productKey; 
            private String topicShortName; 

            private Builder() {
            } 

            private Builder(ProductTopicInfo model) {
                this.codec = model.codec;
                this.desc = model.desc;
                this.enableProxySubscribe = model.enableProxySubscribe;
                this.id = model.id;
                this.operation = model.operation;
                this.productKey = model.productKey;
                this.topicShortName = model.topicShortName;
            } 

            /**
             * Codec.
             */
            public Builder codec(String codec) {
                this.codec = codec;
                return this;
            }

            /**
             * <p>The description of the topic category.</p>
             * 
             * <strong>example:</strong>
             * <p>topicDesc</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
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
             * <p>The ID of the topic category.</p>
             * 
             * <strong>example:</strong>
             * <p>821****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The operation that devices can perform on the topic category. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Publish.</li>
             * <li><strong>1</strong>: Subscribe.</li>
             * <li><strong>2</strong>: Publish and Subscribe.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The ProductKey of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>HMyB***</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The topic category that does not include the <em>productKey</em> and <em>deviceName</em> levels.</p>
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
    /**
     * 
     * {@link QueryProductTopicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductTopicInfo")
        private java.util.List<ProductTopicInfo> productTopicInfo;

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
        public java.util.List<ProductTopicInfo> getProductTopicInfo() {
            return this.productTopicInfo;
        }

        public static final class Builder {
            private java.util.List<ProductTopicInfo> productTopicInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.productTopicInfo = model.productTopicInfo;
            } 

            /**
             * ProductTopicInfo.
             */
            public Builder productTopicInfo(java.util.List<ProductTopicInfo> productTopicInfo) {
                this.productTopicInfo = productTopicInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
