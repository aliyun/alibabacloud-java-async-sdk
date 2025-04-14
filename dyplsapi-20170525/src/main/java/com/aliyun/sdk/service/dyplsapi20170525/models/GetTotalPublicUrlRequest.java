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
 * {@link GetTotalPublicUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTotalPublicUrlRequest</p>
 */
public class GetTotalPublicUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckSubs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean checkSubs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartnerKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String partnerKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GetTotalPublicUrlRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.callTime = builder.callTime;
        this.checkSubs = builder.checkSubs;
        this.ownerId = builder.ownerId;
        this.partnerKey = builder.partnerKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTotalPublicUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return callTime
     */
    public String getCallTime() {
        return this.callTime;
    }

    /**
     * @return checkSubs
     */
    public Boolean getCheckSubs() {
        return this.checkSubs;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return partnerKey
     */
    public String getPartnerKey() {
        return this.partnerKey;
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

    public static final class Builder extends Request.Builder<GetTotalPublicUrlRequest, Builder> {
        private String callId; 
        private String callTime; 
        private Boolean checkSubs; 
        private Long ownerId; 
        private String partnerKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetTotalPublicUrlRequest request) {
            super(request);
            this.callId = request.callId;
            this.callTime = request.callTime;
            this.checkSubs = request.checkSubs;
            this.ownerId = request.ownerId;
            this.partnerKey = request.partnerKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the call record.</p>
         * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view <strong>Call Record ID</strong> on the <strong>Call Record Query</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2568900****</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>The call initiation time in the call record.</p>
         * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. View <strong>Call Initiated At</strong> on the <strong>Call Record Query</strong> page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-05 12:00:00</p>
         */
        public Builder callTime(String callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
            return this;
        }

        /**
         * <p>Specifies whether the verification on the binding ID is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkSubs(Boolean checkSubs) {
            this.putQueryParameter("CheckSubs", checkSubs);
            this.checkSubs = checkSubs;
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
         * <p>FC12256****</p>
         */
        public Builder partnerKey(String partnerKey) {
            this.putQueryParameter("PartnerKey", partnerKey);
            this.partnerKey = partnerKey;
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
        public GetTotalPublicUrlRequest build() {
            return new GetTotalPublicUrlRequest(this);
        } 

    } 

}
