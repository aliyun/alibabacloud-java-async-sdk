// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataMaskingTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataMaskingTasksResponseBody</p>
 */
public class DescribeDataMaskingTasksResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataMaskingTasksResponseBody build() {
            return new DescribeDataMaskingTasksResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DstPath")
        private String dstPath;

        @NameInMap("DstType")
        private Integer dstType;

        @NameInMap("DstTypeCode")
        private String dstTypeCode;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("HasUnfinishProcess")
        private Boolean hasUnfinishProcess;

        @NameInMap("Id")
        private Long id;

        @NameInMap("OriginalTable")
        private Boolean originalTable;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("RunCount")
        private Integer runCount;

        @NameInMap("SrcPath")
        private String srcPath;

        @NameInMap("SrcType")
        private Integer srcType;

        @NameInMap("SrcTypeCode")
        private String srcTypeCode;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TriggerType")
        private Integer triggerType;

        private Items(Builder builder) {
            this.dstPath = builder.dstPath;
            this.dstType = builder.dstType;
            this.dstTypeCode = builder.dstTypeCode;
            this.gmtCreate = builder.gmtCreate;
            this.hasUnfinishProcess = builder.hasUnfinishProcess;
            this.id = builder.id;
            this.originalTable = builder.originalTable;
            this.owner = builder.owner;
            this.runCount = builder.runCount;
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
            private String dstPath; 
            private Integer dstType; 
            private String dstTypeCode; 
            private Long gmtCreate; 
            private Boolean hasUnfinishProcess; 
            private Long id; 
            private Boolean originalTable; 
            private String owner; 
            private Integer runCount; 
            private String srcPath; 
            private Integer srcType; 
            private String srcTypeCode; 
            private Integer status; 
            private String taskId; 
            private String taskName; 
            private Integer triggerType; 

            /**
             * DstPath.
             */
            public Builder dstPath(String dstPath) {
                this.dstPath = dstPath;
                return this;
            }

            /**
             * DstType.
             */
            public Builder dstType(Integer dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * DstTypeCode.
             */
            public Builder dstTypeCode(String dstTypeCode) {
                this.dstTypeCode = dstTypeCode;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * HasUnfinishProcess.
             */
            public Builder hasUnfinishProcess(Boolean hasUnfinishProcess) {
                this.hasUnfinishProcess = hasUnfinishProcess;
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
             * OriginalTable.
             */
            public Builder originalTable(Boolean originalTable) {
                this.originalTable = originalTable;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * RunCount.
             */
            public Builder runCount(Integer runCount) {
                this.runCount = runCount;
                return this;
            }

            /**
             * SrcPath.
             */
            public Builder srcPath(String srcPath) {
                this.srcPath = srcPath;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(Integer srcType) {
                this.srcType = srcType;
                return this;
            }

            /**
             * SrcTypeCode.
             */
            public Builder srcTypeCode(String srcTypeCode) {
                this.srcTypeCode = srcTypeCode;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TriggerType.
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
