// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSavepointsRequest} extends {@link RequestModel}
 *
 * <p>ListSavepointsRequest</p>
 */
public class ListSavepointsRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("deploymentId")
    private String deploymentId;

    @Query
    @NameInMap("jobId")
    private String jobId;

    @Query
    @NameInMap("pageIndex")
    private Integer pageIndex;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
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
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.putQueryParameter("deploymentId", deploymentId);
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * workspace.
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
