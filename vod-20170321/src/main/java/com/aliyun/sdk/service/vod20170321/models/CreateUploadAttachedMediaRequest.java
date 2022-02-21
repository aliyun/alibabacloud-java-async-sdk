// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadAttachedMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadAttachedMediaRequest</p>
 */
public class CreateUploadAttachedMediaRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("CateIds")
    private String cateIds;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileSize")
    private String fileSize;

    @Query
    @NameInMap("MediaExt")
    private String mediaExt;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    private CreateUploadAttachedMediaRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.businessType = builder.businessType;
        this.cateIds = builder.cateIds;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.mediaExt = builder.mediaExt;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadAttachedMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public String getFileSize() {
        return this.fileSize;
    }

    /**
     * @return mediaExt
     */
    public String getMediaExt() {
        return this.mediaExt;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
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

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateUploadAttachedMediaRequest, Builder> {
        private String appId; 
        private String businessType; 
        private String cateIds; 
        private String description; 
        private String fileName; 
        private String fileSize; 
        private String mediaExt; 
        private String storageLocation; 
        private String tags; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadAttachedMediaRequest response) {
            super(response);
            this.appId = response.appId;
            this.businessType = response.businessType;
            this.cateIds = response.cateIds;
            this.description = response.description;
            this.fileName = response.fileName;
            this.fileSize = response.fileSize;
            this.mediaExt = response.mediaExt;
            this.storageLocation = response.storageLocation;
            this.tags = response.tags;
            this.title = response.title;
            this.userData = response.userData;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(String fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * MediaExt.
         */
        public Builder mediaExt(String mediaExt) {
            this.putQueryParameter("MediaExt", mediaExt);
            this.mediaExt = mediaExt;
            return this;
        }

        /**
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
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

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadAttachedMediaRequest build() {
            return new CreateUploadAttachedMediaRequest(this);
        } 

    } 

}
