// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPlanRequest</p>
 */
public class DeleteBackupPlanRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("RequireNoRunningJobs")
    private Boolean requireNoRunningJobs;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private DeleteBackupPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.requireNoRunningJobs = builder.requireNoRunningJobs;
        this.sourceType = builder.sourceType;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return requireNoRunningJobs
     */
    public Boolean getRequireNoRunningJobs() {
        return this.requireNoRunningJobs;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DeleteBackupPlanRequest, Builder> {
        private String planId; 
        private Boolean requireNoRunningJobs; 
        private String sourceType; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPlanRequest request) {
            super(request);
            this.planId = request.planId;
            this.requireNoRunningJobs = request.requireNoRunningJobs;
            this.sourceType = request.sourceType;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the backup plan.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * RequireNoRunningJobs.
         */
        public Builder requireNoRunningJobs(Boolean requireNoRunningJobs) {
            this.putQueryParameter("RequireNoRunningJobs", requireNoRunningJobs);
            this.requireNoRunningJobs = requireNoRunningJobs;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: Elastic Compute Service (ECS) files
         * *   **OSS**: Object Storage Service (OSS) buckets
         * *   **NAS**: Apsara File Storage NAS file systems
         * *   **UDM_ECS**: ECS instances
         * *   **OTS**: Tablestore instances
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DeleteBackupPlanRequest build() {
            return new DeleteBackupPlanRequest(this);
        } 

    } 

}
