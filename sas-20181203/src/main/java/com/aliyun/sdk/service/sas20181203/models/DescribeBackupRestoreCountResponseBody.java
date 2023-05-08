// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupRestoreCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupRestoreCountResponseBody</p>
 */
public class DescribeBackupRestoreCountResponseBody extends TeaModel {
    @NameInMap("BackupRestoreCount")
    private BackupRestoreCount backupRestoreCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupRestoreCountResponseBody(Builder builder) {
        this.backupRestoreCount = builder.backupRestoreCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupRestoreCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupRestoreCount
     */
    public BackupRestoreCount getBackupRestoreCount() {
        return this.backupRestoreCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupRestoreCount backupRestoreCount; 
        private String requestId; 

        /**
         * BackupRestoreCount.
         */
        public Builder backupRestoreCount(BackupRestoreCount backupRestoreCount) {
            this.backupRestoreCount = backupRestoreCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupRestoreCountResponseBody build() {
            return new DescribeBackupRestoreCountResponseBody(this);
        } 

    } 

    public static class BackupRestoreCount extends TeaModel {
        @NameInMap("Recovering")
        private Integer recovering;

        @NameInMap("Total")
        private Integer total;

        private BackupRestoreCount(Builder builder) {
            this.recovering = builder.recovering;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupRestoreCount create() {
            return builder().build();
        }

        /**
         * @return recovering
         */
        public Integer getRecovering() {
            return this.recovering;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer recovering; 
            private Integer total; 

            /**
             * Recovering.
             */
            public Builder recovering(Integer recovering) {
                this.recovering = recovering;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public BackupRestoreCount build() {
                return new BackupRestoreCount(this);
            } 

        } 

    }
}
