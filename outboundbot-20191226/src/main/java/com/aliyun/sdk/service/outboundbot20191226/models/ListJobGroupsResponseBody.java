// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobGroupsResponseBody</p>
 */
public class ListJobGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobGroups")
    private JobGroups jobGroups;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListJobGroupsResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobGroups = builder.jobGroups;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobGroups
     */
    public JobGroups getJobGroups() {
        return this.jobGroups;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String asyncTaskId; 
        private String code; 
        private Integer httpStatusCode; 
        private JobGroups jobGroups; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListJobGroupsResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobGroups = model.jobGroups;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AsyncTaskId.
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobGroups.
         */
        public Builder jobGroups(JobGroups jobGroups) {
            this.jobGroups = jobGroups;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJobGroupsResponseBody build() {
            return new ListJobGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobGroupsResponseBody</p>
     */
    public static class ExportProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileHttpUrl")
        private String fileHttpUrl;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ExportProgress(Builder builder) {
            this.fileHttpUrl = builder.fileHttpUrl;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportProgress create() {
            return builder().build();
        }

        /**
         * @return fileHttpUrl
         */
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String fileHttpUrl; 
            private String progress; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExportProgress model) {
                this.fileHttpUrl = model.fileHttpUrl;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * FileHttpUrl.
             */
            public Builder fileHttpUrl(String fileHttpUrl) {
                this.fileHttpUrl = fileHttpUrl;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExportProgress build() {
                return new ExportProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobGroupsResponseBody</p>
     */
    public static class Progress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelledNum")
        private Integer cancelledNum;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("ExecutingNum")
        private Integer executingNum;

        @com.aliyun.core.annotation.NameInMap("FailedNum")
        private Integer failedNum;

        @com.aliyun.core.annotation.NameInMap("PausedNum")
        private Integer pausedNum;

        @com.aliyun.core.annotation.NameInMap("Scheduling")
        private Integer scheduling;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalCompleted")
        private Integer totalCompleted;

        @com.aliyun.core.annotation.NameInMap("TotalJobs")
        private Integer totalJobs;

        @com.aliyun.core.annotation.NameInMap("TotalNotAnswered")
        private Integer totalNotAnswered;

        private Progress(Builder builder) {
            this.cancelledNum = builder.cancelledNum;
            this.duration = builder.duration;
            this.executingNum = builder.executingNum;
            this.failedNum = builder.failedNum;
            this.pausedNum = builder.pausedNum;
            this.scheduling = builder.scheduling;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCompleted = builder.totalCompleted;
            this.totalJobs = builder.totalJobs;
            this.totalNotAnswered = builder.totalNotAnswered;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return cancelledNum
         */
        public Integer getCancelledNum() {
            return this.cancelledNum;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return executingNum
         */
        public Integer getExecutingNum() {
            return this.executingNum;
        }

        /**
         * @return failedNum
         */
        public Integer getFailedNum() {
            return this.failedNum;
        }

        /**
         * @return pausedNum
         */
        public Integer getPausedNum() {
            return this.pausedNum;
        }

        /**
         * @return scheduling
         */
        public Integer getScheduling() {
            return this.scheduling;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCompleted
         */
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        /**
         * @return totalJobs
         */
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        /**
         * @return totalNotAnswered
         */
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

        public static final class Builder {
            private Integer cancelledNum; 
            private Integer duration; 
            private Integer executingNum; 
            private Integer failedNum; 
            private Integer pausedNum; 
            private Integer scheduling; 
            private Long startTime; 
            private String status; 
            private Integer totalCompleted; 
            private Integer totalJobs; 
            private Integer totalNotAnswered; 

            private Builder() {
            } 

            private Builder(Progress model) {
                this.cancelledNum = model.cancelledNum;
                this.duration = model.duration;
                this.executingNum = model.executingNum;
                this.failedNum = model.failedNum;
                this.pausedNum = model.pausedNum;
                this.scheduling = model.scheduling;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalCompleted = model.totalCompleted;
                this.totalJobs = model.totalJobs;
                this.totalNotAnswered = model.totalNotAnswered;
            } 

            /**
             * CancelledNum.
             */
            public Builder cancelledNum(Integer cancelledNum) {
                this.cancelledNum = cancelledNum;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ExecutingNum.
             */
            public Builder executingNum(Integer executingNum) {
                this.executingNum = executingNum;
                return this;
            }

            /**
             * FailedNum.
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * PausedNum.
             */
            public Builder pausedNum(Integer pausedNum) {
                this.pausedNum = pausedNum;
                return this;
            }

            /**
             * Scheduling.
             */
            public Builder scheduling(Integer scheduling) {
                this.scheduling = scheduling;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCompleted.
             */
            public Builder totalCompleted(Integer totalCompleted) {
                this.totalCompleted = totalCompleted;
                return this;
            }

            /**
             * TotalJobs.
             */
            public Builder totalJobs(Integer totalJobs) {
                this.totalJobs = totalJobs;
                return this;
            }

            /**
             * TotalNotAnswered.
             */
            public Builder totalNotAnswered(Integer totalNotAnswered) {
                this.totalNotAnswered = totalNotAnswered;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobGroupsResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Strategy(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobGroupsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("ExportProgress")
        private ExportProgress exportProgress;

        @com.aliyun.core.annotation.NameInMap("JobDataParsingTaskId")
        private String jobDataParsingTaskId;

        @com.aliyun.core.annotation.NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("MinConcurrency")
        private Integer minConcurrency;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Progress progress;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("ScriptVersion")
        private String scriptVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        @com.aliyun.core.annotation.NameInMap("TotalCallNum")
        private Integer totalCallNum;

        private List(Builder builder) {
            this.creationTime = builder.creationTime;
            this.exportProgress = builder.exportProgress;
            this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.minConcurrency = builder.minConcurrency;
            this.modifyTime = builder.modifyTime;
            this.progress = builder.progress;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.scriptVersion = builder.scriptVersion;
            this.status = builder.status;
            this.strategy = builder.strategy;
            this.totalCallNum = builder.totalCallNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return exportProgress
         */
        public ExportProgress getExportProgress() {
            return this.exportProgress;
        }

        /**
         * @return jobDataParsingTaskId
         */
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        /**
         * @return jobGroupDescription
         */
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return minConcurrency
         */
        public Integer getMinConcurrency() {
            return this.minConcurrency;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return progress
         */
        public Progress getProgress() {
            return this.progress;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        /**
         * @return totalCallNum
         */
        public Integer getTotalCallNum() {
            return this.totalCallNum;
        }

        public static final class Builder {
            private Long creationTime; 
            private ExportProgress exportProgress; 
            private String jobDataParsingTaskId; 
            private String jobGroupDescription; 
            private String jobGroupId; 
            private String jobGroupName; 
            private Integer minConcurrency; 
            private String modifyTime; 
            private Progress progress; 
            private String scriptId; 
            private String scriptName; 
            private String scriptVersion; 
            private String status; 
            private Strategy strategy; 
            private Integer totalCallNum; 

            private Builder() {
            } 

            private Builder(List model) {
                this.creationTime = model.creationTime;
                this.exportProgress = model.exportProgress;
                this.jobDataParsingTaskId = model.jobDataParsingTaskId;
                this.jobGroupDescription = model.jobGroupDescription;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.minConcurrency = model.minConcurrency;
                this.modifyTime = model.modifyTime;
                this.progress = model.progress;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.scriptVersion = model.scriptVersion;
                this.status = model.status;
                this.strategy = model.strategy;
                this.totalCallNum = model.totalCallNum;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ExportProgress.
             */
            public Builder exportProgress(ExportProgress exportProgress) {
                this.exportProgress = exportProgress;
                return this;
            }

            /**
             * JobDataParsingTaskId.
             */
            public Builder jobDataParsingTaskId(String jobDataParsingTaskId) {
                this.jobDataParsingTaskId = jobDataParsingTaskId;
                return this;
            }

            /**
             * JobGroupDescription.
             */
            public Builder jobGroupDescription(String jobGroupDescription) {
                this.jobGroupDescription = jobGroupDescription;
                return this;
            }

            /**
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobGroupName.
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * MinConcurrency.
             */
            public Builder minConcurrency(Integer minConcurrency) {
                this.minConcurrency = minConcurrency;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Progress progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptName.
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * ScriptVersion.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Strategy.
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * TotalCallNum.
             */
            public Builder totalCallNum(Integer totalCallNum) {
                this.totalCallNum = totalCallNum;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobGroupsResponseBody</p>
     */
    public static class JobGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private JobGroups(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobGroups create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(JobGroups model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public JobGroups build() {
                return new JobGroups(this);
            } 

        } 

    }
}
