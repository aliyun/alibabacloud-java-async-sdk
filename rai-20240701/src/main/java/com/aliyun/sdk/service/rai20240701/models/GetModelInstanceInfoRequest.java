// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModelInstanceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetModelInstanceInfoRequest</p>
 */
public class GetModelInstanceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
    private Long modelInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    private GetModelInstanceInfoRequest(Builder builder) {
        super(builder);
        this.modelInstanceId = builder.modelInstanceId;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelInstanceInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelInstanceId
     */
    public Long getModelInstanceId() {
        return this.modelInstanceId;
    }

    /**
     * @return sceneType
     */
    public Integer getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<GetModelInstanceInfoRequest, Builder> {
        private Long modelInstanceId; 
        private Integer sceneType; 

        private Builder() {
            super();
        } 

        private Builder(GetModelInstanceInfoRequest request) {
            super(request);
            this.modelInstanceId = request.modelInstanceId;
            this.sceneType = request.sceneType;
        } 

        /**
         * ModelInstanceId.
         */
        public Builder modelInstanceId(Long modelInstanceId) {
            this.putQueryParameter("ModelInstanceId", modelInstanceId);
            this.modelInstanceId = modelInstanceId;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(Integer sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public GetModelInstanceInfoRequest build() {
            return new GetModelInstanceInfoRequest(this);
        } 

    } 

}
