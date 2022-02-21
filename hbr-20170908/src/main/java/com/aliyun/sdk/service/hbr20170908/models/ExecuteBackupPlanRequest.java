// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>ExecuteBackupPlanRequest</p>
 */
public class ExecuteBackupPlanRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("RuleId")
    private String ruleId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private ExecuteBackupPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.ruleId = builder.ruleId;
        this.sourceType = builder.sourceType;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteBackupPlanRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<ExecuteBackupPlanRequest, Builder> {
        private String planId; 
        private String ruleId; 
        private String sourceType; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteBackupPlanRequest response) {
            super(response);
            this.planId = response.planId;
            this.ruleId = response.ruleId;
            this.sourceType = response.sourceType;
            this.vaultId = response.vaultId;
        } 

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public ExecuteBackupPlanRequest build() {
            return new ExecuteBackupPlanRequest(this);
        } 

    } 

}
