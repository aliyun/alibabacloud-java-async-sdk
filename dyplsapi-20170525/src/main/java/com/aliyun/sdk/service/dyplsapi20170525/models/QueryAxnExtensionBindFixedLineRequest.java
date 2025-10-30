// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QueryAxnExtensionBindFixedLineRequest} extends {@link RequestModel}
 *
 * <p>QueryAxnExtensionBindFixedLineRequest</p>
 */
public class QueryAxnExtensionBindFixedLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubId")
    private String subId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private QueryAxnExtensionBindFixedLineRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.queryType = builder.queryType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subId = builder.subId;
        this.telA = builder.telA;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAxnExtensionBindFixedLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
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
     * @return subId
     */
    public String getSubId() {
        return this.subId;
    }

    /**
     * @return telA
     */
    public String getTelA() {
        return this.telA;
    }

    /**
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<QueryAxnExtensionBindFixedLineRequest, Builder> {
        private String appId; 
        private String orderId; 
        private Long ownerId; 
        private String queryType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subId; 
        private String telA; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(QueryAxnExtensionBindFixedLineRequest request) {
            super(request);
            this.appId = request.appId;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.queryType = request.queryType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subId = request.subId;
            this.telA = request.telA;
            this.ts = request.ts;
        } 

        /**
         * <p>号池ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alitest</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>消息请求唯一标识。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345dkwkd99d</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
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
         * <p>查询类型。取值： 0：根据绑定ID查询。1：根据X和A/B号码查询</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
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
         * <p>绑定ID。QueryType参数为0时必传。</p>
         * 
         * <strong>example:</strong>
         * <p>A203**************</p>
         */
        public Builder subId(String subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        /**
         * <p>A号码。QueryType参数为1时必传。</p>
         * 
         * <strong>example:</strong>
         * <p>15500001111</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20250421141723098</p>
         */
        public Builder ts(String ts) {
            this.putQueryParameter("Ts", ts);
            this.ts = ts;
            return this;
        }

        @Override
        public QueryAxnExtensionBindFixedLineRequest build() {
            return new QueryAxnExtensionBindFixedLineRequest(this);
        } 

    } 

}
