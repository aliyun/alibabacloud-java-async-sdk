// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link TransferVersionRequest} extends {@link RequestModel}
 *
 * <p>TransferVersionRequest</p>
 */
public class TransferVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableWriteWindows")
    private String disableWriteWindows;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceClusterName")
    private String sourceClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceShards")
    private String sourceShards;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDbClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPassword;

    private TransferVersionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.disableWriteWindows = builder.disableWriteWindows;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceAccount = builder.sourceAccount;
        this.sourceClusterName = builder.sourceClusterName;
        this.sourcePassword = builder.sourcePassword;
        this.sourceShards = builder.sourceShards;
        this.targetAccount = builder.targetAccount;
        this.targetDbClusterId = builder.targetDbClusterId;
        this.targetPassword = builder.targetPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferVersionRequest create() {
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
     * @return disableWriteWindows
     */
    public String getDisableWriteWindows() {
        return this.disableWriteWindows;
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
     * @return sourceAccount
     */
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * @return sourceClusterName
     */
    public String getSourceClusterName() {
        return this.sourceClusterName;
    }

    /**
     * @return sourcePassword
     */
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    /**
     * @return sourceShards
     */
    public String getSourceShards() {
        return this.sourceShards;
    }

    /**
     * @return targetAccount
     */
    public String getTargetAccount() {
        return this.targetAccount;
    }

    /**
     * @return targetDbClusterId
     */
    public String getTargetDbClusterId() {
        return this.targetDbClusterId;
    }

    /**
     * @return targetPassword
     */
    public String getTargetPassword() {
        return this.targetPassword;
    }

    public static final class Builder extends Request.Builder<TransferVersionRequest, Builder> {
        private String DBClusterId; 
        private String disableWriteWindows; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceAccount; 
        private String sourceClusterName; 
        private String sourcePassword; 
        private String sourceShards; 
        private String targetAccount; 
        private String targetDbClusterId; 
        private String targetPassword; 

        private Builder() {
            super();
        } 

        private Builder(TransferVersionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.disableWriteWindows = request.disableWriteWindows;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceAccount = request.sourceAccount;
            this.sourceClusterName = request.sourceClusterName;
            this.sourcePassword = request.sourcePassword;
            this.sourceShards = request.sourceShards;
            this.targetAccount = request.targetAccount;
            this.targetDbClusterId = request.targetDbClusterId;
            this.targetPassword = request.targetPassword;
        } 

        /**
         * <p>The ID of the source ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1tm8zf130ew****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The time window during which write operations are stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-08T00:00:00+08:00,2025-02-12T00:00:00+08:00</p>
         */
        public Builder disableWriteWindows(String disableWriteWindows) {
            this.putQueryParameter("DisableWriteWindows", disableWriteWindows);
            this.disableWriteWindows = disableWriteWindows;
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
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The database account that is used to log on to the database in the source ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sourceAccount(String sourceAccount) {
            this.putQueryParameter("SourceAccount", sourceAccount);
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * <p>The name of the self-managed ClickHouse cluster. You can execute the <code>SELECT * FROM system.clusters</code> statement to query the cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder sourceClusterName(String sourceClusterName) {
            this.putQueryParameter("SourceClusterName", sourceClusterName);
            this.sourceClusterName = sourceClusterName;
            return this;
        }

        /**
         * <p>The password that corresponds to the database account for logging on to the database in the source ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Aa</p>
         */
        public Builder sourcePassword(String sourcePassword) {
            this.putQueryParameter("SourcePassword", sourcePassword);
            this.sourcePassword = sourcePassword;
            return this;
        }

        /**
         * <p>The endpoint and TCP port of the self-managed ClickHouse cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.4:9000,192.168.0.5:9000,192.168.0.6:9000</p>
         */
        public Builder sourceShards(String sourceShards) {
            this.putQueryParameter("SourceShards", sourceShards);
            this.sourceShards = sourceShards;
            return this;
        }

        /**
         * <p>The database account that is used to log on to the database in the destination ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder targetAccount(String targetAccount) {
            this.putQueryParameter("TargetAccount", targetAccount);
            this.targetAccount = targetAccount;
            return this;
        }

        /**
         * <p>The ID of the destination ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp14b39djx7zg****</p>
         */
        public Builder targetDbClusterId(String targetDbClusterId) {
            this.putQueryParameter("TargetDbClusterId", targetDbClusterId);
            this.targetDbClusterId = targetDbClusterId;
            return this;
        }

        /**
         * <p>The password that corresponds to the database account for logging on to the database in the destination ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Ff</p>
         */
        public Builder targetPassword(String targetPassword) {
            this.putQueryParameter("TargetPassword", targetPassword);
            this.targetPassword = targetPassword;
            return this;
        }

        @Override
        public TransferVersionRequest build() {
            return new TransferVersionRequest(this);
        } 

    } 

}
