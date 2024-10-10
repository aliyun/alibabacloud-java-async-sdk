// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupRestoreCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupRestoreCountResponseBody</p>
 */
public class DescribeBackupRestoreCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupRestoreCount")
    private BackupRestoreCount backupRestoreCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The statistics of restoration tasks.</p>
         */
        public Builder backupRestoreCount(BackupRestoreCount backupRestoreCount) {
            this.backupRestoreCount = backupRestoreCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>ECC6B3E3-D496-512D-B46D-E6996A6B63EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupRestoreCountResponseBody build() {
            return new DescribeBackupRestoreCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupRestoreCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupRestoreCountResponseBody</p>
     */
    public static class BackupRestoreCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Recovering")
        private Integer recovering;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The number of the restoration tasks that are in the <strong>being restored</strong> state.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder recovering(Integer recovering) {
                this.recovering = recovering;
                return this;
            }

            /**
             * <p>The total number of the restoration tasks that you create.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
