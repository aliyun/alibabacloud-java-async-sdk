// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWorkspacesOutput} extends {@link TeaModel}
 *
 * <p>ListWorkspacesOutput</p>
 */
public class ListWorkspacesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("workspaces")
    private java.util.List<Workspace> workspaces;

    private ListWorkspacesOutput(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
        this.workspaces = builder.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return workspaces
     */
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long total; 
        private java.util.List<Workspace> workspaces; 

        private Builder() {
        } 

        private Builder(ListWorkspacesOutput model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.total = model.total;
            this.workspaces = model.workspaces;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * workspaces.
         */
        public Builder workspaces(java.util.List<Workspace> workspaces) {
            this.workspaces = workspaces;
            return this;
        }

        public ListWorkspacesOutput build() {
            return new ListWorkspacesOutput(this);
        } 

    } 

}
