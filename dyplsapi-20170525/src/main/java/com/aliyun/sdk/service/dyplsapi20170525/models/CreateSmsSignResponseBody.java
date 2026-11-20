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
 * {@link CreateSmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSmsSignResponseBody</p>
 */
public class CreateSmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateSmsSignResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSignResponseBody create() {
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
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateSmsSignResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned status code. Valid values:</p>
         * <ul>
         * <li><p>0000: The request is successful.</p>
         * </li>
         * <li><p>Other values: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The text message signature creation result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CalledNoSign&quot;:&quot;sign23343466&quot;}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><p>true: The request is successful.</p>
         * </li>
         * <li><p>false: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSmsSignResponseBody build() {
            return new CreateSmsSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSmsSignResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSmsSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNoSign")
        private String calledNoSign;

        private Data(Builder builder) {
            this.calledNoSign = builder.calledNoSign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return calledNoSign
         */
        public String getCalledNoSign() {
            return this.calledNoSign;
        }

        public static final class Builder {
            private String calledNoSign; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.calledNoSign = model.calledNoSign;
            } 

            /**
             * <p>The signature string of the recipient number. Append this string to the text message content to parse the actual called number.</p>
             * 
             * <strong>example:</strong>
             * <p>sign23343466</p>
             */
            public Builder calledNoSign(String calledNoSign) {
                this.calledNoSign = calledNoSign;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
