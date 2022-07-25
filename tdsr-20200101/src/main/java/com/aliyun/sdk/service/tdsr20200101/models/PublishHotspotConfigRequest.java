// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishHotspotConfigRequest} extends {@link RequestModel}
 *
 * <p>PublishHotspotConfigRequest</p>
 */
public class PublishHotspotConfigRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private PublishHotspotConfigRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishHotspotConfigRequest create() {
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

    public static final class Builder extends Request.Builder<PublishHotspotConfigRequest, Builder> {
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(PublishHotspotConfigRequest request) {
            super(request);
            this.sceneId = request.sceneId;
        } 

        /**
         * 场景Id
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public PublishHotspotConfigRequest build() {
            return new PublishHotspotConfigRequest(this);
        } 

    } 

}
