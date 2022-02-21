// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRobotTaskCalledFileRequest} extends {@link RequestModel}
 *
 * <p>UploadRobotTaskCalledFileRequest</p>
 */
public class UploadRobotTaskCalledFileRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

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
    @NameInMap("TtsParam")
    private String ttsParam;

    @Query
    @NameInMap("TtsParamHead")
    private String ttsParamHead;

    private UploadRobotTaskCalledFileRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ttsParam = builder.ttsParam;
        this.ttsParamHead = builder.ttsParamHead;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRobotTaskCalledFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return ttsParam
     */
    public String getTtsParam() {
        return this.ttsParam;
    }

    /**
     * @return ttsParamHead
     */
    public String getTtsParamHead() {
        return this.ttsParamHead;
    }

    public static final class Builder extends Request.Builder<UploadRobotTaskCalledFileRequest, Builder> {
        private String calledNumber; 
        private Long id; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ttsParam; 
        private String ttsParamHead; 

        private Builder() {
            super();
        } 

        private Builder(UploadRobotTaskCalledFileRequest response) {
            super(response);
            this.calledNumber = response.calledNumber;
            this.id = response.id;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ttsParam = response.ttsParam;
            this.ttsParamHead = response.ttsParamHead;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * TtsParam.
         */
        public Builder ttsParam(String ttsParam) {
            this.putQueryParameter("TtsParam", ttsParam);
            this.ttsParam = ttsParam;
            return this;
        }

        /**
         * TtsParamHead.
         */
        public Builder ttsParamHead(String ttsParamHead) {
            this.putQueryParameter("TtsParamHead", ttsParamHead);
            this.ttsParamHead = ttsParamHead;
            return this;
        }

        @Override
        public UploadRobotTaskCalledFileRequest build() {
            return new UploadRobotTaskCalledFileRequest(this);
        } 

    } 

}
