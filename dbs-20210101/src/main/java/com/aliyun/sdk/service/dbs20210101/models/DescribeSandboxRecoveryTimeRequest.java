// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link DescribeSandboxRecoveryTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSandboxRecoveryTimeRequest</p>
 */
public class DescribeSandboxRecoveryTimeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    private DescribeSandboxRecoveryTimeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public static final class Builder extends Request.Builder<DescribeSandboxRecoveryTimeRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSandboxRecoveryTimeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/437215.html">DescribeBackupPlanList</a> operation to obtain the ID of the backup schedule. If you set this parameter to the backup schedule ID obtained by calling the DescribeBackupPlanList operation, the dbs prefix must be removed. Otherwise, the call fails.</p>
         * <blockquote>
         * <p>If your instance is an ApsaraDB RDS for MySQL instance, you can <a href="https://help.aliyun.com/document_detail/193091.html">configure automatic access to a data source</a> to automatically add the instance to DBS and obtain the ID of the backup schedule.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1jyjal15l****</p>
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
