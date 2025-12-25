// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateThreadRequest} extends {@link RequestModel}
 *
 * <p>CreateThreadRequest</p>
 */
public class CreateThreadRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private Variables variables;

    private CreateThreadRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.title = builder.title;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThreadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return variables
     */
    public Variables getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateThreadRequest, Builder> {
        private String name; 
        private String title; 
        private Variables variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateThreadRequest request) {
            super(request);
            this.name = request.name;
            this.title = request.title;
            this.variables = request.variables;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(Variables variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateThreadRequest build() {
            return new CreateThreadRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateThreadRequest} extends {@link TeaModel}
     *
     * <p>CreateThreadRequest</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Variables(Builder builder) {
            this.project = builder.project;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String project; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.project = model.project;
                this.workspace = model.workspace;
            } 

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
}
