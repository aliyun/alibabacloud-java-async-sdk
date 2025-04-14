// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
    private java.util.List<Module> module;

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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public java.util.List<Module> getModule() {
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
        private java.util.List<Module> module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryPhoneNoAByTrackNoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information returned after the phone numbers were bound.</p>
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPhoneNoAByTrackNoResponseBody build() {
            return new QueryPhoneNoAByTrackNoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPhoneNoAByTrackNoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPhoneNoAByTrackNoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Module model) {
                this.extension = model.extension;
                this.phoneNoA = model.phoneNoA;
                this.phoneNoX = model.phoneNoX;
            } 

            /**
             * <p>The extension of phone number X.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Phone number A.</p>
             * 
             * <strong>example:</strong>
             * <p>1310000****</p>
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * <p>The private number, that is, phone number X.</p>
             * 
             * <strong>example:</strong>
             * <p>1710000****</p>
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
