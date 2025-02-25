// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectRequest</p>
 */
public class UpdateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    private UpdateProjectRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.description = builder.description;
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateProjectRequest, Builder> {
        private String project; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectRequest request) {
            super(request);
            this.project = request.project;
            this.description = request.description;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-project-test</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The description of the project. The default value is an empty string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of my-project-test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateProjectRequest build() {
            return new UpdateProjectRequest(this);
        } 

    } 

}
