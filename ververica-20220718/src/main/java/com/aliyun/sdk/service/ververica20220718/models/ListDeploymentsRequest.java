// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentsRequest</p>
 */
public class ListDeploymentsRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("executionMode")
    private String executionMode;

    @Query
    @NameInMap("name")
    private String name;

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

    private ListDeploymentsRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.executionMode = builder.executionMode;
        this.name = builder.name;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentsRequest create() {
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
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ListDeploymentsRequest, Builder> {
        private String namespace; 
        private String executionMode; 
        private String name; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentsRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.executionMode = request.executionMode;
            this.name = request.name;
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
         * executionMode.
         */
        public Builder executionMode(String executionMode) {
            this.putQueryParameter("executionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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
        public ListDeploymentsRequest build() {
            return new ListDeploymentsRequest(this);
        } 

    } 

}
