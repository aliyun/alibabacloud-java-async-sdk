// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CmsV1MigrationAdmission} extends {@link TeaModel}
 *
 * <p>CmsV1MigrationAdmission</p>
 */
public class CmsV1MigrationAdmission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("newMigrationAllowed")
    private Boolean newMigrationAllowed;

    @com.aliyun.core.annotation.NameInMap("policyRevision")
    private String policyRevision;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private CmsV1MigrationAdmission(Builder builder) {
        this.newMigrationAllowed = builder.newMigrationAllowed;
        this.policyRevision = builder.policyRevision;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CmsV1MigrationAdmission create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newMigrationAllowed
     */
    public Boolean getNewMigrationAllowed() {
        return this.newMigrationAllowed;
    }

    /**
     * @return policyRevision
     */
    public String getPolicyRevision() {
        return this.policyRevision;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private Boolean newMigrationAllowed; 
        private String policyRevision; 
        private String reason; 

        private Builder() {
        } 

        private Builder(CmsV1MigrationAdmission model) {
            this.newMigrationAllowed = model.newMigrationAllowed;
            this.policyRevision = model.policyRevision;
            this.reason = model.reason;
        } 

        /**
         * <p>The real-time new migration eligibility evaluated for the current target primary account, which does not replace RAM, account ownership, or workspace validations.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder newMigrationAllowed(Boolean newMigrationAllowed) {
            this.newMigrationAllowed = newMigrationAllowed;
            return this;
        }

        /**
         * <p>The summary of the normalized policy, which excludes the UID list and is not an authorization credential.</p>
         * 
         * <strong>example:</strong>
         * <p>03ac8b5b92cb9c2675119d64c31d2520c069647aa9b88979df1bb115472c02b4</p>
         */
        public Builder policyRevision(String policyRevision) {
            this.policyRevision = policyRevision;
            return this;
        }

        /**
         * <p>The reason why the new migration is denied. CMSV1_MIGRATION_NOT_ADMITTED indicates that the migration is not admitted, and CMSV1_MIGRATION_POLICY_UNAVAILABLE indicates that the policy is unavailable. Historical tasks remain queryable.</p>
         * 
         * <strong>example:</strong>
         * <p>CMSV1_MIGRATION_NOT_ADMITTED</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public CmsV1MigrationAdmission build() {
            return new CmsV1MigrationAdmission(this);
        } 

    } 

}
