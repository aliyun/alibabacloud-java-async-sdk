// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryReimbursementOrderRequest} extends {@link RequestModel}
 *
 * <p>QueryReimbursementOrderRequest</p>
 */
public class QueryReimbursementOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reimb_order_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reimbOrderNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sub_corp_id")
    private String subCorpId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private QueryReimbursementOrderRequest(Builder builder) {
        super(builder);
        this.reimbOrderNo = builder.reimbOrderNo;
        this.subCorpId = builder.subCorpId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReimbursementOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reimbOrderNo
     */
    public String getReimbOrderNo() {
        return this.reimbOrderNo;
    }

    /**
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<QueryReimbursementOrderRequest, Builder> {
        private String reimbOrderNo; 
        private String subCorpId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryReimbursementOrderRequest request) {
            super(request);
            this.reimbOrderNo = request.reimbOrderNo;
            this.subCorpId = request.subCorpId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RT204396</p>
         */
        public Builder reimbOrderNo(String reimbOrderNo) {
            this.putQueryParameter("reimb_order_no", reimbOrderNo);
            this.reimbOrderNo = reimbOrderNo;
            return this;
        }

        /**
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
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
        public QueryReimbursementOrderRequest build() {
            return new QueryReimbursementOrderRequest(this);
        } 

    } 

}
