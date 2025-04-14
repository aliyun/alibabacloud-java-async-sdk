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
 * {@link GetXConfigRequest} extends {@link RequestModel}
 *
 * <p>GetXConfigRequest</p>
 */
public class GetXConfigRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telX;

    private GetXConfigRequest(Builder builder) {
        super(builder);
        this.callerParentId = builder.callerParentId;
        this.customerPoolKey = builder.customerPoolKey;
        this.ownerId = builder.ownerId;
        this.reqId = builder.reqId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.telX = builder.telX;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetXConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return telX
     */
    public String getTelX() {
        return this.telX;
    }

    public static final class Builder extends Request.Builder<GetXConfigRequest, Builder> {
        private Long callerParentId; 
        private String customerPoolKey; 
        private Long ownerId; 
        private String reqId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String telX; 

        private Builder() {
            super();
        } 

        private Builder(GetXConfigRequest request) {
            super(request);
            this.callerParentId = request.callerParentId;
            this.customerPoolKey = request.customerPoolKey;
            this.ownerId = request.ownerId;
            this.reqId = request.reqId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.telX = request.telX;
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

        /**
         * <p>X号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17*******22</p>
         */
        public Builder telX(String telX) {
            this.putQueryParameter("TelX", telX);
            this.telX = telX;
            return this;
        }

        @Override
        public GetXConfigRequest build() {
            return new GetXConfigRequest(this);
        } 

    } 

}
