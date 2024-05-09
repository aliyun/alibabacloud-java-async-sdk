// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsureOrderApplyRequest} extends {@link RequestModel}
 *
 * <p>InsureOrderApplyRequest</p>
 */
public class InsureOrderApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ins_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String insOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
    private String outSubOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureOrderApplyRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.insOrderId = builder.insOrderId;
        this.isvName = builder.isvName;
        this.outOrderId = builder.outOrderId;
        this.outSubOrderId = builder.outSubOrderId;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureOrderApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return insOrderId
     */
    public String getInsOrderId() {
        return this.insOrderId;
    }

    /**
     * @return isvName
     */
    public String getIsvName() {
        return this.isvName;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outSubOrderId
     */
    public String getOutSubOrderId() {
        return this.outSubOrderId;
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

    public static final class Builder extends Request.Builder<InsureOrderApplyRequest, Builder> {
        private String btripUserId; 
        private String buyerName; 
        private String insOrderId; 
        private String isvName; 
        private String outOrderId; 
        private String outSubOrderId; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureOrderApplyRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.insOrderId = request.insOrderId;
            this.isvName = request.isvName;
            this.outOrderId = request.outOrderId;
            this.outSubOrderId = request.outSubOrderId;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * buyer_name.
         */
        public Builder buyerName(String buyerName) {
            this.putBodyParameter("buyer_name", buyerName);
            this.buyerName = buyerName;
            return this;
        }

        /**
         * ins_order_id.
         */
        public Builder insOrderId(String insOrderId) {
            this.putBodyParameter("ins_order_id", insOrderId);
            this.insOrderId = insOrderId;
            return this;
        }

        /**
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_sub_order_id.
         */
        public Builder outSubOrderId(String outSubOrderId) {
            this.putBodyParameter("out_sub_order_id", outSubOrderId);
            this.outSubOrderId = outSubOrderId;
            return this;
        }

        /**
         * supplier_code.
         */
        public Builder supplierCode(String supplierCode) {
            this.putBodyParameter("supplier_code", supplierCode);
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
        public InsureOrderApplyRequest build() {
            return new InsureOrderApplyRequest(this);
        } 

    } 

}
