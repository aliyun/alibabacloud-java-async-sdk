// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveHotspotTagListRequest} extends {@link RequestModel}
 *
 * <p>SaveHotspotTagListRequest</p>
 */
public class SaveHotspotTagListRequest extends Request {
    @Query
    @NameInMap("HotspotListJson")
    @Validation(required = true)
    private String hotspotListJson;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private SaveHotspotTagListRequest(Builder builder) {
        super(builder);
        this.hotspotListJson = builder.hotspotListJson;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveHotspotTagListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotspotListJson
     */
    public String getHotspotListJson() {
        return this.hotspotListJson;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<SaveHotspotTagListRequest, Builder> {
        private String hotspotListJson; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotTagListRequest request) {
            super(request);
            this.hotspotListJson = request.hotspotListJson;
            this.sceneId = request.sceneId;
        } 

        /**
         * 热点数据，json字符串数组
         */
        public Builder hotspotListJson(String hotspotListJson) {
            this.putQueryParameter("HotspotListJson", hotspotListJson);
            this.hotspotListJson = hotspotListJson;
            return this;
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
        public SaveHotspotTagListRequest build() {
            return new SaveHotspotTagListRequest(this);
        } 

    } 

}
