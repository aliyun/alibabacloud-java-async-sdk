// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBProxyEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyEndpointRequest</p>
 */
public class ModifyDBProxyEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CausalConsistReadTimeout")
    private String causalConsistReadTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigDBProxyFeatures")
    private String configDBProxyFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointId")
    private String DBProxyEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointAliases")
    private String dbEndpointAliases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointCostThresholdForDuckdb")
    private String dbEndpointCostThresholdForDuckdb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointMinSlaveCount")
    private String dbEndpointMinSlaveCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointOperator")
    private String dbEndpointOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointReadWriteMode")
    private String dbEndpointReadWriteMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbEndpointType")
    private String dbEndpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveSpecificTime")
    private String effectiveSpecificTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceDistributionType")
    private String readOnlyInstanceDistributionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceMaxDelayTime")
    private String readOnlyInstanceMaxDelayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceWeight")
    private String readOnlyInstanceWeight;

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
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyDBProxyEndpointRequest(Builder builder) {
        super(builder);
        this.causalConsistReadTimeout = builder.causalConsistReadTimeout;
        this.configDBProxyFeatures = builder.configDBProxyFeatures;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.dbEndpointAliases = builder.dbEndpointAliases;
        this.dbEndpointCostThresholdForDuckdb = builder.dbEndpointCostThresholdForDuckdb;
        this.dbEndpointMinSlaveCount = builder.dbEndpointMinSlaveCount;
        this.dbEndpointOperator = builder.dbEndpointOperator;
        this.dbEndpointReadWriteMode = builder.dbEndpointReadWriteMode;
        this.dbEndpointType = builder.dbEndpointType;
        this.effectiveSpecificTime = builder.effectiveSpecificTime;
        this.effectiveTime = builder.effectiveTime;
        this.ownerId = builder.ownerId;
        this.readOnlyInstanceDistributionType = builder.readOnlyInstanceDistributionType;
        this.readOnlyInstanceMaxDelayTime = builder.readOnlyInstanceMaxDelayTime;
        this.readOnlyInstanceWeight = builder.readOnlyInstanceWeight;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return causalConsistReadTimeout
     */
    public String getCausalConsistReadTimeout() {
        return this.causalConsistReadTimeout;
    }

    /**
     * @return configDBProxyFeatures
     */
    public String getConfigDBProxyFeatures() {
        return this.configDBProxyFeatures;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return dbEndpointAliases
     */
    public String getDbEndpointAliases() {
        return this.dbEndpointAliases;
    }

    /**
     * @return dbEndpointCostThresholdForDuckdb
     */
    public String getDbEndpointCostThresholdForDuckdb() {
        return this.dbEndpointCostThresholdForDuckdb;
    }

    /**
     * @return dbEndpointMinSlaveCount
     */
    public String getDbEndpointMinSlaveCount() {
        return this.dbEndpointMinSlaveCount;
    }

    /**
     * @return dbEndpointOperator
     */
    public String getDbEndpointOperator() {
        return this.dbEndpointOperator;
    }

    /**
     * @return dbEndpointReadWriteMode
     */
    public String getDbEndpointReadWriteMode() {
        return this.dbEndpointReadWriteMode;
    }

    /**
     * @return dbEndpointType
     */
    public String getDbEndpointType() {
        return this.dbEndpointType;
    }

    /**
     * @return effectiveSpecificTime
     */
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return readOnlyInstanceDistributionType
     */
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    /**
     * @return readOnlyInstanceMaxDelayTime
     */
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    /**
     * @return readOnlyInstanceWeight
     */
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyDBProxyEndpointRequest, Builder> {
        private String causalConsistReadTimeout; 
        private String configDBProxyFeatures; 
        private String DBInstanceId; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String dbEndpointAliases; 
        private String dbEndpointCostThresholdForDuckdb; 
        private String dbEndpointMinSlaveCount; 
        private String dbEndpointOperator; 
        private String dbEndpointReadWriteMode; 
        private String dbEndpointType; 
        private String effectiveSpecificTime; 
        private String effectiveTime; 
        private Long ownerId; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyEndpointRequest request) {
            super(request);
            this.causalConsistReadTimeout = request.causalConsistReadTimeout;
            this.configDBProxyFeatures = request.configDBProxyFeatures;
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.dbEndpointAliases = request.dbEndpointAliases;
            this.dbEndpointCostThresholdForDuckdb = request.dbEndpointCostThresholdForDuckdb;
            this.dbEndpointMinSlaveCount = request.dbEndpointMinSlaveCount;
            this.dbEndpointOperator = request.dbEndpointOperator;
            this.dbEndpointReadWriteMode = request.dbEndpointReadWriteMode;
            this.dbEndpointType = request.dbEndpointType;
            this.effectiveSpecificTime = request.effectiveSpecificTime;
            this.effectiveTime = request.effectiveTime;
            this.ownerId = request.ownerId;
            this.readOnlyInstanceDistributionType = request.readOnlyInstanceDistributionType;
            this.readOnlyInstanceMaxDelayTime = request.readOnlyInstanceMaxDelayTime;
            this.readOnlyInstanceWeight = request.readOnlyInstanceWeight;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The timeout period for read consistency. Unit: milliseconds. Default value: <strong>10</strong>. Valid values: <strong>0</strong> to <strong>60000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder causalConsistReadTimeout(String causalConsistReadTimeout) {
            this.putQueryParameter("CausalConsistReadTimeout", causalConsistReadTimeout);
            this.causalConsistReadTimeout = causalConsistReadTimeout;
            return this;
        }

        /**
         * <p>Specifies the proxy features to be enabled for the proxy endpoint. Separate multiple features with semicolons (;). Format: <code>Feature 1:Status;Feature 2:Status;...</code>. Do not add a semicolon (;) at the end.</p>
         * <p>Valid values for features:</p>
         * <ul>
         * <li><strong>ReadWriteSpliting</strong>: Read/write splitting.</li>
         * <li><strong>ConnectionPersist</strong>: Connection pool.</li>
         * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: Transaction splitting.</li>
         * <li><strong>AZProximityAccess</strong>: Nearest access.</li>
         * <li><strong>CausalConsistRead</strong>: Read consistency.</li>
         * <li><strong>HtapFilter</strong>: Automatic request distribution among row store and column store nodes for HTAP.</li>
         * </ul>
         * <p>Valid values for the status:</p>
         * <ul>
         * <li><strong>1</strong>: The feature is enabled.</li>
         * <li><strong>0</strong>: The feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>ApsaraDB RDS for PostgreSQL supports only <strong>ReadWriteSpliting</strong>.</li>
         * <li>The nearest access feature is supported only by dedicated database proxies for MySQL.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ReadWriteSpliting:1;ConnectionPersist:0</p>
         */
        public Builder configDBProxyFeatures(String configDBProxyFeatures) {
            this.putQueryParameter("ConfigDBProxyFeatures", configDBProxyFeatures);
            this.configDBProxyFeatures = configDBProxyFeatures;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp145737x5bi6****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID.</p>
         * <blockquote>
         * <ul>
         * <li>MySQL: This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Delete</strong> or <strong>Modify</strong>.</li>
         * <li>PostgreSQL: This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Delete</strong>, <strong>Modify</strong>, or <strong>Create</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gos787jog2wk0y****</p>
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The description of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test-proxy</p>
         */
        public Builder dbEndpointAliases(String dbEndpointAliases) {
            this.putQueryParameter("DbEndpointAliases", dbEndpointAliases);
            this.dbEndpointAliases = dbEndpointAliases;
            return this;
        }

        /**
         * <p>The execution cost threshold for SQL statements in automatic request distribution among row store and column store nodes for HTAP.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        public Builder dbEndpointCostThresholdForDuckdb(String dbEndpointCostThresholdForDuckdb) {
            this.putQueryParameter("DbEndpointCostThresholdForDuckdb", dbEndpointCostThresholdForDuckdb);
            this.dbEndpointCostThresholdForDuckdb = dbEndpointCostThresholdForDuckdb;
            return this;
        }

        /**
         * <p>The minimum number of reserved instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder dbEndpointMinSlaveCount(String dbEndpointMinSlaveCount) {
            this.putQueryParameter("DbEndpointMinSlaveCount", dbEndpointMinSlaveCount);
            this.dbEndpointMinSlaveCount = dbEndpointMinSlaveCount;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>Modify</strong>: Modifies the proxy endpoint. This is the default value.</li>
         * <li><strong>Create</strong>: Creates a proxy endpoint.</li>
         * <li><strong>Delete</strong>: Deletes a proxy endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Modify</p>
         */
        public Builder dbEndpointOperator(String dbEndpointOperator) {
            this.putQueryParameter("DbEndpointOperator", dbEndpointOperator);
            this.dbEndpointOperator = dbEndpointOperator;
            return this;
        }

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: Connects to the primary instance and can accept write requests.</li>
         * <li><strong>ReadOnly</strong>: Does not connect to the primary instance and cannot accept write requests. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when <strong>DbEndpointOperator</strong> is set to <strong>Create</strong>.</li>
         * <li>For an ApsaraDB RDS for MySQL instance, if you change the value of this parameter from <strong>ReadWrite</strong> to <strong>ReadOnly</strong>, the transaction splitting feature is disabled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        public Builder dbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
            this.putQueryParameter("DbEndpointReadWriteMode", dbEndpointReadWriteMode);
            this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
            return this;
        }

        /**
         * <p>The type of the proxy endpoint. This parameter is reserved and does not need to be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>RWSplit</p>
         */
        public Builder dbEndpointType(String dbEndpointType) {
            this.putQueryParameter("DbEndpointType", dbEndpointType);
            this.dbEndpointType = dbEndpointType;
            return this;
        }

        /**
         * <p>The specific time when the modification takes effect. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>EffectiveTime</strong> is set to <strong>SpecificTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06T07:08:09Z</p>
         */
        public Builder effectiveSpecificTime(String effectiveSpecificTime) {
            this.putQueryParameter("EffectiveSpecificTime", effectiveSpecificTime);
            this.effectiveSpecificTime = effectiveSpecificTime;
            return this;
        }

        /**
         * <p>The effective period. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong>: The modification immediately takes effect.</li>
         * <li><strong>MaintainTime</strong>: The modification takes effect within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecificTime</strong>: The modification takes effect at a specified time.</li>
         * </ul>
         * <p>Default value: <strong>MaintainTime</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
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
         * <p>The read weight allocation pattern. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: Automatically allocates read weights based on instance specifications. This is the default value.</li>
         * <li><strong>Custom</strong>: Custom allocated weights.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required only when read/write splitting is enabled. For more information about the read weight allocation pattern, see <a href="https://help.aliyun.com/document_detail/96076.html">Read weight distribution</a> for MySQL and <a href="https://help.aliyun.com/document_detail/418272.html">Enable and configure the database proxy service</a> for PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.putQueryParameter("ReadOnlyInstanceDistributionType", readOnlyInstanceDistributionType);
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * <p>The maximum latency threshold for read-only instances in read/write splitting. If the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance. Unit: seconds. If you do not specify this parameter, the original value is retained. Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only when read/write splitting is enabled.</li>
         * <li>Default value: <strong>30</strong> when the read/write attribute is set to Read/Write (read/write splitting), and <strong>-1</strong> (disabled) when the read/write attribute is set to Read-only.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.putQueryParameter("ReadOnlyInstanceMaxDelayTime", readOnlyInstanceMaxDelayTime);
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * <p>The custom read weights of the primary and read-only instances. The weight must be a multiple of 100 and cannot exceed 10000. Format:</p>
         * <ul>
         * <li><p>Standard instance: <code>{&quot;Primary instance ID&quot;:&quot;Weight&quot;,&quot;Read-only instance ID&quot;:&quot;Weight&quot;...}</code></p>
         * <p>  Example: <code>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</code></p>
         * </li>
         * <li><p>ApsaraDB RDS for MySQL Cluster Edition instance: <code>{&quot;Read-only instance ID&quot;:&quot;Weight&quot;,&quot;DBClusterNode&quot;:{&quot;Primary node ID&quot;:&quot;Weight&quot;,&quot;Secondary node ID&quot;:&quot;Weight&quot;,&quot;Secondary node ID&quot;:&quot;Weight&quot;...}}</code></p>
         * <p>  Example: <code>{&quot;rr-tfhfgk5****&quot;:&quot;200&quot;,&quot;DBClusterNode&quot;:{&quot;rn-2z****&quot;:&quot;0&quot;,&quot;rn-2z****&quot;:&quot;400&quot;,&quot;rn-2z****&quot;:&quot;400&quot;...}}</code></p>
         * <blockquote>
         * <p><strong>DBClusterNode</strong> is a request parameter specific to Cluster Edition instances. It contains the <strong>NodeID</strong> and <strong>Weight</strong> of the primary and secondary nodes.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</p>
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.putQueryParameter("ReadOnlyInstanceWeight", readOnlyInstanceWeight);
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the ID.</p>
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
         * <p>The ID of the vSwitch in the zone of the database proxy endpoint. Default value: the ID of the vSwitch that corresponds to the default endpoint of the proxy instance. You can call the DescribeVSwitches operation to query created vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2p****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC in the zone of the database proxy endpoint. Default value: the ID of the VPC that corresponds to the default endpoint of the proxy instance. You can call the DescribeDBInstanceAttribute operation to query the default VPC of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeusejj******</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyDBProxyEndpointRequest build() {
            return new ModifyDBProxyEndpointRequest(this);
        } 

    } 

}
