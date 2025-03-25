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
 * {@link DescribeDBClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClustersRequest</p>
 */
public class DescribeDBClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIds")
    private String DBClusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    private String DBNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeType")
    private String describeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecentCreationInterval")
    private Integer recentCreationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecentExpirationInterval")
    private Integer recentExpirationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeDBClustersRequest(Builder builder) {
        super(builder);
        this.connectionString = builder.connectionString;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterIds = builder.DBClusterIds;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.DBNodeIds = builder.DBNodeIds;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.describeType = builder.describeType;
        this.expired = builder.expired;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.payType = builder.payType;
        this.recentCreationInterval = builder.recentCreationInterval;
        this.recentExpirationInterval = builder.recentExpirationInterval;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClustersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterIds
     */
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    /**
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    /**
     * @return DBNodeIds
     */
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return describeType
     */
    public String getDescribeType() {
        return this.describeType;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return recentCreationInterval
     */
    public Integer getRecentCreationInterval() {
        return this.recentCreationInterval;
    }

    /**
     * @return recentExpirationInterval
     */
    public Integer getRecentExpirationInterval() {
        return this.recentExpirationInterval;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDBClustersRequest, Builder> {
        private String connectionString; 
        private String DBClusterDescription; 
        private String DBClusterIds; 
        private String DBClusterStatus; 
        private String DBNodeIds; 
        private String DBType; 
        private String DBVersion; 
        private String describeType; 
        private Boolean expired; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String payType; 
        private Integer recentCreationInterval; 
        private Integer recentExpirationInterval; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClustersRequest request) {
            super(request);
            this.connectionString = request.connectionString;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterIds = request.DBClusterIds;
            this.DBClusterStatus = request.DBClusterStatus;
            this.DBNodeIds = request.DBNodeIds;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.describeType = request.describeType;
            this.expired = request.expired;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.payType = request.payType;
            this.recentCreationInterval = request.recentCreationInterval;
            this.recentExpirationInterval = request.recentExpirationInterval;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * <p>The endpoint of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The description of the cluster. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The ID of the cluster. Separate multiple cluster IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterIds(String DBClusterIds) {
            this.putQueryParameter("DBClusterIds", DBClusterIds);
            this.DBClusterIds = DBClusterIds;
            return this;
        }

        /**
         * <p>The state of the cluster that you want to query. For information about valid values, see <a href="https://help.aliyun.com/document_detail/99286.html">Cluster states</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.putQueryParameter("DBClusterStatus", DBClusterStatus);
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The ID of the node. You can specify multiple node IDs. Separate multiple node IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pi-***************</p>
         */
        public Builder DBNodeIds(String DBNodeIds) {
            this.putQueryParameter("DBNodeIds", DBNodeIds);
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * <p>The database engine that the cluster runs. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database engine version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The query mode of the list. The value Simple indicates that the simple mode is used. In this mode, only the basic metadata information of the cluster is returned.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the detailed mode is used by default. Detailed information about the cluster is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        public Builder describeType(String describeType) {
            this.putQueryParameter("DescribeType", describeType);
            this.describeType = describeType;
            return this;
        }

        /**
         * <p>Specifies whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder expired(Boolean expired) {
            this.putQueryParameter("Expired", expired);
            this.expired = expired;
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
         * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the INTEGER data type. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>Filters clusters created in the last N days. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder recentCreationInterval(Integer recentCreationInterval) {
            this.putQueryParameter("RecentCreationInterval", recentCreationInterval);
            this.recentCreationInterval = recentCreationInterval;
            return this;
        }

        /**
         * <p>Filters clusters that expire after N days. Valid values: 0 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder recentExpirationInterval(Integer recentExpirationInterval) {
            this.putQueryParameter("RecentExpirationInterval", recentExpirationInterval);
            this.recentExpirationInterval = recentExpirationInterval;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available regions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-**********</p>
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
         * <p>The tags of the cluster.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDBClustersRequest build() {
            return new DescribeDBClustersRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClustersRequest} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag. You can use tags to filter clusters. You can specify up to 20 tags. N specifies the serial number of each tag. The values that you specify for N must be unique and consecutive integers that start from 1. The value of Tag.N.Key is Tag.N.Value.</p>
             * <blockquote>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <blockquote>
             * <p>The tag value can be up to 64 characters in length and cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
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
