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
 * {@link DeleteLoggingRequest} extends {@link RequestModel}
 *
 * <p>DeleteLoggingRequest</p>
 */
public class DeleteLoggingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private DeleteLoggingRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoggingRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLoggingRequest, Builder> {
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLoggingRequest request) {
            super(request);
            this.project = request.project;
        } 

        /**
         * <p>Project名称。</p>
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

        @Override
        public DeleteLoggingRequest build() {
            return new DeleteLoggingRequest(this);
        } 

    } 

}
