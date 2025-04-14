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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>返回状态码 0000表示成功 其他表示失败</p>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
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
         * <p>返回信息</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>返回是否成功 true  表示成功 false表示失败</p>
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
             * <p>短信接收者号码签名串(加到短信内容中供解析真实被叫号码)</p>
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
