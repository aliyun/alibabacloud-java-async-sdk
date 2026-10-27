// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

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
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

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
         * <p>The list of items.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
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
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Impact")
        private String impact;

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
        private Long status;

        @com.aliyun.core.annotation.NameInMap("SubInsNames")
        private java.util.List<String> subInsNames;

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
            this.impact = builder.impact;
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
        public Long getId() {
            return this.id;
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
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return subInsNames
         */
        public java.util.List<String> getSubInsNames() {
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
            private Long id; 
            private String impact; 
            private String impactEn; 
            private String impactZh; 
            private String insComment; 
            private String insName; 
            private String modifiedTime; 
            private String prepareInterval; 
            private String region; 
            private String resultInfo; 
            private String startTime; 
            private Long status; 
            private java.util.List<String> subInsNames; 
            private String switchTime; 
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
                this.dbType = model.dbType;
                this.dbVersion = model.dbVersion;
                this.deadline = model.deadline;
                this.id = model.id;
                this.impact = model.impact;
                this.impactEn = model.impactEn;
                this.impactZh = model.impactZh;
                this.insComment = model.insComment;
                this.insName = model.insName;
                this.modifiedTime = model.modifiedTime;
                this.prepareInterval = model.prepareInterval;
                this.region = model.region;
                this.resultInfo = model.resultInfo;
                this.startTime = model.startTime;
                this.status = model.status;
                this.subInsNames = model.subInsNames;
                this.switchTime = model.switchTime;
                this.taskType = model.taskType;
                this.taskTypeEn = model.taskTypeEn;
                this.taskTypeZh = model.taskTypeZh;
            } 

            /**
             * <p>Indicates whether the event can be canceled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allowCancel(String allowCancel) {
                this.allowCancel = allowCancel;
                return this;
            }

            /**
             * <p>Indicates whether the time can be modified. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder allowChange(String allowChange) {
                this.allowChange = allowChange;
                return this;
            }

            /**
             * <p>The change level. This parameter can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>Risk</p>
             */
            public Builder changeLevel(String changeLevel) {
                this.changeLevel = changeLevel;
                return this;
            }

            /**
             * <p>The change level in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Risk repairment</p>
             */
            public Builder changeLevelEn(String changeLevelEn) {
                this.changeLevelEn = changeLevelEn;
                return this;
            }

            /**
             * <p>The change level in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>风险修复</p>
             */
            public Builder changeLevelZh(String changeLevelZh) {
                this.changeLevelZh = changeLevelZh;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T16:00:00Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The current availability zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-et-a</p>
             */
            public Builder currentAVZ(String currentAVZ) {
                this.currentAVZ = currentAVZ;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The database version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * <p>The deadline.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T16:00:00Z</p>
             */
            public Builder deadline(String deadline) {
                this.deadline = deadline;
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
             * <p>The impact. This parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
             */
            public Builder impact(String impact) {
                this.impact = impact;
                return this;
            }

            /**
             * <p>The impact in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Transient instance disconnection</p>
             */
            public Builder impactEn(String impactEn) {
                this.impactEn = impactEn;
                return this;
            }

            /**
             * <p>The impact in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>中断</p>
             */
            public Builder impactZh(String impactZh) {
                this.impactZh = impactZh;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder insComment(String insComment) {
                this.insComment = insComment;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-dd</p>
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T16:00:00Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The preparation interval.</p>
             * 
             * <strong>example:</strong>
             * <p>03:00:00</p>
             */
            public Builder prepareInterval(String prepareInterval) {
                this.prepareInterval = prepareInterval;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-et15-b01</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The result information. This parameter can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * <p>The start time. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T16:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: pending </li>
             * <li><strong>4</strong>: running</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of child instances.</p>
             */
            public Builder subInsNames(java.util.List<String> subInsNames) {
                this.subInsNames = subInsNames;
                return this;
            }

            /**
             * <p>The switchover time. The time is displayed in UTC in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T16:00:00Z</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_apsaradb_transfer</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The task type in English. This parameter can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
             */
            public Builder taskTypeEn(String taskTypeEn) {
                this.taskTypeEn = taskTypeEn;
                return this;
            }

            /**
             * <p>The task type in Chinese. This parameter can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>--</p>
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
