// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHpoExperimentRequest} extends {@link RequestModel}
 *
 * <p>UpdateHpoExperimentRequest</p>
 */
public class UpdateHpoExperimentRequest extends Request {
    @Path
    @NameInMap("ExperimentId")
    private String experimentId;

    @Body
    @NameInMap("Accessibility")
    private String accessibility;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("HpoExperimentConfiguration")
    private HpoExperimentConfig hpoExperimentConfiguration;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("WorkspaceId")
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
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
         * HpoExperimentConfiguration.
         */
        public Builder hpoExperimentConfiguration(HpoExperimentConfig hpoExperimentConfiguration) {
            this.putBodyParameter("HpoExperimentConfiguration", hpoExperimentConfiguration);
            this.hpoExperimentConfiguration = hpoExperimentConfiguration;
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
         * WorkspaceId.
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
