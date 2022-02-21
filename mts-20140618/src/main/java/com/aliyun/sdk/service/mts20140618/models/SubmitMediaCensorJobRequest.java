// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitMediaCensorJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaCensorJobRequest</p>
 */
public class SubmitMediaCensorJobRequest extends Request {
    @Query
    @NameInMap("Barrages")
    private String barrages;

    @Query
    @NameInMap("CoverImages")
    private String coverImages;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExternalUrl")
    private String externalUrl;

    @Query
    @NameInMap("Input")
    private String input;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoCensorConfig")
    @Validation(required = true)
    private String videoCensorConfig;

    private SubmitMediaCensorJobRequest(Builder builder) {
        super(builder);
        this.barrages = builder.barrages;
        this.coverImages = builder.coverImages;
        this.description = builder.description;
        this.externalUrl = builder.externalUrl;
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.videoCensorConfig = builder.videoCensorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaCensorJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return barrages
     */
    public String getBarrages() {
        return this.barrages;
    }

    /**
     * @return coverImages
     */
    public String getCoverImages() {
        return this.coverImages;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return externalUrl
     */
    public String getExternalUrl() {
        return this.externalUrl;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoCensorConfig
     */
    public String getVideoCensorConfig() {
        return this.videoCensorConfig;
    }

    public static final class Builder extends Request.Builder<SubmitMediaCensorJobRequest, Builder> {
        private String barrages; 
        private String coverImages; 
        private String description; 
        private String externalUrl; 
        private String input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String title; 
        private String userData; 
        private String videoCensorConfig; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaCensorJobRequest response) {
            super(response);
            this.barrages = response.barrages;
            this.coverImages = response.coverImages;
            this.description = response.description;
            this.externalUrl = response.externalUrl;
            this.input = response.input;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pipelineId = response.pipelineId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.title = response.title;
            this.userData = response.userData;
            this.videoCensorConfig = response.videoCensorConfig;
        } 

        /**
         * Barrages.
         */
        public Builder barrages(String barrages) {
            this.putQueryParameter("Barrages", barrages);
            this.barrages = barrages;
            return this;
        }

        /**
         * CoverImages.
         */
        public Builder coverImages(String coverImages) {
            this.putQueryParameter("CoverImages", coverImages);
            this.coverImages = coverImages;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExternalUrl.
         */
        public Builder externalUrl(String externalUrl) {
            this.putQueryParameter("ExternalUrl", externalUrl);
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
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
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
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
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * VideoCensorConfig.
         */
        public Builder videoCensorConfig(String videoCensorConfig) {
            this.putQueryParameter("VideoCensorConfig", videoCensorConfig);
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }

        @Override
        public SubmitMediaCensorJobRequest build() {
            return new SubmitMediaCensorJobRequest(this);
        } 

    } 

}
