// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSandboxRecoveryTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSandboxRecoveryTimeRequest</p>
 */
public class DescribeSandboxRecoveryTimeRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    private DescribeSandboxRecoveryTimeRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSandboxRecoveryTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public static final class Builder extends Request.Builder<DescribeSandboxRecoveryTimeRequest, Builder> {
        private String backupPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSandboxRecoveryTimeRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
        } 

        /**
         * The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule. If you set this parameter to the backup schedule ID obtained by calling the DescribeBackupPlanList operation, the dbs prefix must be removed. Otherwise, the call fails.
         * <p>
         * 
         * >  If your instance is an ApsaraDB RDS for MySQL instance, you can configure [automatic access to the instance](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        @Override
        public DescribeSandboxRecoveryTimeRequest build() {
            return new DescribeSandboxRecoveryTimeRequest(this);
        } 

    } 

}
