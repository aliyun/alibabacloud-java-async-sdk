// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePtsSceneBaseLineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePtsSceneBaseLineRequest</p>
 */
public class UpdatePtsSceneBaseLineRequest extends Request {
    @Query
    @NameInMap("ApiBaselines")
    private java.util.Map < String, ? > apiBaselines;

    @Query
    @NameInMap("SceneBaseline")
    private java.util.Map < String, ? > sceneBaseline;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private UpdatePtsSceneBaseLineRequest(Builder builder) {
        super(builder);
        this.apiBaselines = builder.apiBaselines;
        this.sceneBaseline = builder.sceneBaseline;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePtsSceneBaseLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiBaselines
     */
    public java.util.Map < String, ? > getApiBaselines() {
        return this.apiBaselines;
    }

    /**
     * @return sceneBaseline
     */
    public java.util.Map < String, ? > getSceneBaseline() {
        return this.sceneBaseline;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdatePtsSceneBaseLineRequest, Builder> {
        private java.util.Map < String, ? > apiBaselines; 
        private java.util.Map < String, ? > sceneBaseline; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePtsSceneBaseLineRequest request) {
            super(request);
            this.apiBaselines = request.apiBaselines;
            this.sceneBaseline = request.sceneBaseline;
            this.sceneId = request.sceneId;
        } 

        /**
         * ApiBaselines.
         */
        public Builder apiBaselines(java.util.Map < String, ? > apiBaselines) {
            String apiBaselinesShrink = shrink(apiBaselines, "ApiBaselines", "json");
            this.putQueryParameter("ApiBaselines", apiBaselinesShrink);
            this.apiBaselines = apiBaselines;
            return this;
        }

        /**
         * SceneBaseline.
         */
        public Builder sceneBaseline(java.util.Map < String, ? > sceneBaseline) {
            String sceneBaselineShrink = shrink(sceneBaseline, "SceneBaseline", "json");
            this.putQueryParameter("SceneBaseline", sceneBaselineShrink);
            this.sceneBaseline = sceneBaseline;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdatePtsSceneBaseLineRequest build() {
            return new UpdatePtsSceneBaseLineRequest(this);
        } 

    } 

}
