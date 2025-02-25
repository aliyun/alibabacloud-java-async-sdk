// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeMediaTypeRequest} extends {@link RequestModel}
 *
 * <p>ChangeMediaTypeRequest</p>
 */
public class ChangeMediaTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ChangeMediaTypeRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.calledNum = builder.calledNum;
        this.mediaType = builder.mediaType;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMediaTypeRequest create() {
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
     * @return calledNum
     */
    public String getCalledNum() {
        return this.calledNum;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
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

    public static final class Builder extends Request.Builder<ChangeMediaTypeRequest, Builder> {
        private String callId; 
        private String calledNum; 
        private String mediaType; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeMediaTypeRequest request) {
            super(request);
            this.callId = request.callId;
            this.calledNum = request.calledNum;
            this.mediaType = request.mediaType;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder calledNum(String calledNum) {
            this.putQueryParameter("CalledNum", calledNum);
            this.calledNum = calledNum;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
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

        @Override
        public ChangeMediaTypeRequest build() {
            return new ChangeMediaTypeRequest(this);
        } 

    } 

}
