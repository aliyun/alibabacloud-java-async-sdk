// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobRequest</p>
 */
public class DeleteJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteJobRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.jobId = builder.jobId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteJobRequest, Builder> {
        private String namespace; 
        private String jobId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.jobId = request.jobId;
            this.workspace = request.workspace;
        } 

        /**
         * The namespace ID.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The job ID.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteJobRequest build() {
            return new DeleteJobRequest(this);
        } 

    } 

}
