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
 * {@link OperateBlackNoRequest} extends {@link RequestModel}
 *
 * <p>OperateBlackNoRequest</p>
 */
public class OperateBlackNoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tips")
    private String tips;

    private OperateBlackNoRequest(Builder builder) {
        super(builder);
        this.blackNo = builder.blackNo;
        this.operateType = builder.operateType;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tips = builder.tips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateBlackNoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackNo
     */
    public String getBlackNo() {
        return this.blackNo;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return tips
     */
    public String getTips() {
        return this.tips;
    }

    public static final class Builder extends Request.Builder<OperateBlackNoRequest, Builder> {
        private String blackNo; 
        private String operateType; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tips; 

        private Builder() {
            super();
        } 

        private Builder(OperateBlackNoRequest request) {
            super(request);
            this.blackNo = request.blackNo;
            this.operateType = request.operateType;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tips = request.tips;
        } 

        /**
         * <p>The phone number to be added to or deleted from the blacklist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        public Builder blackNo(String blackNo) {
            this.putQueryParameter("BlackNo", blackNo);
            this.blackNo = blackNo;
            return this;
        }

        /**
         * <p>The type of the operation on the phone number. Valid values:</p>
         * <ul>
         * <li><strong>AddBlack</strong>: adds the phone number to the blacklist.</li>
         * <li><strong>DeleteBlack</strong>: deletes the phone number from the blacklist.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AddBlack</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
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
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC123456****</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef</p>
         */
        public Builder tips(String tips) {
            this.putQueryParameter("Tips", tips);
            this.tips = tips;
            return this;
        }

        @Override
        public OperateBlackNoRequest build() {
            return new OperateBlackNoRequest(this);
        } 

    } 

}
