// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateServiceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceConfigRequest</p>
 */
public class UpdateServiceConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileConfig")
    private String fileConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordFilterLibs")
    private String keywordFilterLibs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordHitLibs")
    private String keywordHitLibs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ManualMachineConfig")
    private String manualMachineConfig;

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
    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    private String serviceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VideoConfig")
    private String videoConfig;

    private UpdateServiceConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fileConfig = builder.fileConfig;
        this.keywordFilterLibs = builder.keywordFilterLibs;
        this.keywordHitLibs = builder.keywordHitLibs;
        this.manualMachineConfig = builder.manualMachineConfig;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.sceneConfig = builder.sceneConfig;
        this.serviceCode = builder.serviceCode;
        this.serviceConfig = builder.serviceConfig;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return manualMachineConfig
     */
    public String getManualMachineConfig() {
        return this.manualMachineConfig;
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
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * @return videoConfig
     */
    public String getVideoConfig() {
        return this.videoConfig;
    }

    public static final class Builder extends Request.Builder<UpdateServiceConfigRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String fileConfig; 
        private String keywordFilterLibs; 
        private String keywordHitLibs; 
        private String manualMachineConfig; 
        private String regionId; 
        private String resourceType; 
        private String scene; 
        private String sceneConfig; 
        private String serviceCode; 
        private String serviceConfig; 
        private String videoConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fileConfig = request.fileConfig;
            this.keywordFilterLibs = request.keywordFilterLibs;
            this.keywordHitLibs = request.keywordHitLibs;
            this.manualMachineConfig = request.manualMachineConfig;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.sceneConfig = request.sceneConfig;
            this.serviceCode = request.serviceCode;
            this.serviceConfig = request.serviceConfig;
            this.videoConfig = request.videoConfig;
        } 

        /**
         * <p>The client-generated idempotency token used to prevent duplicate operations caused by network retries. The token must be unique across requests and contain only printable ASCII characters (ASCII 32-126).</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. When set to true, only parameter validation and business logic checks are performed without actually creating or updating resources.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The document configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder fileConfig(String fileConfig) {
            this.putBodyParameter("FileConfig", fileConfig);
            this.fileConfig = fileConfig;
            return this;
        }

        /**
         * <p>The keyword filter libraries.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder keywordFilterLibs(String keywordFilterLibs) {
            this.putBodyParameter("KeywordFilterLibs", keywordFilterLibs);
            this.keywordFilterLibs = keywordFilterLibs;
            return this;
        }

        /**
         * <p>The keyword hit libraries.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder keywordHitLibs(String keywordHitLibs) {
            this.putBodyParameter("KeywordHitLibs", keywordHitLibs);
            this.keywordHitLibs = keywordHitLibs;
            return this;
        }

        /**
         * <p>The human-machine moderation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder manualMachineConfig(String manualMachineConfig) {
            this.putBodyParameter("ManualMachineConfig", manualMachineConfig);
            this.manualMachineConfig = manualMachineConfig;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The moderation scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>pornographic</p>
         */
        public Builder scene(String scene) {
            this.putBodyParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The scenario configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder sceneConfig(String sceneConfig) {
            this.putBodyParameter("SceneConfig", sceneConfig);
            this.sceneConfig = sceneConfig;
            return this;
        }

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>The service configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder serviceConfig(String serviceConfig) {
            this.putBodyParameter("ServiceConfig", serviceConfig);
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * <p>The video configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
