// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDebugPtsSceneRequest} extends {@link RequestModel}
 *
 * <p>StopDebugPtsSceneRequest</p>
 */
public class StopDebugPtsSceneRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private StopDebugPtsSceneRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDebugPtsSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<StopDebugPtsSceneRequest, Builder> {
        private String planId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(StopDebugPtsSceneRequest request) {
            super(request);
            this.planId = request.planId;
            this.sceneId = request.sceneId;
        } 

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
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
        public StopDebugPtsSceneRequest build() {
            return new StopDebugPtsSceneRequest(this);
        } 

    } 

}
