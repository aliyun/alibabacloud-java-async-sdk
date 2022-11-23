// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBackupPolicyResponseBody</p>
 */
public class CreateBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupPolicy")
    private BackupPolicy backupPolicy;

    @NameInMap("RequestId")
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
         * BackupPolicy.
         */
        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBackupPolicyResponseBody build() {
            return new CreateBackupPolicyResponseBody(this);
        } 

    } 

    public static class BackupPolicy extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Status")
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
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
