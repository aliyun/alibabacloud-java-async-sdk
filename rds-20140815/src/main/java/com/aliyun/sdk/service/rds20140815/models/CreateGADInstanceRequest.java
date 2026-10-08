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
 * {@link CreateGADInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateGADInstanceRequest</p>
 */
public class CreateGADInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CentralDBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String centralDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CentralRdsDtsAdminAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String centralRdsDtsAdminAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CentralRdsDtsAdminPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String centralRdsDtsAdminPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CentralRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String centralRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UnitNode> unitNode;

    private CreateGADInstanceRequest(Builder builder) {
        super(builder);
        this.centralDBInstanceId = builder.centralDBInstanceId;
        this.centralRdsDtsAdminAccount = builder.centralRdsDtsAdminAccount;
        this.centralRdsDtsAdminPassword = builder.centralRdsDtsAdminPassword;
        this.centralRegionId = builder.centralRegionId;
        this.DBList = builder.DBList;
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.unitNode = builder.unitNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGADInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centralDBInstanceId
     */
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    /**
     * @return centralRdsDtsAdminAccount
     */
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    /**
     * @return centralRdsDtsAdminPassword
     */
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    /**
     * @return centralRegionId
     */
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    /**
     * @return DBList
     */
    public String getDBList() {
        return this.DBList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return unitNode
     */
    public java.util.List<UnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static final class Builder extends Request.Builder<CreateGADInstanceRequest, Builder> {
        private String centralDBInstanceId; 
        private String centralRdsDtsAdminAccount; 
        private String centralRdsDtsAdminPassword; 
        private String centralRegionId; 
        private String DBList; 
        private String description; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private java.util.List<UnitNode> unitNode; 

        private Builder() {
            super();
        } 

        private Builder(CreateGADInstanceRequest request) {
            super(request);
            this.centralDBInstanceId = request.centralDBInstanceId;
            this.centralRdsDtsAdminAccount = request.centralRdsDtsAdminAccount;
            this.centralRdsDtsAdminPassword = request.centralRdsDtsAdminPassword;
            this.centralRegionId = request.centralRegionId;
            this.DBList = request.DBList;
            this.description = request.description;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.unitNode = request.unitNode;
        } 

        /**
         * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID. This instance serves as the central node (primary node) of the GAD cluster.</p>
         * <blockquote>
         * <ul>
         * <li>A primary instance ID can serve as the central node of only one GAD cluster.</li>
         * <li>Only ApsaraDB RDS for MySQL primary instances in the China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu) regions can serve as the central node of a GAD cluster.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder centralDBInstanceId(String centralDBInstanceId) {
            this.putQueryParameter("CentralDBInstanceId", centralDBInstanceId);
            this.centralDBInstanceId = centralDBInstanceId;
            return this;
        }

        /**
         * <p>The privileged account of the central node. You can call the DescribeAccounts operation to query the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder centralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
            this.putQueryParameter("CentralRdsDtsAdminAccount", centralRdsDtsAdminAccount);
            this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
            return this;
        }

        /**
         * <p>The password of the privileged account for the central node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test12345</p>
         */
        public Builder centralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
            this.putQueryParameter("CentralRdsDtsAdminPassword", centralRdsDtsAdminPassword);
            this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
            return this;
        }

        /**
         * <p>The region ID of the central node. You can call the DescribeRegions operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder centralRegionId(String centralRegionId) {
            this.putQueryParameter("CentralRegionId", centralRegionId);
            this.centralRegionId = centralRegionId;
            return this;
        }

        /**
         * <p>A JSON array that contains the database information of the central node. All database information in this array is synchronized to the current unit node (secondary node). Parameter description:</p>
         * <ul>
         * <li><strong>name</strong>: the database name.</li>
         * <li><strong>all</strong>: specifies whether to synchronize all data in the current database or table. Valid values: <strong>true</strong> | <strong>false</strong>.</li>
         * <li><strong>Table</strong>: the table name. If the <strong>all</strong> parameter is set to <strong>false</strong>, you must also specify the names of the tables to be synchronized in the JSON array.</li>
         * </ul>
         * <p>Example: <code>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</code></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</p>
         */
        public Builder DBList(String DBList) {
            this.putQueryParameter("DBList", DBList);
            this.DBList = DBList;
            return this;
        }

        /**
         * <p>The name of the GAD cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The unit node information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder unitNode(java.util.List<UnitNode> unitNode) {
            this.putQueryParameter("UnitNode", unitNode);
            this.unitNode = unitNode;
            return this;
        }

        @Override
        public CreateGADInstanceRequest build() {
            return new CreateGADInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGADInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateGADInstanceRequest</p>
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
             * <p>The tag key. You can create up to N tag keys at a time. Valid values of N: <strong>1 to 20</strong>. The tag key cannot be an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>testkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value that corresponds to the tag key. You can create up to N tag values at a time. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue1</p>
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
    /**
     * 
     * {@link CreateGADInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateGADInstanceRequest</p>
     */
    public static class UnitNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @com.aliyun.core.annotation.NameInMap("DbInstanceClass")
        private String dbInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DtsConflict")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dtsConflict;

        @com.aliyun.core.annotation.NameInMap("DtsInstanceClass")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dtsInstanceClass;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionID")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("VSwitchID")
        private String vSwitchID;

        @com.aliyun.core.annotation.NameInMap("VpcID")
        private String vpcID;

        @com.aliyun.core.annotation.NameInMap("ZoneID")
        private String zoneID;

        @com.aliyun.core.annotation.NameInMap("ZoneIDSlave1")
        private String zoneIDSlave1;

        @com.aliyun.core.annotation.NameInMap("ZoneIDSlave2")
        private String zoneIDSlave2;

        private UnitNode(Builder builder) {
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceStorage = builder.DBInstanceStorage;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.dbInstanceClass = builder.dbInstanceClass;
            this.dtsConflict = builder.dtsConflict;
            this.dtsInstanceClass = builder.dtsInstanceClass;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.payType = builder.payType;
            this.regionID = builder.regionID;
            this.securityIPList = builder.securityIPList;
            this.vSwitchID = builder.vSwitchID;
            this.vpcID = builder.vpcID;
            this.zoneID = builder.zoneID;
            this.zoneIDSlave1 = builder.zoneIDSlave1;
            this.zoneIDSlave2 = builder.zoneIDSlave2;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitNode create() {
            return builder().build();
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceStorage
         */
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        /**
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        /**
         * @return dbInstanceClass
         */
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        /**
         * @return dtsConflict
         */
        public String getDtsConflict() {
            return this.dtsConflict;
        }

        /**
         * @return dtsInstanceClass
         */
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
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
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return vSwitchID
         */
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        /**
         * @return vpcID
         */
        public String getVpcID() {
            return this.vpcID;
        }

        /**
         * @return zoneID
         */
        public String getZoneID() {
            return this.zoneID;
        }

        /**
         * @return zoneIDSlave1
         */
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        /**
         * @return zoneIDSlave2
         */
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

        public static final class Builder {
            private String DBInstanceDescription; 
            private Long DBInstanceStorage; 
            private String DBInstanceStorageType; 
            private String dbInstanceClass; 
            private String dtsConflict; 
            private String dtsInstanceClass; 
            private String engine; 
            private String engineVersion; 
            private String payType; 
            private String regionID; 
            private String securityIPList; 
            private String vSwitchID; 
            private String vpcID; 
            private String zoneID; 
            private String zoneIDSlave1; 
            private String zoneIDSlave2; 

            private Builder() {
            } 

            private Builder(UnitNode model) {
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceStorage = model.DBInstanceStorage;
                this.DBInstanceStorageType = model.DBInstanceStorageType;
                this.dbInstanceClass = model.dbInstanceClass;
                this.dtsConflict = model.dtsConflict;
                this.dtsInstanceClass = model.dtsInstanceClass;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.payType = model.payType;
                this.regionID = model.regionID;
                this.securityIPList = model.securityIPList;
                this.vSwitchID = model.vSwitchID;
                this.vpcID = model.vpcID;
                this.zoneID = model.zoneID;
                this.zoneIDSlave1 = model.zoneIDSlave1;
                this.zoneIDSlave2 = model.zoneIDSlave2;
            } 

            /**
             * <p>The name of the new unit node. The name must meet the following requirements:</p>
             * <ul>
             * <li>The name must be <strong>2 to 255</strong> characters in length.</li>
             * <li>The name must start with a letter or a Chinese character. It can contain digits, Chinese characters, letters, underscores (_), and hyphens (-).</li>
             * <li>The name cannot start with <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The storage capacity of the new unit node. Unit: GB. The value is incremented in 5 GB increments. For the value range, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>. You can also call the DescribeAvailableResource operation to query the available storage capacity range for the target instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * <p>The instance storage type. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd</strong>: Premium Local SSD (recommended).</li>
             * <li><strong>cloud_ssd</strong>: standard SSD (not recommended because standard SSDs are no longer available for purchase in some regions).</li>
             * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
             * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
             * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
             * </ul>
             * <p>The default value of this parameter is determined by the instance type specified in the <strong>DBInstanceClass</strong> parameter:</p>
             * <ul>
             * <li>If the instance type is a Premium Local SSD instance type, the default value is <strong>local_ssd</strong>.</li>
             * <li>If the instance type is a cloud disk instance type, the default value is <strong>cloud_essd</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd2</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The instance type of the new unit node. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>. You can also call the DescribeAvailableResource operation to query the available instance types in the target region.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.t1.small</p>
             */
            public Builder dbInstanceClass(String dbInstanceClass) {
                this.dbInstanceClass = dbInstanceClass;
                return this;
            }

            /**
             * <p>The conflict resolution policy used when a primary key conflict occurs during data synchronization for the new unit node. Valid values:</p>
             * <ul>
             * <li><strong>overwrite</strong>: overwrites the conflicting primary key on the destination node.</li>
             * <li><strong>interrupt</strong>: stops the synchronization task and reports an error.</li>
             * <li><strong>ignore</strong>: ignores the conflicting primary key on the current node.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>overwrite</p>
             */
            public Builder dtsConflict(String dtsConflict) {
                this.dtsConflict = dtsConflict;
                return this;
            }

            /**
             * <p>The specification of the data synchronization link for the new unit node. Valid values:</p>
             * <ul>
             * <li><strong>small</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>large</strong></li>
             * <li><strong>micro</strong></li>
             * </ul>
             * <blockquote>
             * <p>For more information about the differences between specifications, see <a href="https://help.aliyun.com/document_detail/26605.html">Data synchronization link specifications</a>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder dtsInstanceClass(String dtsInstanceClass) {
                this.dtsInstanceClass = dtsInstanceClass;
                return this;
            }

            /**
             * <p>The database engine of the new unit node. Only <strong>MySQL</strong> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version of the new unit node. Valid values:</p>
             * <ul>
             * <li><strong>8.0</strong></li>
             * <li><strong>5.7</strong></li>
             * <li><strong>5.6</strong></li>
             * <li><strong>5.5</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The billing method of the new unit node. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * <blockquote>
             * <p>The system automatically generates and completes the payment for the order. You do not need to manually confirm the payment.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID of the new unit node. You can call the DescribeRegions operation to query the region ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the new unit node. Separate multiple entries with commas (,). Entries cannot be duplicated. A maximum of 1,000 entries are allowed. The following two formats are supported:</p>
             * <ul>
             * <li>IP address format, such as <code>10.10.10.10</code>.</li>
             * <li>CIDR format, such as <code>10.10.10.10/24</code> (Classless Inter-Domain Routing, where <strong>24</strong> indicates the length of the prefix, ranging from <strong>1 to 32</strong>).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.10</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The vSwitch ID of the new unit node.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1tg609m5j85****</p>
             */
            public Builder vSwitchID(String vSwitchID) {
                this.vSwitchID = vSwitchID;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID of the new unit node.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19ame5m1r3o****</p>
             */
            public Builder vpcID(String vpcID) {
                this.vpcID = vpcID;
                return this;
            }

            /**
             * <p>The zone ID of the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneID(String zoneID) {
                this.zoneID = zoneID;
                return this;
            }

            /**
             * <p>The zone ID of the secondary node for the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
             * <ul>
             * <li>If this value is the same as the <strong>ZoneId</strong> of the current unit node, the single-zone deployment is used.</li>
             * <li>If this value is different from the <strong>ZoneId</strong> of the current unit node, the multi-zone deployment is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneIDSlave1(String zoneIDSlave1) {
                this.zoneIDSlave1 = zoneIDSlave1;
                return this;
            }

            /**
             * <p>The zone ID of the logger node for the new unit node. You can call the DescribeRegions operation to query the zone ID.</p>
             * <ul>
             * <li>If this value is the same as the <strong>ZoneId</strong> of the current unit node, the single-zone deployment is used.</li>
             * <li>If this value is different from the <strong>ZoneId</strong> of the current unit node, the multi-zone deployment is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
             */
            public Builder zoneIDSlave2(String zoneIDSlave2) {
                this.zoneIDSlave2 = zoneIDSlave2;
                return this;
            }

            public UnitNode build() {
                return new UnitNode(this);
            } 

        } 

    }
}
