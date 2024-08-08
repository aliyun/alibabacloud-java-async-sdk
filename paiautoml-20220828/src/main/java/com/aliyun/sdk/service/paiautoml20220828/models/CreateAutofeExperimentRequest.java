// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutofeExperimentRequest} extends {@link RequestModel}
 *
 * <p>CreateAutofeExperimentRequest</p>
 */
public class CreateAutofeExperimentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutofeExperimentConfiguration")
    private AutofeExperimentConfiguration autofeExperimentConfiguration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateAutofeExperimentRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.autofeExperimentConfiguration = builder.autofeExperimentConfiguration;
        this.description = builder.description;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutofeExperimentRequest create() {
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
     * @return autofeExperimentConfiguration
     */
    public AutofeExperimentConfiguration getAutofeExperimentConfiguration() {
        return this.autofeExperimentConfiguration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CreateAutofeExperimentRequest, Builder> {
        private String accessibility; 
        private AutofeExperimentConfiguration autofeExperimentConfiguration; 
        private String description; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutofeExperimentRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.autofeExperimentConfiguration = request.autofeExperimentConfiguration;
            this.description = request.description;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
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
         * AutofeExperimentConfiguration.
         */
        public Builder autofeExperimentConfiguration(AutofeExperimentConfiguration autofeExperimentConfiguration) {
            this.putBodyParameter("AutofeExperimentConfiguration", autofeExperimentConfiguration);
            this.autofeExperimentConfiguration = autofeExperimentConfiguration;
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
        public CreateAutofeExperimentRequest build() {
            return new CreateAutofeExperimentRequest(this);
        } 

    } 

}
