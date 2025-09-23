// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link FaceGuardRiskRequest} extends {@link RequestModel}
 *
 * <p>FaceGuardRiskRequest</p>
 */
public class FaceGuardRiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceToken")
    private String deviceToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantBizId")
    private String merchantBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    private FaceGuardRiskRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.deviceToken = builder.deviceToken;
        this.merchantBizId = builder.merchantBizId;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceGuardRiskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return deviceToken
     */
    public String getDeviceToken() {
        return this.deviceToken;
    }

    /**
     * @return merchantBizId
     */
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<FaceGuardRiskRequest, Builder> {
        private String bizId; 
        private String deviceToken; 
        private String merchantBizId; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(FaceGuardRiskRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.deviceToken = request.deviceToken;
            this.merchantBizId = request.merchantBizId;
            this.productCode = request.productCode;
        } 

        /**
         * <p>The unique ID of the current business authentication. It is used with FACE_GUARD for verification during queries.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The deviceToken obtained from the client SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>Tk9SSUQuMS*****************ZDNmNWY5NzQxOW1o</p>
         */
        public Builder deviceToken(String deviceToken) {
            this.putQueryParameter("DeviceToken", deviceToken);
            this.deviceToken = deviceToken;
            return this;
        }

        /**
         * <p>A custom unique business identifier. It is used to locate and troubleshoot issues. The identifier can be a combination of letters and digits up to 32 characters long. Ensure that it is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>0c83ce0101d34eff886b1f7d1cdef67f</p>
         */
        public Builder merchantBizId(String merchantBizId) {
            this.putQueryParameter("MerchantBizId", merchantBizId);
            this.merchantBizId = merchantBizId;
            return this;
        }

        /**
         * <p>The product code. Set this to the static field <strong>FACE_GUARD</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_GUARD</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public FaceGuardRiskRequest build() {
            return new FaceGuardRiskRequest(this);
        } 

    } 

}
