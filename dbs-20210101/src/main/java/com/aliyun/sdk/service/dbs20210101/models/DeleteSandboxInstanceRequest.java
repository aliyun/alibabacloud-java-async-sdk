// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSandboxInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSandboxInstanceRequest</p>
 */
public class DeleteSandboxInstanceRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteSandboxInstanceRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.instanceId = builder.instanceId;
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

    public static final class Builder extends Request.Builder<DeleteSandboxInstanceRequest, Builder> {
        private String backupPlanId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSandboxInstanceRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.instanceId = request.instanceId;
        } 

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteSandboxInstanceRequest build() {
            return new DeleteSandboxInstanceRequest(this);
        } 

    } 

}
