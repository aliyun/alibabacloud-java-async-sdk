// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSupabaseBackupJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupabaseBackupJobsResponseBody</p>
 */
public class ListSupabaseBackupJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSupabaseBackupJobsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupabaseBackupJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSupabaseBackupJobsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of backup tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page, which can be used as the NextToken parameter in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSupabaseBackupJobsResponseBody build() {
            return new ListSupabaseBackupJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupabaseBackupJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupabaseBackupJobsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupJobId")
        private String backupJobId;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Items(Builder builder) {
            this.backupJobId = builder.backupJobId;
            this.backupMode = builder.backupMode;
            this.backupStatus = builder.backupStatus;
            this.process = builder.process;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupJobId
         */
        public String getBackupJobId() {
            return this.backupJobId;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String backupJobId; 
            private String backupMode; 
            private String backupStatus; 
            private String process; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupJobId = model.backupJobId;
                this.backupMode = model.backupMode;
                this.backupStatus = model.backupStatus;
                this.process = model.process;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong>: automatic backup</li>
             * <li><strong>Manual</strong>: manual backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The status of the backup task. Valid statuses include: schedule (waiting to be scheduled) and backup (in progress).</p>
             * 
             * <strong>example:</strong>
             * <p>backup</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The progress percentage of the backup task, such as 0%. This value may be an empty string when the task is in the schedule (waiting to be scheduled) state.</p>
             * 
             * <strong>example:</strong>
             * <p>0%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The start time of the backup task. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format. This value may be an empty string when the task is in the schedule (waiting to be scheduled) state.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09T04:37:01Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
