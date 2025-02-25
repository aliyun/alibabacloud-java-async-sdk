// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSceneListRequest} extends {@link RequestModel}
 *
 * <p>AddSceneListRequest</p>
 */
public class AddSceneListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("SceneDescribe")
    private String sceneDescribe;

    @Query
    @NameInMap("SceneName")
    private String sceneName;

    @Query
    @NameInMap("ScenePersonLiable")
    private String scenePersonLiable;

    @Query
    @NameInMap("SceneType")
    private String sceneType;

    @Query
    @NameInMap("SceneVoJson")
    private String sceneVoJson;

    @Query
    @NameInMap("Webhook")
    private String webhook;

    private AddSceneListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.sceneDescribe = builder.sceneDescribe;
        this.sceneName = builder.sceneName;
        this.scenePersonLiable = builder.scenePersonLiable;
        this.sceneType = builder.sceneType;
        this.sceneVoJson = builder.sceneVoJson;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSceneListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sceneDescribe
     */
    public String getSceneDescribe() {
        return this.sceneDescribe;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return scenePersonLiable
     */
    public String getScenePersonLiable() {
        return this.scenePersonLiable;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return sceneVoJson
     */
    public String getSceneVoJson() {
        return this.sceneVoJson;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<AddSceneListRequest, Builder> {
        private String operaUid; 
        private String sceneDescribe; 
        private String sceneName; 
        private String scenePersonLiable; 
        private String sceneType; 
        private String sceneVoJson; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(AddSceneListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.sceneDescribe = request.sceneDescribe;
            this.sceneName = request.sceneName;
            this.scenePersonLiable = request.scenePersonLiable;
            this.sceneType = request.sceneType;
            this.sceneVoJson = request.sceneVoJson;
            this.webhook = request.webhook;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SceneDescribe.
         */
        public Builder sceneDescribe(String sceneDescribe) {
            this.putQueryParameter("SceneDescribe", sceneDescribe);
            this.sceneDescribe = sceneDescribe;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * ScenePersonLiable.
         */
        public Builder scenePersonLiable(String scenePersonLiable) {
            this.putQueryParameter("ScenePersonLiable", scenePersonLiable);
            this.scenePersonLiable = scenePersonLiable;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * SceneVoJson.
         */
        public Builder sceneVoJson(String sceneVoJson) {
            this.putQueryParameter("SceneVoJson", sceneVoJson);
            this.sceneVoJson = sceneVoJson;
            return this;
        }

        /**
         * Webhook.
         */
        public Builder webhook(String webhook) {
            this.putQueryParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public AddSceneListRequest build() {
            return new AddSceneListRequest(this);
        } 

    } 

}
