// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Environment body;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public Environment getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private String project; 
        private String name; 
        private Environment body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putPathParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(Environment body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

}
