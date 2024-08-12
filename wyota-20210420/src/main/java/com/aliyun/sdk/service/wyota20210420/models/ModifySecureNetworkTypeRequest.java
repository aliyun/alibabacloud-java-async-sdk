// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecureNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifySecureNetworkTypeRequest</p>
 */
public class ModifySecureNetworkTypeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecureNetworkType")
    private String secureNetworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNo;

    private ModifySecureNetworkTypeRequest(Builder builder) {
        super(builder);
        this.secureNetworkType = builder.secureNetworkType;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecureNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return secureNetworkType
     */
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<ModifySecureNetworkTypeRequest, Builder> {
        private String secureNetworkType; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecureNetworkTypeRequest request) {
            super(request);
            this.secureNetworkType = request.secureNetworkType;
            this.serialNo = request.serialNo;
        } 

        /**
         * SecureNetworkType.
         */
        public Builder secureNetworkType(String secureNetworkType) {
            this.putBodyParameter("SecureNetworkType", secureNetworkType);
            this.secureNetworkType = secureNetworkType;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public ModifySecureNetworkTypeRequest build() {
            return new ModifySecureNetworkTypeRequest(this);
        } 

    } 

}
