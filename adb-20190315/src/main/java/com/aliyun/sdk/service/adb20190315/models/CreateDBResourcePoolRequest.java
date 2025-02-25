// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDBResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateDBResourcePoolRequest</p>
 */
public class CreateDBResourcePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNum")
    @com.aliyun.core.annotation.Validation(maximum = 4294967296D)
    private Integer nodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDBResourcePoolRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.nodeNum = builder.nodeNum;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.poolName = builder.poolName;
        this.queryType = builder.queryType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBResourcePoolRequest create() {
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
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return this.nodeNum;
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
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
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

    public static final class Builder extends Request.Builder<CreateDBResourcePoolRequest, Builder> {
        private String DBClusterId; 
        private Integer nodeNum; 
        private String ownerAccount; 
        private Long ownerId; 
        private String poolName; 
        private String queryType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBResourcePoolRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.nodeNum = request.nodeNum;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.poolName = request.poolName;
            this.queryType = request.queryType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The number of nodes. Default value: 0.</p>
         * <ul>
         * <li>Each node provides 16 cores and 64 GB memory.</li>
         * <li>The total amount of resources provided by the nodes (number of nodes × 16 cores, number of nodes × 64 GB memory) cannot exceed the total amount of resources in the cluster. Set this parameter to a proper value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeNum(Integer nodeNum) {
            this.putQueryParameter("NodeNum", nodeNum);
            this.nodeNum = nodeNum;
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
         * <p>The name of the resource group.</p>
         * <ul>
         * <li>The name can be up to 255 characters in length.</li>
         * <li>The name must start with a letter or a digit.</li>
         * <li>The name can contain letters, digits, hyphens (<em>), and underscores (</em>).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder poolName(String poolName) {
            this.putQueryParameter("PoolName", poolName);
            this.poolName = poolName;
            return this;
        }

        /**
         * <p>The mode in which to execute SQL statements.</p>
         * <ul>
         * <li><p><strong>batch</strong></p>
         * </li>
         * <li><p><strong>interactive</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
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

        @Override
        public CreateDBResourcePoolRequest build() {
            return new CreateDBResourcePoolRequest(this);
        } 

    } 

}
