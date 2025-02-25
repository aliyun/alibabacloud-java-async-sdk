// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBackupRequest} extends {@link RequestModel}
 *
 * <p>EnableBackupRequest</p>
 */
public class EnableBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private EnableBackupRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBackupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EnableBackupRequest, Builder> {
        private String backupId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(EnableBackupRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.instanceId = request.instanceId;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
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
        public EnableBackupRequest build() {
            return new EnableBackupRequest(this);
        } 

    } 

}
