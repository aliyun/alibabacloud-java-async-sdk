// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadVideoRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadVideoRequest</p>
 */
public class CreateUploadVideoRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("CoverURL")
    private String coverURL;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("FileSize")
    private Long fileSize;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("TemplateGroupId")
    private String templateGroupId;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("WorkflowId")
    private String workflowId;

    private CreateUploadVideoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.templateGroupId = builder.templateGroupId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadVideoRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
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
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
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
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<CreateUploadVideoRequest, Builder> {
        private String appId; 
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String fileName; 
        private Long fileSize; 
        private String storageLocation; 
        private String tags; 
        private String templateGroupId; 
        private String title; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadVideoRequest request) {
            super(request);
            this.appId = request.appId;
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.fileName = request.fileName;
            this.fileSize = request.fileSize;
            this.storageLocation = request.storageLocation;
            this.tags = request.tags;
            this.templateGroupId = request.templateGroupId;
            this.title = request.title;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
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
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
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
         * TemplateGroupId.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
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
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public CreateUploadVideoRequest build() {
            return new CreateUploadVideoRequest(this);
        } 

    } 

}
