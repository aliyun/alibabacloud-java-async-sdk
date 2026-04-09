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
 * {@link ListToolsRequest} extends {@link RequestModel}
 *
 * <p>ListToolsRequest</p>
 */
public class ListToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("toolType")
    private String toolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceIds")
    private String workspaceIds;

    private ListToolsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.toolName = builder.toolName;
        this.toolType = builder.toolType;
        this.workspaceId = builder.workspaceId;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListToolsRequest create() {
        return builder().build();
    }

@Override
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
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    /**
     * @return toolType
     */
    public String getToolType() {
        return this.toolType;
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

    public static final class Builder extends Request.Builder<ListToolsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String toolName; 
        private String toolType; 
        private String workspaceId; 
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListToolsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.toolName = request.toolName;
            this.toolType = request.toolType;
            this.workspaceId = request.workspaceId;
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * <p>当前页码，从 1 开始</p>
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
         * <p>每页返回的工具数量，用于分页查询</p>
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
         * toolName.
         */
        public Builder toolName(String toolName) {
            this.putQueryParameter("toolName", toolName);
            this.toolName = toolName;
            return this;
        }

        /**
         * <p>按工具类型过滤，可选值：MCP、FUNCTIONCALL、SKILL</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        public Builder toolType(String toolType) {
            this.putQueryParameter("toolType", toolType);
            this.toolType = toolType;
            return this;
        }

        /**
         * <p>按工作空间ID过滤，查询指定工作空间下的工具</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-xyz789</p>
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
        public ListToolsRequest build() {
            return new ListToolsRequest(this);
        } 

    } 

}
