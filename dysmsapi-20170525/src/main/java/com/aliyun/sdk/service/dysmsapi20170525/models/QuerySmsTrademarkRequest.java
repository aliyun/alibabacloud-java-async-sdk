// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsTrademarkRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsTrademarkRequest</p>
 */
public class QuerySmsTrademarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> trademarkIdList;

    private QuerySmsTrademarkRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trademarkIdList = builder.trademarkIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsTrademarkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return trademarkIdList
     */
    public java.util.List<Long> getTrademarkIdList() {
        return this.trademarkIdList;
    }

    public static final class Builder extends Request.Builder<QuerySmsTrademarkRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Long> trademarkIdList; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsTrademarkRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trademarkIdList = request.trademarkIdList;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>商标实体id列表</p>
         * <p>This parameter is required.</p>
         */
        public Builder trademarkIdList(java.util.List<Long> trademarkIdList) {
            String trademarkIdListShrink = shrink(trademarkIdList, "TrademarkIdList", "json");
            this.putQueryParameter("TrademarkIdList", trademarkIdListShrink);
            this.trademarkIdList = trademarkIdList;
            return this;
        }

        @Override
        public QuerySmsTrademarkRequest build() {
            return new QuerySmsTrademarkRequest(this);
        } 

    } 

}
