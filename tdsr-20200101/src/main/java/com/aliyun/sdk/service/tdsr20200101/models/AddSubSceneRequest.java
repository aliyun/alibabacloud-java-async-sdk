// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSubSceneRequest} extends {@link RequestModel}
 *
 * <p>AddSubSceneRequest</p>
 */
public class AddSubSceneRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("UploadType")
    private String uploadType;

    private AddSubSceneRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.sceneId = builder.sceneId;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSubSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<AddSubSceneRequest, Builder> {
        private String name; 
        private String sceneId; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(AddSubSceneRequest request) {
            super(request);
            this.name = request.name;
            this.sceneId = request.sceneId;
            this.uploadType = request.uploadType;
        } 

        /**
         * 子场景名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
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
         * 类型 图片：IMAGE 视频：VIDEO
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public AddSubSceneRequest build() {
            return new AddSubSceneRequest(this);
        } 

    } 

}
