// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMediaByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadMediaByURLRequest</p>
 */
public class UploadMediaByURLRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("MediaMetaData")
    private String mediaMetaData;

    @Query
    @NameInMap("PostProcessConfig")
    private String postProcessConfig;

    @Query
    @NameInMap("UploadTargetConfig")
    private String uploadTargetConfig;

    @Query
    @NameInMap("UploadURLs")
    private String uploadURLs;

    @Query
    @NameInMap("UserData")
    private String userData;

    private UploadMediaByURLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.entityId = builder.entityId;
        this.mediaMetaData = builder.mediaMetaData;
        this.postProcessConfig = builder.postProcessConfig;
        this.uploadTargetConfig = builder.uploadTargetConfig;
        this.uploadURLs = builder.uploadURLs;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaByURLRequest create() {
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
     * @return uploadURLs
     */
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UploadMediaByURLRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String entityId; 
        private String mediaMetaData; 
        private String postProcessConfig; 
        private String uploadTargetConfig; 
        private String uploadURLs; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UploadMediaByURLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.entityId = request.entityId;
            this.mediaMetaData = request.mediaMetaData;
            this.postProcessConfig = request.postProcessConfig;
            this.uploadTargetConfig = request.uploadTargetConfig;
            this.uploadURLs = request.uploadURLs;
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
         * UploadURLs.
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
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
        public UploadMediaByURLRequest build() {
            return new UploadMediaByURLRequest(this);
        } 

    } 

}
