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
 * {@link CreateConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigRequest</p>
 */
public class CreateConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private LogtailConfig body;

    private CreateConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigRequest create() {
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
    public LogtailConfig getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateConfigRequest, Builder> {
        private String project; 
        private LogtailConfig body; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigRequest request) {
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
         * <p>The body of the request.</p>
         */
        public Builder body(LogtailConfig body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateConfigRequest build() {
            return new CreateConfigRequest(this);
        } 

    } 

}
