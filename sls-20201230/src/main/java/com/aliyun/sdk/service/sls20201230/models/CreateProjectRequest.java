// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @Body
    @NameInMap("dataRedundancyType")
    private String dataRedundancyType;

    @Body
    @NameInMap("description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.dataRedundancyType = builder.dataRedundancyType;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String dataRedundancyType; 
        private String description; 
        private String projectName; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.dataRedundancyType = request.dataRedundancyType;
            this.description = request.description;
            this.projectName = request.projectName;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * Data redundancy type
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putBodyParameter("dataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * The description of the project.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the project. The name must be unique in a region. You cannot change the name after you create the project. The name must meet the following requirements:
         * <p>
         * 
         * *   The name must be unique.
         * *   It can contain only lowercase letters, digits, and hyphens (-).
         * *   It must start and end with a lowercase letter or a digit.
         * *   It must be 3 to 63 characters in length.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
