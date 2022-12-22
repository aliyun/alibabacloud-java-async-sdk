// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaCollectionsRequest} extends {@link RequestModel}
 *
 * <p>ListMetaCollectionsRequest</p>
 */
public class ListMetaCollectionsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Administrator")
    private String administrator;

    @Query
    @NameInMap("CollectionType")
    @Validation(required = true)
    private String collectionType;

    @Query
    @NameInMap("Creator")
    private String creator;

    @Query
    @NameInMap("Follower")
    private String follower;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentQualifiedName")
    private String parentQualifiedName;

    private ListMetaCollectionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.administrator = builder.administrator;
        this.collectionType = builder.collectionType;
        this.creator = builder.creator;
        this.follower = builder.follower;
        this.keyword = builder.keyword;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.parentQualifiedName = builder.parentQualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaCollectionsRequest create() {
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
     * @return administrator
     */
    public String getAdministrator() {
        return this.administrator;
    }

    /**
     * @return collectionType
     */
    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return follower
     */
    public String getFollower() {
        return this.follower;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentQualifiedName
     */
    public String getParentQualifiedName() {
        return this.parentQualifiedName;
    }

    public static final class Builder extends Request.Builder<ListMetaCollectionsRequest, Builder> {
        private String regionId; 
        private String administrator; 
        private String collectionType; 
        private String creator; 
        private String follower; 
        private String keyword; 
        private String nextToken; 
        private String orderBy; 
        private Integer pageSize; 
        private String parentQualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaCollectionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.administrator = request.administrator;
            this.collectionType = request.collectionType;
            this.creator = request.creator;
            this.follower = request.follower;
            this.keyword = request.keyword;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.parentQualifiedName = request.parentQualifiedName;
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
         * Administrator.
         */
        public Builder administrator(String administrator) {
            this.putQueryParameter("Administrator", administrator);
            this.administrator = administrator;
            return this;
        }

        /**
         * CollectionType.
         */
        public Builder collectionType(String collectionType) {
            this.putQueryParameter("CollectionType", collectionType);
            this.collectionType = collectionType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Follower.
         */
        public Builder follower(String follower) {
            this.putQueryParameter("Follower", follower);
            this.follower = follower;
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
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
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

        /**
         * ParentQualifiedName.
         */
        public Builder parentQualifiedName(String parentQualifiedName) {
            this.putQueryParameter("ParentQualifiedName", parentQualifiedName);
            this.parentQualifiedName = parentQualifiedName;
            return this;
        }

        @Override
        public ListMetaCollectionsRequest build() {
            return new ListMetaCollectionsRequest(this);
        } 

    } 

}
