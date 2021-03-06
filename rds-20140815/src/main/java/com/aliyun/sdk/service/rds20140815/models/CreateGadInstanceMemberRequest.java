// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGadInstanceMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateGadInstanceMemberRequest</p>
 */
public class CreateGadInstanceMemberRequest extends Request {
    @Query
    @NameInMap("CentralDBInstanceId")
    @Validation(required = true)
    private String centralDBInstanceId;

    @Query
    @NameInMap("CentralRdsDtsAdminAccount")
    @Validation(required = true)
    private String centralRdsDtsAdminAccount;

    @Query
    @NameInMap("CentralRdsDtsAdminPassword")
    @Validation(required = true)
    private String centralRdsDtsAdminPassword;

    @Query
    @NameInMap("CentralRegionId")
    @Validation(required = true)
    private String centralRegionId;

    @Query
    @NameInMap("DBList")
    @Validation(required = true)
    private String DBList;

    @Query
    @NameInMap("GadInstanceId")
    @Validation(required = true)
    private String gadInstanceId;

    @Query
    @NameInMap("UnitNode")
    @Validation(required = true)
    private java.util.List < UnitNode> unitNode;

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
    public java.util.List < UnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static final class Builder extends Request.Builder<CreateGadInstanceMemberRequest, Builder> {
        private String centralDBInstanceId; 
        private String centralRdsDtsAdminAccount; 
        private String centralRdsDtsAdminPassword; 
        private String centralRegionId; 
        private String DBList; 
        private String gadInstanceId; 
        private java.util.List < UnitNode> unitNode; 

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
         * CentralDBInstanceId.
         */
        public Builder centralDBInstanceId(String centralDBInstanceId) {
            this.putQueryParameter("CentralDBInstanceId", centralDBInstanceId);
            this.centralDBInstanceId = centralDBInstanceId;
            return this;
        }

        /**
         * CentralRdsDtsAdminAccount.
         */
        public Builder centralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
            this.putQueryParameter("CentralRdsDtsAdminAccount", centralRdsDtsAdminAccount);
            this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
            return this;
        }

        /**
         * CentralRdsDtsAdminPassword.
         */
        public Builder centralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
            this.putQueryParameter("CentralRdsDtsAdminPassword", centralRdsDtsAdminPassword);
            this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
            return this;
        }

        /**
         * CentralRegionId.
         */
        public Builder centralRegionId(String centralRegionId) {
            this.putQueryParameter("CentralRegionId", centralRegionId);
            this.centralRegionId = centralRegionId;
            return this;
        }

        /**
         * DBList.
         */
        public Builder DBList(String DBList) {
            this.putQueryParameter("DBList", DBList);
            this.DBList = DBList;
            return this;
        }

        /**
         * GadInstanceId.
         */
        public Builder gadInstanceId(String gadInstanceId) {
            this.putQueryParameter("GadInstanceId", gadInstanceId);
            this.gadInstanceId = gadInstanceId;
            return this;
        }

        /**
         * UnitNode.
         */
        public Builder unitNode(java.util.List < UnitNode> unitNode) {
            this.putQueryParameter("UnitNode", unitNode);
            this.unitNode = unitNode;
            return this;
        }

        @Override
        public CreateGadInstanceMemberRequest build() {
            return new CreateGadInstanceMemberRequest(this);
        } 

    } 

    public static class UnitNode extends TeaModel {
        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceStorage")
        private Long DBInstanceStorage;

        @NameInMap("DbInstanceClass")
        private String dbInstanceClass;

        @NameInMap("DtsConflict")
        @Validation(required = true)
        private String dtsConflict;

        @NameInMap("DtsInstanceClass")
        @Validation(required = true)
        private String dtsInstanceClass;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("RegionID")
        @Validation(required = true)
        private String regionID;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("VSwitchID")
        @Validation(required = true)
        private String vSwitchID;

        @NameInMap("VpcID")
        @Validation(required = true)
        private String vpcID;

        @NameInMap("ZoneID")
        private String zoneID;

        @NameInMap("ZoneIDSlave1")
        private String zoneIDSlave1;

        @NameInMap("ZoneIDSlave2")
        private String zoneIDSlave2;

        private UnitNode(Builder builder) {
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceStorage = builder.DBInstanceStorage;
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

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceStorage.
             */
            public Builder DBInstanceStorage(Long DBInstanceStorage) {
                this.DBInstanceStorage = DBInstanceStorage;
                return this;
            }

            /**
             * DbInstanceClass.
             */
            public Builder dbInstanceClass(String dbInstanceClass) {
                this.dbInstanceClass = dbInstanceClass;
                return this;
            }

            /**
             * DtsConflict.
             */
            public Builder dtsConflict(String dtsConflict) {
                this.dtsConflict = dtsConflict;
                return this;
            }

            /**
             * DtsInstanceClass.
             */
            public Builder dtsInstanceClass(String dtsInstanceClass) {
                this.dtsInstanceClass = dtsInstanceClass;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * RegionID.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * VSwitchID.
             */
            public Builder vSwitchID(String vSwitchID) {
                this.vSwitchID = vSwitchID;
                return this;
            }

            /**
             * VpcID.
             */
            public Builder vpcID(String vpcID) {
                this.vpcID = vpcID;
                return this;
            }

            /**
             * ZoneID.
             */
            public Builder zoneID(String zoneID) {
                this.zoneID = zoneID;
                return this;
            }

            /**
             * ZoneIDSlave1.
             */
            public Builder zoneIDSlave1(String zoneIDSlave1) {
                this.zoneIDSlave1 = zoneIDSlave1;
                return this;
            }

            /**
             * ZoneIDSlave2.
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
