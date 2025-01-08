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
 * {@link CreateDashboardRequest} extends {@link RequestModel}
 *
 * <p>CreateDashboardRequest</p>
 */
public class CreateDashboardRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The data structure of the dashboard.</p>
         * <p>This parameter is required.</p>
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
