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
 * {@link ListSupabaseDataBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupabaseDataBackupsResponseBody</p>
 */
public class ListSupabaseDataBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalBackupSize")
    private Long totalBackupSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSupabaseDataBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalBackupSize = builder.totalBackupSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupabaseDataBackupsResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalBackupSize
     */
    public Long getTotalBackupSize() {
        return this.totalBackupSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalBackupSize; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSupabaseDataBackupsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalBackupSize = model.totalBackupSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of backup sets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. You can use this value as the NextToken parameter in the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of backup sets on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>The total size of the backup sets. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder totalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSupabaseDataBackupsResponseBody build() {
            return new ListSupabaseDataBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupabaseDataBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupabaseDataBackupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupEndTimeLocal")
        private String backupEndTimeLocal;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStartTimeLocal")
        private String backupStartTimeLocal;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BaksetName")
        private String baksetName;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private Long consistentTime;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        private Items(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupEndTimeLocal = builder.backupEndTimeLocal;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSetId = builder.backupSetId;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStartTimeLocal = builder.backupStartTimeLocal;
            this.backupStatus = builder.backupStatus;
            this.baksetName = builder.baksetName;
            this.consistentTime = builder.consistentTime;
            this.dataType = builder.dataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupEndTimeLocal
         */
        public String getBackupEndTimeLocal() {
            return this.backupEndTimeLocal;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStartTimeLocal
         */
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return baksetName
         */
        public String getBaksetName() {
            return this.baksetName;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupEndTimeLocal; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSetId; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStartTimeLocal; 
            private String backupStatus; 
            private String baksetName; 
            private Long consistentTime; 
            private String dataType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupEndTime = model.backupEndTime;
                this.backupEndTimeLocal = model.backupEndTimeLocal;
                this.backupMethod = model.backupMethod;
                this.backupMode = model.backupMode;
                this.backupSetId = model.backupSetId;
                this.backupSize = model.backupSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStartTimeLocal = model.backupStartTimeLocal;
                this.backupStatus = model.backupStatus;
                this.baksetName = model.baksetName;
                this.consistentTime = model.consistentTime;
                this.dataType = model.dataType;
            } 

            /**
             * <p>The end time of the backup. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09T01:24:44Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The local time representation of the backup end time. Format: yyyy-MM-ddTHH:mm:ssZ. The current return value is in Beijing time (UTC+8). The trailing Z is a fixed character in the compatibility format and does not indicate the zero time zone. To parse the time in a standard format, use BackupEndTime.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09T09:24:44Z</p>
             */
            public Builder backupEndTimeLocal(String backupEndTimeLocal) {
                this.backupEndTimeLocal = backupEndTimeLocal;
                return this;
            }

            /**
             * <p>The backup method. Valid values: Physical: physical backup; Snapshot: snapshot backup.</p>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The backup mode.</p>
             * <p>Valid values for automatic backups:</p>
             * <ul>
             * <li><strong>Automated</strong>: automatic system backup.</li>
             * <li><strong>Manual</strong>: manual backup.</li>
             * </ul>
             * <p>Valid values for restorable points:</p>
             * <ul>
             * <li><strong>Automated</strong>: the restorable point after a automatic backup.</li>
             * <li><strong>Manual</strong>: the restorable point manually triggered by the user.</li>
             * <li><strong>Period</strong>: the restorable point triggered periodically based on the backup policy.</li>
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
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>1111111111</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The size of the backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10737418240</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09T01:23:02Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The local time representation of the backup start time. Format: yyyy-MM-ddTHH:mm:ssZ. The current return value is in Beijing time (UTC+8). The trailing Z is a fixed character in the compatibility format and does not indicate the zero time zone. To parse the time in a standard format, use BackupStartTime.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09T09:23:02Z</p>
             */
            public Builder backupStartTimeLocal(String backupStartTimeLocal) {
                this.backupStartTimeLocal = backupStartTimeLocal;
                return this;
            }

            /**
             * <p>The status of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: successful.</li>
             * <li><strong>Failure</strong>: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The name of the restorable point or the full backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>logic_backup</p>
             */
            public Builder baksetName(String baksetName) {
                this.baksetName = baksetName;
                return this;
            }

            /**
             * <p>The consistency point in time. The value is a UNIX timestamp in seconds. For a full backup, this parameter indicates the consistency point in time of the backup. For a restorable point, this parameter indicates the point in time to which data can be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>1791508983</p>
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>DATA</strong>: full backup.</li>
             * <li><strong>RESTOREPOI</strong>: restorable point.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
