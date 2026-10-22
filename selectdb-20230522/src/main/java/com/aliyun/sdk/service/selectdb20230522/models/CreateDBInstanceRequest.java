// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddVPCIPs")
    private String addVPCIPs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CacheSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cacheSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNodeCount")
    private Integer clusterNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNodeType")
    private String clusterNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigPatternType")
    private String configPatternType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployScheme")
    private String deployScheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FEClassCode")
    private String FEClassCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FENodeCount")
    private String FENodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZone")
    private java.util.List<MultiZone> multiZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private Double scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private Double scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TdeEnabled")
    private String tdeEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TdeMode")
    private String tdeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.addVPCIPs = builder.addVPCIPs;
        this.cacheSize = builder.cacheSize;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.clusterNodeCount = builder.clusterNodeCount;
        this.clusterNodeType = builder.clusterNodeType;
        this.configPatternType = builder.configPatternType;
        this.connectionString = builder.connectionString;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.deployScheme = builder.deployScheme;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.FEClassCode = builder.FEClassCode;
        this.FENodeCount = builder.FENodeCount;
        this.multiZone = builder.multiZone;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.securityIPList = builder.securityIPList;
        this.tag = builder.tag;
        this.tdeEnabled = builder.tdeEnabled;
        this.tdeMode = builder.tdeMode;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addVPCIPs
     */
    public String getAddVPCIPs() {
        return this.addVPCIPs;
    }

    /**
     * @return cacheSize
     */
    public Integer getCacheSize() {
        return this.cacheSize;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterNodeCount
     */
    public Integer getClusterNodeCount() {
        return this.clusterNodeCount;
    }

    /**
     * @return clusterNodeType
     */
    public String getClusterNodeType() {
        return this.clusterNodeType;
    }

    /**
     * @return configPatternType
     */
    public String getConfigPatternType() {
        return this.configPatternType;
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return deployScheme
     */
    public String getDeployScheme() {
        return this.deployScheme;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return FEClassCode
     */
    public String getFEClassCode() {
        return this.FEClassCode;
    }

    /**
     * @return FENodeCount
     */
    public String getFENodeCount() {
        return this.FENodeCount;
    }

    /**
     * @return multiZone
     */
    public java.util.List<MultiZone> getMultiZone() {
        return this.multiZone;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scaleMax
     */
    public Double getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public Double getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tdeEnabled
     */
    public String getTdeEnabled() {
        return this.tdeEnabled;
    }

    /**
     * @return tdeMode
     */
    public String getTdeMode() {
        return this.tdeMode;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String addVPCIPs; 
        private Integer cacheSize; 
        private String chargeType; 
        private String clientToken; 
        private Integer clusterNodeCount; 
        private String clusterNodeType; 
        private String configPatternType; 
        private String connectionString; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String deployScheme; 
        private String engine; 
        private String engineVersion; 
        private String FEClassCode; 
        private String FENodeCount; 
        private java.util.List<MultiZone> multiZone; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private Double scaleMax; 
        private Double scaleMin; 
        private String securityIPList; 
        private java.util.List<Tag> tag; 
        private String tdeEnabled; 
        private String tdeMode; 
        private Integer usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.addVPCIPs = request.addVPCIPs;
            this.cacheSize = request.cacheSize;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.clusterNodeCount = request.clusterNodeCount;
            this.clusterNodeType = request.clusterNodeType;
            this.configPatternType = request.configPatternType;
            this.connectionString = request.connectionString;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.deployScheme = request.deployScheme;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.FEClassCode = request.FEClassCode;
            this.FENodeCount = request.FENodeCount;
            this.multiZone = request.multiZone;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.securityIPList = request.securityIPList;
            this.tag = request.tag;
            this.tdeEnabled = request.tdeEnabled;
            this.tdeMode = request.tdeMode;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>Specifies whether to add the VPC CIDR block to the whitelist. Valid values:</p>
         * <ul>
         * <li>1: yes</li>
         * <li>0: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addVPCIPs(String addVPCIPs) {
            this.putQueryParameter("AddVPCIPs", addVPCIPs);
            this.addVPCIPs = addVPCIPs;
            return this;
        }

        /**
         * <p>The reserved cache size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder cacheSize(Integer cacheSize) {
            this.putQueryParameter("CacheSize", cacheSize);
            this.cacheSize = cacheSize;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>AB</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The number of cluster nodes. This parameter takes effect only in Serverless mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterNodeCount(Integer clusterNodeCount) {
            this.putQueryParameter("ClusterNodeCount", clusterNodeCount);
            this.clusterNodeCount = clusterNodeCount;
            return this;
        }

        /**
         * <p>The cluster node type. This parameter takes effect only in Serverless mode.</p>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        public Builder clusterNodeType(String clusterNodeType) {
            this.putQueryParameter("ClusterNodeType", clusterNodeType);
            this.clusterNodeType = clusterNodeType;
            return this;
        }

        /**
         * <p>The configuration template applied to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder configPatternType(String configPatternType) {
            this.putQueryParameter("ConfigPatternType", configPatternType);
            this.configPatternType = configPatternType;
            return this;
        }

        /**
         * <p>The database endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213c8y****-public.selectdbfe.pre.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/2853363.html">DescribeAllDBInstanceClass</a> operation to query instance types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb.g.2xlarge</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>New instance test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The deployment mode of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>single_az</p>
         */
        public Builder deployScheme(String deployScheme) {
            this.putQueryParameter("DeployScheme", deployScheme);
            this.deployScheme = deployScheme;
            return this;
        }

        /**
         * <p>The database engine type. Default value: <strong>selectdb</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version. Default value: <strong>4.1</strong>. Valid values:</p>
         * <ul>
         * <li><p>4.0</p>
         * </li>
         * <li><p>4.1</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4.1</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The node specifications of a single node in the frontend (FE) cluster. This parameter takes effect only when you create a pay-as-you-go or subscription instance. Default value: selectdb_fe.xlarge16.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb_fe.xlarge16</p>
         */
        public Builder FEClassCode(String FEClassCode) {
            this.putQueryParameter("FEClassCode", FEClassCode);
            this.FEClassCode = FEClassCode;
            return this;
        }

        /**
         * <p>The number of nodes in the FE cluster. This parameter takes effect only when you create a pay-as-you-go or subscription instance. Default value: 3. Valid values: 1 to 11. The value must be an odd number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder FENodeCount(String FENodeCount) {
            this.putQueryParameter("FENodeCount", FENodeCount);
            this.FENodeCount = FENodeCount;
            return this;
        }

        /**
         * <p>The multi-zone configuration.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect and is required when DeployScheme is set to multi_az.</li>
         * </ul>
         * </blockquote>
         */
        public Builder multiZone(java.util.List<MultiZone> multiZone) {
            String multiZoneShrink = shrink(multiZone, "MultiZone", "json");
            this.putQueryParameter("MultiZone", multiZoneShrink);
            this.multiZone = multiZone;
            return this;
        }

        /**
         * <p>Specifies the billing cycle of the subscription cluster. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: yearly.</li>
         * <li><strong>Month</strong>: monthly.<blockquote>
         * <p>This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
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
         * <p>The region ID.</p>
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
         * <p>rg-aekzt2zaluvuvqa_fake</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The maximum value of the automatic scaling range for the RCU (RDS Capacity Unit) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder scaleMax(Double scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum value of the automatic scaling range for the RCU (RDS Capacity Unit) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder scaleMin(Double scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The IP address whitelist of the instance. Separate multiple IP addresses with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The tag list information of the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to enable TDE on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder tdeEnabled(String tdeEnabled) {
            this.putQueryParameter("TdeEnabled", tdeEnabled);
            this.tdeEnabled = tdeEnabled;
            return this;
        }

        /**
         * <p>The mode for enabling Transparent Data Encryption (TDE) on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        public Builder tdeMode(String tdeMode) {
            this.putQueryParameter("TdeMode", tdeMode);
            this.tdeMode = tdeMode;
            return this;
        }

        /**
         * <p>The subscription duration of the instance. The unit is specified by the Period parameter. Year indicates years, and Month indicates months. Valid values:</p>
         * <ul>
         * <li>If Period is set to Year, valid values are 1, 2, 3, 4, and 5.</li>
         * <li>If Period is set to Month, valid values are 1 to 12.<blockquote>
         * <p>This parameter takes effect and is required only when <strong>ChargeType</strong> is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
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

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1gzt31twhlo0sa5****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp175iuvg8nxqraf2****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class MultiZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MultiZone(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZone create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MultiZone model) {
                this.vSwitchIds = model.vSwitchIds;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The list of vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MultiZone build() {
                return new MultiZone(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
