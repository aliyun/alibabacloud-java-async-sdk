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
 * {@link QueryPhoneNoAByTrackNoRequest} extends {@link RequestModel}
 *
 * <p>QueryPhoneNoAByTrackNoRequest</p>
 */
public class QueryPhoneNoAByTrackNoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CabinetNo")
    private String cabinetNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    private String phoneNoX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("trackNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trackNo;

    private QueryPhoneNoAByTrackNoRequest(Builder builder) {
        super(builder);
        this.cabinetNo = builder.cabinetNo;
        this.ownerId = builder.ownerId;
        this.phoneNoX = builder.phoneNoX;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trackNo = builder.trackNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPhoneNoAByTrackNoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cabinetNo
     */
    public String getCabinetNo() {
        return this.cabinetNo;
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
     * @return trackNo
     */
    public String getTrackNo() {
        return this.trackNo;
    }

    public static final class Builder extends Request.Builder<QueryPhoneNoAByTrackNoRequest, Builder> {
        private String cabinetNo; 
        private Long ownerId; 
        private String phoneNoX; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trackNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryPhoneNoAByTrackNoRequest request) {
            super(request);
            this.cabinetNo = request.cabinetNo;
            this.ownerId = request.ownerId;
            this.phoneNoX = request.phoneNoX;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trackNo = request.trackNo;
        } 

        /**
         * <p>The cabinet number.</p>
         * 
         * <strong>example:</strong>
         * <p>25689****</p>
         */
        public Builder cabinetNo(String cabinetNo) {
            this.putQueryParameter("CabinetNo", cabinetNo);
            this.cabinetNo = cabinetNo;
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
         * <p>Phone number X returned by the API operation for creating a binding.</p>
         * 
         * <strong>example:</strong>
         * <p>1710000****</p>
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
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
         * <p>The tracking number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22573****</p>
         */
        public Builder trackNo(String trackNo) {
            this.putQueryParameter("trackNo", trackNo);
            this.trackNo = trackNo;
            return this;
        }

        @Override
        public QueryPhoneNoAByTrackNoRequest build() {
            return new QueryPhoneNoAByTrackNoRequest(this);
        } 

    } 

}
