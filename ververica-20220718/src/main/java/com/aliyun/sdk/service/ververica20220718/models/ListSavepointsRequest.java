// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSavepointsRequest} extends {@link RequestModel}
 *
 * <p>ListSavepointsRequest</p>
 */
public class ListSavepointsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListSavepointsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentId = builder.deploymentId;
        this.jobId = builder.jobId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavepointsRequest create() {
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
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListSavepointsRequest, Builder> {
        private String namespace; 
        private String deploymentId; 
        private String jobId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListSavepointsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentId = request.deploymentId;
            this.jobId = request.jobId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The deployment ID. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>88a8fc49-e090-430a-85d8-3ee8c79c****</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.putQueryParameter("deploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>The job ID. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>99a8fc49-e090-430a-85d8-3ee8c79c****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListSavepointsRequest build() {
            return new ListSavepointsRequest(this);
        } 

    } 

}
