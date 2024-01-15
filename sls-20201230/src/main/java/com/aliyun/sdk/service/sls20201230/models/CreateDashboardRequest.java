// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateDashboardRequest} extends {@link RequestModel}
 *
 * <p>CreateDashboardRequest</p>
 */
public class CreateDashboardRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private Dashboard body;

    private CreateDashboardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDashboardRequest create() {
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
     * @return body
     */
    public Dashboard getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateDashboardRequest, Builder> {
        private String project; 
        private Dashboard body; 

        private Builder() {
            super();
        } 

        private Builder(CreateDashboardRequest request) {
            super(request);
            this.project = request.project;
            this.body = request.body;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The data structure of the dashboard.
         */
        public Builder body(Dashboard body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateDashboardRequest build() {
            return new CreateDashboardRequest(this);
        } 

    } 

}
