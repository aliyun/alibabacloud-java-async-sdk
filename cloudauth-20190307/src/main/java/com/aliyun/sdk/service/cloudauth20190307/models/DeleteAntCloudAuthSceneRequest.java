// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DeleteAntCloudAuthSceneRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntCloudAuthSceneRequest</p>
 */
public class DeleteAntCloudAuthSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sceneId;

    private DeleteAntCloudAuthSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntCloudAuthSceneRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAntCloudAuthSceneRequest, Builder> {
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntCloudAuthSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>ID of the scene to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000011589</p>
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DeleteAntCloudAuthSceneRequest build() {
            return new DeleteAntCloudAuthSceneRequest(this);
        } 

    } 

}
