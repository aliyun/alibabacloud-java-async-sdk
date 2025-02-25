// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link RenderH5OrderRequest} extends {@link RequestModel}
 *
 * <p>RenderH5OrderRequest</p>
 */
public class RenderH5OrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyOrderRequestModel")
    private String buyOrderRequestModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private RenderH5OrderRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.buyOrderRequestModel = builder.buyOrderRequestModel;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenderH5OrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return buyOrderRequestModel
     */
    public String getBuyOrderRequestModel() {
        return this.buyOrderRequestModel;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<RenderH5OrderRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String bizUid; 
        private String buyOrderRequestModel; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(RenderH5OrderRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.buyOrderRequestModel = request.buyOrderRequestModel;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * BizUid.
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * BuyOrderRequestModel.
         */
        public Builder buyOrderRequestModel(String buyOrderRequestModel) {
            this.putQueryParameter("BuyOrderRequestModel", buyOrderRequestModel);
            this.buyOrderRequestModel = buyOrderRequestModel;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public RenderH5OrderRequest build() {
            return new RenderH5OrderRequest(this);
        } 

    } 

}
