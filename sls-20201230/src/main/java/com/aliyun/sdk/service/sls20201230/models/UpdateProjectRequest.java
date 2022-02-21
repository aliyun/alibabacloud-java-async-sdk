// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
    @Body
    @NameInMap("description")
    private String description;

    @Host
    @NameInMap("project")
    private String project;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectRequest create() {
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private String description; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest response) {
            super(response);
            this.description = response.description;
            this.project = response.project;
        } 

        /**
         * Project description
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * Project name
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

}
