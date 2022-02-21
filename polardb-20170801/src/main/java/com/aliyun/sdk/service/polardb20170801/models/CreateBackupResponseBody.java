// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupResponseBody</p>
 */
public class CreateBackupResponseBody extends TeaModel {
    @NameInMap("BackupJobId")
    private String backupJobId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBackupResponseBody(Builder builder) {
        this.backupJobId = builder.backupJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupJobId
     */
    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backupJobId; 
        private String requestId; 

        /**
         * BackupJobId.
         */
        public Builder backupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * RequestId.
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
