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
 * {@link DeleteCloudauthstSceneRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudauthstSceneRequest</p>
 */
public class DeleteCloudauthstSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private DeleteCloudauthstSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudauthstSceneRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteCloudauthstSceneRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudauthstSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>ID of the scene to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4275001</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DeleteCloudauthstSceneRequest build() {
            return new DeleteCloudauthstSceneRequest(this);
        } 

    } 

}
