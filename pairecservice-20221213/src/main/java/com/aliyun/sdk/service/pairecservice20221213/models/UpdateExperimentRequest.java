// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExperimentRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentRequest</p>
 */
public class UpdateExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Body
    @NameInMap("Config")
    private String config;

    @Body
    @NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @Body
    @NameInMap("DebugUsers")
    private String debugUsers;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("FlowPercent")
    private Integer flowPercent;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.config = builder.config;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.flowPercent = builder.flowPercent;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return debugCrowdId
     */
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    /**
     * @return debugUsers
     */
    public String getDebugUsers() {
        return this.debugUsers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowPercent
     */
    public Integer getFlowPercent() {
        return this.flowPercent;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentRequest, Builder> {
        private String experimentId; 
        private String config; 
        private String debugCrowdId; 
        private String debugUsers; 
        private String description; 
        private Integer flowPercent; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.config = request.config;
            this.debugCrowdId = request.debugCrowdId;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.flowPercent = request.flowPercent;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * DebugCrowdId.
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.putBodyParameter("DebugCrowdId", debugCrowdId);
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.putBodyParameter("DebugUsers", debugUsers);
            this.debugUsers = debugUsers;
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
         * FlowPercent.
         */
        public Builder flowPercent(Integer flowPercent) {
            this.putBodyParameter("FlowPercent", flowPercent);
            this.flowPercent = flowPercent;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateExperimentRequest build() {
            return new UpdateExperimentRequest(this);
        } 

    } 

}
