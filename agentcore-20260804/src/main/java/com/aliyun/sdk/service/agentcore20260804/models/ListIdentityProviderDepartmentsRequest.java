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
 * {@link ListIdentityProviderDepartmentsRequest} extends {@link RequestModel}
 *
 * <p>ListIdentityProviderDepartmentsRequest</p>
 */
public class ListIdentityProviderDepartmentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("identityProviderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityProviderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("parentDepartmentId")
    private String parentDepartmentId;

    private ListIdentityProviderDepartmentsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.identityProviderType = builder.identityProviderType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentDepartmentId = builder.parentDepartmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderDepartmentsRequest create() {
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
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
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
     * @return parentDepartmentId
     */
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

    public static final class Builder extends Request.Builder<ListIdentityProviderDepartmentsRequest, Builder> {
        private String workspaceId; 
        private String identityProviderType; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentDepartmentId; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentityProviderDepartmentsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.identityProviderType = request.identityProviderType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentDepartmentId = request.parentDepartmentId;
        } 

        /**
         * <p>The ID of the AgentCore workspace to which the identity provider belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The type of the identity provider. DingTalk indicates DingTalk, and Feishu indicates Lark.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putPathParameter("identityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>The number of departments to return per page. Valid values: 1 to 50. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The nextToken returned from the previous page. Do not specify this parameter for the first query. When continuing pagination, keep the identity provider and parentDepartmentId unchanged, and pass the token as is. An empty or missing return value indicates that there are no subsequent pages at the current hierarchy level.</p>
         * 
         * <strong>example:</strong>
         * <p>example-next-page-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Queries the direct child departments of the specified department. If this parameter is not specified or is empty, the root hierarchy is queried, and all descendants are not recursively returned. When expanding a node in the list, pass the ID of the node, not its parentId.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder parentDepartmentId(String parentDepartmentId) {
            this.putQueryParameter("parentDepartmentId", parentDepartmentId);
            this.parentDepartmentId = parentDepartmentId;
            return this;
        }

        @Override
        public ListIdentityProviderDepartmentsRequest build() {
            return new ListIdentityProviderDepartmentsRequest(this);
        } 

    } 

}
