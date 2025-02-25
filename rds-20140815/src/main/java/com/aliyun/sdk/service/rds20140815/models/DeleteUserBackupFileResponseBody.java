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
         * <p>The ID of the deleted full backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>b-w1haya7e4i25********</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F28AE40B-203B-4CFE-B81F-FD981CD97B17</p>
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
