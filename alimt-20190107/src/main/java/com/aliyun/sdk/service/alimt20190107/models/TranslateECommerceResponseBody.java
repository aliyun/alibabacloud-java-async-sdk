// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20190107.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateECommerceResponseBody} extends {@link TeaModel}
 *
 * <p>TranslateECommerceResponseBody</p>
 */
public class TranslateECommerceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private TranslateECommerceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TranslateECommerceResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public TranslateECommerceResponseBody build() {
            return new TranslateECommerceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Translated")
        private String translated;

        private Data(Builder builder) {
            this.translated = builder.translated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return translated
         */
        public String getTranslated() {
            return this.translated;
        }

        public static final class Builder {
            private String translated; 

            /**
             * Translated.
             */
            public Builder translated(String translated) {
                this.translated = translated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
