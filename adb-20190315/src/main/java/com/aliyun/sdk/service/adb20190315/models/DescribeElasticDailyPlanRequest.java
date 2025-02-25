// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeElasticDailyPlanRequest} extends {@link RequestModel}
 *
 * <p>DescribeElasticDailyPlanRequest</p>
 */
public class DescribeElasticDailyPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticDailyPlanDay")
    private String elasticDailyPlanDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticDailyPlanStatusList")
    private String elasticDailyPlanStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
    private String elasticPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcePoolName")
    private String resourcePoolName;

    private DescribeElasticDailyPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticDailyPlanDay = builder.elasticDailyPlanDay;
        this.elasticDailyPlanStatusList = builder.elasticDailyPlanStatusList;
        this.elasticPlanName = builder.elasticPlanName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolName = builder.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticDailyPlanRequest create() {
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
     * @return elasticDailyPlanDay
     */
    public String getElasticDailyPlanDay() {
        return this.elasticDailyPlanDay;
    }

    /**
     * @return elasticDailyPlanStatusList
     */
    public String getElasticDailyPlanStatusList() {
        return this.elasticDailyPlanStatusList;
    }

    /**
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
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
     * @return resourcePoolName
     */
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public static final class Builder extends Request.Builder<DescribeElasticDailyPlanRequest, Builder> {
        private String DBClusterId; 
        private String elasticDailyPlanDay; 
        private String elasticDailyPlanStatusList; 
        private String elasticPlanName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeElasticDailyPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticDailyPlanDay = request.elasticDailyPlanDay;
            this.elasticDailyPlanStatusList = request.elasticDailyPlanStatusList;
            this.elasticPlanName = request.elasticPlanName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolName = request.resourcePoolName;
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
         * <p>The start date of the current-day scaling plan. Specify the date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02</p>
         */
        public Builder elasticDailyPlanDay(String elasticDailyPlanDay) {
            this.putQueryParameter("ElasticDailyPlanDay", elasticDailyPlanDay);
            this.elasticDailyPlanDay = elasticDailyPlanDay;
            return this;
        }

        /**
         * <p>The execution state of the current-day scaling plan. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The scaling plan is not executed.</li>
         * <li><strong>2</strong>: The scaling plan is being executed.</li>
         * <li><strong>3</strong>: The scaling plan is executed.</li>
         * <li><strong>4</strong>: The scaling plan fails to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder elasticDailyPlanStatusList(String elasticDailyPlanStatusList) {
            this.putQueryParameter("ElasticDailyPlanStatusList", elasticDailyPlanStatusList);
            this.elasticDailyPlanStatusList = elasticDailyPlanStatusList;
            return this;
        }

        /**
         * <p>The name of the scaling plan. Valid values:</p>
         * <ul>
         * <li>The name must be 2 to 30 characters in length.</li>
         * <li>The name can contain letters, digits, and underscores (_).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>realtimeplan</p>
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
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
         * <p>The name of the resource group.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/466685.html">DescribeDBResourceGroup</a> operation to query the resource group name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourcePoolName(String resourcePoolName) {
            this.putQueryParameter("ResourcePoolName", resourcePoolName);
            this.resourcePoolName = resourcePoolName;
            return this;
        }

        @Override
        public DescribeElasticDailyPlanRequest build() {
            return new DescribeElasticDailyPlanRequest(this);
        } 

    } 

}
