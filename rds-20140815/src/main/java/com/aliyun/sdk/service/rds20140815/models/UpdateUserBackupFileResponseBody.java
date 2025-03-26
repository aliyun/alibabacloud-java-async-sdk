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
 * {@link UpdateUserBackupFileResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserBackupFileResponseBody</p>
 */
public class UpdateUserBackupFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateUserBackupFileResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserBackupFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateUserBackupFileResponseBody model) {
            this.backupId = model.backupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>b-g14d0m772f7b********</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A236067-4727-4B42-92CF-734E417ED69A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUserBackupFileResponseBody build() {
            return new UpdateUserBackupFileResponseBody(this);
        } 

    } 

}
