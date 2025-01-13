// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The lineage type. Valid values:<br>up: ancestor lineage<br>down: descendant lineage</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The unique identifier of the entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table.project.table</p>
         */
        public Builder entityQualifiedName(String entityQualifiedName) {
            this.putQueryParameter("EntityQualifiedName", entityQualifiedName);
            this.entityQualifiedName = entityQualifiedName;
            return this;
        }

        /**
         * <p>The keyword of the entity name.</p>
         * 
         * <strong>example:</strong>
         * <p>name-keyword</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>next-token-from-previous-request</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
