// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadMediaRequest</p>
 */
public class CreateUploadMediaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileInfo")
    private String fileInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetaData")
    private String mediaMetaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostProcessConfig")
    private String postProcessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTargetConfig")
    private String uploadTargetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.entityId = builder.entityId;
        this.fileInfo = builder.fileInfo;
        this.mediaMetaData = builder.mediaMetaData;
        this.postProcessConfig = builder.postProcessConfig;
        this.uploadTargetConfig = builder.uploadTargetConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return fileInfo
     */
    public String getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return mediaMetaData
     */
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    /**
     * @return postProcessConfig
     */
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    /**
     * @return uploadTargetConfig
     */
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateUploadMediaRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String entityId; 
        private String fileInfo; 
        private String mediaMetaData; 
        private String postProcessConfig; 
        private String uploadTargetConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.entityId = request.entityId;
            this.fileInfo = request.fileInfo;
            this.mediaMetaData = request.mediaMetaData;
            this.postProcessConfig = request.postProcessConfig;
            this.uploadTargetConfig = request.uploadTargetConfig;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * FileInfo.
         */
        public Builder fileInfo(String fileInfo) {
            this.putQueryParameter("FileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * MediaMetaData.
         */
        public Builder mediaMetaData(String mediaMetaData) {
            this.putQueryParameter("MediaMetaData", mediaMetaData);
            this.mediaMetaData = mediaMetaData;
            return this;
        }

        /**
         * PostProcessConfig.
         */
        public Builder postProcessConfig(String postProcessConfig) {
            this.putQueryParameter("PostProcessConfig", postProcessConfig);
            this.postProcessConfig = postProcessConfig;
            return this;
        }

        /**
         * UploadTargetConfig.
         */
        public Builder uploadTargetConfig(String uploadTargetConfig) {
            this.putQueryParameter("UploadTargetConfig", uploadTargetConfig);
            this.uploadTargetConfig = uploadTargetConfig;
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
        public CreateUploadMediaRequest build() {
            return new CreateUploadMediaRequest(this);
        } 

    } 

}
