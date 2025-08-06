// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteTranscodeTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteTranscodeTemplatesRequest</p>
 */
public class DeleteTranscodeTemplatesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateIdList;

    private DeleteTranscodeTemplatesRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateIdList = builder.transcodeTemplateIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTranscodeTemplatesRequest create() {
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
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    /**
     * @return transcodeTemplateIdList
     */
    public String getTranscodeTemplateIdList() {
        return this.transcodeTemplateIdList;
    }

    public static final class Builder extends Request.Builder<DeleteTranscodeTemplatesRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTranscodeTemplatesRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateIdList = request.transcodeTemplateIdList;
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
         * <p>This parameter is required.</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transcodeTemplateIdList(String transcodeTemplateIdList) {
            this.putQueryParameter("TranscodeTemplateIdList", transcodeTemplateIdList);
            this.transcodeTemplateIdList = transcodeTemplateIdList;
            return this;
        }

        @Override
        public DeleteTranscodeTemplatesRequest build() {
            return new DeleteTranscodeTemplatesRequest(this);
        } 

    } 

}
