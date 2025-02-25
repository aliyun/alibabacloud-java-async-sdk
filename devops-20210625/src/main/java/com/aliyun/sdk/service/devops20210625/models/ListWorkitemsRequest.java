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
 * {@link ListWorkitemsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkitemsRequest</p>
 */
public class ListWorkitemsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("groupCondition")
    private String groupCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceType;

    private ListWorkitemsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.category = builder.category;
        this.conditions = builder.conditions;
        this.extraConditions = builder.extraConditions;
        this.groupCondition = builder.groupCondition;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.searchType = builder.searchType;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemsRequest create() {
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
     * @return groupCondition
     */
    public String getGroupCondition() {
        return this.groupCondition;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<ListWorkitemsRequest, Builder> {
        private String organizationId; 
        private String category; 
        private String conditions; 
        private String extraConditions; 
        private String groupCondition; 
        private String maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String searchType; 
        private String spaceIdentifier; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkitemsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.category = request.category;
            this.conditions = request.conditions;
            this.extraConditions = request.extraConditions;
            this.groupCondition = request.groupCondition;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.searchType = request.searchType;
            this.spaceIdentifier = request.spaceIdentifier;
            this.spaceType = request.spaceType;
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
         * <p>Req</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * conditions.
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
         * groupCondition.
         */
        public Builder groupCondition(String groupCondition) {
            this.putQueryParameter("groupCondition", groupCondition);
            this.groupCondition = groupCondition;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(String maxResults) {
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
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * searchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8fb83debd69a6c7c6626......</p>
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public ListWorkitemsRequest build() {
            return new ListWorkitemsRequest(this);
        } 

    } 

}
