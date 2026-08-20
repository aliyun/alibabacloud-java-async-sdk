// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListScheduledTasksRequest} extends {@link RequestModel}
 *
 * <p>ListScheduledTasksRequest</p>
 */
public class ListScheduledTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("creatorOnly")
    private Boolean creatorOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("visibilities")
    private java.util.List<String> visibilities;

    private ListScheduledTasksRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.creatorOnly = builder.creatorOnly;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
        this.visibilities = builder.visibilities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return creatorOnly
     */
    public Boolean getCreatorOnly() {
        return this.creatorOnly;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return visibilities
     */
    public java.util.List<String> getVisibilities() {
        return this.visibilities;
    }

    public static final class Builder extends Request.Builder<ListScheduledTasksRequest, Builder> {
        private String collaborationGroupId; 
        private Boolean creatorOnly; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String tenantId; 
        private java.util.List<String> visibilities; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduledTasksRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.creatorOnly = request.creatorOnly;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
            this.visibilities = request.visibilities;
        } 

        /**
         * <p>协作群组 ID（如 cg_101）；传入时按群维度返回群任务（调用者需为有效群成员），未传时为个人维度（排除群任务）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putQueryParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>只看自己创建的任务；仅群维度生效（个人维度恒为自己的任务），不传表示不过滤</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder creatorOnly(Boolean creatorOnly) {
            this.putQueryParameter("creatorOnly", creatorOnly);
            this.creatorOnly = creatorOnly;
            return this;
        }

        /**
         * <p>任务名模糊搜索</p>
         * 
         * <strong>example:</strong>
         * <p>示例关键词</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>单页最大返回数量（1~100）；传入时优先于 pageSize</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>翻页令牌，取上次响应返回的 nextToken；传入时优先于 page，翻页过程中请保持 maxResults 不变</p>
         * 
         * <strong>example:</strong>
         * <p>eHiB8vca1XDyBT0cNAmThA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>每页条数（1~100）</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>按可见范围多选筛选：PRIVATE(仅创建人与群主可见)/COLLABORATIVE(指定协作成员可见)/PUBLIC(群内全员可见)；不传或空列表表示不筛；仅群维度（传 collaborationGroupId）生效，个人维度忽略</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder visibilities(java.util.List<String> visibilities) {
            String visibilitiesShrink = shrink(visibilities, "visibilities", "json");
            this.putQueryParameter("visibilities", visibilitiesShrink);
            this.visibilities = visibilities;
            return this;
        }

        @Override
        public ListScheduledTasksRequest build() {
            return new ListScheduledTasksRequest(this);
        } 

    } 

}
