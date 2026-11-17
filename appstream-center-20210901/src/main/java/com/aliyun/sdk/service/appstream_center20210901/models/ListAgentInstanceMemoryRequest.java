// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAgentInstanceMemoryRequest} extends {@link RequestModel}
 *
 * <p>ListAgentInstanceMemoryRequest</p>
 */
public class ListAgentInstanceMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedEndUserIds")
    private java.util.List<String> excludedEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryStatuses")
    private java.util.List<String> memoryStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchType")
    private String searchType;

    private ListAgentInstanceMemoryRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.bizType = builder.bizType;
        this.endUserIds = builder.endUserIds;
        this.excludedEndUserIds = builder.excludedEndUserIds;
        this.memoryStatuses = builder.memoryStatuses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKeyword = builder.searchKeyword;
        this.searchType = builder.searchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return excludedEndUserIds
     */
    public java.util.List<String> getExcludedEndUserIds() {
        return this.excludedEndUserIds;
    }

    /**
     * @return memoryStatuses
     */
    public java.util.List<String> getMemoryStatuses() {
        return this.memoryStatuses;
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
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    public static final class Builder extends Request.Builder<ListAgentInstanceMemoryRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Integer bizType; 
        private java.util.List<String> endUserIds; 
        private java.util.List<String> excludedEndUserIds; 
        private java.util.List<String> memoryStatuses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKeyword; 
        private String searchType; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentInstanceMemoryRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.bizType = request.bizType;
            this.endUserIds = request.endUserIds;
            this.excludedEndUserIds = request.excludedEndUserIds;
            this.memoryStatuses = request.memoryStatuses;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKeyword = request.searchKeyword;
            this.searchType = request.searchType;
        } 

        /**
         * <p>Filters by the business platform to which the Agent belongs. If omitted, no restriction is applied to the business platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>Filters by Agent provider. If omitted, queries providers that support memory management. <code>JVSCopilot</code> is not supported for memory management in this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>AgenticComputer</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>Filters by business type code. If omitted, no restriction is applied to the business type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The list of end user IDs to include in the query results. Exact match is applied. You can specify up to 200 IDs.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The list of end user IDs to exclude from the query results. You can specify up to 200 IDs. If used together with EndUserIds, these users are excluded from the inclusion scope.</p>
         */
        public Builder excludedEndUserIds(java.util.List<String> excludedEndUserIds) {
            this.putQueryParameter("ExcludedEndUserIds", excludedEndUserIds);
            this.excludedEndUserIds = excludedEndUserIds;
            return this;
        }

        /**
         * <p>Filters by the memory switch configured for the instance.</p>
         * <ul>
         * <li><code>ENABLED</code>: The instance memory switch is turned on.</li>
         * <li><code>DISABLED</code>: The instance memory switch is turned off.
         * If both values are specified, instances matching either status are returned.</li>
         * </ul>
         */
        public Builder memoryStatuses(java.util.List<String> memoryStatuses) {
            this.putQueryParameter("MemoryStatuses", memoryStatuses);
            this.memoryStatuses = memoryStatuses;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. If this parameter is not specified or is set to 0, the first page is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The keyword used for inclusion matching. Specify the search field by using SearchType. If left empty, no keyword filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-d8ut</p>
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putQueryParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * <p>The search scope for the keyword. Default value: <code>ALL</code>.</p>
         * <ul>
         * <li><code>ALL</code>: Searches the resource ID, resource name, runtime ID, and end user ID.</li>
         * <li><code>RESOURCE_ID</code>: Searches the resource ID.</li>
         * <li><code>RESOURCE_NAME</code>: Searches the resource name.</li>
         * <li><code>RUNTIME_ID</code>: Searches the runtime ID.</li>
         * <li><code>END_USER_ID</code>: Searches the end user ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESOURCE_ID</p>
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        @Override
        public ListAgentInstanceMemoryRequest build() {
            return new ListAgentInstanceMemoryRequest(this);
        } 

    } 

}
