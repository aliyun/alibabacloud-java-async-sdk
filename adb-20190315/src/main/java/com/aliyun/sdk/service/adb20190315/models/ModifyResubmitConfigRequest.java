// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link ModifyResubmitConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyResubmitConfigRequest</p>
 */
public class ModifyResubmitConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Rules> rules;

    private ModifyResubmitConfigRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResubmitConfigRequest create() {
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyResubmitConfigRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResubmitConfigRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rules = request.rules;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-4690g37929****</p>
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
         * <p>The job resubmission rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyResubmitConfigRequest build() {
            return new ModifyResubmitConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyResubmitConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyResubmitConfigRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceedMemoryException")
        private Boolean exceedMemoryException;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private String peakMemory;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("TargetGroupName")
        private String targetGroupName;

        private Rules(Builder builder) {
            this.exceedMemoryException = builder.exceedMemoryException;
            this.groupName = builder.groupName;
            this.peakMemory = builder.peakMemory;
            this.queryTime = builder.queryTime;
            this.targetGroupName = builder.targetGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return exceedMemoryException
         */
        public Boolean getExceedMemoryException() {
            return this.exceedMemoryException;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return peakMemory
         */
        public String getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return targetGroupName
         */
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

        public static final class Builder {
            private Boolean exceedMemoryException; 
            private String groupName; 
            private String peakMemory; 
            private String queryTime; 
            private String targetGroupName; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.exceedMemoryException = model.exceedMemoryException;
                this.groupName = model.groupName;
                this.peakMemory = model.peakMemory;
                this.queryTime = model.queryTime;
                this.targetGroupName = model.targetGroupName;
            } 

            /**
             * <p>Specifies whether to configure out-of-memory (OOM) check.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exceedMemoryException(Boolean exceedMemoryException) {
                this.exceedMemoryException = exceedMemoryException;
                return this;
            }

            /**
             * <p>The name of the source resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test2</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The peak memory usage.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder peakMemory(String peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The duration of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The name of the destination resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test_target_group</p>
             */
            public Builder targetGroupName(String targetGroupName) {
                this.targetGroupName = targetGroupName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
