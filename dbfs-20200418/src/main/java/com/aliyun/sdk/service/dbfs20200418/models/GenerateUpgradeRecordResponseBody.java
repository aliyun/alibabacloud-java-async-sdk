// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUpgradeRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUpgradeRecordResponseBody</p>
 */
public class GenerateUpgradeRecordResponseBody extends TeaModel {
    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateUpgradeRecordResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUpgradeRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * Records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateUpgradeRecordResponseBody build() {
            return new GenerateUpgradeRecordResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("BatchStrategyNo")
        private String batchStrategyNo;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CurrentVersion")
        private String currentVersion;

        @NameInMap("DbfsId")
        private String dbfsId;

        @NameInMap("EcsId")
        private String ecsId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        @NameInMap("TargetVersion")
        private String targetVersion;

        @NameInMap("TaskErrorReason")
        private String taskErrorReason;

        @NameInMap("TaskExecutionCounts")
        private Integer taskExecutionCounts;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UpgradeEndTime")
        private Long upgradeEndTime;

        @NameInMap("UpgradeStartTime")
        private Long upgradeStartTime;

        @NameInMap("ZoneId")
        private String zoneId;

        private Records(Builder builder) {
            this.accountId = builder.accountId;
            this.batchStrategyNo = builder.batchStrategyNo;
            this.createTime = builder.createTime;
            this.currentVersion = builder.currentVersion;
            this.dbfsId = builder.dbfsId;
            this.ecsId = builder.ecsId;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.targetVersion = builder.targetVersion;
            this.taskErrorReason = builder.taskErrorReason;
            this.taskExecutionCounts = builder.taskExecutionCounts;
            this.taskId = builder.taskId;
            this.updateTime = builder.updateTime;
            this.upgradeEndTime = builder.upgradeEndTime;
            this.upgradeStartTime = builder.upgradeStartTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return batchStrategyNo
         */
        public String getBatchStrategyNo() {
            return this.batchStrategyNo;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return dbfsId
         */
        public String getDbfsId() {
            return this.dbfsId;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return taskErrorReason
         */
        public String getTaskErrorReason() {
            return this.taskErrorReason;
        }

        /**
         * @return taskExecutionCounts
         */
        public Integer getTaskExecutionCounts() {
            return this.taskExecutionCounts;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return upgradeEndTime
         */
        public Long getUpgradeEndTime() {
            return this.upgradeEndTime;
        }

        /**
         * @return upgradeStartTime
         */
        public Long getUpgradeStartTime() {
            return this.upgradeStartTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountId; 
            private String batchStrategyNo; 
            private Long createTime; 
            private String currentVersion; 
            private String dbfsId; 
            private String ecsId; 
            private Long id; 
            private String regionId; 
            private String state; 
            private String targetVersion; 
            private String taskErrorReason; 
            private Integer taskExecutionCounts; 
            private String taskId; 
            private Long updateTime; 
            private Long upgradeEndTime; 
            private Long upgradeStartTime; 
            private String zoneId; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BatchStrategyNo.
             */
            public Builder batchStrategyNo(String batchStrategyNo) {
                this.batchStrategyNo = batchStrategyNo;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * DbfsId.
             */
            public Builder dbfsId(String dbfsId) {
                this.dbfsId = dbfsId;
                return this;
            }

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TargetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * TaskErrorReason.
             */
            public Builder taskErrorReason(String taskErrorReason) {
                this.taskErrorReason = taskErrorReason;
                return this;
            }

            /**
             * TaskExecutionCounts.
             */
            public Builder taskExecutionCounts(Integer taskExecutionCounts) {
                this.taskExecutionCounts = taskExecutionCounts;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpgradeEndTime.
             */
            public Builder upgradeEndTime(Long upgradeEndTime) {
                this.upgradeEndTime = upgradeEndTime;
                return this;
            }

            /**
             * UpgradeStartTime.
             */
            public Builder upgradeStartTime(Long upgradeStartTime) {
                this.upgradeStartTime = upgradeStartTime;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
