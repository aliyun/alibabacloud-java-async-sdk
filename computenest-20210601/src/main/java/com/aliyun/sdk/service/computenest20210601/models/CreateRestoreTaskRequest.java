// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateRestoreTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreTaskRequest</p>
 */
public class CreateRestoreTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private CreateRestoreTaskRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreTaskRequest create() {
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
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<CreateRestoreTaskRequest, Builder> {
        private String backupId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreTaskRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>The backup ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-385d35fb088f453c8fa1</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances</a> to obtain the ID of the service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-49793f3bfa034ec6a990</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public CreateRestoreTaskRequest build() {
            return new CreateRestoreTaskRequest(this);
        } 

    } 

}
