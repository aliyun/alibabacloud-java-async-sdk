// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHotspotFileRequest} extends {@link RequestModel}
 *
 * <p>AddHotspotFileRequest</p>
 */
public class AddHotspotFileRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private AddHotspotFileRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.sceneId = builder.sceneId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddHotspotFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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

    public static final class Builder extends Request.Builder<AddHotspotFileRequest, Builder> {
        private String fileName; 
        private String sceneId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddHotspotFileRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.sceneId = request.sceneId;
            this.type = request.type;
        } 

        /**
         * 文件名
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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

        /**
         * 文件类型
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddHotspotFileRequest build() {
            return new AddHotspotFileRequest(this);
        } 

    } 

}
