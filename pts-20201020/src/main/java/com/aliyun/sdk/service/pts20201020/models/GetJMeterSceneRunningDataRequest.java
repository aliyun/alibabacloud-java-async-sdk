// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterSceneRunningDataRequest} extends {@link RequestModel}
 *
 * <p>GetJMeterSceneRunningDataRequest</p>
 */
public class GetJMeterSceneRunningDataRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private GetJMeterSceneRunningDataRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJMeterSceneRunningDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetJMeterSceneRunningDataRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(GetJMeterSceneRunningDataRequest request) {
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
        public GetJMeterSceneRunningDataRequest build() {
            return new GetJMeterSceneRunningDataRequest(this);
        } 

    } 

}
