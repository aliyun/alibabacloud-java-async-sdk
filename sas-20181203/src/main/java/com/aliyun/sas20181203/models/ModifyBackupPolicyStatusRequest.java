// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

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
    private Long id;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("Status")
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

        private Builder(ModifyBackupPolicyStatusRequest response) {
            super(response);
            this.id = response.id;
            this.policyVersion = response.policyVersion;
            this.status = response.status;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * PolicyVersion.
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * Status.
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
