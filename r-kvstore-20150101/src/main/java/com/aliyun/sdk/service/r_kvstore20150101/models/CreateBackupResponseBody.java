// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateBackupResponseBody model) {
            this.backupJobID = model.backupJobID;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The backup task ID. For cluster instances created before December 5, 2023, the return value consists of the job IDs of individual child DB nodes. For example, for a cluster instance with two shards, the BackupJobID value is returned in the format of &quot;10000,10001&quot;. For cluster instances created on or after December 5, 2023, all DB nodes in a cluster are described by a single job ID. You only need to use this single job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1022,2480&quot;</p>
         */
        public Builder backupJobID(String backupJobID) {
            this.backupJobID = backupJobID;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
