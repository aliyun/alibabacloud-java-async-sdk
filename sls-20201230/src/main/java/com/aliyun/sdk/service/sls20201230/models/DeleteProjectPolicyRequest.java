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
 * {@link DeleteProjectPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectPolicyRequest</p>
 */
public class DeleteProjectPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private DeleteProjectPolicyRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProjectPolicyRequest, Builder> {
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectPolicyRequest request) {
            super(request);
            this.project = request.project;
        } 

        /**
         * <p>The name of the project.</p>
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
        public DeleteProjectPolicyRequest build() {
            return new DeleteProjectPolicyRequest(this);
        } 

    } 

}
