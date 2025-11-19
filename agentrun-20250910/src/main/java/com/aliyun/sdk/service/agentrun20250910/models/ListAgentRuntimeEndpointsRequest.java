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
 * {@link ListAgentRuntimeEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentRuntimeEndpointsRequest</p>
 */
public class ListAgentRuntimeEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endpointName")
    private String endpointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchMode")
    private String searchMode;

    private ListAgentRuntimeEndpointsRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.endpointName = builder.endpointName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchMode = builder.searchMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentRuntimeEndpointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
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
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    public static final class Builder extends Request.Builder<ListAgentRuntimeEndpointsRequest, Builder> {
        private String agentRuntimeId; 
        private String endpointName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchMode; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentRuntimeEndpointsRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.endpointName = request.endpointName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchMode = request.searchMode;
        } 

        /**
         * <p>智能体运行时实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putPathParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * <p>根据端点名称进行模糊匹配过滤</p>
         * 
         * <strong>example:</strong>
         * <p>my-endpoint</p>
         */
        public Builder endpointName(String endpointName) {
            this.putQueryParameter("endpointName", endpointName);
            this.endpointName = endpointName;
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

        @Override
        public ListAgentRuntimeEndpointsRequest build() {
            return new ListAgentRuntimeEndpointsRequest(this);
        } 

    } 

}
