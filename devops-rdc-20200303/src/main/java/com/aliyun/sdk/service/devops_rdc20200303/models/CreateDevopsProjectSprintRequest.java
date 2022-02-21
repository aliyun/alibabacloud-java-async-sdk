// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectSprintRequest} extends {@link RequestModel}
 *
 * <p>CreateDevopsProjectSprintRequest</p>
 */
public class CreateDevopsProjectSprintRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DueDate")
    private String dueDate;

    @Body
    @NameInMap("ExecutorId")
    @Validation(required = true)
    private String executorId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    private CreateDevopsProjectSprintRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.dueDate = builder.dueDate;
        this.executorId = builder.executorId;
        this.name = builder.name;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevopsProjectSprintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dueDate
     */
    public String getDueDate() {
        return this.dueDate;
    }

    /**
     * @return executorId
     */
    public String getExecutorId() {
        return this.executorId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CreateDevopsProjectSprintRequest, Builder> {
        private String description; 
        private String dueDate; 
        private String executorId; 
        private String name; 
        private String orgId; 
        private String projectId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevopsProjectSprintRequest response) {
            super(response);
            this.description = response.description;
            this.dueDate = response.dueDate;
            this.executorId = response.executorId;
            this.name = response.name;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.startDate = response.startDate;
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
         * DueDate.
         */
        public Builder dueDate(String dueDate) {
            this.putBodyParameter("DueDate", dueDate);
            this.dueDate = dueDate;
            return this;
        }

        /**
         * ExecutorId.
         */
        public Builder executorId(String executorId) {
            this.putBodyParameter("ExecutorId", executorId);
            this.executorId = executorId;
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
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CreateDevopsProjectSprintRequest build() {
            return new CreateDevopsProjectSprintRequest(this);
        } 

    } 

}
