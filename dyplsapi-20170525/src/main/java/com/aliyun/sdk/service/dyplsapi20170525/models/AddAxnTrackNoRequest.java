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
 * {@link AddAxnTrackNoRequest} extends {@link RequestModel}
 *
 * <p>AddAxnTrackNoRequest</p>
 */
public class AddAxnTrackNoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoX;

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
    @com.aliyun.core.annotation.NameInMap("SubsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trackNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trackNo;

    private AddAxnTrackNoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subsId = builder.subsId;
        this.trackNo = builder.trackNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAxnTrackNoRequest create() {
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
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
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
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    /**
     * @return trackNo
     */
    public String getTrackNo() {
        return this.trackNo;
    }

    public static final class Builder extends Request.Builder<AddAxnTrackNoRequest, Builder> {
        private Long ownerId; 
        private String phoneNoX; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subsId; 
        private String trackNo; 

        private Builder() {
            super();
        } 

        private Builder(AddAxnTrackNoRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.phoneNoX = request.phoneNoX;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subsId = request.subsId;
            this.trackNo = request.trackNo;
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
         * <p>The private number in the AXN binding, that is, phone number X.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/110258.html">BindAxn</a> operation to obtain the value of PhoneNoX.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000****</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC2235****</p>
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
         * <p>The binding ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/110258.html">BindAxn</a> operation to obtain the value of SubsId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15678890****</p>
         */
        public Builder subsId(String subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        /**
         * <p>The tracking number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde*****</p>
         */
        public Builder trackNo(String trackNo) {
            this.putQueryParameter("trackNo", trackNo);
            this.trackNo = trackNo;
            return this;
        }

        @Override
        public AddAxnTrackNoRequest build() {
            return new AddAxnTrackNoRequest(this);
        } 

    } 

}
