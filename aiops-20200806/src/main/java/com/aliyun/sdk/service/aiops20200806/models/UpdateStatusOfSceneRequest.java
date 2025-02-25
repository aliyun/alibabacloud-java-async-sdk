// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStatusOfSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateStatusOfSceneRequest</p>
 */
public class UpdateStatusOfSceneRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SceneId")
    private Long sceneId;

    @Body
    @NameInMap("SceneStatus")
    private Integer sceneStatus;

    private UpdateStatusOfSceneRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.sceneId = builder.sceneId;
        this.sceneStatus = builder.sceneStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStatusOfSceneRequest create() {
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

    /**
     * @return sceneStatus
     */
    public Integer getSceneStatus() {
        return this.sceneStatus;
    }

    public static final class Builder extends Request.Builder<UpdateStatusOfSceneRequest, Builder> {
        private String operaUid; 
        private Long sceneId; 
        private Integer sceneStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStatusOfSceneRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.sceneId = request.sceneId;
            this.sceneStatus = request.sceneStatus;
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

        /**
         * SceneStatus.
         */
        public Builder sceneStatus(Integer sceneStatus) {
            this.putBodyParameter("SceneStatus", sceneStatus);
            this.sceneStatus = sceneStatus;
            return this;
        }

        @Override
        public UpdateStatusOfSceneRequest build() {
            return new UpdateStatusOfSceneRequest(this);
        } 

    } 

}
