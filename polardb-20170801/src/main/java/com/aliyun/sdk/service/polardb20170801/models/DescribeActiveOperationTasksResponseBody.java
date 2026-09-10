// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeActiveOperationTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTasksResponseBody</p>
 */
public class DescribeActiveOperationTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeActiveOperationTasksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of O\&amp;M tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FAF88508-D5F8-52B1-8824-262601769E31</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of task records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeActiveOperationTasksResponseBody build() {
            return new DescribeActiveOperationTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveOperationTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveOperationTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCancel")
        private Long allowCancel;

        @com.aliyun.core.annotation.NameInMap("AllowChange")
        private Long allowChange;

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

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBNodeIds")
        private java.util.List<String> DBNodeIds;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("Deadline")
        private String deadline;

        @com.aliyun.core.annotation.NameInMap("Impact")
        private String impact;

        @com.aliyun.core.annotation.NameInMap("ImpactEn")
        private String impactEn;

        @com.aliyun.core.annotation.NameInMap("ImpactZh")
        private String impactZh;

        @com.aliyun.core.annotation.NameInMap("InsComment")
        private String insComment;

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

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
        private String switchTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        @com.aliyun.core.annotation.NameInMap("TaskParams")
        private String taskParams;

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
            this.DBClusterId = builder.DBClusterId;
            this.DBNodeIds = builder.DBNodeIds;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.deadline = builder.deadline;
            this.impact = builder.impact;
            this.impactEn = builder.impactEn;
            this.impactZh = builder.impactZh;
            this.insComment = builder.insComment;
            this.modifiedTime = builder.modifiedTime;
            this.prepareInterval = builder.prepareInterval;
            this.region = builder.region;
            this.resultInfo = builder.resultInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.switchTime = builder.switchTime;
            this.taskId = builder.taskId;
            this.taskParams = builder.taskParams;
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
        public Long getAllowCancel() {
            return this.allowCancel;
        }

