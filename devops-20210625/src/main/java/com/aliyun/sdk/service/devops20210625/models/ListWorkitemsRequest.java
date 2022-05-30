// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkitemsRequest</p>
 */
public class ListWorkitemsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("conditions")
    private String conditions;

    @Query
    @NameInMap("extraConditions")
    private String extraConditions;

    @Query
    @NameInMap("groupCondition")
    private String groupCondition;

    @Query
    @NameInMap("maxResults")
    private String maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("orderBy")
    private String orderBy;

    @Query
    @NameInMap("searchType")
    private String searchType;

    @Query
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Query
    @NameInMap("spaceType")
    @Validation(required = true)
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
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 工作项类型，需求为Req，缺陷为Bug，任务为Task，风险为Risk
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * 过滤条件
         */
        public Builder conditions(String conditions) {
            this.putQueryParameter("conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * 额外条件
         */
        public Builder extraConditions(String extraConditions) {
            this.putQueryParameter("extraConditions", extraConditions);
            this.extraConditions = extraConditions;
            return this;
        }

        /**
         * 分组条件
         */
        public Builder groupCondition(String groupCondition) {
            this.putQueryParameter("groupCondition", groupCondition);
            this.groupCondition = groupCondition;
            return this;
        }

        /**
         * 每页最大返回数量，0-200，默认值20
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页中的起始序列
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 排序顺序
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * 查询类型
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 项目类型
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
