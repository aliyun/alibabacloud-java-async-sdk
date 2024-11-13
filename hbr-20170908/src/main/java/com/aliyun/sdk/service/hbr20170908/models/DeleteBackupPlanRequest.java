// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPlanRequest</p>
 */
public class DeleteBackupPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireNoRunningJobs")
    private Boolean requireNoRunningJobs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
         * <p>The ID of the backup plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-*********************</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>Specifies whether no running jobs are required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder requireNoRunningJobs(Boolean requireNoRunningJobs) {
            this.putQueryParameter("RequireNoRunningJobs", requireNoRunningJobs);
            this.requireNoRunningJobs = requireNoRunningJobs;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
         * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
         * <li><strong>OTS</strong>: Tablestore instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The ID of the backup vault. This parameter is required if the SourceType parameter is not set to UDM_ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
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
