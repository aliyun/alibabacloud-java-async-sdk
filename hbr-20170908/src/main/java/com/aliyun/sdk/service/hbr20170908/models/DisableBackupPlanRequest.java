// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>DisableBackupPlanRequest</p>
 */
public class DisableBackupPlanRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private DisableBackupPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.sourceType = builder.sourceType;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableBackupPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DisableBackupPlanRequest, Builder> {
        private String planId; 
        private String sourceType; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DisableBackupPlanRequest request) {
            super(request);
            this.planId = request.planId;
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
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: The system backs up data from Elastic Compute Service (ECS) instances.
         * *   **OSS**: The system backs up data from Object Storage Service (OSS) buckets.
         * *   **NAS**: The system backs up data from Apsara File Storage NAS file systems.
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
        public DisableBackupPlanRequest build() {
            return new DisableBackupPlanRequest(this);
        } 

    } 

}
