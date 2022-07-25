// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveModelConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveModelConfigRequest</p>
 */
public class SaveModelConfigRequest extends Request {
    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private SaveModelConfigRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveModelConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<SaveModelConfigRequest, Builder> {
        private String data; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(SaveModelConfigRequest request) {
            super(request);
            this.data = request.data;
            this.sceneId = request.sceneId;
        } 

        /**
         * 模型配置，json字符串
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
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

        @Override
        public SaveModelConfigRequest build() {
            return new SaveModelConfigRequest(this);
        } 

    } 

}
