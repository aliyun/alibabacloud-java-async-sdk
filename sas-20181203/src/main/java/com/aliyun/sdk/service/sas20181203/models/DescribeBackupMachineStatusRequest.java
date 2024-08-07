// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupMachineStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupMachineStatusRequest</p>
 */
public class DescribeBackupMachineStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private String policyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DescribeBackupMachineStatusRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyVersion = builder.policyVersion;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupMachineStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeBackupMachineStatusRequest, Builder> {
        private Long policyId; 
        private String policyVersion; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupMachineStatusRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyVersion = request.policyVersion;
            this.uuid = request.uuid;
        } 

        /**
         * The ID of the anti-ransomware policy.
         * <p>
         * 
         * >  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The version of the anti-ransomware policy. Valid values:
         * <p>
         * 
         * *   **1.0.0**
         * *   **2.0.0**
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * >  You can call the [DescribeBackupPolicy](~~DescribeBackupPolicy~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeBackupMachineStatusRequest build() {
            return new DescribeBackupMachineStatusRequest(this);
        } 

    } 

}
