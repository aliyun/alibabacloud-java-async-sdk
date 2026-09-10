// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeColdStorageInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeColdStorageInstanceRequest</p>
 */
public class DescribeColdStorageInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private DescribeColdStorageInstanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.engineType = builder.engineType;
        this.expireTime = builder.expireTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.objectType = builder.objectType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColdStorageInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DescribeColdStorageInstanceRequest, Builder> {
        private String DBClusterId; 
        private String DBName; 
        private String engineType; 
        private Integer expireTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String objectType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeColdStorageInstanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBName = request.DBName;
            this.engineType = request.engineType;
            this.expireTime = request.expireTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.objectType = request.objectType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tableName = request.tableName;
        } 

        /**
         * <p>The ID of the PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-wz9062015ly7526jc</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The type of the supported engine. The return value is the sum of the values of the supported engine types.</p>
         * <ul>
         * <li><p>1: Search engine</p>
         * </li>
         * <li><p>2: LindormTSDB</p>
         * </li>
         * <li><p>4: LindormTable</p>
         * </li>
         * <li><p>8: File engine</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For example, if \<code>EngineType\\</code> is 15 (8 + 4 + 2 + 1), the instance supports the search engine, LindormTSDB, LindormTable, and file engine. If \<code>EngineType\\</code> is 6 (4 + 2), the instance supports LindormTSDB and LindormTable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The expiration time of the cluster. Note: This parameter is returned only for subscription clusters. An empty value is returned for pay-as-you-go clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <ul>
         * <li><p>If you do not specify the <strong>MaxResults</strong> parameter, the query is not paged. The value of the <strong>MaxResults</strong> parameter in the response indicates the total number of entries.</p>
         * </li>
         * <li><p>If you specify the <strong>MaxResults</strong> parameter, the query is paged. <strong>MaxResults</strong> specifies the number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. The value of the <strong>MaxResults</strong> parameter in the response indicates the number of entries on the current page. The recommended value is <strong>20</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A token to retrieve the next page of results. Set this parameter to the \<code>NextToken\\</code> value from a previous call. You do not need to specify this parameter for the first call.</p>
         * 
         * <strong>example:</strong>
         * <p>c2FpXzIwMjIwNjI5X2Jhay9zYWlfc3VtbWVyX3RyZWFzdXJlX3Bvb2xfbG9nLkNTVg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The object type. Valid values: \<code>TABLE\\</code>, \<code>PARTITION_TABLE\\</code>, and \<code>LOB\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <ul>
         * <li>For more information, see <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the operation queries scheduled tasks in all regions within your account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The name of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>account_log</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DescribeColdStorageInstanceRequest build() {
            return new DescribeColdStorageInstanceRequest(this);
        } 

    } 

}
