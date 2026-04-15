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
 * {@link ListFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowsRequest</p>
 */
public class ListFlowsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("flowName")
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceIds")
    private String workspaceIds;

    private ListFlowsRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.workspaceId = builder.workspaceId;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<ListFlowsRequest, Builder> {
        private String flowName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String workspaceId; 
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowsRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.workspaceId = request.workspaceId;
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * <p>根据工作流名称进行模糊匹配过滤</p>
         * 
         * <strong>example:</strong>
         * <p>my-flow</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("flowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>当前页码，从1开始计数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>每页返回的记录数量</p>
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
         * <p>根据工作空间ID进行过滤，用于资源隔离和权限管理</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * workspaceIds.
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("workspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public ListFlowsRequest build() {
            return new ListFlowsRequest(this);
        } 

    } 

}
