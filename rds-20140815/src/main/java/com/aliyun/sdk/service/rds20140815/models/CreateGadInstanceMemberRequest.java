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
 * {@link CreateGadInstanceMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateGadInstanceMemberRequest</p>
 */
public class CreateGadInstanceMemberRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GadInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gadInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UnitNode> unitNode;

    private CreateGadInstanceMemberRequest(Builder builder) {
        super(builder);
        this.centralDBInstanceId = builder.centralDBInstanceId;
        this.centralRdsDtsAdminAccount = builder.centralRdsDtsAdminAccount;
        this.centralRdsDtsAdminPassword = builder.centralRdsDtsAdminPassword;
        this.centralRegionId = builder.centralRegionId;
        this.DBList = builder.DBList;
        this.gadInstanceId = builder.gadInstanceId;
        this.unitNode = builder.unitNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGadInstanceMemberRequest create() {
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
     * @return gadInstanceId
     */
    public String getGadInstanceId() {
        return this.gadInstanceId;
    }

    /**
     * @return unitNode
     */
    public java.util.List<UnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static final class Builder extends Request.Builder<CreateGadInstanceMemberRequest, Builder> {
        private String centralDBInstanceId; 
        private String centralRdsDtsAdminAccount; 
        private String centralRdsDtsAdminPassword; 
        private String centralRegionId; 
        private String DBList; 
        private String gadInstanceId; 
        private java.util.List<UnitNode> unitNode; 

        private Builder() {
            super();
        } 

        private Builder(CreateGadInstanceMemberRequest request) {
            super(request);
            this.centralDBInstanceId = request.centralDBInstanceId;
            this.centralRdsDtsAdminAccount = request.centralRdsDtsAdminAccount;
            this.centralRdsDtsAdminPassword = request.centralRdsDtsAdminPassword;
            this.centralRegionId = request.centralRegionId;
            this.DBList = request.DBList;
            this.gadInstanceId = request.gadInstanceId;
            this.unitNode = request.unitNode;
        } 

        /**
         * <p>The ID of the central node. You can call the DescribeGadInstances operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp190h8y69tad****</p>
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
         * <p>The password of the privileged account of the central node.</p>
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
         * <p>The region ID of the central node (primary node). You can call the DescribeRegions operation to query the region ID.</p>
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
         * <p>The JSON array of database information in the central node. All database information in the array is synchronized to the current unit node. Parameter description:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the database.</li>
         * <li><strong>all</strong>: specifies whether to synchronize all data in the current database or table. Valid values: <strong>true</strong> and <strong>false</strong>.</li>
         * <li><strong>Table</strong>: the name of the table. If the <strong>all</strong> parameter is set to <strong>false</strong>, you must also include the names of the tables to be synchronized in the JSON array.</li>
         * </ul>
         * <p>Example: <code>{    &quot;testdb&quot;: {     &quot;name&quot;: &quot;testdb&quot;,     &quot;all&quot;: false,     &quot;Table&quot;: {       &quot;order&quot;: {         &quot;name&quot;: &quot;order&quot;,         &quot;all&quot;: true       },       &quot;ordernew&quot;: {         &quot;name&quot;: &quot;ordernew&quot;,         &quot;all&quot;: true       }     }   } }</code></p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects for migration, synchronization, or subscription</a>.</p>
         * </blockquote>
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
         * <p>The ID of the ApsaraDB RDS global active database cluster. You can call the DescribeGadInstances operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-rm-bp1npi2j8****</p>
         */
        public Builder gadInstanceId(String gadInstanceId) {
            this.putQueryParameter("GadInstanceId", gadInstanceId);
            this.gadInstanceId = gadInstanceId;
            return this;
        }

        /**
         * <p>The list of unit node (secondary node) information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder unitNode(java.util.List<UnitNode> unitNode) {
            this.putQueryParameter("UnitNode", unitNode);
            this.unitNode = unitNode;
            return this;
        }

        @Override
        public CreateGadInstanceMemberRequest build() {
            return new CreateGadInstanceMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGadInstanceMemberRequest} extends {@link TeaModel}
     *
     * <p>CreateGadInstanceMemberRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("RegionID")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("VSwitchID")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchID;

        @com.aliyun.core.annotation.NameInMap("VpcID")
        @com.aliyun.core.annotation.Validation(required = true)
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
                this.regionID = model.regionID;
                this.securityIPList = model.securityIPList;
                this.vSwitchID = model.vSwitchID;
                this.vpcID = model.vpcID;
                this.zoneID = model.zoneID;
                this.zoneIDSlave1 = model.zoneIDSlave1;
                this.zoneIDSlave2 = model.zoneIDSlave2;
            } 

            /**
             * <p>The name of the new unit node. The naming rules are as follows:</p>
             * <ul>
             * <li>The name must be <strong>2</strong> to <strong>255</strong> characters in length.</li>
             * <li>The name must start with a letter or a Chinese character and can contain letters, digits, Chinese characters, underscores (_), and hyphens (-).</li>
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
             * <p>The storage capacity of the new unit node. Unit: GB. The storage capacity increases in increments of 5 GB. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>. You can also call the DescribeAvailableResource operation to query the available storage capacity range for the target instance type.</p>
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
             * <li><strong>local_ssd</strong>: local SSD</li>
             * <li><strong>cloud_ssd</strong>: standard SSD</li>
             * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
             * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
             * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The instance type of the new unit node. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a>. You can also call the DescribeAvailableResource operation to query the available instance types in the target region.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.t1.small</p>
             */
            public Builder dbInstanceClass(String dbInstanceClass) {
                this.dbInstanceClass = dbInstanceClass;
                return this;
            }

            /**
             * <p>The resolution policy for primary key conflicts that occur during synchronization on the new unit node. Valid values:</p>
             * <ul>
             * <li><strong>overwrite</strong>: Overwrites the conflicting primary keys in the destination node.</li>
             * <li><strong>interrupt</strong>: Interrupts the synchronization task, reports an error, and exits.</li>
             * <li><strong>ignore</strong>: Overwrites the conflicting primary keys in the current node.</li>
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
             * <p>The region ID of the new unit node (secondary node). You can call the DescribeRegions operation to query the region ID.</p>
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
             * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the new unit node. Separate multiple entries with commas (,). Duplicate entries are not allowed. A maximum of 1,000 entries can be added. The following two formats are supported:</p>
             * <ul>
             * <li>IP address format, such as <code>10.10.XX.XX</code>.</li>
             * <li>CIDR format, such as <code>10.10.XX.XX/24</code>. <strong>24</strong> indicates the length of the prefix in the IP address, and the valid values are <strong>1</strong> to <strong>32</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.10.XX.XX</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The vSwitch ID of the new unit node.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1tg609m5j85****</p>
             */
            public Builder vSwitchID(String vSwitchID) {
                this.vSwitchID = vSwitchID;
                return this;
            }

            /**
             * <p>The VPC ID of the new unit node.</p>
             * <p>This parameter is required.</p>
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
             * <p>The zone ID of the secondary node for the new unit node. You can call the DescribeRegions operation to query the zone ID where the node is active.</p>
             * <ul>
             * <li>If the value is the same as the <strong>ZoneId</strong> of the current unit node, it is a single-zone deployment.</li>
             * <li>If the value is different from the <strong>ZoneId</strong> of the current unit node, it is a multi-zone deployment.</li>
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
             * <p>The zone ID of the logger node for the new unit node. You can call the DescribeRegions operation to query the zone ID where the node is active.</p>
             * <ul>
             * <li>If the value is the same as the <strong>ZoneId</strong> of the current unit node, it is a single-zone deployment.</li>
             * <li>If the value is different from the <strong>ZoneId</strong> of the current unit node, it is a multi-zone deployment.</li>
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
