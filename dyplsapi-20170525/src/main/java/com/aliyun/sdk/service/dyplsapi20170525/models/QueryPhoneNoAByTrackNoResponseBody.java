// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPhoneNoAByTrackNoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPhoneNoAByTrackNoResponseBody</p>
 */
public class QueryPhoneNoAByTrackNoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Module")
    private java.util.List < Module> module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPhoneNoAByTrackNoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPhoneNoAByTrackNoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < Module> module; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other status codes indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
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
         * The information returned after the phone numbers were bound.
         */
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPhoneNoAByTrackNoResponseBody build() {
            return new QueryPhoneNoAByTrackNoResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("PhoneNoA")
        private String phoneNoA;

        @com.aliyun.core.annotation.NameInMap("PhoneNoX")
        private String phoneNoX;

        private Module(Builder builder) {
            this.extension = builder.extension;
            this.phoneNoA = builder.phoneNoA;
            this.phoneNoX = builder.phoneNoX;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return phoneNoA
         */
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        /**
         * @return phoneNoX
         */
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public static final class Builder {
            private String extension; 
            private String phoneNoA; 
            private String phoneNoX; 

            /**
             * The extension of phone number X.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Phone number A.
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * The private number, that is, phone number X.
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
