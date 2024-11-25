// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    private ModifyDBProxyEndpointRequest(Builder builder) {
        super(builder);
        this.configDBProxyFeatures = builder.configDBProxyFeatures;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.dbEndpointAliases = builder.dbEndpointAliases;
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

    public static final class Builder extends Request.Builder<ModifyDBProxyEndpointRequest, Builder> {
        private String configDBProxyFeatures; 
        private String DBInstanceId; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String dbEndpointAliases; 
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

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyEndpointRequest request) {
            super(request);
            this.configDBProxyFeatures = request.configDBProxyFeatures;
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.dbEndpointAliases = request.dbEndpointAliases;
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
        } 

        /**
         * <p>The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: <code>Feature 1:Status;Feature 2:Status;...</code>. Do not add a semicolon (;) at the end of the value.</p>
         * <p>Valid feature values:</p>
         * <ul>
         * <li><strong>ReadWriteSpliting</strong>: read/write splitting</li>
         * <li><strong>ConnectionPersist</strong>: connection pooling</li>
         * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: transaction splitting</li>
         * </ul>
         * <p>Valid status values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * <blockquote>
         * <p> If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by <strong>ReadWriteSpliting</strong>.</p>
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
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
         * <p>The ID of the proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the proxy endpoint ID.</p>
         * <blockquote>
         * <ul>
         * <li>If the instance runs MySQL and you set <strong>DbEndpointOperator</strong> to <strong>Delete</strong> or <strong>Modify</strong>, you must specify DBProxyEndpointId.</li>
         * <li>If the instance runs PostgreSQL and you set <strong>DbEndpointOperator</strong> to <strong>Delete</strong>, <strong>Modify</strong>, or <strong>Create</strong>, you must specify DBProxyEndpointId.</li>
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
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
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
         * <p>The description of the proxy terminal.</p>
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
         * <p>The type of operation that you want to perform. Valid values:</p>
         * <ul>
         * <li><strong>Modify</strong>: Modify a proxy terminal. This is the default value.</li>
         * <li><strong>Create</strong>: Create a proxy terminal.</li>
         * <li><strong>Delete</strong>: Delete a proxy terminal.</li>
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
         * <p>The read and write attributes of the proxy terminal. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: The proxy terminal connects to the primary instance and can receive both read and write requests.</li>
         * <li><strong>ReadOnly</strong>: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set <strong>DbEndpointOperator</strong> to <strong>Create</strong>, you must also specify DbEndpointReadWriteMode.</li>
         * <li>If the instance runs MySQL and you change the value of this parameter from <strong>ReadWrite</strong> to <strong>ReadOnly</strong>, the transaction splitting feature is disabled.</li>
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
         * <p>The type of the proxy terminal. This is a reserved parameter. You do not need to specify this parameter.</p>
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
         * <p>The specified time takes effect. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
         * <blockquote>
         * <p>This parameter must be passed when EffectiveTime is SpecificTime.</p>
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
         * <p>Effective time, value:</p>
         * <ul>
         * <li><p><strong>Immediate</strong>: effective immediately.</p>
         * </li>
         * <li><p><strong>MaintainTime</strong>: effective during the operational and maintainable time period, see ModifyDBInstanceMaintainTime.</p>
         * </li>
         * <li><p><strong>SpecificTime</strong>: effective at a specified time.</p>
         * </li>
         * </ul>
         * <p>Default value: MaintainTime.</p>
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
         * <p>The policy that is used to allocate read weights. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: The system automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.</li>
         * <li><strong>Custom</strong>: You must manually allocate read weights to the instance and its read-only instances.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify this parameter only when the read/write splitting feature is enabled. For more information about the permission allocation policy, see <a href="https://help.aliyun.com/document_detail/96076.html">Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances</a> and <a href="https://help.aliyun.com/document_detail/418272.html">Enable and configure the database proxy feature for an ApsaraDB RDS for PostgreSQL instance</a>.</p>
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
         * <p>The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, the system no longer forwards read requests to the read-only instance. Unit: seconds If you do not specify this parameter, the original value of this parameter is retained. Valid values: <strong>0</strong> to <strong>3600</strong>. Default value: <strong>30</strong>.</p>
         * <blockquote>
         * <p>You must specify this parameter only when the read/write splitting feature is enabled.</p>
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
         * <p>The read weights of the instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10000. Formats:</p>
         * <ul>
         * <li><p>Standard instance: <code>{&quot;ID of the primary instance&quot;:&quot;Weight&quot;,&quot;ID of the read-only instance&quot;:&quot;Weight&quot;...}</code></p>
         * <p>Example: <code>{&quot;rm-uf6wjk5****&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</code></p>
         * </li>
         * <li><p>Instance on RDS Cluster Edition: <code>{&quot;ID of the read-only instance&quot;:&quot;Weight&quot;,&quot;DBClusterNode&quot;:{&quot;ID of the primary node&quot;:&quot;Weight&quot;,&quot;ID of the secondary node&quot;:&quot;Weight&quot;,&quot;ID of the secondary node&quot;:&quot;Weight&quot;...}}</code></p>
         * <p>Example: <code>{&quot;rr-tfhfgk5****&quot;:&quot;200&quot;,&quot;DBClusterNode&quot;:{&quot;rn-2z****&quot;:&quot;0&quot;,&quot;rn-2z****&quot;:&quot;400&quot;,&quot;rn-2z****&quot;:&quot;400&quot;...}}</code></p>
         * <blockquote>
         * <p><strong>DBClusterNode</strong> is required if the instance runs RDS Cluster Edition. The DBClusterNode parameter includes information about <strong>IDs</strong> and <strong>weights</strong> of the primary and secondary nodes..</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rm-uf6wjk5xxxx&quot;:&quot;500&quot;,&quot;rr-tfhfgk5xxx&quot;:&quot;200&quot;...}</p>
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.putQueryParameter("ReadOnlyInstanceWeight", readOnlyInstanceWeight);
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>Specifies the switch ID corresponding to the availability zone of the proxy connection address. By default, it is the switch ID corresponding to the default terminal of the proxy instance. You can query the created switch by calling the DescribeVSwitches interface.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6adz52c2p****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyDBProxyEndpointRequest build() {
            return new ModifyDBProxyEndpointRequest(this);
        } 

    } 

}
