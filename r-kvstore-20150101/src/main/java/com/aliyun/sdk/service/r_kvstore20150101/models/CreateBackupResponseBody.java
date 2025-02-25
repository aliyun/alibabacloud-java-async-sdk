// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @com.aliyun.core.annotation.NameInMap("BackupJobID")
    private String backupJobID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackupResponseBody(Builder builder) {
        this.backupJobID = builder.backupJobID;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupJobID
     */
    public String getBackupJobID() {
        return this.backupJobID;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backupJobID; 
        private String requestId; 

        /**
         * <p>The ID of the backup task.<br>For cluster instances created before December 5, 2023, the return value is a comma-separated list composed of the job ID of each node within an instance. For example, if you have a cluster instance with two shards, the return value of BackupJobID is &quot;10000,10001&quot;.<br>For cluster instance created after December 5, 2023, all jobs for nodes in an instance are represented by a single job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1162****</p>
         */
        public Builder backupJobID(String backupJobID) {
            this.backupJobID = backupJobID;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FF6158E-3394-4A90-B634-79C49184****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackupResponseBody build() {
            return new CreateBackupResponseBody(this);
        } 

    } 

}
