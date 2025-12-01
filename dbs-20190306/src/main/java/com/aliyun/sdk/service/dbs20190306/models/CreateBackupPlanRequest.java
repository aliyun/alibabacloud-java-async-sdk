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
         * <p>The backup method of the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>logical</strong>: logical backup</li>
         * <li><strong>physical</strong>: physical backup</li>
         * <li><strong>duplication</strong>: dump backup</li>
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
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
         * <p>The region in which the database you want to back up resides.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
         * </blockquote>
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
         * <p>The type of the source database. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>MSSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>MariaDB</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>DRDS</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>Redis</strong></li>
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
         * <p>The source of the request. The default value is OpenAPI and cannot be changed.</p>
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
         * <p>The type of the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>micro</strong></li>
         * <li><strong>small</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>large</strong></li>
         * <li><strong>xlarge</strong></li>
         * </ul>
         * <blockquote>
         * <p> A backup schedule type with higher specifications offers higher backup and restoration performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Select a backup schedule type</a>.</p>
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
         * <p>The type of the source database instance. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
         * <li><strong>PolarDB</strong>: PolarDB.</li>
         * <li><strong>DDS</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>Kvstore</strong>: ApsaraDB for Redis.</li>
         * <li><strong>Other</strong>: Database connected by using an IP address and a port number.</li>
         * <li><strong>dg</strong>: Self-managed database that has no public IP address or port number and is connected over Database Gateway.</li>
         * </ul>
         * <blockquote>
         * <p> If <strong>PayType</strong> is set to <strong>postpay</strong>, this parameter is required.</p>
         * </blockquote>
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
         * <p>The billing method of the backup schedule. Valid values:</p>
         * <ul>
         * <li><strong>postpay</strong>: pay-as-you-go</li>
         * <li><strong>prepay</strong>: subscription</li>
         * </ul>
         * <blockquote>
         * <p>The default value is <strong>prepay</strong>. If the <strong>BackupMethod</strong> parameter is set to <strong>duplication</strong>, <strong>postpay</strong> is supported.</p>
         * </blockquote>
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
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: yearly subscription</li>
         * <li><strong>Month</strong>: monthly subscription</li>
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
         * <p>The ID of the region in which you can activate Data Disaster Recovery. You can call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation to query the regions supported by Data Disaster Recovery.</p>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/2869810.html">Endpoints</a>.</p>
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
         * <p>The region in which you want to store the backup data.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
         * </blockquote>
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
         * <p>This parameter is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The subscription period. Valid values:</p>
         * <ul>
         * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 5.</li>
         * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 11.</li>
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
