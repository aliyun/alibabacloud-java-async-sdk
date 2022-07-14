// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImAuditRequest} extends {@link RequestModel}
 *
 * <p>ImAuditRequest</p>
 */
public class ImAuditRequest extends Request {
    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("Contents")
    private String contents;

    @Query
    @NameInMap("Images")
    private String images;

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
    @NameInMap("Scenes")
    @Validation(required = true)
    private String scenes;

    private ImAuditRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.contents = builder.contents;
        this.images = builder.images;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scenes = builder.scenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return contents
     */
    public String getContents() {
        return this.contents;
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
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
     * @return scenes
     */
    public String getScenes() {
        return this.scenes;
    }

    public static final class Builder extends Request.Builder<ImAuditRequest, Builder> {
        private String bizType; 
        private String contents; 
        private String images; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scenes; 

        private Builder() {
            super();
        } 

        private Builder(ImAuditRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.contents = request.contents;
            this.images = request.images;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scenes = request.scenes;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Contents.
         */
        public Builder contents(String contents) {
            this.putQueryParameter("Contents", contents);
            this.contents = contents;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
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
         * Scenes.
         */
        public Builder scenes(String scenes) {
            this.putQueryParameter("Scenes", scenes);
            this.scenes = scenes;
            return this;
        }

        @Override
        public ImAuditRequest build() {
            return new ImAuditRequest(this);
        } 

    } 

}
