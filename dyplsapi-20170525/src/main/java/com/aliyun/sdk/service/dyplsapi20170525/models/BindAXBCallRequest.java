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
 * {@link BindAXBCallRequest} extends {@link RequestModel}
 *
 * <p>BindAXBCallRequest</p>
 */
public class BindAXBCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerPoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerPoolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expiration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private BindAXBCallRequest(Builder builder) {
        super(builder);
        this.authId = builder.authId;
        this.callerParentId = builder.callerParentId;
        this.customerPoolKey = builder.customerPoolKey;
        this.expiration = builder.expiration;
        this.ownerId = builder.ownerId;
        this.reqId = builder.reqId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.telA = builder.telA;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAXBCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authId
     */
    public String getAuthId() {
        return this.authId;
    }

    /**
     * @return callerParentId
     */
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    /**
     * @return customerPoolKey
     */
    public String getCustomerPoolKey() {
        return this.customerPoolKey;
    }

    /**
     * @return expiration
     */
    public Long getExpiration() {
        return this.expiration;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
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
     * @return telA
     */
    public String getTelA() {
        return this.telA;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<BindAXBCallRequest, Builder> {
        private String authId; 
        private Long callerParentId; 
        private String customerPoolKey; 
        private Long expiration; 
        private Long ownerId; 
        private String reqId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String telA; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(BindAXBCallRequest request) {
            super(request);
            this.authId = request.authId;
            this.callerParentId = request.callerParentId;
            this.customerPoolKey = request.customerPoolKey;
            this.expiration = request.expiration;
            this.ownerId = request.ownerId;
            this.reqId = request.reqId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.telA = request.telA;
            this.userData = request.userData;
        } 

        /**
         * <p>authId绑定关系BX唯一id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12353</p>
         */
        public Builder authId(String authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * <p>客户uid</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder callerParentId(Long callerParentId) {
            this.putQueryParameter("CallerParentId", callerParentId);
            this.callerParentId = callerParentId;
            return this;
        }

        /**
         * <p>号码池key</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC5**********************a1a</p>
         */
        public Builder customerPoolKey(String customerPoolKey) {
            this.putQueryParameter("CustomerPoolKey", customerPoolKey);
            this.customerPoolKey = customerPoolKey;
            return this;
        }

        /**
         * <p>绑定关系过期失效时间： 取值必须大于0； 单位：秒，ct_time + expiration = 自动解绑时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        public Builder expiration(Long expiration) {
            this.putQueryParameter("Expiration", expiration);
            this.expiration = expiration;
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
         * <p>请求去重ID, reqId最大长度为20位,接入方需要保持原子性</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>564**********879</p>
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
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
         * <p>客户A号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13*******43</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>客户自定义参数回调带回</p>
         * 
         * <strong>example:</strong>
         * <p>000</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public BindAXBCallRequest build() {
            return new BindAXBCallRequest(this);
        } 

    } 

}
