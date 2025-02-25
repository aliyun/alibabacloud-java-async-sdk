// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190102.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMtConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>ListMtConnectorResponseBody</p>
 */
public class ListMtConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("bizErrorCode")
    private Long bizErrorCode;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ListMtConnectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.bizErrorCode = builder.bizErrorCode;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMtConnectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return bizErrorCode
     */
    public Long getBizErrorCode() {
        return this.bizErrorCode;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Long bizErrorCode; 
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * bizErrorCode.
         */
        public Builder bizErrorCode(Long bizErrorCode) {
            this.bizErrorCode = bizErrorCode;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ListMtConnectorResponseBody build() {
            return new ListMtConnectorResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Data(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
