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

    private CreateSandboxInstanceRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder<CreateSandboxInstanceRequest, Builder> {
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

        private Builder() {
            super();
        } 

        private Builder(CreateSandboxInstanceRequest request) {
            super(request);
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
        } 

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * SandboxInstanceName.
         */
        public Builder sandboxInstanceName(String sandboxInstanceName) {
            this.putQueryParameter("SandboxInstanceName", sandboxInstanceName);
            this.sandboxInstanceName = sandboxInstanceName;
            return this;
        }

        /**
         * SandboxPassword.
         */
        public Builder sandboxPassword(String sandboxPassword) {
            this.putQueryParameter("SandboxPassword", sandboxPassword);
            this.sandboxPassword = sandboxPassword;
            return this;
        }

        /**
         * SandboxSpecification.
         */
        public Builder sandboxSpecification(String sandboxSpecification) {
            this.putQueryParameter("SandboxSpecification", sandboxSpecification);
            this.sandboxSpecification = sandboxSpecification;
            return this;
        }

        /**
         * SandboxType.
         */
        public Builder sandboxType(String sandboxType) {
            this.putQueryParameter("SandboxType", sandboxType);
            this.sandboxType = sandboxType;
            return this;
        }

        /**
         * SandboxUser.
         */
        public Builder sandboxUser(String sandboxUser) {
            this.putQueryParameter("SandboxUser", sandboxUser);
            this.sandboxUser = sandboxUser;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VpcSwitchId.
         */
        public Builder vpcSwitchId(String vpcSwitchId) {
            this.putQueryParameter("VpcSwitchId", vpcSwitchId);
            this.vpcSwitchId = vpcSwitchId;
            return this;
        }

        @Override
        public CreateSandboxInstanceRequest build() {
            return new CreateSandboxInstanceRequest(this);
        } 

    } 

}
