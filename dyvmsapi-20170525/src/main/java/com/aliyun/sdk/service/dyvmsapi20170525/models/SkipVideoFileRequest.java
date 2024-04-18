// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipVideoFileRequest} extends {@link RequestModel}
 *
 * <p>SkipVideoFileRequest</p>
 */
public class SkipVideoFileRequest extends Request {
    @Query
    @NameInMap("CallId")
    private String callId;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SkipTimes")
    @Validation(required = true)
    private Long skipTimes;

    private SkipVideoFileRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.calledNumber = builder.calledNumber;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.skipTimes = builder.skipTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipVideoFileRequest create() {
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
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return skipTimes
     */
    public Long getSkipTimes() {
        return this.skipTimes;
    }

    public static final class Builder extends Request.Builder<SkipVideoFileRequest, Builder> {
        private String callId; 
        private String calledNumber; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long skipTimes; 

        private Builder() {
            super();
        } 

        private Builder(SkipVideoFileRequest request) {
            super(request);
            this.callId = request.callId;
            this.calledNumber = request.calledNumber;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.skipTimes = request.skipTimes;
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
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * SkipTimes.
         */
        public Builder skipTimes(Long skipTimes) {
            this.putQueryParameter("SkipTimes", skipTimes);
            this.skipTimes = skipTimes;
            return this;
        }

        @Override
        public SkipVideoFileRequest build() {
            return new SkipVideoFileRequest(this);
        } 

    } 

}
