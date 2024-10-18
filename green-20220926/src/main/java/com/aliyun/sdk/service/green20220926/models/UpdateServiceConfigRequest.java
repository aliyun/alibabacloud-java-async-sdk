// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceConfigRequest</p>
 */
public class UpdateServiceConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileConfig")
    private String fileConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordFilterLibs")
    private String keywordFilterLibs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordHitLibs")
    private String keywordHitLibs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneConfig")
    private String sceneConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoConfig")
    private String videoConfig;

    private UpdateServiceConfigRequest(Builder builder) {
        super(builder);
        this.fileConfig = builder.fileConfig;
        this.keywordFilterLibs = builder.keywordFilterLibs;
        this.keywordHitLibs = builder.keywordHitLibs;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.sceneConfig = builder.sceneConfig;
        this.serviceCode = builder.serviceCode;
        this.videoConfig = builder.videoConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileConfig
     */
    public String getFileConfig() {
        return this.fileConfig;
    }

    /**
     * @return keywordFilterLibs
     */
    public String getKeywordFilterLibs() {
        return this.keywordFilterLibs;
    }

    /**
     * @return keywordHitLibs
     */
    public String getKeywordHitLibs() {
        return this.keywordHitLibs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sceneConfig
     */
    public String getSceneConfig() {
        return this.sceneConfig;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return videoConfig
     */
    public String getVideoConfig() {
        return this.videoConfig;
    }

    public static final class Builder extends Request.Builder<UpdateServiceConfigRequest, Builder> {
        private String fileConfig; 
        private String keywordFilterLibs; 
        private String keywordHitLibs; 
        private String regionId; 
        private String resourceType; 
        private String scene; 
        private String sceneConfig; 
        private String serviceCode; 
        private String videoConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceConfigRequest request) {
            super(request);
            this.fileConfig = request.fileConfig;
            this.keywordFilterLibs = request.keywordFilterLibs;
            this.keywordHitLibs = request.keywordHitLibs;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.sceneConfig = request.sceneConfig;
            this.serviceCode = request.serviceCode;
            this.videoConfig = request.videoConfig;
        } 

        /**
         * FileConfig.
         */
        public Builder fileConfig(String fileConfig) {
            this.putBodyParameter("FileConfig", fileConfig);
            this.fileConfig = fileConfig;
            return this;
        }

        /**
         * KeywordFilterLibs.
         */
        public Builder keywordFilterLibs(String keywordFilterLibs) {
            this.putBodyParameter("KeywordFilterLibs", keywordFilterLibs);
            this.keywordFilterLibs = keywordFilterLibs;
            return this;
        }

        /**
         * KeywordHitLibs.
         */
        public Builder keywordHitLibs(String keywordHitLibs) {
            this.putBodyParameter("KeywordHitLibs", keywordHitLibs);
            this.keywordHitLibs = keywordHitLibs;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * SceneConfig.
         */
        public Builder sceneConfig(String sceneConfig) {
            this.putBodyParameter("SceneConfig", sceneConfig);
            this.sceneConfig = sceneConfig;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * VideoConfig.
         */
        public Builder videoConfig(String videoConfig) {
            this.putBodyParameter("VideoConfig", videoConfig);
            this.videoConfig = videoConfig;
            return this;
        }

        @Override
        public UpdateServiceConfigRequest build() {
            return new UpdateServiceConfigRequest(this);
        } 

    } 

}
