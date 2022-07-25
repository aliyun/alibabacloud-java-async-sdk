// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PackSceneRequest} extends {@link RequestModel}
 *
 * <p>PackSceneRequest</p>
 */
public class PackSceneRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private PackSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PackSceneRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PackSceneRequest, Builder> {
        private String sceneId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PackSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
            this.type = request.type;
        } 

        /**
         * 场景ID
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * 操作类型：download（下载），sync（同步）
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PackSceneRequest build() {
            return new PackSceneRequest(this);
        } 

    } 

}
