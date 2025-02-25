// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMediaPublishStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaPublishStateRequest</p>
 */
public class UpdateMediaPublishStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Publish")
    private Boolean publish;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateMediaPublishStateRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.publish = builder.publish;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaPublishStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return publish
     */
    public Boolean getPublish() {
        return this.publish;
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

    public static final class Builder extends Request.Builder<UpdateMediaPublishStateRequest, Builder> {
        private String mediaId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean publish; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaPublishStateRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.publish = request.publish;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the media file whose publishing status you want to update. You can obtain the ID of a media file from the response of the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation. Alternatively, perform the following operations in the ApsaraVideo Media Processing (MPS) console: In the left-side navigation pane, choose <strong>Media Management</strong> &gt; <strong>Media List</strong>. Find the required video and click <strong>Manage</strong>. The ID of the video is displayed on the Basics tab.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3e6149d5a8c944c09b1a8d2dc3e4****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The publishing status. Default value: <strong>Initialed</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: published.</li>
         * <li><strong>false</strong>: unpublished.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publish(Boolean publish) {
            this.putQueryParameter("Publish", publish);
            this.publish = publish;
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
        public UpdateMediaPublishStateRequest build() {
            return new UpdateMediaPublishStateRequest(this);
        } 

    } 

}
