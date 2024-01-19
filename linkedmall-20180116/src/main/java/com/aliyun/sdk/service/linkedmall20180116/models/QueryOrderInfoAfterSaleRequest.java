// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderInfoAfterSaleRequest} extends {@link RequestModel}
 *
 * <p>QueryOrderInfoAfterSaleRequest</p>
 */
public class QueryOrderInfoAfterSaleRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ChannelUserId")
    @Validation(required = true)
    private String channelUserId;

    @Query
    @NameInMap("LmOrderId")
    @Validation(required = true)
    private String lmOrderId;

    @Query
    @NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @Query
    @NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private QueryOrderInfoAfterSaleRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizId = builder.bizId;
        this.channelUserId = builder.channelUserId;
        this.lmOrderId = builder.lmOrderId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderInfoAfterSaleRequest create() {
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
     * @return channelUserId
     */
    public String getChannelUserId() {
        return this.channelUserId;
    }

    /**
     * @return lmOrderId
     */
    public String getLmOrderId() {
        return this.lmOrderId;
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

    public static final class Builder extends Request.Builder<QueryOrderInfoAfterSaleRequest, Builder> {
        private String accountType; 
        private String bizId; 
        private String channelUserId; 
        private String lmOrderId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrderInfoAfterSaleRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizId = request.bizId;
            this.channelUserId = request.channelUserId;
            this.lmOrderId = request.lmOrderId;
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
         * ChannelUserId.
         */
        public Builder channelUserId(String channelUserId) {
            this.putQueryParameter("ChannelUserId", channelUserId);
            this.channelUserId = channelUserId;
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
        public QueryOrderInfoAfterSaleRequest build() {
            return new QueryOrderInfoAfterSaleRequest(this);
        } 

    } 

}
