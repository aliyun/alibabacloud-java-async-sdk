// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySceneRequest} extends {@link RequestModel}
 *
 * <p>CopySceneRequest</p>
 */
public class CopySceneRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("SceneName")
    @Validation(required = true)
    private String sceneName;

    private CopySceneRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    public static final class Builder extends Request.Builder<CopySceneRequest, Builder> {
        private String projectId; 
        private String sceneId; 
        private String sceneName; 

        private Builder() {
            super();
        } 

        private Builder(CopySceneRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.sceneId = request.sceneId;
            this.sceneName = request.sceneName;
        } 

        /**
         * 复制到的项目Id，默认为空，复制到当前场景所在的项目
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 场景Id
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 新场景名称
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        @Override
        public CopySceneRequest build() {
            return new CopySceneRequest(this);
        } 

    } 

}
