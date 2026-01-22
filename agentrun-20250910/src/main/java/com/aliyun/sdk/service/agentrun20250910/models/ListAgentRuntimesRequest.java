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
 * {@link ListAgentRuntimesRequest} extends {@link RequestModel}
 *
 * <p>ListAgentRuntimesRequest</p>
 */
public class ListAgentRuntimesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentRuntimeName")
    private String agentRuntimeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListAgentRuntimesRequest(Builder builder) {
        super(builder);
        this.agentRuntimeName = builder.agentRuntimeName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.searchMode = builder.searchMode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeName
     */
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAgentRuntimesRequest, Builder> {
        private String agentRuntimeName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String searchMode; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentRuntimesRequest request) {
            super(request);
            this.agentRuntimeName = request.agentRuntimeName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.searchMode = request.searchMode;
            this.status = request.status;
        } 

        /**
         * <p>根据智能体运行时名称进行模糊匹配过滤</p>
         * 
         * <strong>example:</strong>
         * <p>my-runtime</p>
         */
        public Builder agentRuntimeName(String agentRuntimeName) {
            this.putQueryParameter("agentRuntimeName", agentRuntimeName);
            this.agentRuntimeName = agentRuntimeName;
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
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>查询模式，支持精确查询和模糊查询</p>
         * 
         * <strong>example:</strong>
         * <p>fuzzy</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("searchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>根据状态进行过滤，多个状态用逗号分隔，支持精确匹配</p>
         * 
         * <strong>example:</strong>
         * <p>READY,CREATING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAgentRuntimesRequest build() {
            return new ListAgentRuntimesRequest(this);
        } 

    } 

}
