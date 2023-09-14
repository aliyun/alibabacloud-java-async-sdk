// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSceneRequest</p>
 */
public class DeleteSceneRequest extends Request {
    @Path
    @NameInMap("SceneId")
    private String sceneId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private DeleteSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSceneRequest create() {
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteSceneRequest, Builder> {
        private String sceneId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
            this.instanceId = request.instanceId;
        } 

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteSceneRequest build() {
            return new DeleteSceneRequest(this);
        } 

    } 

}
