// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link UpdateSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneRequest</p>
 */
public class UpdateSceneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Flows")
    private java.util.List<Flows> flows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.flows = builder.flows;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flows
     */
    public java.util.List<Flows> getFlows() {
        return this.flows;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateSceneRequest, Builder> {
        private String sceneId; 
        private String regionId; 
        private String description; 
        private java.util.List<Flows> flows; 
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.flows = request.flows;
            this.instanceId = request.instanceId;
            this.name = request.name;
        } 

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putPathParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Flows.
         */
        public Builder flows(java.util.List<Flows> flows) {
            this.putBodyParameter("Flows", flows);
            this.flows = flows;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSceneRequest build() {
            return new UpdateSceneRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSceneRequest} extends {@link TeaModel}
     *
     * <p>UpdateSceneRequest</p>
     */
    public static class Flows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowCode")
        private String flowCode;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        private Flows(Builder builder) {
            this.flowCode = builder.flowCode;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return flowCode
         */
        public String getFlowCode() {
            return this.flowCode;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private String flowCode; 
            private String flowName; 

            /**
             * FlowCode.
             */
            public Builder flowCode(String flowCode) {
                this.flowCode = flowCode;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
}
