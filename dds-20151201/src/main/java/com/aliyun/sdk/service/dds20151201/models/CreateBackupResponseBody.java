// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupResponseBody</p>
 */
public class CreateBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackupResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupResponseBody create() {
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

    public static final class Builder {
        private String backupId; 
        private String requestId; 

        /**
         * The ID of the backup set.
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * The request ID.
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
