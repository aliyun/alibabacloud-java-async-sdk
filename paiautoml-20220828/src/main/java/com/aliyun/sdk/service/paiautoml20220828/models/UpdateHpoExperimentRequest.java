// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>UpdateHpoExperimentRequest</p>
 */
public class UpdateHpoExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HpoExperimentConfiguration")
    private HpoExperimentConfig hpoExperimentConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateHpoExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.hpoExperimentConfiguration = builder.hpoExperimentConfiguration;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHpoExperimentRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hpoExperimentConfiguration
     */
    public HpoExperimentConfig getHpoExperimentConfiguration() {
        return this.hpoExperimentConfiguration;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateHpoExperimentRequest, Builder> {
        private String experimentId; 
        private String accessibility; 
        private String description; 
        private HpoExperimentConfig hpoExperimentConfiguration; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHpoExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.hpoExperimentConfiguration = request.hpoExperimentConfiguration;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Experiment ID.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Experiment accessibility, private or public.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Experiment description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Experiment configuration.
         */
        public Builder hpoExperimentConfiguration(HpoExperimentConfig hpoExperimentConfiguration) {
            this.putBodyParameter("HpoExperimentConfiguration", hpoExperimentConfiguration);
            this.hpoExperimentConfiguration = hpoExperimentConfiguration;
            return this;
        }

        /**
         * Experiment name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Expeirment\"s AI workspace ID.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateHpoExperimentRequest build() {
            return new UpdateHpoExperimentRequest(this);
        } 

    } 

}
