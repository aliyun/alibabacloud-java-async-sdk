// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBackScriptListRequest} extends {@link RequestModel}
 *
 * <p>GetBackScriptListRequest</p>
 */
public class GetBackScriptListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("SceneId")
    private Integer sceneId;

    private GetBackScriptListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackScriptListRequest create() {
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
    public Integer getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<GetBackScriptListRequest, Builder> {
        private String operaUid; 
        private Integer sceneId; 

        private Builder() {
            super();
        } 

        private Builder(GetBackScriptListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.sceneId = request.sceneId;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Integer sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public GetBackScriptListRequest build() {
            return new GetBackScriptListRequest(this);
        } 

    } 

}
