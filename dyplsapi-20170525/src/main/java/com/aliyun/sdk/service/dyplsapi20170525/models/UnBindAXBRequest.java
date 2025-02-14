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
 * {@link UnBindAXBRequest} extends {@link RequestModel}
 *
 * <p>UnBindAXBRequest</p>
 */
public class UnBindAXBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerPoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerPoolKey;

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

    private UnBindAXBRequest(Builder builder) {
        super(builder);
        this.bindId = builder.bindId;
        this.callerParentId = builder.callerParentId;
        this.customerPoolKey = builder.customerPoolKey;
        this.ownerId = builder.ownerId;
        this.reqId = builder.reqId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnBindAXBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindId
     */
    public String getBindId() {
        return this.bindId;
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

    public static final class Builder extends Request.Builder<UnBindAXBRequest, Builder> {
        private String bindId; 
        private Long callerParentId; 
        private String customerPoolKey; 
        private Long ownerId; 
        private String reqId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UnBindAXBRequest request) {
            super(request);
            this.bindId = request.bindId;
            this.callerParentId = request.callerParentId;
            this.customerPoolKey = request.customerPoolKey;
            this.ownerId = request.ownerId;
            this.reqId = request.reqId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>bindId绑定关系AXB唯一id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4534543</p>
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
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

        @Override
        public UnBindAXBRequest build() {
            return new UnBindAXBRequest(this);
        } 

    } 

}
