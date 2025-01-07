// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupPolicyResponseBody</p>
 */
public class CreateBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupPolicy")
    private BackupPolicy backupPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBackupPolicyResponseBody(Builder builder) {
        this.backupPolicy = builder.backupPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupPolicy
     */
    public BackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupPolicy backupPolicy; 
        private String requestId; 

        /**
         * <p>The information about the anti-ransomware policy.</p>
         */
        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackupPolicyResponseBody build() {
            return new CreateBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBackupPolicyResponseBody</p>
     */
    public static class BackupPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BackupPolicy(Builder builder) {
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupPolicy create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String id; 
            private String status; 

            /**
             * <p>The ID of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>1301575</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware policy. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong></li>
             * <li><strong>disabled</strong></li>
             * </ul>
             * <blockquote>
             * <p> After you create an anti-ransomware policy, the policy is enabled by default.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BackupPolicy build() {
                return new BackupPolicy(this);
            } 

        } 

    }
}
