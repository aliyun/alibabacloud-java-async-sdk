// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("conditions")
    private String conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("extraConditions")
    private String extraConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.category = builder.category;
        this.conditions = builder.conditions;
        this.extraConditions = builder.extraConditions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return extraConditions
     */
    public String getExtraConditions() {
        return this.extraConditions;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private String organizationId; 
        private String category; 
        private String conditions; 
        private String extraConditions; 
        private Long maxResults; 
        private String nextToken; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.category = request.category;
            this.conditions = request.conditions;
            this.extraConditions = request.extraConditions;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.scope = request.scope;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>{&quot;conditionGroups&quot;:[[]]}</p>
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * extraConditions.
         */
        public Builder extraConditions(String extraConditions) {
            this.putQueryParameter("extraConditions", extraConditions);
            this.extraConditions = extraConditions;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

}
