// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTotalPublicUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTotalPublicUrlRequest</p>
 */
public class GetTotalPublicUrlRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("CallTime")
    @Validation(required = true)
    private String callTime;

    @Query
    @NameInMap("CheckSubs")
    @Validation(required = true)
    private Boolean checkSubs;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PartnerKey")
    @Validation(required = true)
    private String partnerKey;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
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
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * CallTime.
         */
        public Builder callTime(String callTime) {
            this.putQueryParameter("CallTime", callTime);
            this.callTime = callTime;
            return this;
        }

        /**
         * CheckSubs.
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
         * PartnerKey.
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
