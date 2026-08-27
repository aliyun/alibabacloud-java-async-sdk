// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DeleteAppSceneRecipientRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppSceneRecipientRequest</p>
 */
public class DeleteAppSceneRecipientRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecipientId")
    private String recipientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    private DeleteAppSceneRecipientRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.recipientId = builder.recipientId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppSceneRecipientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return recipientId
     */
    public String getRecipientId() {
        return this.recipientId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DeleteAppSceneRecipientRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String recipientId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppSceneRecipientRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.recipientId = request.recipientId;
            this.sceneId = request.sceneId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * RecipientId.
         */
        public Builder recipientId(String recipientId) {
            this.putQueryParameter("RecipientId", recipientId);
            this.recipientId = recipientId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DeleteAppSceneRecipientRequest build() {
            return new DeleteAppSceneRecipientRequest(this);
        } 

    } 

}
