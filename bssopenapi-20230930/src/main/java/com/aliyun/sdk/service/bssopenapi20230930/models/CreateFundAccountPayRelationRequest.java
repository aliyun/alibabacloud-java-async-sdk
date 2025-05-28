// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateFundAccountPayRelationRequest} extends {@link RequestModel}
 *
 * <p>CreateFundAccountPayRelationRequest</p>
 */
public class CreateFundAccountPayRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fundAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private CreateFundAccountPayRelationRequest(Builder builder) {
        super(builder);
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.fundAccountId = builder.fundAccountId;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFundAccountPayRelationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return fundAccountId
     */
    public String getFundAccountId() {
        return this.fundAccountId;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    public static final class Builder extends Request.Builder<CreateFundAccountPayRelationRequest, Builder> {
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String fundAccountId; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(CreateFundAccountPayRelationRequest request) {
            super(request);
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.fundAccountId = request.fundAccountId;
            this.nbid = request.nbid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12332112</p>
         */
        public Builder fundAccountId(String fundAccountId) {
            this.putBodyParameter("FundAccountId", fundAccountId);
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public CreateFundAccountPayRelationRequest build() {
            return new CreateFundAccountPayRelationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFundAccountPayRelationRequest} extends {@link TeaModel}
     *
     * <p>CreateFundAccountPayRelationRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIds model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
}
