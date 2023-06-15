// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMigrationPrecheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMigrationPrecheckResultResponseBody</p>
 */
public class DescribeCloudMigrationPrecheckResultResponseBody extends TeaModel {
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

    private DescribeCloudMigrationPrecheckResultResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMigrationPrecheckResultResponseBody create() {
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
         * The details of the assessment report.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribeCloudMigrationPrecheckResultResponseBody build() {
            return new DescribeCloudMigrationPrecheckResultResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

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
            this.sourceAccount = builder.sourceAccount;
            this.sourceCategory = builder.sourceCategory;
            this.sourceIpAddress = builder.sourceIpAddress;
            this.sourcePassword = builder.sourcePassword;
            this.sourcePort = builder.sourcePort;
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
            private String sourceAccount; 
            private String sourceCategory; 
            private String sourceIpAddress; 
            private String sourcePassword; 
            private Long sourcePort; 
            private String targetEip; 
            private String targetInstanceName; 
            private Long taskId; 
            private String taskName; 

            /**
             * The content of the assessment report.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The time when the task was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder sourceAccount(String sourceAccount) {
                this.sourceAccount = sourceAccount;
                return this;
            }

            /**
             * The environment in which the self-managed PostgreSQL instance runs.
             * <p>
             * 
             * *   **idcOnVpc**: The self-managed PostgreSQL instance resides in a data center. The data center can communicate with the VPC to which the ApsaraDB RDS for PostgreSQL instance belongs.
             * *   **ecsOnVpc**: The self-managed PostgreSQL instance resides on an ECS instance.
             */
            public Builder sourceCategory(String sourceCategory) {
                this.sourceCategory = sourceCategory;
                return this;
            }

            /**
             * The private IP address that is used to connect to the self-managed PostgreSQL instance.
             */
            public Builder sourceIpAddress(String sourceIpAddress) {
                this.sourceIpAddress = sourceIpAddress;
                return this;
            }

            /**
             * The password of the account.
             */
            public Builder sourcePassword(String sourcePassword) {
                this.sourcePassword = sourcePassword;
                return this;
            }

            /**
             * The port number that is used to connect to the self-managed PostgreSQL instance.
             */
            public Builder sourcePort(Long sourcePort) {
                this.sourcePort = sourcePort;
                return this;
            }

            /**
             * A reserved parameter. The return value of this parameter is null.
             */
            public Builder targetEip(String targetEip) {
                this.targetEip = targetEip;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the task.
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
