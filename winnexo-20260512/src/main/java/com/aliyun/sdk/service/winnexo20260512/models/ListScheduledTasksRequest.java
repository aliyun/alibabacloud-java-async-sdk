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
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

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
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.creatorOnly = builder.creatorOnly;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String collaborationGroupId; 
        private Boolean creatorOnly; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String opsUserCode; 
        private String opsUserId; 
        private Long page; 
        private Long pageSize; 
        private String tenantId; 
        private java.util.List<String> visibilities; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduledTasksRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.collaborationGroupId = request.collaborationGroupId;
            this.creatorOnly = request.creatorOnly;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
            this.visibilities = request.visibilities;
        } 

        /**
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The ID of the collaboration group to which the task belongs, such as cg_101. If this parameter is specified, a group space task is created, and the caller must be a valid group member. If this parameter is left empty, a personal task is created.</p>
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
         * <p>Specifies whether to view only tasks created by yourself. This parameter takes effect only at the group level (at the personal level, tasks are always your own). If this parameter is not specified, no filtering is applied.</p>
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
         * <p>The keyword in the rule name for fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample keyword</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of records to return for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page.</p>
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
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The page number for pagination. Default value: 1.</p>
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
         * <p>The number of entries to return per page.</p>
         * <blockquote>
         * <p>The maximum number of entries per page is 30.</p>
         * </blockquote>
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
         * <p>The effective tenant ID.</p>
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
         * <p>Filters tasks by visibility scope. Multiple values can be selected. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaboration members), and PUBLIC (visible to all group members). If this parameter is not specified or an empty list is passed, no filtering is applied. This parameter takes effect only at the group level (when collaborationGroupId is specified) and is ignored at the personal level.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;PRIVATE&quot;]</p>
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
