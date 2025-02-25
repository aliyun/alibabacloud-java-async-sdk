// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

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
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SceneId")
    private Long sceneId;

    private DeleteSceneRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.sceneId = builder.sceneId;
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
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DeleteSceneRequest, Builder> {
        private String operaUid; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.sceneId = request.sceneId;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DeleteSceneRequest build() {
            return new DeleteSceneRequest(this);
        } 

    } 

}
