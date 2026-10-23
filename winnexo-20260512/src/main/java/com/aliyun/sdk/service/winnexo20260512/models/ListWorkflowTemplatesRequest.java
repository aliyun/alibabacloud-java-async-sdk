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
 * {@link ListWorkflowTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowTemplatesRequest</p>
 */
public class ListWorkflowTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListWorkflowTemplatesRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowTemplatesRequest create() {
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
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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

    public static final class Builder extends Request.Builder<ListWorkflowTemplatesRequest, Builder> {
        private String collaborationGroupId; 
        private String keyword; 
        private Long maxResults; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowTemplatesRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of the collaboration space.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The keyword for fuzzy search in the template name or description.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Obtain the token from the nextToken parameter in the previous response. This parameter takes precedence over page if both are specified.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. This parameter is ignored if nextToken is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListWorkflowTemplatesRequest build() {
            return new ListWorkflowTemplatesRequest(this);
        } 

    } 

}
