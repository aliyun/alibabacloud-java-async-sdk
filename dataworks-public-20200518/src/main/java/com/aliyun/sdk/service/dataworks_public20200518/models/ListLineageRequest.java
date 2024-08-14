// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLineageRequest} extends {@link RequestModel}
 *
 * <p>ListLineageRequest</p>
 */
public class ListLineageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityQualifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityQualifiedName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.direction = builder.direction;
        this.entityQualifiedName = builder.entityQualifiedName;
        this.keyword = builder.keyword;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLineageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return entityQualifiedName
     */
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListLineageRequest, Builder> {
        private String regionId; 
        private String direction; 
        private String entityQualifiedName; 
        private String keyword; 
        private String nextToken; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.direction = request.direction;
            this.entityQualifiedName = request.entityQualifiedName;
            this.keyword = request.keyword;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The lineage type. Valid values:\
         * <p>
         * up: ancestor lineage\
         * down: descendant lineage
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The unique identifier of the entity.
         */
        public Builder entityQualifiedName(String entityQualifiedName) {
            this.putQueryParameter("EntityQualifiedName", entityQualifiedName);
            this.entityQualifiedName = entityQualifiedName;
            return this;
        }

        /**
         * The keyword of the entity name.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListLineageRequest build() {
            return new ListLineageRequest(this);
        } 

    } 

}
