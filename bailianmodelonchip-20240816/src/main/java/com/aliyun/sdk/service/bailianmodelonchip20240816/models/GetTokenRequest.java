// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link GetTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTokenRequest</p>
 */
public class GetTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nonce;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tokenKey")
    private String tokenKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tokenType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tokenType;

    private GetTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deviceName = builder.deviceName;
        this.nonce = builder.nonce;
        this.requestTime = builder.requestTime;
        this.signature = builder.signature;
        this.tokenKey = builder.tokenKey;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return nonce
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * @return requestTime
     */
    public String getRequestTime() {
        return this.requestTime;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return tokenKey
     */
    public String getTokenKey() {
        return this.tokenKey;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<GetTokenRequest, Builder> {
        private String appId; 
        private String deviceName; 
        private String nonce; 
        private String requestTime; 
        private String signature; 
        private String tokenKey; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.deviceName = request.deviceName;
            this.nonce = request.nonce;
            this.requestTime = request.requestTime;
            this.signature = request.signature;
            this.tokenKey = request.tokenKey;
            this.tokenType = request.tokenType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2a64edd96296880f55aa61987b</p>
         */
        public Builder nonce(String nonce) {
            this.putBodyParameter("nonce", nonce);
            this.nonce = nonce;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1748413148546</p>
         */
        public Builder requestTime(String requestTime) {
            this.putBodyParameter("requestTime", requestTime);
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5/Smm8gnDSgZY2Blftq9eGYpVnpYCztoLJaJfhlH7id0lNlQxydRLtjUkGPr1qdbQq+oUn6Y1h0KJUdk0rf4am3MzdNr/Uhc47c8bbXnV8SlIC0agGo5skEQZNObzUD+sFxt8uN35/FYf7YRC8R61xY7+NPN2NLJrA/DPhewtVRRgAbb8RjergTcIG6oN1XTzLyC+76Az/3o2dPCxTfMXG3AFQc=</p>
         */
        public Builder signature(String signature) {
            this.putBodyParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * tokenKey.
         */
        public Builder tokenKey(String tokenKey) {
            this.putBodyParameter("tokenKey", tokenKey);
            this.tokenKey = tokenKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder tokenType(String tokenType) {
            this.putBodyParameter("tokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public GetTokenRequest build() {
            return new GetTokenRequest(this);
        } 

    } 

}
