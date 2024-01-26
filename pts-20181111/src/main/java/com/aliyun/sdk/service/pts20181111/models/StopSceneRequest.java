// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20181111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopSceneRequest} extends {@link RequestModel}
 *
 * <p>StopSceneRequest</p>
 */
public class StopSceneRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private Long sceneId;

    private StopSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<StopSceneRequest, Builder> {
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(StopSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public StopSceneRequest build() {
            return new StopSceneRequest(this);
        } 

    } 

}
