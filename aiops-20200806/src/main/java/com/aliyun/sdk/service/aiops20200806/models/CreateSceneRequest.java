// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneRequest</p>
 */
public class CreateSceneRequest extends Request {
    @Body
    @NameInMap("FlowName")
    private String flowName;

    @Body
    @NameInMap("MetricListJson")
    private String metricListJson;

    @Body
    @NameInMap("NodeListJson")
    private String nodeListJson;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SceneDesc")
    private String sceneDesc;

    @Body
    @NameInMap("SceneName")
    private String sceneName;

    @Body
    @NameInMap("SceneOwner")
    private String sceneOwner;

    @Body
    @NameInMap("SceneWebhook")
    private String sceneWebhook;

    private CreateSceneRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.metricListJson = builder.metricListJson;
        this.nodeListJson = builder.nodeListJson;
        this.operaUid = builder.operaUid;
        this.sceneDesc = builder.sceneDesc;
        this.sceneName = builder.sceneName;
        this.sceneOwner = builder.sceneOwner;
        this.sceneWebhook = builder.sceneWebhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return metricListJson
     */
    public String getMetricListJson() {
        return this.metricListJson;
    }

    /**
     * @return nodeListJson
     */
    public String getNodeListJson() {
        return this.nodeListJson;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sceneDesc
     */
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return sceneOwner
     */
    public String getSceneOwner() {
        return this.sceneOwner;
    }

    /**
     * @return sceneWebhook
     */
    public String getSceneWebhook() {
        return this.sceneWebhook;
    }

    public static final class Builder extends Request.Builder<CreateSceneRequest, Builder> {
        private String flowName; 
        private String metricListJson; 
        private String nodeListJson; 
        private String operaUid; 
        private String sceneDesc; 
        private String sceneName; 
        private String sceneOwner; 
        private String sceneWebhook; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.metricListJson = request.metricListJson;
            this.nodeListJson = request.nodeListJson;
            this.operaUid = request.operaUid;
            this.sceneDesc = request.sceneDesc;
            this.sceneName = request.sceneName;
            this.sceneOwner = request.sceneOwner;
            this.sceneWebhook = request.sceneWebhook;
        } 

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * MetricListJson.
         */
        public Builder metricListJson(String metricListJson) {
            this.putBodyParameter("MetricListJson", metricListJson);
            this.metricListJson = metricListJson;
            return this;
        }

        /**
         * NodeListJson.
         */
        public Builder nodeListJson(String nodeListJson) {
            this.putBodyParameter("NodeListJson", nodeListJson);
            this.nodeListJson = nodeListJson;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SceneDesc.
         */
        public Builder sceneDesc(String sceneDesc) {
            this.putBodyParameter("SceneDesc", sceneDesc);
            this.sceneDesc = sceneDesc;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putBodyParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * SceneOwner.
         */
        public Builder sceneOwner(String sceneOwner) {
            this.putBodyParameter("SceneOwner", sceneOwner);
            this.sceneOwner = sceneOwner;
            return this;
        }

        /**
         * SceneWebhook.
         */
        public Builder sceneWebhook(String sceneWebhook) {
            this.putBodyParameter("SceneWebhook", sceneWebhook);
            this.sceneWebhook = sceneWebhook;
            return this;
        }

        @Override
        public CreateSceneRequest build() {
            return new CreateSceneRequest(this);
        } 

    } 

}
