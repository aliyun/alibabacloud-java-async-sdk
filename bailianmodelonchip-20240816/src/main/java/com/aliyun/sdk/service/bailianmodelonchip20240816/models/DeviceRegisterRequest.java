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
    @com.aliyun.core.annotation.NameInMap("nonce")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nonce;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("requestTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signature;

    private DeviceRegisterRequest(Builder builder) {
        super(builder);
        this.nonce = builder.nonce;
        this.productKey = builder.productKey;
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
     * @return nonce
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
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
        private String nonce; 
        private String productKey; 
        private String requestTime; 
        private String signature; 

        private Builder() {
            super();
        } 

        private Builder(DeviceRegisterRequest request) {
            super(request);
            this.nonce = request.nonce;
            this.productKey = request.productKey;
            this.requestTime = request.requestTime;
            this.signature = request.signature;
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
         * <p>el3SzmCU2p0x4RBc</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1748312544852</p>
         */
        public Builder requestTime(String requestTime) {
            this.putQueryParameter("requestTime", requestTime);
            this.requestTime = requestTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3spKwUgUpAGsXbbrHKnpVJPlI9wamoyhh96uqJuSyCKyJ7oscLAHRcz15dSzLG5L+ywFgYXSQNqdRtsn/Ri0j7pD0IuoKt9R7EnNo/U6viPvWD3Ldp3ehDDtOFtSrpUg6LTedvGtUWYU4x/zSD2jgCXijEdZCCMGCypcheMHRXfInYWF1xFtnCEXJfxtrBrnCk1p/pW3JSmdHJzmInnUEO3dWbNe3A==</p>
         */
        public Builder signature(String signature) {
            this.putQueryParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        @Override
        public DeviceRegisterRequest build() {
            return new DeviceRegisterRequest(this);
        } 

    } 

}
