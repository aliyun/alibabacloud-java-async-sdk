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
 * {@link EncryptInvokeRequest} extends {@link RequestModel}
 *
 * <p>EncryptInvokeRequest</p>
 */
public class EncryptInvokeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encryptKey")
    private String encryptKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("methodName")
    private String methodName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sign")
    private String sign;

    private EncryptInvokeRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.data = builder.data;
        this.encryptKey = builder.encryptKey;
        this.methodName = builder.methodName;
        this.sign = builder.sign;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptInvokeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return encryptKey
     */
    public String getEncryptKey() {
        return this.encryptKey;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    public static final class Builder extends Request.Builder<EncryptInvokeRequest, Builder> {
        private Long clientId; 
        private String data; 
        private String encryptKey; 
        private String methodName; 
        private String sign; 

        private Builder() {
            super();
        } 

        private Builder(EncryptInvokeRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.data = request.data;
            this.encryptKey = request.encryptKey;
            this.methodName = request.methodName;
            this.sign = request.sign;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(String data) {
            this.putBodyParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * encryptKey.
         */
        public Builder encryptKey(String encryptKey) {
            this.putBodyParameter("encryptKey", encryptKey);
            this.encryptKey = encryptKey;
            return this;
        }

        /**
         * methodName.
         */
        public Builder methodName(String methodName) {
            this.putBodyParameter("methodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * sign.
         */
        public Builder sign(String sign) {
            this.putBodyParameter("sign", sign);
            this.sign = sign;
            return this;
        }

        @Override
        public EncryptInvokeRequest build() {
            return new EncryptInvokeRequest(this);
        } 

    } 

}
