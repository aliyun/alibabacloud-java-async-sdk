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
 * {@link CreateBackupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupResponseBody</p>
 */
public class CreateBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("BackupJobId")
    private String backupJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackupResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.backupJobId = builder.backupJobId;
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
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
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
        private String backupId; 
        private String backupJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBackupResponseBody model) {
            this.backupId = model.backupId;
            this.backupJobId = model.backupJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the backup.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong> This parameter will be deprecated soon. To obtain the backup ID, call the <a href="https://help.aliyun.com/document_detail/468441.html">DescribeBackups</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5664****</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>775051</p>
         */
        public Builder backupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7016B12F-7F64-40A4-BAFF-013F02AC82FC</p>
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
