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
 * {@link InsureOrderRefundRequest} extends {@link RequestModel}
 *
 * <p>InsureOrderRefundRequest</p>
 */
public class InsureOrderRefundRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ins_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String insOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buyer_name")
    private String buyerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isv_name")
    private String isvName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_apply_id")
    private String outApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policy_no_list")
    private java.util.List<String> policyNoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sub_ins_order_ids")
    private java.util.List<String> subInsOrderIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("supplier_code")
    private String supplierCode;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private InsureOrderRefundRequest(Builder builder) {
        super(builder);
        this.insOrderId = builder.insOrderId;
        this.btripUserId = builder.btripUserId;
        this.buyerName = builder.buyerName;
        this.isvName = builder.isvName;
        this.outApplyId = builder.outApplyId;
        this.policyNoList = builder.policyNoList;
        this.subInsOrderIds = builder.subInsOrderIds;
        this.supplierCode = builder.supplierCode;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsureOrderRefundRequest create() {
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
     * @return outApplyId
     */
    public String getOutApplyId() {
        return this.outApplyId;
    }

    /**
     * @return policyNoList
     */
    public java.util.List<String> getPolicyNoList() {
        return this.policyNoList;
    }

    /**
     * @return subInsOrderIds
     */
    public java.util.List<String> getSubInsOrderIds() {
        return this.subInsOrderIds;
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

    public static final class Builder extends Request.Builder<InsureOrderRefundRequest, Builder> {
        private String insOrderId; 
        private String btripUserId; 
        private String buyerName; 
        private String isvName; 
        private String outApplyId; 
        private java.util.List<String> policyNoList; 
        private java.util.List<String> subInsOrderIds; 
        private String supplierCode; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(InsureOrderRefundRequest request) {
            super(request);
            this.insOrderId = request.insOrderId;
            this.btripUserId = request.btripUserId;
            this.buyerName = request.buyerName;
            this.isvName = request.isvName;
            this.outApplyId = request.outApplyId;
            this.policyNoList = request.policyNoList;
            this.subInsOrderIds = request.subInsOrderIds;
            this.supplierCode = request.supplierCode;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
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
         * isv_name.
         */
        public Builder isvName(String isvName) {
            this.putBodyParameter("isv_name", isvName);
            this.isvName = isvName;
            return this;
        }

        /**
         * out_apply_id.
         */
        public Builder outApplyId(String outApplyId) {
            this.putBodyParameter("out_apply_id", outApplyId);
            this.outApplyId = outApplyId;
            return this;
        }

        /**
         * policy_no_list.
         */
        public Builder policyNoList(java.util.List<String> policyNoList) {
            String policyNoListShrink = shrink(policyNoList, "policy_no_list", "json");
            this.putBodyParameter("policy_no_list", policyNoListShrink);
            this.policyNoList = policyNoList;
            return this;
        }

        /**
         * sub_ins_order_ids.
         */
        public Builder subInsOrderIds(java.util.List<String> subInsOrderIds) {
            String subInsOrderIdsShrink = shrink(subInsOrderIds, "sub_ins_order_ids", "json");
            this.putBodyParameter("sub_ins_order_ids", subInsOrderIdsShrink);
            this.subInsOrderIds = subInsOrderIds;
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
        public InsureOrderRefundRequest build() {
            return new InsureOrderRefundRequest(this);
        } 

    } 

}
