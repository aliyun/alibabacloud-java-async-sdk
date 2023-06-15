// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportUserBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>ImportUserBackupFileResponseBody</p>
 */
public class ImportUserBackupFileResponseBody extends TeaModel {
    @NameInMap("BackupId")
    private String backupId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Boolean status;

    private ImportUserBackupFileResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportUserBackupFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
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
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String backupId; 
        private String requestId; 
        private Boolean status; 

        /**
         * The ID of the full backup file.
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the full backup file is successfully imported into the instance. If the full backup file is successfully imported, **true** is returned. Otherwise, an error message is returned.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public ImportUserBackupFileResponseBody build() {
            return new ImportUserBackupFileResponseBody(this);
        } 

    } 

}
