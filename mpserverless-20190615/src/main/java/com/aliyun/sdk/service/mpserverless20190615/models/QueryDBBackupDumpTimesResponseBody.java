// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBBackupDumpTimesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDBBackupDumpTimesResponseBody</p>
 */
public class QueryDBBackupDumpTimesResponseBody extends TeaModel {
    @NameInMap("BackupDumpTimes")
    private java.util.List < BackupDumpTimes> backupDumpTimes;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDBBackupDumpTimesResponseBody(Builder builder) {
        this.backupDumpTimes = builder.backupDumpTimes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBBackupDumpTimesResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupDumpTimes
     */
    public java.util.List < BackupDumpTimes> getBackupDumpTimes() {
        return this.backupDumpTimes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BackupDumpTimes> backupDumpTimes; 
        private String requestId; 

        /**
         * BackupDumpTimes.
         */
        public Builder backupDumpTimes(java.util.List < BackupDumpTimes> backupDumpTimes) {
            this.backupDumpTimes = backupDumpTimes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDBBackupDumpTimesResponseBody build() {
            return new QueryDBBackupDumpTimesResponseBody(this);
        } 

    } 

    public static class BackupDumpTimes extends TeaModel {
        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("DumpTime")
        private String dumpTime;

        private BackupDumpTimes(Builder builder) {
            this.backupId = builder.backupId;
            this.dumpTime = builder.dumpTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupDumpTimes create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return dumpTime
         */
        public String getDumpTime() {
            return this.dumpTime;
        }

        public static final class Builder {
            private String backupId; 
            private String dumpTime; 

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * DumpTime.
             */
            public Builder dumpTime(String dumpTime) {
                this.dumpTime = dumpTime;
                return this;
            }

            public BackupDumpTimes build() {
                return new BackupDumpTimes(this);
            } 

        } 

    }
}
