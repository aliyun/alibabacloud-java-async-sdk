// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserBackupFileResponseBody</p>
 */
public class DeleteUserBackupFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteUserBackupFileResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserBackupFileResponseBody create() {
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
         * The ID of the deleted full backup file.
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

        public DeleteUserBackupFileResponseBody build() {
            return new DeleteUserBackupFileResponseBody(this);
        } 

    } 

}
