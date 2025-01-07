// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link InsureRefundDetailRequest} extends {@link RequestModel}
 *
 * <p>InsureRefundDetailRequest</p>
 */
public class InsureRefundDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    private String applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ins_order_id")
    private String insOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_apply_id")
    private String outApplyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureRefundDetailRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.insOrderId = builder.insOrderId;
        this.isvName = builder.isvName;
        this.outApplyId = builder.outApplyId;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureRefundDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public String getApplyId() {
        return this.applyId;
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
     * @return outApplyId
     */
    public String getOutApplyId() {
        return this.outApplyId;
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

    public static final class Builder extends Request.Builder<InsureRefundDetailRequest, Builder> {
        private String applyId; 
        private String btripUserId; 
        private String buyerName; 
        private String insOrderId; 
        private String isvName; 
        private String outApplyId; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureRefundDetailRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.insOrderId = request.insOrderId;
            this.isvName = request.isvName;
            this.outApplyId = request.outApplyId;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(String applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
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
         * ins_order_id.
         */
        public Builder insOrderId(String insOrderId) {
            this.putQueryParameter("ins_order_id", insOrderId);
            this.insOrderId = insOrderId;
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
         * out_apply_id.
         */
        public Builder outApplyId(String outApplyId) {
            this.putQueryParameter("out_apply_id", outApplyId);
            this.outApplyId = outApplyId;
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
        public InsureRefundDetailRequest build() {
            return new InsureRefundDetailRequest(this);
        } 

    } 

}
