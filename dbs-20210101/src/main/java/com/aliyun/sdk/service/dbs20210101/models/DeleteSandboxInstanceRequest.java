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
 * {@link DeleteSandboxInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSandboxInstanceRequest</p>
 */
public class DeleteSandboxInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DeleteSandboxInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.instanceId = builder.instanceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSandboxInstanceRequest create() {
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DeleteSandboxInstanceRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private String instanceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSandboxInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.instanceId = request.instanceId;
            this.zoneId = request.zoneId;
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
         * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/437215.html">DescribeBackupPlanList</a> operation to query the ID of the backup schedule.</p>
         * <blockquote>
         * <p>If your instance is an ApsaraDB RDS for MySQL instance, you can <a href="https://help.aliyun.com/document_detail/193091.html">configure automatic access to a data source</a> to automatically add the instance to DBS and obtain the ID of the backup schedule.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1hxxxx8xxxxxa</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The ID of the sandbox instance. You can call the <a href="https://help.aliyun.com/document_detail/437257.html">DescribeSandboxInstances</a> operation to query the ID of the sandbox instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1jxxxxnxxx1xc</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DeleteSandboxInstanceRequest build() {
            return new DeleteSandboxInstanceRequest(this);
        } 

    } 

}
