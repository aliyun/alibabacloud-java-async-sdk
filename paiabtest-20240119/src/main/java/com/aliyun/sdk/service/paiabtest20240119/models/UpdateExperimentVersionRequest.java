// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExperimentVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentVersionRequest</p>
 */
public class UpdateExperimentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentVersionId;

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

    private UpdateExperimentVersionRequest(Builder builder) {
        super(builder);
        this.experimentVersionId = builder.experimentVersionId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.crowdIds = builder.crowdIds;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.flow = builder.flow;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentVersionId
     */
    public String getExperimentVersionId() {
        return this.experimentVersionId;
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

    public static final class Builder extends Request.Builder<UpdateExperimentVersionRequest, Builder> {
        private String experimentVersionId; 
        private String regionId; 
        private String config; 
        private String crowdIds; 
        private String debugUsers; 
        private String description; 
        private Integer flow; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentVersionRequest request) {
            super(request);
            this.experimentVersionId = request.experimentVersionId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.crowdIds = request.crowdIds;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.flow = request.flow;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * ExperimentVersionId.
         */
        public Builder experimentVersionId(String experimentVersionId) {
            this.putPathParameter("ExperimentVersionId", experimentVersionId);
            this.experimentVersionId = experimentVersionId;
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
        public UpdateExperimentVersionRequest build() {
            return new UpdateExperimentVersionRequest(this);
        } 

    } 

}
