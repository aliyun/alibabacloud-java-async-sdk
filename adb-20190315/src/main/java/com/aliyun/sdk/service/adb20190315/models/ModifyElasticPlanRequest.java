// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticPlanRequest</p>
 */
public class ModifyElasticPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanEnable")
    private Boolean elasticPlanEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanEndDay")
    private String elasticPlanEndDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanMonthlyRepeat")
    private String elasticPlanMonthlyRepeat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanNodeNum")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Integer elasticPlanNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanStartDay")
    private String elasticPlanStartDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanTimeEnd")
    private String elasticPlanTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanTimeStart")
    private String elasticPlanTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanType")
    private String elasticPlanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanWeeklyRepeat")
    private String elasticPlanWeeklyRepeat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanWorkerSpec")
    private String elasticPlanWorkerSpec;

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

    private ModifyElasticPlanRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanEnable = builder.elasticPlanEnable;
        this.elasticPlanEndDay = builder.elasticPlanEndDay;
        this.elasticPlanMonthlyRepeat = builder.elasticPlanMonthlyRepeat;
        this.elasticPlanName = builder.elasticPlanName;
        this.elasticPlanNodeNum = builder.elasticPlanNodeNum;
        this.elasticPlanStartDay = builder.elasticPlanStartDay;
        this.elasticPlanTimeEnd = builder.elasticPlanTimeEnd;
        this.elasticPlanTimeStart = builder.elasticPlanTimeStart;
        this.elasticPlanType = builder.elasticPlanType;
        this.elasticPlanWeeklyRepeat = builder.elasticPlanWeeklyRepeat;
        this.elasticPlanWorkerSpec = builder.elasticPlanWorkerSpec;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePoolName = builder.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticPlanRequest create() {
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
     * @return elasticPlanEnable
     */
    public Boolean getElasticPlanEnable() {
        return this.elasticPlanEnable;
    }

    /**
     * @return elasticPlanEndDay
     */
    public String getElasticPlanEndDay() {
        return this.elasticPlanEndDay;
    }

    /**
     * @return elasticPlanMonthlyRepeat
     */
    public String getElasticPlanMonthlyRepeat() {
        return this.elasticPlanMonthlyRepeat;
    }

    /**
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    /**
     * @return elasticPlanNodeNum
     */
    public Integer getElasticPlanNodeNum() {
        return this.elasticPlanNodeNum;
    }

    /**
     * @return elasticPlanStartDay
     */
    public String getElasticPlanStartDay() {
        return this.elasticPlanStartDay;
    }

    /**
     * @return elasticPlanTimeEnd
     */
    public String getElasticPlanTimeEnd() {
        return this.elasticPlanTimeEnd;
    }

    /**
     * @return elasticPlanTimeStart
     */
    public String getElasticPlanTimeStart() {
        return this.elasticPlanTimeStart;
    }

    /**
     * @return elasticPlanType
     */
    public String getElasticPlanType() {
        return this.elasticPlanType;
    }

    /**
     * @return elasticPlanWeeklyRepeat
     */
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
    }

    /**
     * @return elasticPlanWorkerSpec
     */
    public String getElasticPlanWorkerSpec() {
        return this.elasticPlanWorkerSpec;
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

    public static final class Builder extends Request.Builder<ModifyElasticPlanRequest, Builder> {
        private String DBClusterId; 
        private Boolean elasticPlanEnable; 
        private String elasticPlanEndDay; 
        private String elasticPlanMonthlyRepeat; 
        private String elasticPlanName; 
        private Integer elasticPlanNodeNum; 
        private String elasticPlanStartDay; 
        private String elasticPlanTimeEnd; 
        private String elasticPlanTimeStart; 
        private String elasticPlanType; 
        private String elasticPlanWeeklyRepeat; 
        private String elasticPlanWorkerSpec; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePoolName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticPlanRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanEnable = request.elasticPlanEnable;
            this.elasticPlanEndDay = request.elasticPlanEndDay;
            this.elasticPlanMonthlyRepeat = request.elasticPlanMonthlyRepeat;
            this.elasticPlanName = request.elasticPlanName;
            this.elasticPlanNodeNum = request.elasticPlanNodeNum;
            this.elasticPlanStartDay = request.elasticPlanStartDay;
            this.elasticPlanTimeEnd = request.elasticPlanTimeEnd;
            this.elasticPlanTimeStart = request.elasticPlanTimeStart;
            this.elasticPlanType = request.elasticPlanType;
            this.elasticPlanWeeklyRepeat = request.elasticPlanWeeklyRepeat;
            this.elasticPlanWorkerSpec = request.elasticPlanWorkerSpec;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePoolName = request.resourcePoolName;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1rqvm70uh2v****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether the scaling plan takes effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder elasticPlanEnable(Boolean elasticPlanEnable) {
            this.putQueryParameter("ElasticPlanEnable", elasticPlanEnable);
            this.elasticPlanEnable = elasticPlanEnable;
            return this;
        }

        /**
         * <p>The end date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-09</p>
         */
        public Builder elasticPlanEndDay(String elasticPlanEndDay) {
            this.putQueryParameter("ElasticPlanEndDay", elasticPlanEndDay);
            this.elasticPlanEndDay = elasticPlanEndDay;
            return this;
        }

        /**
         * <p>The dates of the month when you want to execute the scaling plan. A number specifies a date of the month. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,15,25</p>
         */
        public Builder elasticPlanMonthlyRepeat(String elasticPlanMonthlyRepeat) {
            this.putQueryParameter("ElasticPlanMonthlyRepeat", elasticPlanMonthlyRepeat);
            this.elasticPlanMonthlyRepeat = elasticPlanMonthlyRepeat;
            return this;
        }

        /**
         * <p>The name of the scaling plan.</p>
         * <ul>
         * <li>The name must be 2 to 30 characters in length.</li>
         * <li>The name can contain letters, digits, and underscores (_).</li>
         * </ul>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/190596.html">DescribeElasticPlan</a> operation to query the information about all scaling plans of a cluster, including the scaling plan names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        /**
         * <p>The number of nodes that are involved in the scaling plan.</p>
         * <ul>
         * <li>If ElasticPlanType is set to <strong>worker</strong>, you can set this parameter to 0 or leave this parameter empty.</li>
         * <li>If ElasticPlanType is set to <strong>executorcombineworker</strong> or <strong>executor</strong>, you must set this parameter to a value that is greater than 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder elasticPlanNodeNum(Integer elasticPlanNodeNum) {
            this.putQueryParameter("ElasticPlanNodeNum", elasticPlanNodeNum);
            this.elasticPlanNodeNum = elasticPlanNodeNum;
            return this;
        }

        /**
         * <p>The start date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02</p>
         */
        public Builder elasticPlanStartDay(String elasticPlanStartDay) {
            this.putQueryParameter("ElasticPlanStartDay", elasticPlanStartDay);
            this.elasticPlanStartDay = elasticPlanStartDay;
            return this;
        }

        /**
         * <p>The restoration time of the scaling plan. Specify the time on the hour in the HH:mm:ss format. The interval between the scale-up time and the restoration time cannot be more than 24 hours.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        public Builder elasticPlanTimeEnd(String elasticPlanTimeEnd) {
            this.putQueryParameter("ElasticPlanTimeEnd", elasticPlanTimeEnd);
            this.elasticPlanTimeEnd = elasticPlanTimeEnd;
            return this;
        }

        /**
         * <p>The scale-up time of the scaling plan. Specify the time on the hour in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>8:00:00</p>
         */
        public Builder elasticPlanTimeStart(String elasticPlanTimeStart) {
            this.putQueryParameter("ElasticPlanTimeStart", elasticPlanTimeStart);
            this.elasticPlanTimeStart = elasticPlanTimeStart;
            return this;
        }

        /**
         * <p>The type of the scaling plan. Valid values:</p>
         * <ul>
         * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
         * <li><strong>executor</strong>: scales only computing resources.</li>
         * <li><strong>executorcombineworker</strong> (default): scales both elastic I/O resources and computing resources by proportion.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you want to set this parameter to <strong>executorcombineworker</strong>, make sure that the cluster runs a minor version of 3.1.3.2 or later.</p>
         * </li>
         * <li><p>If you want to set this parameter to <strong>worker</strong> or <strong>executor</strong>, make sure that the cluster runs a minor version of 3.1.6.1 or later and a ticket is submitted. After your request is approved, you can set this parameter to <strong>worker</strong> or <strong>executor</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>worker</p>
         */
        public Builder elasticPlanType(String elasticPlanType) {
            this.putQueryParameter("ElasticPlanType", elasticPlanType);
            this.elasticPlanType = elasticPlanType;
            return this;
        }

        /**
         * <p>The days of the week when you want to execute the scaling plan. Valid values: 0 to 6, which indicate Sunday to Saturday. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4,5</p>
         */
        public Builder elasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
            this.putQueryParameter("ElasticPlanWeeklyRepeat", elasticPlanWeeklyRepeat);
            this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
            return this;
        }

        /**
         * <p>The resource specifications that can be scaled up by the scaling plan. Valid values:</p>
         * <ul>
         * <li>8 Core 64 GB (default)</li>
         * <li>16 Core 64 GB</li>
         * <li>32 Core 64 GB</li>
         * <li>64 Core 128 GB</li>
         * <li>12 Core 96 GB</li>
         * <li>24 Core 96 GB</li>
         * <li>52 Core 86 GB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16 Core 64 GB</p>
         */
        public Builder elasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
            this.putQueryParameter("ElasticPlanWorkerSpec", elasticPlanWorkerSpec);
            this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/466685.html">DescribeDBResourceGroup</a> operation to query the resource group name.</p>
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
        public ModifyElasticPlanRequest build() {
            return new ModifyElasticPlanRequest(this);
        } 

    } 

}
