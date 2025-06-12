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
 * {@link DeviceRegisterRequest} extends {@link RequestModel}
 *
 * <p>DeviceRegisterRequest</p>
 */
public class DeviceRegisterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

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

    private DeviceRegisterRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.nonce = builder.nonce;
        this.requestTime = builder.requestTime;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceRegisterRequest create() {
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

    public static final class Builder extends Request.Builder<DeviceRegisterRequest, Builder> {
        private String appId; 
        private String nonce; 
        private String requestTime; 
        private String signature; 

        private Builder() {
            super();
        } 

        private Builder(DeviceRegisterRequest request) {
            super(request);
            this.appId = request.appId;
            this.nonce = request.nonce;
            this.requestTime = request.requestTime;
            this.signature = request.signature;
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
         * <p>2a64edd96296880f55aa61987b</p>
         */
        public Builder nonce(String nonce) {
            this.putBodyParameter("nonce", nonce);
            this.nonce = nonce;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestTime(String requestTime) {
            this.putBodyParameter("requestTime", requestTime);
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder signature(String signature) {
            this.putBodyParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        @Override
        public DeviceRegisterRequest build() {
            return new DeviceRegisterRequest(this);
        } 

    } 

}
