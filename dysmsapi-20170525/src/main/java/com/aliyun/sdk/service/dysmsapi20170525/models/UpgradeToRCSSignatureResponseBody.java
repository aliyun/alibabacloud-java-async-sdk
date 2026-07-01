// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link UpgradeToRCSSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeToRCSSignatureResponseBody</p>
 */
public class UpgradeToRCSSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private UpgradeToRCSSignatureResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeToRCSSignatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpgradeToRCSSignatureResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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

        public UpgradeToRCSSignatureResponseBody build() {
            return new UpgradeToRCSSignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeToRCSSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeToRCSSignatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChatbotCode")
        private String chatbotCode;

        @com.aliyun.core.annotation.NameInMap("SignId")
        private Long signId;

        private Data(Builder builder) {
            this.chatbotCode = builder.chatbotCode;
            this.signId = builder.signId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chatbotCode
         */
        public String getChatbotCode() {
            return this.chatbotCode;
        }

        /**
         * @return signId
         */
        public Long getSignId() {
            return this.signId;
        }

        public static final class Builder {
            private String chatbotCode; 
            private Long signId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chatbotCode = model.chatbotCode;
                this.signId = model.signId;
            } 

            /**
             * ChatbotCode.
             */
            public Builder chatbotCode(String chatbotCode) {
                this.chatbotCode = chatbotCode;
                return this;
            }

            /**
             * SignId.
             */
            public Builder signId(Long signId) {
                this.signId = signId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
