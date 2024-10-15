// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IntlFlightOtaItemDetailRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightOtaItemDetailRequest</p>
 */
public class IntlFlightOtaItemDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightOtaItemDetailRequest(Builder builder) {
        super(builder);
        this.otaItemId = builder.otaItemId;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.isvName = builder.isvName;
        this.language = builder.language;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOtaItemDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return buyerName
     */
    public String getBuyerName() {
        return this.buyerName;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return supplierCode
     */
    public String getSupplierCode() {
        return this.supplierCode;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightOtaItemDetailRequest, Builder> {
        private String otaItemId; 
        private String btripUserId; 
        private String buyerName; 
        private String isvName; 
        private String language; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightOtaItemDetailRequest request) {
            super(request);
            this.otaItemId = request.otaItemId;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.isvName = request.isvName;
            this.language = request.language;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d01eb358456b4ba38eb4d8f1499186da_0</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putPathParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
            return this;
        }

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putQueryParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putQueryParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putQueryParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * supplier_code.
         */
        public Builder supplierCode(String supplierCode) {
            this.putQueryParameter("supplier_code", supplierCode);
            this.supplierCode = supplierCode;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public IntlFlightOtaItemDetailRequest build() {
            return new IntlFlightOtaItemDetailRequest(this);
        } 

    } 

}
