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
 * {@link CreateIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexRequest</p>
 */
public class CreateIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Index body;

    private CreateIndexRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndexRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
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
    public Index getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateIndexRequest, Builder> {
        private String logstore; 
        private String project; 
        private Index body; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
            this.body = request.body;
        } 

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-logstore-test</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
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
         * <p>The request body.</p>
         */
        public Builder body(Index body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateIndexRequest build() {
            return new CreateIndexRequest(this);
        } 

    } 

}
