// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ListWorkFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkFlowsRequest</p>
 */
public class ListWorkFlowsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    private ListWorkFlowsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkFlowsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<ListWorkFlowsRequest, Builder> {
        private String groupId; 
        private String namespace; 
        private String namespaceSource; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 
        private Integer status; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkFlowsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
            this.workflowName = request.workflowName;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hxm.test</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a06d5ea-f576-4326-842c-fb14ea043d8d</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace. This parameter is required only for special sources.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The job status.</p>
         * <ul>
         * <li><strong>0</strong>: disables the job.</li>
         * <li><strong>1</strong>: enables the routing policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>test3</p>
         */
        public Builder workflowName(String workflowName) {
            this.putQueryParameter("WorkflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public ListWorkFlowsRequest build() {
            return new ListWorkFlowsRequest(this);
        } 

    } 

}
