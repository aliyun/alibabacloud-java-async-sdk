// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExperimentVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentVersionRequest</p>
 */
public class CreateExperimentVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrowdIds")
    private String crowdIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Flow")
    private Integer flow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateExperimentVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.experimentId = builder.experimentId;
        this.flow = builder.flow;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentVersionRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return crowdIds
     */
    public String getCrowdIds() {
        return this.crowdIds;
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
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return flow
     */
    public Integer getFlow() {
        return this.flow;
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

    public static final class Builder extends Request.Builder<CreateExperimentVersionRequest, Builder> {
        private String regionId; 
        private String config; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private String experimentId; 
        private Integer flow; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.crowdIds = request.crowdIds;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.experimentId = request.experimentId;
            this.flow = request.flow;
            this.name = request.name;
            this.type = request.type;
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
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * CrowdIds.
         */
        public Builder crowdIds(String crowdIds) {
            this.putBodyParameter("CrowdIds", crowdIds);
            this.crowdIds = crowdIds;
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putBodyParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Flow.
         */
        public Builder flow(Integer flow) {
            this.putBodyParameter("Flow", flow);
            this.flow = flow;
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
        public CreateExperimentVersionRequest build() {
            return new CreateExperimentVersionRequest(this);
        } 

    } 

}
