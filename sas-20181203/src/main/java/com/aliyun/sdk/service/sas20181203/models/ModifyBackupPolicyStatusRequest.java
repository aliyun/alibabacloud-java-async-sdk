// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyStatusRequest</p>
 */
public class ModifyBackupPolicyStatusRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("PolicyVersion")
    @Validation(required = true)
    private String policyVersion;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private ModifyBackupPolicyStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.policyVersion = builder.policyVersion;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyStatusRequest, Builder> {
        private Long id; 
        private String policyVersion; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyStatusRequest request) {
            super(request);
            this.id = request.id;
            this.policyVersion = request.policyVersion;
            this.status = request.status;
        } 

        /**
         * The ID of the anti-ransomware policy.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The version of the anti-ransomware policy. Set the value to **2.0.0**.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * Specifies whether to enable or disable the anti-ransomware policy. Valid values:
         * <p>
         * 
         * *   **enabled**: enables the anti-ransomware policy. After you enable the anti-ransomware policy, the anti-ransomware feature protects data on your servers. Data on your servers is backed up based on the policy.
         * *   **disabled**: disables the anti-ransomware policy. After you disable the anti-ransomware policy, the data backup task that is running based on the policy stops.
         * 
         * >  When the system runs data backup tasks, your network bandwidth is consumed. We recommend that you enable the anti-ransomware policy during peak-off hours to back up data.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyBackupPolicyStatusRequest build() {
            return new ModifyBackupPolicyStatusRequest(this);
        } 

    } 

}
