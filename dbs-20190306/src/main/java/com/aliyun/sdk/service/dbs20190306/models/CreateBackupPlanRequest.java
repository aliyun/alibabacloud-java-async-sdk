// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link CreateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupPlanRequest</p>
 */
public class CreateBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseRegion")
    private String databaseRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromApp")
    private String fromApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    private String storageRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    private CreateBackupPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupMethod = builder.backupMethod;
        this.clientToken = builder.clientToken;
        this.databaseRegion = builder.databaseRegion;
        this.databaseType = builder.databaseType;
        this.fromApp = builder.fromApp;
        this.instanceClass = builder.instanceClass;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageRegion = builder.storageRegion;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPlanRequest create() {
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
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return databaseRegion
     */
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateBackupPlanRequest, Builder> {
        private String regionId; 
        private String backupMethod; 
        private String clientToken; 
        private String databaseRegion; 
        private String databaseType; 
        private String fromApp; 
        private String instanceClass; 
        private String instanceType; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String region; 
        private String resourceGroupId; 
        private String storageRegion; 
        private String storageType; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupMethod = request.backupMethod;
            this.clientToken = request.clientToken;
            this.databaseRegion = request.databaseRegion;
            this.databaseType = request.databaseType;
            this.fromApp = request.fromApp;
            this.instanceClass = request.instanceClass;
            this.instanceType = request.instanceType;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.region = request.region;
            this.resourceGroupId = request.resourceGroupId;
            this.storageRegion = request.storageRegion;
            this.storageType = request.storageType;
            this.usedTime = request.usedTime;
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
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><p><strong>logical</strong>: logical backup</p>
         * </li>
         * <li><p><strong>physical</strong>: physical backup</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logical</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <p>A client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>KJSAHKJFHKJSHFKASHFKJADFHKDXXXX</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder databaseRegion(String databaseRegion) {
            this.putQueryParameter("DatabaseRegion", databaseRegion);
            this.databaseRegion = databaseRegion;
            return this;
        }

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>MSSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>MariaDB</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>DRDS</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * <p>The source of the request. The default value is OpenAPI. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
            return this;
        }

        /**
         * <p>The instance class. Valid values:</p>
         * <ul>
         * <li><p><strong>micro</strong>: Entry</p>
         * </li>
         * <li><p><strong>small</strong>: Basic</p>
         * </li>
         * <li><p><strong>medium</strong>: Standard</p>
         * </li>
         * <li><p><strong>large</strong>: Enhanced</p>
         * </li>
         * <li><p><strong>xlarge</strong>: Enhanced (no traffic limit)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The higher the instance class, the better the performance of backup and recovery. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Specifications</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>micro</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The database instance type. Valid values:</p>
         * <ul>
         * <li><p><strong>RDS</strong></p>
         * </li>
         * <li><p><strong>PolarDB</strong></p>
         * </li>
         * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
         * </li>
         * <li><p><strong>Kvstore</strong>: Alibaba Cloud Redis</p>
         * </li>
         * <li><p><strong>Other</strong>: A database that is connected over the Internet.</p>
         * </li>
         * <li><p><strong>dg</strong>: A self-managed database without a public IP address and port that is connected through Database Gateway (DG).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The payment method. Valid value:</p>
         * <p><strong>prepay</strong>: subscription</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Year</strong></p>
         * </li>
         * <li><p><strong>Month</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the DBS instance. This parameter is required. Call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation to view the regions that DBS supports.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2869810.html">Endpoints</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzecovzti****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The storage region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder storageRegion(String storageRegion) {
            this.putQueryParameter("StorageRegion", storageRegion);
            this.storageRegion = storageRegion;
            return this;
        }

        /**
         * <p>This parameter is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li><p>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of <strong>UsedTime</strong> can be 1 to 5.</p>
         * </li>
         * <li><p>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of <strong>UsedTime</strong> can be 1 to 11.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateBackupPlanRequest build() {
            return new CreateBackupPlanRequest(this);
        } 

    } 

}
