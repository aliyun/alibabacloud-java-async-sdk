// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCachesRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageCachesRequest</p>
 */
public class DescribeImageCachesRequest extends Request {
    @Query
    @NameInMap("Image")
    private String image;

    @Query
    @NameInMap("ImageCacheId")
    private String imageCacheId;

    @Query
    @NameInMap("ImageCacheName")
    private String imageCacheName;

    @Query
    @NameInMap("ImageFullMatch")
    private Boolean imageFullMatch;

    @Query
    @NameInMap("ImageMatchCountRequest")
    private Integer imageMatchCountRequest;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("MatchImage")
    private java.util.List < String > matchImage;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeImageCachesRequest(Builder builder) {
        super(builder);
        this.image = builder.image;
        this.imageCacheId = builder.imageCacheId;
        this.imageCacheName = builder.imageCacheName;
        this.imageFullMatch = builder.imageFullMatch;
        this.imageMatchCountRequest = builder.imageMatchCountRequest;
        this.limit = builder.limit;
        this.matchImage = builder.matchImage;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.snapshotId = builder.snapshotId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    /**
     * @return imageCacheName
     */
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    /**
     * @return imageFullMatch
     */
    public Boolean getImageFullMatch() {
        return this.imageFullMatch;
    }

    /**
     * @return imageMatchCountRequest
     */
    public Integer getImageMatchCountRequest() {
        return this.imageMatchCountRequest;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return matchImage
     */
    public java.util.List < String > getMatchImage() {
        return this.matchImage;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeImageCachesRequest, Builder> {
        private String image; 
        private String imageCacheId; 
        private String imageCacheName; 
        private Boolean imageFullMatch; 
        private Integer imageMatchCountRequest; 
        private Integer limit; 
        private java.util.List < String > matchImage; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String snapshotId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageCachesRequest request) {
            super(request);
            this.image = request.image;
            this.imageCacheId = request.imageCacheId;
            this.imageCacheName = request.imageCacheName;
            this.imageFullMatch = request.imageFullMatch;
            this.imageMatchCountRequest = request.imageMatchCountRequest;
            this.limit = request.limit;
            this.matchImage = request.matchImage;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.snapshotId = request.snapshotId;
            this.tag = request.tag;
        } 

        /**
         * The container images.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * The IDs of the image caches.
         */
        public Builder imageCacheId(String imageCacheId) {
            this.putQueryParameter("ImageCacheId", imageCacheId);
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * The names of the image caches.
         */
        public Builder imageCacheName(String imageCacheName) {
            this.putQueryParameter("ImageCacheName", imageCacheName);
            this.imageCacheName = imageCacheName;
            return this;
        }

        /**
         * Specifies whether the image layers of the image caches must contain all image layers of the container image.\
         * <p>
         * If you configure MatchImage, you can configure this parameter to further filter query results.
         */
        public Builder imageFullMatch(Boolean imageFullMatch) {
            this.putQueryParameter("ImageFullMatch", imageFullMatch);
            this.imageFullMatch = imageFullMatch;
            return this;
        }

        /**
         * The quantity of image caches whose image layers contain all image layers of the container image.\
         * <p>
         * If you configure MatchImage, you can configure this parameter to further filter query results.
         */
        public Builder imageMatchCountRequest(Integer imageMatchCountRequest) {
            this.putQueryParameter("ImageMatchCountRequest", imageMatchCountRequest);
            this.imageMatchCountRequest = imageMatchCountRequest;
            return this;
        }

        /**
         * The maximum entries of query results that are allowed to be displayed.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The container images used to match the image caches that you want to query. You can specify a maximum of 100 container images.
         */
        public Builder matchImage(java.util.List < String > matchImage) {
            this.putQueryParameter("MatchImage", matchImage);
            this.matchImage = matchImage;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID of the image caches.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the image caches belong.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The IDs of the snapshots that correspond to the image caches.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The tags to add to the image caches.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeImageCachesRequest build() {
            return new DescribeImageCachesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N of the image cache.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the image cache.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
