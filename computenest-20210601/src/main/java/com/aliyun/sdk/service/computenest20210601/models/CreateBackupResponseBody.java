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
 * {@link CreateBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupResponseBody</p>
 */
public class CreateBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateBackupResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupResponseBody create() {
        return builder().build();
    }

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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String backupId; 
        private String description; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateBackupResponseBody model) {
            this.backupId = model.backupId;
            this.description = model.description;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>Backup ID</p>
         * 
         * <strong>example:</strong>
         * <p>backup-cad4a85ff5e340388b93</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8DC02957-A0FC-5AB2-8C54-496B636EAF12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Backup status </p>
         * <ul>
         * <li>Creating: In progress </li>
         * <li>Created: Success </li>
         * <li>CreateFailed: Failed </li>
         * <li>Deleting: In progress </li>
         * <li>Deleted: Success </li>
         * <li>DeleteFailed: Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateBackupResponseBody build() {
            return new CreateBackupResponseBody(this);
        } 

    } 

}
