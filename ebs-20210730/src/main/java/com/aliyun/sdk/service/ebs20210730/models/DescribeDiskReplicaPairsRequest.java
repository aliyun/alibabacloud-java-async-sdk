// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskReplicaPairsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiskReplicaPairsRequest</p>
 */
public class DescribeDiskReplicaPairsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairIds")
    private String pairIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
    private String replicaGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeDiskReplicaPairsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pairIds = builder.pairIds;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
        this.resourceGroupId = builder.resourceGroupId;
        this.site = builder.site;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pairIds
     */
    public String getPairIds() {
        return this.pairIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaGroupId
     */
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDiskReplicaPairsRequest, Builder> {
        private Long maxResults; 
        private String name; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pairIds; 
        private String regionId; 
        private String replicaGroupId; 
        private String resourceGroupId; 
        private String site; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiskReplicaPairsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pairIds = request.pairIds;
            this.regionId = request.regionId;
            this.replicaGroupId = request.replicaGroupId;
            this.resourceGroupId = request.resourceGroupId;
            this.site = request.site;
            this.tag = request.tag;
        } 

        /**
         * <p>The maximum number of entries per page. You can use this parameter together with NextToken.</p>
         * <p>Valid values: 1 to 500.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the replication pair. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>name***</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken. If you specify NextToken, the PageSize and PageNumber request parameters do not take effect, and the TotalCount response parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
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
         * <p>The IDs of replication pairs. You can specify the IDs of one or more replication pairs and separate the IDs with commas (,). Example: <code>pair-cn-dsa****,pair-cn-asd****</code>.</p>
         * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried. You can specify a maximum of 100 replication pair IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>pair-cn-dsa****</p>
         */
        public Builder pairIds(String pairIds) {
            this.putQueryParameter("PairIds", pairIds);
            this.pairIds = pairIds;
            return this;
        }

        /**
         * <p>The region ID of the primary or secondary disk in the replication pair. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the replication pair-consistent group. You can specify the ID of a replication pair-consistent group to query the replication pairs in the group. Example: <code>pg-****</code>.</p>
         * <p>This parameter is empty by default, which indicates that all replication pairs in the specified region are queried.</p>
         * <blockquote>
         * <p> If this parameter is set to<code>-</code>, replication pairs that are not added to any replication pair-consistent groups are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pg-****</p>
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the replication pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvs******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the site from which the information of replication pairs is retrieved. Valid value:</p>
         * <ul>
         * <li>production: primary site</li>
         * <li>backup: secondary site</li>
         * </ul>
         * <p>Default value: production.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder site(String site) {
            this.putQueryParameter("Site", site);
            this.site = site;
            return this;
        }

        /**
         * <p>The tags. Up to 20 tags are supported.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairsRequest build() {
            return new DescribeDiskReplicaPairsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskReplicaPairsRequest} extends {@link TeaModel}
     *
     * <p>DescribeDiskReplicaPairsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