        /**
         * @return allowChange
         */
        public Long getAllowChange() {
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
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBNodeIds
         */
        public java.util.List<String> getDBNodeIds() {
            return this.DBNodeIds;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return deadline
         */
        public String getDeadline() {
            return this.deadline;
        }

        /**
         * @return impact
         */
        public String getImpact() {
            return this.impact;
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
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskParams
         */
        public String getTaskParams() {
            return this.taskParams;
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
            private Long allowCancel; 
            private Long allowChange; 
            private String changeLevel; 
            private String changeLevelEn; 
            private String changeLevelZh; 
            private String createdTime; 
            private String currentAVZ; 
            private String DBClusterId; 
            private java.util.List<String> DBNodeIds; 
            private String DBType; 
            private String DBVersion; 
            private String deadline; 
            private String impact; 
            private String impactEn; 
            private String impactZh; 
            private String insComment; 
            private String modifiedTime; 
            private String prepareInterval; 
            private String region; 
            private String resultInfo; 
            private String startTime; 
            private Integer status; 
            private String switchTime; 
            private Integer taskId; 
            private String taskParams; 
            private String taskType; 
            private String taskTypeEn; 
            private String taskTypeZh; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.allowCancel = model.allowCancel;
                this.allowChange = model.allowChange;
                this.changeLevel = model.changeLevel;
                this.changeLevelEn = model.changeLevelEn;
                this.changeLevelZh = model.changeLevelZh;
                this.createdTime = model.createdTime;
                this.currentAVZ = model.currentAVZ;
                this.DBClusterId = model.DBClusterId;
                this.DBNodeIds = model.DBNodeIds;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.deadline = model.deadline;
                this.impact = model.impact;
                this.impactEn = model.impactEn;
                this.impactZh = model.impactZh;
                this.insComment = model.insComment;
                this.modifiedTime = model.modifiedTime;
                this.prepareInterval = model.prepareInterval;
                this.region = model.region;
                this.resultInfo = model.resultInfo;
                this.startTime = model.startTime;
                this.status = model.status;
                this.switchTime = model.switchTime;
                this.taskId = model.taskId;
                this.taskParams = model.taskParams;
                this.taskType = model.taskType;
                this.taskTypeEn = model.taskTypeEn;
                this.taskTypeZh = model.taskTypeZh;
            } 

            /**
             * <p>Indicates whether cancellation is allowed. Valid values:</p>
             * <ul>
             * <li><p>1: indicates that users are allowed to cancel the task.</p>
             * </li>
             * <li><p>0: indicates that cancellation is not allowed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allowCancel(Long allowCancel) {
                this.allowCancel = allowCancel;
                return this;
            }

            /**
             * <p>Indicates whether time modification is allowed. Valid values:</p>
             * <ul>
             * <li><p>1: indicates that users are allowed to modify the time.</p>
             * </li>
             * <li><p>0: indicates that users are not allowed to modify the time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allowChange(Long allowChange) {
                this.allowChange = allowChange;
                return this;
            }

            /**
             * <p>The event level code. Valid values:</p>
             * <ul>
             * <li><p>S1: system maintenance.</p>
             * </li>
             * <li><p>S0: threat fix.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S0</p>
             */
            public Builder changeLevel(String changeLevel) {
                this.changeLevel = changeLevel;
                return this;
            }

            /**
             * <p>The event level (English).</p>
             * 
             * <strong>example:</strong>
             * <p>System maintenance</p>
             */
            public Builder changeLevelEn(String changeLevelEn) {
                this.changeLevelEn = changeLevelEn;
                return this;
            }

            /**
             * <p>The event level (Chinese).</p>
             * 
             * <strong>example:</strong>
             * <p>系统运维</p>
             */
            public Builder changeLevelZh(String changeLevelZh) {
                this.changeLevelZh = changeLevelZh;
                return this;
            }

            /**
             * <p>The creation time. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T22:00:42Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The current zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
             */
            public Builder currentAVZ(String currentAVZ) {
                this.currentAVZ = currentAVZ;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The list of node IDs.</p>
             */
            public Builder DBNodeIds(java.util.List<String> DBNodeIds) {
                this.DBNodeIds = DBNodeIds;
                return this;
            }

            /**
             * <p>The database engine type. Valid values:</p>
             * <ul>
             * <li><p><strong>MySQL</strong></p>
             * </li>
             * <li><p><strong>PostgreSQL</strong></p>
             * </li>
             * <li><p><strong>Oracle</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The kernel version number.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The latest deadline for the adjustable range of task execution time. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-11T15:59:59Z</p>
             */
            public Builder deadline(String deadline) {
                this.deadline = deadline;
                return this;
            }

            /**
             * <p>The event impact.</p>
             * 
             * <strong>example:</strong>
             * <p>TransientDisconnection</p>
             */
            public Builder impact(String impact) {
                this.impact = impact;
                return this;
            }

            /**
             * <p>The event impact (English).</p>
             * 
             * <strong>example:</strong>
             * <p>Transient instance disconnection</p>
             */
            public Builder impactEn(String impactEn) {
                this.impactEn = impactEn;
                return this;
            }

            /**
             * <p>The event impact (Chinese).</p>
             * 
             * <strong>example:</strong>
             * <p>集群闪断</p>
             */
            public Builder impactZh(String impactZh) {
                this.impactZh = impactZh;
                return this;
            }

            /**
             * <p>The cluster alias or cluster comment.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder insComment(String insComment) {
                this.insComment = insComment;
                return this;
            }

            /**
             * <p>The modification time. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T22:00:42Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The preparation time required between the start time and the switch time. Format: HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>04:00:00</p>
             */
            public Builder prepareInterval(String prepareInterval) {
                this.prepareInterval = prepareInterval;
                return this;
            }

            /**
             * <p>The region code.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The execution result information.</p>
             * 
             * <strong>example:</strong>
             * <p>userCancel</p>
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * <p>The time when the background task is executed. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-19T02:48:17Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><p>0: indicates waiting for notification.</p>
             * </li>
             * <li><p>1: indicates retry notification.</p>
             * </li>
             * <li><p>2: indicates waiting for user-specified time.</p>
             * </li>
             * <li><p>3: indicates waiting for processing.</p>
             * </li>
             * <li><p>4: indicates in progress.</p>
             * </li>
             * <li><p>5: indicates successfully completed.</p>
             * </li>
             * <li><p>6: indicates failed.</p>
             * </li>
             * <li><p>7: indicates canceled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the background initiates the switch operation. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T22:00:00Z</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>107202351</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Action&quot;: &quot;UpgradeDBInstance&quot;
             * }</p>
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * <p>The type of the pending event task. Valid values:</p>
             * <ul>
             * <li><p><strong>DatabaseSoftwareUpgrading</strong>: database software upgrade.</p>
             * </li>
             * <li><p><strong>DatabaseHardwareMaintenance</strong>: hardware maintenance and upgrade.</p>
             * </li>
             * <li><p><strong>DatabaseStorageUpgrading</strong>: database storage upgrade.</p>
             * </li>
             * <li><p><strong>DatabaseProxyUpgrading</strong>: proxy minor version upgrade.</p>
             * </li>
             * <li><p><strong>all</strong>: returns all types of pending events.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DatabaseSoftwareUpgrading</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The task reason in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Minor version update</p>
             */
            public Builder taskTypeEn(String taskTypeEn) {
                this.taskTypeEn = taskTypeEn;
                return this;
            }

            /**
             * <p>The task reason in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>小版本升级</p>
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
