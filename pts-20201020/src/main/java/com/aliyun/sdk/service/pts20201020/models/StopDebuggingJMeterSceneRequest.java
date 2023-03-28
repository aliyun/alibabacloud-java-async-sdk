// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDebuggingJMeterSceneRequest} extends {@link RequestModel}
 *
 * <p>StopDebuggingJMeterSceneRequest</p>
 */
public class StopDebuggingJMeterSceneRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private StopDebuggingJMeterSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDebuggingJMeterSceneRequest create() {
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

    public static final class Builder extends Request.Builder<StopDebuggingJMeterSceneRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(StopDebuggingJMeterSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * 场景id
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public StopDebuggingJMeterSceneRequest build() {
            return new StopDebuggingJMeterSceneRequest(this);
        } 

    } 

}
