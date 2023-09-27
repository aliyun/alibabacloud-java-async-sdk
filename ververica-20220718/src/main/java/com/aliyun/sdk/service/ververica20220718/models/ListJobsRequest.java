// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsRequest} extends {@link RequestModel}
 *
 * <p>ListJobsRequest</p>
 */
public class ListJobsRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("deploymentId")
    @Validation(required = true)
    private String deploymentId;

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

    private ListJobsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.deploymentId = builder.deploymentId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsRequest create() {
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

    public static final class Builder extends Request.Builder<ListJobsRequest, Builder> {
        private String namespace; 
        private String deploymentId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.deploymentId = request.deploymentId;
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
        public ListJobsRequest build() {
            return new ListJobsRequest(this);
        } 

    } 

}
