// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SeekVideoFileRequest} extends {@link RequestModel}
 *
 * <p>SeekVideoFileRequest</p>
 */
public class SeekVideoFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeekTimes")
    private Long seekTimes;

    private SeekVideoFileRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.calledNumber = builder.calledNumber;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.seekTimes = builder.seekTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SeekVideoFileRequest create() {
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
     * @return seekTimes
     */
    public Long getSeekTimes() {
        return this.seekTimes;
    }

    public static final class Builder extends Request.Builder<SeekVideoFileRequest, Builder> {
        private String callId; 
        private String calledNumber; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long seekTimes; 

        private Builder() {
            super();
        } 

        private Builder(SeekVideoFileRequest request) {
            super(request);
            this.callId = request.callId;
            this.calledNumber = request.calledNumber;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.seekTimes = request.seekTimes;
        } 

        /**
         * <p>呼叫唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>被叫号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
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
         * <p>快进或快退值，负数为快退，单位秒</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        public Builder seekTimes(Long seekTimes) {
            this.putQueryParameter("SeekTimes", seekTimes);
            this.seekTimes = seekTimes;
            return this;
        }

        @Override
        public SeekVideoFileRequest build() {
            return new SeekVideoFileRequest(this);
        } 

    } 

}
