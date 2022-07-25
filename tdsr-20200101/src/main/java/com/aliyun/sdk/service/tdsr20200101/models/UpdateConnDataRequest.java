// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnDataRequest</p>
 */
public class UpdateConnDataRequest extends Request {
    @Query
    @NameInMap("ConnData")
    @Validation(required = true)
    private String connData;

    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private UpdateConnDataRequest(Builder builder) {
        super(builder);
        this.connData = builder.connData;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connData
     */
    public String getConnData() {
        return this.connData;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdateConnDataRequest, Builder> {
        private String connData; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnDataRequest request) {
            super(request);
            this.connData = request.connData;
            this.sceneId = request.sceneId;
        } 

        /**
         * 关联数据
         */
        public Builder connData(String connData) {
            this.putQueryParameter("ConnData", connData);
            this.connData = connData;
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
        public UpdateConnDataRequest build() {
            return new UpdateConnDataRequest(this);
        } 

    } 

}
