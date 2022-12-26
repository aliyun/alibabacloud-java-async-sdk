// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupMachineStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupMachineStatusRequest</p>
 */
public class DescribeBackupMachineStatusRequest extends Request {
    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private Long policyId;

    @Query
    @NameInMap("PolicyVersion")
    private String policyVersion;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
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
         * PolicyId.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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
         * Uuid.
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
