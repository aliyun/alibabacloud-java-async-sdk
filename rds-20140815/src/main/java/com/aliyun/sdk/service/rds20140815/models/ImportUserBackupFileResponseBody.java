// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ImportUserBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>ImportUserBackupFileResponseBody</p>
 */
public class ImportUserBackupFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The ID of the full backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>b-n8tpg24c6i0v********</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A140DD14-DCC9-4548-9C72-52A49A58A310</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the full backup file is successfully imported into the instance. If the full backup file is successfully imported, <strong>true</strong> is returned. Otherwise, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
