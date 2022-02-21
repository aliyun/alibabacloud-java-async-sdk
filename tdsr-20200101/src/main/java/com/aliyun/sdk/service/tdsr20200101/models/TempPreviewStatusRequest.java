// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempPreviewStatusRequest} extends {@link RequestModel}
 *
 * <p>TempPreviewStatusRequest</p>
 */
public class TempPreviewStatusRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private TempPreviewStatusRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempPreviewStatusRequest create() {
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

    public static final class Builder extends Request.Builder<TempPreviewStatusRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(TempPreviewStatusRequest response) {
            super(response);
            this.sceneId = response.sceneId;
        } 

        /**
         * 任务ID
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public TempPreviewStatusRequest build() {
            return new TempPreviewStatusRequest(this);
        } 

    } 

}
