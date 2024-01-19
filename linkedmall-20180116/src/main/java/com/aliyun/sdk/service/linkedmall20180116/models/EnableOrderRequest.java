// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableOrderRequest} extends {@link RequestModel}
 *
 * <p>EnableOrderRequest</p>
 */
public class EnableOrderRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizUid")
    @Validation(required = true)
    private String bizUid;

    @Query
    @NameInMap("ExtJson")
    private String extJson;

    @Query
    @NameInMap("LmOrderId")
    private String lmOrderId;

    @Query
    @NameInMap("OutTradeId")
    @Validation(required = true)
    private String outTradeId;

    @Query
    @NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @Query
    @NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private EnableOrderRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.extJson = builder.extJson;
        this.lmOrderId = builder.lmOrderId;
        this.outTradeId = builder.outTradeId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableOrderRequest create() {
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
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return lmOrderId
     */
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    /**
     * @return outTradeId
     */
    public String getOutTradeId() {
        return this.outTradeId;
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

    public static final class Builder extends Request.Builder<EnableOrderRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String bizUid; 
        private String extJson; 
        private String lmOrderId; 
        private String outTradeId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(EnableOrderRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.extJson = request.extJson;
            this.lmOrderId = request.lmOrderId;
            this.outTradeId = request.outTradeId;
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
         * BizId.
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
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * LmOrderId.
         */
        public Builder lmOrderId(String lmOrderId) {
            this.putQueryParameter("LmOrderId", lmOrderId);
            this.lmOrderId = lmOrderId;
            return this;
        }

        /**
         * OutTradeId.
         */
        public Builder outTradeId(String outTradeId) {
            this.putQueryParameter("OutTradeId", outTradeId);
            this.outTradeId = outTradeId;
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
        public EnableOrderRequest build() {
            return new EnableOrderRequest(this);
        } 

    } 

}
