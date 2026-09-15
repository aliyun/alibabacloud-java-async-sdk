// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyBackupPolicyStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyStatusRequest</p>
 */
public class ModifyBackupPolicyStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    @Deprecated
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the anti-ransomware policy that you want to enable or shutdown.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30490</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The version of the policy that you want to enable or disable. Set the value to <strong>2.0.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable the anti-ransomware policy. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: Enables the anti-ransomware policy. After the policy is enabled, anti-ransomware can protect your server data by backing up data on specified servers based on your anti-ransomware policy.</li>
         * <li><strong>disabled</strong>: Disables the anti-ransomware policy. After the policy is disabled, running backup tasks are stopped.</li>
         * </ul>
         * <blockquote>
         * <p>Backup tasks consume network bandwidth. Enable the policy during off-peak hours to execute data backup tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
