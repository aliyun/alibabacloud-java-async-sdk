// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link EncryptInvokeResponseBody} extends {@link TeaModel}
 *
 * <p>EncryptInvokeResponseBody</p>
 */
public class EncryptInvokeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EncryptInvokeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptInvokeResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EncryptInvokeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public EncryptInvokeResponseBody build() {
            return new EncryptInvokeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EncryptInvokeResponseBody} extends {@link TeaModel}
     *
     * <p>EncryptInvokeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("encryptData")
        private String encryptData;

        @com.aliyun.core.annotation.NameInMap("encryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("sign")
        private String sign;

        private Data(Builder builder) {
            this.encryptData = builder.encryptData;
            this.encryptKey = builder.encryptKey;
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return encryptData
         */
        public String getEncryptData() {
            return this.encryptData;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private String encryptData; 
            private String encryptKey; 
            private String sign; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.encryptData = model.encryptData;
                this.encryptKey = model.encryptKey;
                this.sign = model.sign;
            } 

            /**
             * encryptData.
             */
            public Builder encryptData(String encryptData) {
                this.encryptData = encryptData;
                return this;
            }

            /**
             * encryptKey.
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
