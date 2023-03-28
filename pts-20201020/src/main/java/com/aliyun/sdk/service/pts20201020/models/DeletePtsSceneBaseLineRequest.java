// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePtsSceneBaseLineRequest} extends {@link RequestModel}
 *
 * <p>DeletePtsSceneBaseLineRequest</p>
 */
public class DeletePtsSceneBaseLineRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private DeletePtsSceneBaseLineRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePtsSceneBaseLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DeletePtsSceneBaseLineRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePtsSceneBaseLineRequest request) {
            super(request);
            this.sceneId = request.sceneId;
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
        public DeletePtsSceneBaseLineRequest build() {
            return new DeletePtsSceneBaseLineRequest(this);
        } 

    } 

}
