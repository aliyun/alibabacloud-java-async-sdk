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
         * <p>The time-to-live (TTL) of the backup. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is in UTC.</p>
         * <blockquote>
         * <ul>
         * <li><p><em>9999-01-01</em>T<em>00:00:00</em>&#x5A;<em>&#x20;indicates that the backup is retained permanently.</em></p>
         * <p>**</p>
         * </li>
         * </ul>
         * <p>**</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-03-29T03:47:12Z</p>
         */
        public Builder backupExpireTime(String backupExpireTime) {
            this.backupExpireTime = backupExpireTime;
            return this;
        }

        /**
         * <p>The backup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>260032xxxx</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A0181AC4-XXXX-XXXX-87CA-100C70B86729</p>
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
