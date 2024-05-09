// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsureOrderCancelRequest} extends {@link RequestModel}
 *
 * <p>InsureOrderCancelRequest</p>
 */
public class InsureOrderCancelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ins_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String insOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureOrderCancelRequest(Builder builder) {
        super(builder);
        this.insOrderId = builder.insOrderId;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.isvName = builder.isvName;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureOrderCancelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insOrderId
     */
    public String getInsOrderId() {
        return this.insOrderId;
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

    public static final class Builder extends Request.Builder<InsureOrderCancelRequest, Builder> {
        private String insOrderId; 
        private String btripUserId; 
        private String buyerName; 
        private String isvName; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureOrderCancelRequest request) {
            super(request);
            this.insOrderId = request.insOrderId;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.isvName = request.isvName;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * ins_order_id.
         */
        public Builder insOrderId(String insOrderId) {
            this.putPathParameter("ins_order_id", insOrderId);
            this.insOrderId = insOrderId;
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
        public InsureOrderCancelRequest build() {
            return new InsureOrderCancelRequest(this);
        } 

    } 

}
