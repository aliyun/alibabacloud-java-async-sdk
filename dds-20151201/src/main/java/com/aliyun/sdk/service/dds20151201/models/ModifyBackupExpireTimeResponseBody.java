// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyBackupExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupExpireTimeResponseBody</p>
 */
public class ModifyBackupExpireTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupExpireTime")
    private String backupExpireTime;

    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyBackupExpireTimeResponseBody(Builder builder) {
        this.backupExpireTime = builder.backupExpireTime;
        this.backupId = builder.backupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupExpireTimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupExpireTime
     */
    public String getBackupExpireTime() {
        return this.backupExpireTime;
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
        private String backupExpireTime; 
        private String backupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyBackupExpireTimeResponseBody model) {
            this.backupExpireTime = model.backupExpireTime;
            this.backupId = model.backupId;
            this.requestId = model.requestId;
        } 

        /**
         * BackupExpireTime.
         */
        public Builder backupExpireTime(String backupExpireTime) {
            this.backupExpireTime = backupExpireTime;
            return this;
        }

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBackupExpireTimeResponseBody build() {
            return new ModifyBackupExpireTimeResponseBody(this);
        } 

    } 

}
