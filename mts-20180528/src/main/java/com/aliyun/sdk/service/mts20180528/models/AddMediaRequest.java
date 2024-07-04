// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaRequest} extends {@link RequestModel}
 *
 * <p>AddMediaRequest</p>
 */
public class AddMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputUnbind")
    private Boolean inputUnbind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
    private String mediaWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowUserData")
    private String mediaWorkflowUserData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private AddMediaRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.fileURL = builder.fileURL;
        this.inputUnbind = builder.inputUnbind;
        this.mediaWorkflowId = builder.mediaWorkflowId;
        this.mediaWorkflowUserData = builder.mediaWorkflowUserData;
        this.overrideParams = builder.overrideParams;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return inputUnbind
     */
    public Boolean getInputUnbind() {
        return this.inputUnbind;
    }

    /**
     * @return mediaWorkflowId
     */
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    /**
     * @return mediaWorkflowUserData
     */
    public String getMediaWorkflowUserData() {
        return this.mediaWorkflowUserData;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<AddMediaRequest, Builder> {
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String fileURL; 
        private Boolean inputUnbind; 
        private String mediaWorkflowId; 
        private String mediaWorkflowUserData; 
        private String overrideParams; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.fileURL = request.fileURL;
            this.inputUnbind = request.inputUnbind;
            this.mediaWorkflowId = request.mediaWorkflowId;
            this.mediaWorkflowUserData = request.mediaWorkflowUserData;
            this.overrideParams = request.overrideParams;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.title = request.title;
        } 

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
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
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.putQueryParameter("FileURL", fileURL);
            this.fileURL = fileURL;
            return this;
        }

        /**
         * InputUnbind.
         */
        public Builder inputUnbind(Boolean inputUnbind) {
            this.putQueryParameter("InputUnbind", inputUnbind);
            this.inputUnbind = inputUnbind;
            return this;
        }

        /**
         * MediaWorkflowId.
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * MediaWorkflowUserData.
         */
        public Builder mediaWorkflowUserData(String mediaWorkflowUserData) {
            this.putQueryParameter("MediaWorkflowUserData", mediaWorkflowUserData);
            this.mediaWorkflowUserData = mediaWorkflowUserData;
            return this;
        }

        /**
         * OverrideParams.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
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
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
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

        @Override
        public AddMediaRequest build() {
            return new AddMediaRequest(this);
        } 

    } 

}
