// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSandboxInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSandboxInstanceRequest</p>
 */
public class CreateSandboxInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("SandboxInstanceName")
    private String sandboxInstanceName;

    @Query
    @NameInMap("SandboxPassword")
    private String sandboxPassword;

    @Query
    @NameInMap("SandboxSpecification")
    private String sandboxSpecification;

    @Query
    @NameInMap("SandboxType")
    private String sandboxType;

    @Query
    @NameInMap("SandboxUser")
    private String sandboxUser;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VpcSwitchId")
    private String vpcSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateSandboxInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetId = builder.backupSetId;
        this.restoreTime = builder.restoreTime;
        this.sandboxInstanceName = builder.sandboxInstanceName;
        this.sandboxPassword = builder.sandboxPassword;
        this.sandboxSpecification = builder.sandboxSpecification;
        this.sandboxType = builder.sandboxType;
        this.sandboxUser = builder.sandboxUser;
        this.vpcId = builder.vpcId;
        this.vpcSwitchId = builder.vpcSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSandboxInstanceRequest create() {
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
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return sandboxInstanceName
     */
    public String getSandboxInstanceName() {
        return this.sandboxInstanceName;
    }

    /**
     * @return sandboxPassword
     */
    public String getSandboxPassword() {
        return this.sandboxPassword;
    }

    /**
     * @return sandboxSpecification
     */
    public String getSandboxSpecification() {
        return this.sandboxSpecification;
    }

    /**
     * @return sandboxType
     */
    public String getSandboxType() {
        return this.sandboxType;
    }

    /**
     * @return sandboxUser
     */
    public String getSandboxUser() {
        return this.sandboxUser;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcSwitchId
     */
    public String getVpcSwitchId() {
        return this.vpcSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateSandboxInstanceRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private String backupSetId; 
        private String restoreTime; 
        private String sandboxInstanceName; 
        private String sandboxPassword; 
        private String sandboxSpecification; 
        private String sandboxType; 
        private String sandboxUser; 
        private String vpcId; 
        private String vpcSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSandboxInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.backupSetId = request.backupSetId;
            this.restoreTime = request.restoreTime;
            this.sandboxInstanceName = request.sandboxInstanceName;
            this.sandboxPassword = request.sandboxPassword;
            this.sandboxSpecification = request.sandboxSpecification;
            this.sandboxType = request.sandboxType;
            this.sandboxUser = request.sandboxUser;
            this.vpcId = request.vpcId;
            this.vpcSwitchId = request.vpcSwitchId;
            this.zoneId = request.zoneId;
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
         * The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule.
         * <p>
         * 
         * > If your instance is an ApsaraDB RDS for MySQL instance, you can [configure automatic access to a data source](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * The ID of the backup set to be restored, which is the point in time when a snapshot was created. You can call the [DescribeSandboxBackupSets](~~437256~~) operation to obtain the ID.
         * <p>
         * 
         * > You need to specify only one of the **BackupSetId** and **RestoreTime** parameters.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * The point in time of the sandbox instance to be restored. You can call the [DescribeSandboxRecoveryTime](~~437258~~) operation to view the recoverable time range. Specify the time in the format of *yyyy-MM-ddTHH:mm:ssZ*. The time must be in UTC.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * The custom name of the sandbox instance.
         */
        public Builder sandboxInstanceName(String sandboxInstanceName) {
            this.putQueryParameter("SandboxInstanceName", sandboxInstanceName);
            this.sandboxInstanceName = sandboxInstanceName;
            return this;
        }

        /**
         * The password of the privileged account created in the sandbox instance.
         */
        public Builder sandboxPassword(String sandboxPassword) {
            this.putQueryParameter("SandboxPassword", sandboxPassword);
            this.sandboxPassword = sandboxPassword;
            return this;
        }

        /**
         * The specifications of the sandbox instance. Valid values:
         * <p>
         * 
         * *   **MYSQL\_1C\_1M_SD**: 1 CPU core and 1 GB of memory.
         * *   **MYSQL\_1C\_2M_SD**: 1 CPU core and 2 GB of memory.
         * *   **MYSQL\_2C\_4M_SD**: 2 CPU cores and 4 GB of memory.
         * *   **MYSQL\_2C\_8M_SD**: 2 CPU cores and 8 GB of memory.
         * *   **MYSQL\_4C\_8M_SD**: 4 CPU cores and 8 GB of memory.
         * *   **MYSQL\_4C\_16M_SD**: 4 CPU cores and 16 GB of memory.
         * *   **MYSQL\_8C\_16M_SD**: 8 CPU cores and 16 GB of memory.
         * *   **MYSQL\_8C\_32M_SD**: 8 CPU cores and 32 GB of memory.
         * 
         * > Different specifications have little impact on the recovery speed. High-specification instances provide better performance after restoration. For more information, see [DBS sandbox fees](~~201466~~).
         */
        public Builder sandboxSpecification(String sandboxSpecification) {
            this.putQueryParameter("SandboxSpecification", sandboxSpecification);
            this.sandboxSpecification = sandboxSpecification;
            return this;
        }

        /**
         * The type of the sandbox instance. You can call this operation only to create an instance of the **Sandbox** type. After the sandbox instance is created, the MySQL endpoint of the instance is provided.
         */
        public Builder sandboxType(String sandboxType) {
            this.putQueryParameter("SandboxType", sandboxType);
            this.sandboxType = sandboxType;
            return this;
        }

        /**
         * The privileged account created in the sandbox instance.
         * <p>
         * 
         * *   After you specify this parameter, the system creates a privileged account in the sandbox instance. The account is granted the permissions on all databases in the instance.
         * 
         * The account of the source database is retained in the sandbox instance.
         * 
         * *   If you do not specify this parameter, the database account is the same as that of the source database.
         */
        public Builder sandboxUser(String sandboxUser) {
            this.putQueryParameter("SandboxUser", sandboxUser);
            this.sandboxUser = sandboxUser;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) that is used to connect to the sandbox instance. If you want to connect to the sandbox instance by using Elastic Compute Service (ECS) instances, you must set this parameter to the VPC in which the ECS instances reside.
         * <p>
         * 
         * > You can set this parameter if you want to use it in a recovery drill scenario.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the VSwitch that is used to connect to the sandbox instance.
         */
        public Builder vpcSwitchId(String vpcSwitchId) {
            this.putQueryParameter("VpcSwitchId", vpcSwitchId);
            this.vpcSwitchId = vpcSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateSandboxInstanceRequest build() {
            return new CreateSandboxInstanceRequest(this);
        } 

    } 

}
