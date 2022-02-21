// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMigrationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMigrationResultResponseBody</p>
 */
public class DescribeCloudMigrationResultResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalSize")
    private Integer totalSize;

    private DescribeCloudMigrationResultResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMigrationResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Integer totalSize; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribeCloudMigrationResultResponseBody build() {
            return new DescribeCloudMigrationResultResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("MigrateStage")
        private String migrateStage;

        @NameInMap("ReplicationInfo")
        private String replicationInfo;

        @NameInMap("ReplicationState")
        private String replicationState;

        @NameInMap("SourceAccount")
        private String sourceAccount;

        @NameInMap("SourceCategory")
        private String sourceCategory;

        @NameInMap("SourceIpAddress")
        private String sourceIpAddress;

        @NameInMap("SourcePassword")
        private String sourcePassword;

        @NameInMap("SourcePort")
        private Long sourcePort;

        @NameInMap("SwitchTime")
        private String switchTime;

        @NameInMap("TargetEip")
        private String targetEip;

        @NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("TaskName")
        private String taskName;

        private Items(Builder builder) {
            this.detail = builder.detail;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.migrateStage = builder.migrateStage;
            this.replicationInfo = builder.replicationInfo;
            this.replicationState = builder.replicationState;
            this.sourceAccount = builder.sourceAccount;
            this.sourceCategory = builder.sourceCategory;
            this.sourceIpAddress = builder.sourceIpAddress;
            this.sourcePassword = builder.sourcePassword;
            this.sourcePort = builder.sourcePort;
            this.switchTime = builder.switchTime;
            this.targetEip = builder.targetEip;
            this.targetInstanceName = builder.targetInstanceName;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return migrateStage
         */
        public String getMigrateStage() {
            return this.migrateStage;
        }

        /**
         * @return replicationInfo
         */
        public String getReplicationInfo() {
            return this.replicationInfo;
        }

        /**
         * @return replicationState
         */
        public String getReplicationState() {
            return this.replicationState;
        }

        /**
         * @return sourceAccount
         */
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        /**
         * @return sourceCategory
         */
        public String getSourceCategory() {
            return this.sourceCategory;
        }

        /**
         * @return sourceIpAddress
         */
        public String getSourceIpAddress() {
            return this.sourceIpAddress;
        }

        /**
         * @return sourcePassword
         */
        public String getSourcePassword() {
            return this.sourcePassword;
        }

        /**
         * @return sourcePort
         */
        public Long getSourcePort() {
            return this.sourcePort;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return targetEip
         */
        public String getTargetEip() {
            return this.targetEip;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String detail; 
            private String gmtCreated; 
            private String gmtModified; 
            private String migrateStage; 
            private String replicationInfo; 
            private String replicationState; 
            private String sourceAccount; 
            private String sourceCategory; 
            private String sourceIpAddress; 
            private String sourcePassword; 
            private Long sourcePort; 
            private String switchTime; 
            private String targetEip; 
            private String targetInstanceName; 
            private Long taskId; 
            private String taskName; 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * MigrateStage.
             */
            public Builder migrateStage(String migrateStage) {
                this.migrateStage = migrateStage;
                return this;
            }

            /**
             * ReplicationInfo.
             */
            public Builder replicationInfo(String replicationInfo) {
                this.replicationInfo = replicationInfo;
                return this;
            }

            /**
             * ReplicationState.
             */
            public Builder replicationState(String replicationState) {
                this.replicationState = replicationState;
                return this;
            }

            /**
             * SourceAccount.
             */
            public Builder sourceAccount(String sourceAccount) {
                this.sourceAccount = sourceAccount;
                return this;
            }

            /**
             * SourceCategory.
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * SourceIpAddress.
             */
            public Builder sourceIpAddress(String sourceIpAddress) {
                this.sourceIpAddress = sourceIpAddress;
                return this;
            }

            /**
             * SourcePassword.
             */
            public Builder sourcePassword(String sourcePassword) {
                this.sourcePassword = sourcePassword;
                return this;
            }

            /**
             * SourcePort.
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * SwitchTime.
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * TargetEip.
             */
            public Builder targetEip(String targetEip) {
                this.targetEip = targetEip;
                return this;
            }

            /**
             * TargetInstanceName.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
