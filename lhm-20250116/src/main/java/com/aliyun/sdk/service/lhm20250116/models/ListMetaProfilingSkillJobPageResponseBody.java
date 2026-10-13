// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingSkillJobPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaProfilingSkillJobPageResponseBody</p>
 */
public class ListMetaProfilingSkillJobPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMetaProfilingSkillJobPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingSkillJobPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaProfilingSkillJobPageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of profiling tasks. For the element structure, see the descriptions of the child fields.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. This parameter is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. This parameter is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter is invalid or missing.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of records to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID used to locate and troubleshoot issues for this call.</p>
         * 
         * <strong>example:</strong>
         * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates success, and a value of false indicates failure. If the call fails, troubleshoot the issue based on the errCode and errMessage parameters.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaProfilingSkillJobPageResponseBody build() {
            return new ListMetaProfilingSkillJobPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaProfilingSkillJobPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaProfilingSkillJobPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentId")
        private Long componentId;

        @com.aliyun.core.annotation.NameInMap("currentTaskStatus")
        private Integer currentTaskStatus;

        @com.aliyun.core.annotation.NameInMap("dcName")
        private String dcName;

        @com.aliyun.core.annotation.NameInMap("dcStatus")
        private Integer dcStatus;

        @com.aliyun.core.annotation.NameInMap("dcType")
        private String dcType;

        @com.aliyun.core.annotation.NameInMap("diffNodeNum")
        private Integer diffNodeNum;

        @com.aliyun.core.annotation.NameInMap("diffPartitionNum")
        private Integer diffPartitionNum;

        @com.aliyun.core.annotation.NameInMap("diffTableNum")
        private Integer diffTableNum;

        @com.aliyun.core.annotation.NameInMap("diffWorkflowNum")
        private Integer diffWorkflowNum;

        @com.aliyun.core.annotation.NameInMap("dsCategoryType")
        private String dsCategoryType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("hasIncrementChanges")
        private Boolean hasIncrementChanges;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("jobDesc")
        private String jobDesc;

        @com.aliyun.core.annotation.NameInMap("jobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("jobStatus")
        private Integer jobStatus;

        @com.aliyun.core.annotation.NameInMap("lastBatchId")
        private String lastBatchId;

        @com.aliyun.core.annotation.NameInMap("lastTaskId")
        private Long lastTaskId;

        @com.aliyun.core.annotation.NameInMap("nextCronTime")
        private String nextCronTime;

        @com.aliyun.core.annotation.NameInMap("profilingEnable")
        private Integer profilingEnable;

        @com.aliyun.core.annotation.NameInMap("profilingSchemaList")
        private java.util.List<String> profilingSchemaList;

        @com.aliyun.core.annotation.NameInMap("taskExecResult")
        private Integer taskExecResult;

        @com.aliyun.core.annotation.NameInMap("taskFinishTime")
        private String taskFinishTime;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        private Data(Builder builder) {
            this.componentId = builder.componentId;
            this.currentTaskStatus = builder.currentTaskStatus;
            this.dcName = builder.dcName;
            this.dcStatus = builder.dcStatus;
            this.dcType = builder.dcType;
            this.diffNodeNum = builder.diffNodeNum;
            this.diffPartitionNum = builder.diffPartitionNum;
            this.diffTableNum = builder.diffTableNum;
            this.diffWorkflowNum = builder.diffWorkflowNum;
            this.dsCategoryType = builder.dsCategoryType;
            this.gmtCreate = builder.gmtCreate;
            this.hasIncrementChanges = builder.hasIncrementChanges;
            this.id = builder.id;
            this.jobDesc = builder.jobDesc;
            this.jobName = builder.jobName;
            this.jobStatus = builder.jobStatus;
            this.lastBatchId = builder.lastBatchId;
            this.lastTaskId = builder.lastTaskId;
            this.nextCronTime = builder.nextCronTime;
            this.profilingEnable = builder.profilingEnable;
            this.profilingSchemaList = builder.profilingSchemaList;
            this.taskExecResult = builder.taskExecResult;
            this.taskFinishTime = builder.taskFinishTime;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public Long getComponentId() {
            return this.componentId;
        }

        /**
         * @return currentTaskStatus
         */
        public Integer getCurrentTaskStatus() {
            return this.currentTaskStatus;
        }

        /**
         * @return dcName
         */
        public String getDcName() {
            return this.dcName;
        }

        /**
         * @return dcStatus
         */
        public Integer getDcStatus() {
            return this.dcStatus;
        }

        /**
         * @return dcType
         */
        public String getDcType() {
            return this.dcType;
        }

        /**
         * @return diffNodeNum
         */
        public Integer getDiffNodeNum() {
            return this.diffNodeNum;
        }

        /**
         * @return diffPartitionNum
         */
        public Integer getDiffPartitionNum() {
            return this.diffPartitionNum;
        }

        /**
         * @return diffTableNum
         */
        public Integer getDiffTableNum() {
            return this.diffTableNum;
        }

        /**
         * @return diffWorkflowNum
         */
        public Integer getDiffWorkflowNum() {
            return this.diffWorkflowNum;
        }

        /**
         * @return dsCategoryType
         */
        public String getDsCategoryType() {
            return this.dsCategoryType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return hasIncrementChanges
         */
        public Boolean getHasIncrementChanges() {
            return this.hasIncrementChanges;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobDesc
         */
        public String getJobDesc() {
            return this.jobDesc;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobStatus
         */
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return lastBatchId
         */
        public String getLastBatchId() {
            return this.lastBatchId;
        }

        /**
         * @return lastTaskId
         */
        public Long getLastTaskId() {
            return this.lastTaskId;
        }

        /**
         * @return nextCronTime
         */
        public String getNextCronTime() {
            return this.nextCronTime;
        }

        /**
         * @return profilingEnable
         */
        public Integer getProfilingEnable() {
            return this.profilingEnable;
        }

        /**
         * @return profilingSchemaList
         */
        public java.util.List<String> getProfilingSchemaList() {
            return this.profilingSchemaList;
        }

        /**
         * @return taskExecResult
         */
        public Integer getTaskExecResult() {
            return this.taskExecResult;
        }

        /**
         * @return taskFinishTime
         */
        public String getTaskFinishTime() {
            return this.taskFinishTime;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long componentId; 
            private Integer currentTaskStatus; 
            private String dcName; 
            private Integer dcStatus; 
            private String dcType; 
            private Integer diffNodeNum; 
            private Integer diffPartitionNum; 
            private Integer diffTableNum; 
            private Integer diffWorkflowNum; 
            private String dsCategoryType; 
            private String gmtCreate; 
            private Boolean hasIncrementChanges; 
            private Long id; 
            private String jobDesc; 
            private String jobName; 
            private Integer jobStatus; 
            private String lastBatchId; 
            private Long lastTaskId; 
            private String nextCronTime; 
            private Integer profilingEnable; 
            private java.util.List<String> profilingSchemaList; 
            private Integer taskExecResult; 
            private String taskFinishTime; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.componentId = model.componentId;
                this.currentTaskStatus = model.currentTaskStatus;
                this.dcName = model.dcName;
                this.dcStatus = model.dcStatus;
                this.dcType = model.dcType;
                this.diffNodeNum = model.diffNodeNum;
                this.diffPartitionNum = model.diffPartitionNum;
                this.diffTableNum = model.diffTableNum;
                this.diffWorkflowNum = model.diffWorkflowNum;
                this.dsCategoryType = model.dsCategoryType;
                this.gmtCreate = model.gmtCreate;
                this.hasIncrementChanges = model.hasIncrementChanges;
                this.id = model.id;
                this.jobDesc = model.jobDesc;
                this.jobName = model.jobName;
                this.jobStatus = model.jobStatus;
                this.lastBatchId = model.lastBatchId;
                this.lastTaskId = model.lastTaskId;
                this.nextCronTime = model.nextCronTime;
                this.profilingEnable = model.profilingEnable;
                this.profilingSchemaList = model.profilingSchemaList;
                this.taskExecResult = model.taskExecResult;
                this.taskFinishTime = model.taskFinishTime;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The component ID, which is the primary key identifier of the data source component.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder componentId(Long componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The identifier of the current execution status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentTaskStatus(Integer currentTaskStatus) {
                this.currentTaskStatus = currentTaskStatus;
                return this;
            }

            /**
             * <p>The data component name.</p>
             * 
             * <strong>example:</strong>
             * <p>hive_cluster_a</p>
             */
            public Builder dcName(String dcName) {
                this.dcName = dcName;
                return this;
            }

            /**
             * <p>The status identifier of the data component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dcStatus(Integer dcStatus) {
                this.dcStatus = dcStatus;
                return this;
            }

            /**
             * <p>The type identifier of the data component.</p>
             * 
             * <strong>example:</strong>
             * <p>HIVE</p>
             */
            public Builder dcType(String dcType) {
                this.dcType = dcType;
                return this;
            }

            /**
             * <p>The number of differing nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder diffNodeNum(Integer diffNodeNum) {
                this.diffNodeNum = diffNodeNum;
                return this;
            }

            /**
             * <p>The number of differing partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder diffPartitionNum(Integer diffPartitionNum) {
                this.diffPartitionNum = diffPartitionNum;
                return this;
            }

            /**
             * <p>The number of differing tables.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder diffTableNum(Integer diffTableNum) {
                this.diffTableNum = diffTableNum;
                return this;
            }

            /**
             * <p>The number of differing workflows.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder diffWorkflowNum(Integer diffWorkflowNum) {
                this.diffWorkflowNum = diffWorkflowNum;
                return this;
            }

            /**
             * <p>The category type identifier of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>SOURCE</p>
             */
            public Builder dsCategoryType(String dsCategoryType) {
                this.dsCategoryType = dsCategoryType;
                return this;
            }

            /**
             * <p>The time when the record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Indicates whether incremental changes exist.</p>
             */
            public Builder hasIncrementChanges(Boolean hasIncrementChanges) {
                this.hasIncrementChanges = hasIncrementChanges;
                return this;
            }

            /**
             * <p>The primary key ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>7001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the profiling task.</p>
             * 
             * <strong>example:</strong>
             * <p>Daily full metadata profiling task</p>
             */
            public Builder jobDesc(String jobDesc) {
                this.jobDesc = jobDesc;
                return this;
            }

            /**
             * <p>The profiling task name.</p>
             * 
             * <strong>example:</strong>
             * <p>profiling_daily</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The status identifier of the profiling task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder jobStatus(Integer jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The ID of the most recent execution batch.</p>
             * 
             * <strong>example:</strong>
             * <p>20240719220000</p>
             */
            public Builder lastBatchId(String lastBatchId) {
                this.lastBatchId = lastBatchId;
                return this;
            }

            /**
             * <p>The ID of the most recently executed task.</p>
             * 
             * <strong>example:</strong>
             * <p>8001</p>
             */
            public Builder lastTaskId(Long lastTaskId) {
                this.lastTaskId = lastTaskId;
                return this;
            }

            /**
             * <p>The estimated time for the next scheduled execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-20 02:00:00</p>
             */
            public Builder nextCronTime(String nextCronTime) {
                this.nextCronTime = nextCronTime;
                return this;
            }

            /**
             * <p>Indicates whether data profiling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder profilingEnable(Integer profilingEnable) {
                this.profilingEnable = profilingEnable;
                return this;
            }

            /**
             * <p>The list of schemas (databases) to be profiled.</p>
             */
            public Builder profilingSchemaList(java.util.List<String> profilingSchemaList) {
                this.profilingSchemaList = profilingSchemaList;
                return this;
            }

            /**
             * <p>The identifier of the task execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskExecResult(Integer taskExecResult) {
                this.taskExecResult = taskExecResult;
                return this;
            }

            /**
             * <p>The time when the task execution was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder taskFinishTime(String taskFinishTime) {
                this.taskFinishTime = taskFinishTime;
                return this;
            }

            /**
             * <p>The type identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>PROFILING</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
