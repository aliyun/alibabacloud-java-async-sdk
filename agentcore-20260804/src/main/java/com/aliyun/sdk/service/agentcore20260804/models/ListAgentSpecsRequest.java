// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListAgentSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentSpecsRequest</p>
 */
public class ListAgentSpecsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpecName")
    private String agentSpecName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizTag")
    private String bizTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("search")
    private String search;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withCapabilities")
    private Boolean withCapabilities;

    private ListAgentSpecsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentSpecName = builder.agentSpecName;
        this.bizTag = builder.bizTag;
        this.orderBy = builder.orderBy;
        this.owner = builder.owner;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scope = builder.scope;
        this.search = builder.search;
        this.withCapabilities = builder.withCapabilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSpecsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentSpecName
     */
    public String getAgentSpecName() {
        return this.agentSpecName;
    }

    /**
     * @return bizTag
     */
    public String getBizTag() {
        return this.bizTag;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return withCapabilities
     */
    public Boolean getWithCapabilities() {
        return this.withCapabilities;
    }

    public static final class Builder extends Request.Builder<ListAgentSpecsRequest, Builder> {
        private String workspaceId; 
        private String agentSpecName; 
        private String bizTag; 
        private String orderBy; 
        private String owner; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String scope; 
        private String search; 
        private Boolean withCapabilities; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentSpecsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentSpecName = request.agentSpecName;
            this.bizTag = request.bizTag;
            this.orderBy = request.orderBy;
            this.owner = request.owner;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scope = request.scope;
            this.search = request.search;
            this.withCapabilities = request.withCapabilities;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The AgentSpec name used as a search keyword. Use this parameter together with the search parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>my-worker</p>
         */
        public Builder agentSpecName(String agentSpecName) {
            this.putQueryParameter("agentSpecName", agentSpecName);
            this.agentSpecName = agentSpecName;
            return this;
        }

        /**
         * <p>The business tag used for fuzzy filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>ai</p>
         */
        public Builder bizTag(String bizTag) {
            this.putQueryParameter("bizTag", bizTag);
            this.bizTag = bizTag;
            return this;
        }

        /**
         * <p>The field by which to sort results. Set this parameter to download_count to sort by download count. By default, results are sorted by update time.</p>
         * 
         * <strong>example:</strong>
         * <p>download_count</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The owner used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("pageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
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
         * <p>The visibility scope used to filter results. Valid values:</p>
         * <ul>
         * <li>PUBLIC</li>
         * <li>PRIVATE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The search mode. Valid values:</p>
         * <ul>
         * <li>accurate: exact match.</li>
         * <li>blur: fuzzy match.</li>
         * </ul>
         * <p>Default value: blur.</p>
         * 
         * <strong>example:</strong>
         * <p>blur</p>
         */
        public Builder search(String search) {
            this.putQueryParameter("search", search);
            this.search = search;
            return this;
        }

        /**
         * <p>Specifies whether to return the Skills and McpServers lists. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withCapabilities(Boolean withCapabilities) {
            this.putQueryParameter("withCapabilities", withCapabilities);
            this.withCapabilities = withCapabilities;
            return this;
        }

        @Override
        public ListAgentSpecsRequest build() {
            return new ListAgentSpecsRequest(this);
        } 

    } 

}
