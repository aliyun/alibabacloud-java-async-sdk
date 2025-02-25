// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>CreateHpoExperimentRequest</p>
 */
public class CreateHpoExperimentRequest extends Request {
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

    private CreateHpoExperimentRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.hpoExperimentConfiguration = builder.hpoExperimentConfiguration;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHpoExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateHpoExperimentRequest, Builder> {
        private String accessibility; 
        private String description; 
        private HpoExperimentConfig hpoExperimentConfiguration; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHpoExperimentRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.hpoExperimentConfiguration = request.hpoExperimentConfiguration;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Experiment accesibility, public or private.
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
         * The config object of the expriment.
         */
        public Builder hpoExperimentConfiguration(HpoExperimentConfig hpoExperimentConfiguration) {
            this.putBodyParameter("HpoExperimentConfiguration", hpoExperimentConfiguration);
            this.hpoExperimentConfiguration = hpoExperimentConfiguration;
            return this;
        }

        /**
         * Experiment Name
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * AI Workspace ID
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateHpoExperimentRequest build() {
            return new CreateHpoExperimentRequest(this);
        } 

    } 

}
