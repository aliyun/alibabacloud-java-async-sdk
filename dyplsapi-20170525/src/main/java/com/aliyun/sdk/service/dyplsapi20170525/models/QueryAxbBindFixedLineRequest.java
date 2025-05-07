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
 * {@link QueryAxbBindFixedLineRequest} extends {@link RequestModel}
 *
 * <p>QueryAxbBindFixedLineRequest</p>
 */
public class QueryAxbBindFixedLineRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

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
    @com.aliyun.core.annotation.NameInMap("TelX")
    private String telX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ts;

    private QueryAxbBindFixedLineRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.orderId = builder.orderId;
        this.ownerId = builder.ownerId;
        this.phone = builder.phone;
        this.queryType = builder.queryType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subId = builder.subId;
        this.telX = builder.telX;
        this.ts = builder.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAxbBindFixedLineRequest create() {
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
     * @return phone
     */
    public String getPhone() {
        return this.phone;
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
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    /**
     * @return ts
     */
    public String getTs() {
        return this.ts;
    }

    public static final class Builder extends Request.Builder<QueryAxbBindFixedLineRequest, Builder> {
        private String appId; 
        private String orderId; 
        private Long ownerId; 
        private String phone; 
        private String queryType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subId; 
        private String telX; 
        private String ts; 

        private Builder() {
            super();
        } 

        private Builder(QueryAxbBindFixedLineRequest request) {
            super(request);
            this.appId = request.appId;
            this.orderId = request.orderId;
            this.ownerId = request.ownerId;
            this.phone = request.phone;
            this.queryType = request.queryType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subId = request.subId;
            this.telX = request.telX;
            this.ts = request.ts;
        } 

        /**
         * <p>应用id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALPT_1234</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>业务id，消息请求标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3ererrrdrrrr</p>
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
         * <p>A/B号码，queryType=1时，必传</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>查询类型 0：根据绑定id查询 1：根据X和A/B号码查询</p>
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
         * <p>绑定id， queryType=0时，必传</p>
         * 
         * <strong>example:</strong>
         * <p>A20304o0200303004j</p>
         */
        public Builder subId(String subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        /**
         * <p>x号码，queryType=1时，必传</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        /**
         * <p>格式yyyyMMddHHmmssSSS，时间采用北京时间，24小时制，精确至毫秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20161114143116001</p>
         */
        public Builder ts(String ts) {
            this.putQueryParameter("Ts", ts);
            this.ts = ts;
            return this;
        }

        @Override
        public QueryAxbBindFixedLineRequest build() {
            return new QueryAxbBindFixedLineRequest(this);
        } 

    } 

}
