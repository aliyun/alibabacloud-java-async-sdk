// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeDataMaskingTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataMaskingTasksResponseBody</p>
 */
public class DescribeDataMaskingTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataMaskingTasksResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataMaskingTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>A list of de-identification tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-4******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataMaskingTasksResponseBody build() {
            return new DescribeDataMaskingTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataMaskingTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataMaskingTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstMemberAccount")
        private Long dstMemberAccount;

        @com.aliyun.core.annotation.NameInMap("DstPath")
        private String dstPath;

        @com.aliyun.core.annotation.NameInMap("DstType")
        private Integer dstType;

        @com.aliyun.core.annotation.NameInMap("DstTypeCode")
        private String dstTypeCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("HasUnfinishProcess")
        private Boolean hasUnfinishProcess;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OriginalTable")
        private Boolean originalTable;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RunCount")
        private Integer runCount;

        @com.aliyun.core.annotation.NameInMap("SrcMemberAccount")
        private Long srcMemberAccount;

        @com.aliyun.core.annotation.NameInMap("SrcPath")
        private String srcPath;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private Integer srcType;

        @com.aliyun.core.annotation.NameInMap("SrcTypeCode")
        private String srcTypeCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        private Items(Builder builder) {
            this.dstMemberAccount = builder.dstMemberAccount;
            this.dstPath = builder.dstPath;
            this.dstType = builder.dstType;
            this.dstTypeCode = builder.dstTypeCode;
            this.gmtCreate = builder.gmtCreate;
            this.hasUnfinishProcess = builder.hasUnfinishProcess;
            this.id = builder.id;
            this.originalTable = builder.originalTable;
            this.owner = builder.owner;
            this.runCount = builder.runCount;
            this.srcMemberAccount = builder.srcMemberAccount;
            this.srcPath = builder.srcPath;
            this.srcType = builder.srcType;
            this.srcTypeCode = builder.srcTypeCode;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return dstMemberAccount
         */
        public Long getDstMemberAccount() {
            return this.dstMemberAccount;
        }

        /**
         * @return dstPath
         */
        public String getDstPath() {
            return this.dstPath;
        }

        /**
         * @return dstType
         */
        public Integer getDstType() {
            return this.dstType;
        }

        /**
         * @return dstTypeCode
         */
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return hasUnfinishProcess
         */
        public Boolean getHasUnfinishProcess() {
            return this.hasUnfinishProcess;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return originalTable
         */
        public Boolean getOriginalTable() {
            return this.originalTable;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return runCount
         */
        public Integer getRunCount() {
            return this.runCount;
        }

        /**
         * @return srcMemberAccount
         */
        public Long getSrcMemberAccount() {
            return this.srcMemberAccount;
        }

        /**
         * @return srcPath
         */
        public String getSrcPath() {
            return this.srcPath;
        }

        /**
         * @return srcType
         */
        public Integer getSrcType() {
            return this.srcType;
        }

        /**
         * @return srcTypeCode
         */
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return triggerType
         */
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private Long dstMemberAccount; 
            private String dstPath; 
            private Integer dstType; 
            private String dstTypeCode; 
            private Long gmtCreate; 
            private Boolean hasUnfinishProcess; 
            private Long id; 
            private Boolean originalTable; 
            private String owner; 
            private Integer runCount; 
            private Long srcMemberAccount; 
            private String srcPath; 
            private Integer srcType; 
            private String srcTypeCode; 
            private Integer status; 
            private String taskId; 
            private String taskName; 
            private Integer triggerType; 

            /**
             * <p>The member account to which the desensitization target belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>192479427903xxxx</p>
             */
            public Builder dstMemberAccount(Long dstMemberAccount) {
                this.dstMemberAccount = dstMemberAccount;
                return this;
            }

            /**
             * <p>The destination path.</p>
             */
            public Builder dstPath(String dstPath) {
                this.dstPath = dstPath;
                return this;
            }

            /**
             * <p>The service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder dstType(Integer dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * <p>The type of the service to which the de-identified data belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dstTypeCode(String dstTypeCode) {
                this.dstTypeCode = dstTypeCode;
                return this;
            }

            /**
             * <p>The time when the de-identification task is created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582992000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Indicates whether the de-identification task is running.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasUnfinishProcess(Boolean hasUnfinishProcess) {
                this.hasUnfinishProcess = hasUnfinishProcess;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the source table is de-identified.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder originalTable(Boolean originalTable) {
                this.originalTable = originalTable;
                return this;
            }

            /**
             * <p>The user who created the de-identification task.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The number of times that the de-identification task is run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runCount(Integer runCount) {
                this.runCount = runCount;
                return this;
            }

            /**
             * <p>The member account to which the desensitization source belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>192479427903xxxx</p>
             */
            public Builder srcMemberAccount(Long srcMemberAccount) {
                this.srcMemberAccount = srcMemberAccount;
                return this;
            }

            /**
             * <p>The source path.</p>
             */
            public Builder srcPath(String srcPath) {
                this.srcPath = srcPath;
                return this;
            }

            /**
             * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder srcType(Integer srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * <p>The type of the service to which the data to be de-identified belongs. Valid values: <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder srcTypeCode(String srcTypeCode) {
                this.srcTypeCode = srcTypeCode;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>mt4HBgtw1B******</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Task name</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The mode in which the de-identification task is run. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: manual</li>
             * <li><strong>2</strong>: scheduled</li>
             * <li><strong>3</strong>: manual and scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
