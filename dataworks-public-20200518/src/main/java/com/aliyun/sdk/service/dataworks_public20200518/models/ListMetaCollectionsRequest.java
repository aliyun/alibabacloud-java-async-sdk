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
 * {@link ListMetaCollectionsRequest} extends {@link RequestModel}
 *
 * <p>ListMetaCollectionsRequest</p>
 */
public class ListMetaCollectionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Administrator")
    private String administrator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CollectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Follower")
    private String follower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentQualifiedName")
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
         * <p>The ID of the collection administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>1200759642363000</p>
         */
        public Builder administrator(String administrator) {
            this.putQueryParameter("Administrator", administrator);
            this.administrator = administrator;
            return this;
        }

        /**
         * <ul>
         * <li>ALBUM: data album </li>
         * <li>ALBUM_CATEGORY: category in a data album</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALBUM</p>
         */
        public Builder collectionType(String collectionType) {
            this.putQueryParameter("CollectionType", collectionType);
            this.collectionType = collectionType;
            return this;
        }

        /**
         * <p>The ID of the collection creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1200759642363000</p>
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The ID of the collection follower.</p>
         * 
         * <strong>example:</strong>
         * <p>1200759642363000</p>
         */
        public Builder follower(String follower) {
            this.putQueryParameter("Follower", follower);
            this.follower = follower;
            return this;
        }

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>12345</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the sorting field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the parent collection.</p>
         * 
         * <strong>example:</strong>
         * <p>Album.1234</p>
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
