// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaCollectionEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListMetaCollectionEntitiesRequest</p>
 */
public class ListMetaCollectionEntitiesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CollectionQualifiedName")
    @Validation(required = true)
    private String collectionQualifiedName;

    @Query
    @NameInMap("EntityType")
    private String entityType;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListMetaCollectionEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.collectionQualifiedName = builder.collectionQualifiedName;
        this.entityType = builder.entityType;
        this.keyword = builder.keyword;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaCollectionEntitiesRequest create() {
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
     * @return collectionQualifiedName
     */
    public String getCollectionQualifiedName() {
        return this.collectionQualifiedName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
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

    public static final class Builder extends Request.Builder<ListMetaCollectionEntitiesRequest, Builder> {
        private String regionId; 
        private String collectionQualifiedName; 
        private String entityType; 
        private String keyword; 
        private String nextToken; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaCollectionEntitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.collectionQualifiedName = request.collectionQualifiedName;
            this.entityType = request.entityType;
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
         * CollectionQualifiedName.
         */
        public Builder collectionQualifiedName(String collectionQualifiedName) {
            this.putQueryParameter("CollectionQualifiedName", collectionQualifiedName);
            this.collectionQualifiedName = collectionQualifiedName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListMetaCollectionEntitiesRequest build() {
            return new ListMetaCollectionEntitiesRequest(this);
        } 

    } 

}
