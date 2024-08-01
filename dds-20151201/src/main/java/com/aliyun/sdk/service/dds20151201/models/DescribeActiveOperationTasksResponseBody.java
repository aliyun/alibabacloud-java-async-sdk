// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTasksResponseBody</p>
 */
public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeActiveOperationTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTasksResponseBody create() {
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The O\&M tasks.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeActiveOperationTasksResponseBody build() {
            return new DescribeActiveOperationTasksResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCancel")
        private String allowCancel;

        @com.aliyun.core.annotation.NameInMap("AllowChange")
        private String allowChange;

        @com.aliyun.core.annotation.NameInMap("ChangeLevel")
        private String changeLevel;

        @com.aliyun.core.annotation.NameInMap("ChangeLevelEn")
        private String changeLevelEn;

        @com.aliyun.core.annotation.NameInMap("ChangeLevelZh")
        private String changeLevelZh;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CurrentAVZ")
        private String currentAVZ;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private String dbVersion;

        @com.aliyun.core.annotation.NameInMap("Deadline")
        private String deadline;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("ImpactEn")
        private String impactEn;

        @com.aliyun.core.annotation.NameInMap("ImpactZh")
        private String impactZh;

        @com.aliyun.core.annotation.NameInMap("InsComment")
        private String insComment;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PrepareInterval")
        private String prepareInterval;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private String resultInfo;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubInsNames")
        private java.util.List < String > subInsNames;

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
        private String switchTime;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeEn")
        private String taskTypeEn;

        @com.aliyun.core.annotation.NameInMap("TaskTypeZh")
        private String taskTypeZh;

        private Items(Builder builder) {
            this.allowCancel = builder.allowCancel;
            this.allowChange = builder.allowChange;
            this.changeLevel = builder.changeLevel;
            this.changeLevelEn = builder.changeLevelEn;
            this.changeLevelZh = builder.changeLevelZh;
            this.createdTime = builder.createdTime;
            this.currentAVZ = builder.currentAVZ;
            this.dbType = builder.dbType;
            this.dbVersion = builder.dbVersion;
            this.deadline = builder.deadline;
            this.id = builder.id;
            this.impactEn = builder.impactEn;
            this.impactZh = builder.impactZh;
            this.insComment = builder.insComment;
            this.insName = builder.insName;
            this.modifiedTime = builder.modifiedTime;
            this.prepareInterval = builder.prepareInterval;
            this.region = builder.region;
            this.resultInfo = builder.resultInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subInsNames = builder.subInsNames;
            this.switchTime = builder.switchTime;
            this.taskType = builder.taskType;
            this.taskTypeEn = builder.taskTypeEn;
            this.taskTypeZh = builder.taskTypeZh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allowCancel
         */
        public String getAllowCancel() {
            return this.allowCancel;
        }

        /**
         * @return allowChange
         */
        public String getAllowChange() {
            return this.allowChange;
        }

        /**
         * @return changeLevel
         */
        public String getChangeLevel() {
            return this.changeLevel;
        }

        /**
         * @return changeLevelEn
         */
        public String getChangeLevelEn() {
            return this.changeLevelEn;
        }

        /**
         * @return changeLevelZh
         */
        public String getChangeLevelZh() {
            return this.changeLevelZh;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return currentAVZ
         */
        public String getCurrentAVZ() {
            return this.currentAVZ;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbVersion
         */
        public String getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return deadline
         */
        public String getDeadline() {
            return this.deadline;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return impactEn
         */
        public String getImpactEn() {
            return this.impactEn;
        }

        /**
         * @return impactZh
         */
        public String getImpactZh() {
            return this.impactZh;
        }

        /**
         * @return insComment
         */
        public String getInsComment() {
            return this.insComment;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return prepareInterval
         */
        public String getPrepareInterval() {
            return this.prepareInterval;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resultInfo
         */
        public String getResultInfo() {
            return this.resultInfo;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subInsNames
         */
        public java.util.List < String > getSubInsNames() {
            return this.subInsNames;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskTypeEn
         */
        public String getTaskTypeEn() {
            return this.taskTypeEn;
        }

        /**
         * @return taskTypeZh
         */
        public String getTaskTypeZh() {
            return this.taskTypeZh;
        }

        public static final class Builder {
            private String allowCancel; 
            private String allowChange; 
            private String changeLevel; 
            private String changeLevelEn; 
            private String changeLevelZh; 
            private String createdTime; 
            private String currentAVZ; 
            private String dbType; 
            private String dbVersion; 
            private String deadline; 
            private Integer id; 
            private String impactEn; 
            private String impactZh; 
            private String insComment; 
            private String insName; 
            private String modifiedTime; 
            private String prepareInterval; 
            private String region; 
            private String resultInfo; 
            private String startTime; 
            private Integer status; 
            private java.util.List < String > subInsNames; 
            private String switchTime; 
            private String taskType; 
            private String taskTypeEn; 
            private String taskTypeZh; 

            /**
             * N/A
             */
            public Builder allowCancel(String allowCancel) {
                this.allowCancel = allowCancel;
                return this;
            }

            /**
             * Indicates whether the modification operation is allowed.
             * <p>
             * 
             * *   **0**: The modification operation is not allowed.
             * *   **1**: The modification operation is allowed.
             */
            public Builder allowChange(String allowChange) {
                this.allowChange = allowChange;
                return this;
            }

            /**
             * The change level of the O\&M task.
             */
            public Builder changeLevel(String changeLevel) {
                this.changeLevel = changeLevel;
                return this;
            }

            /**
             * N/A
             */
            public Builder changeLevelEn(String changeLevelEn) {
                this.changeLevelEn = changeLevelEn;
                return this;
            }

            /**
             * The task type in English.
             */
            public Builder changeLevelZh(String changeLevelZh) {
                this.changeLevelZh = changeLevelZh;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * N/A
             */
            public Builder currentAVZ(String currentAVZ) {
                this.currentAVZ = currentAVZ;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The version of the database engine.
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * The end time of the O\&M task.
             */
            public Builder deadline(String deadline) {
                this.deadline = deadline;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * N/A
             */
            public Builder impactEn(String impactEn) {
                this.impactEn = impactEn;
                return this;
            }

            /**
             * N/A
             */
            public Builder impactZh(String impactZh) {
                this.impactZh = impactZh;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder insComment(String insComment) {
                this.insComment = insComment;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * The time when the task is modified. The time follows the ISO 8601 standard in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The required preparation period between the task start time and the switchover time. The time is displayed in the *HH:mm:ss* format.
             */
            public Builder prepareInterval(String prepareInterval) {
                this.prepareInterval = prepareInterval;
                return this;
            }

            /**
             * The region of the instance.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The result information. The value of this parameter can be ignored.
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * The start time of the task. The time follows the ISO 8601 standard in the *yyyy-mm-dd* T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * N/A
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The subinstances.
             */
            public Builder subInsNames(java.util.List < String > subInsNames) {
                this.subInsNames = subInsNames;
                return this;
            }

            /**
             * The switchover point in time in which disconnection may occur. The time follows the ISO 8601 standard in the *yyyy-mm-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * The task type.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * N/A
             */
            public Builder taskTypeEn(String taskTypeEn) {
                this.taskTypeEn = taskTypeEn;
                return this;
            }

            /**
             * The task type in Chinese.
             */
            public Builder taskTypeZh(String taskTypeZh) {
                this.taskTypeZh = taskTypeZh;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
