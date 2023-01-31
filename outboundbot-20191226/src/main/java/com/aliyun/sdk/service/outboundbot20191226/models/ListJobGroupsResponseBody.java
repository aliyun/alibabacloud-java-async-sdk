// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobGroupsResponseBody</p>
 */
public class ListJobGroupsResponseBody extends TeaModel {
    @NameInMap("AsyncTaskId")
    private String asyncTaskId;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("JobGroups")
    private JobGroups jobGroups;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class ExportProgress extends TeaModel {
        @NameInMap("FileHttpUrl")
        private String fileHttpUrl;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
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
    public static class Progress extends TeaModel {
        @NameInMap("CancelledNum")
        private Integer cancelledNum;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("ExecutingNum")
        private Integer executingNum;

        @NameInMap("FailedNum")
        private Integer failedNum;

        @NameInMap("PausedNum")
        private Integer pausedNum;

        @NameInMap("Scheduling")
        private Integer scheduling;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCompleted")
        private Integer totalCompleted;

        @NameInMap("TotalJobs")
        private Integer totalJobs;

        @NameInMap("TotalNotAnswered")
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
    public static class Strategy extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
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
    public static class List extends TeaModel {
        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("ExportProgress")
        private ExportProgress exportProgress;

        @NameInMap("JobDataParsingTaskId")
        private String jobDataParsingTaskId;

        @NameInMap("JobGroupDescription")
        private String jobGroupDescription;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobGroupName")
        private String jobGroupName;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Progress")
        private Progress progress;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptName")
        private String scriptName;

        @NameInMap("ScriptVersion")
        private String scriptVersion;

        @NameInMap("Status")
        private String status;

        @NameInMap("Strategy")
        private Strategy strategy;

        @NameInMap("TotalCallNum")
        private Integer totalCallNum;

        private List(Builder builder) {
            this.creationTime = builder.creationTime;
            this.exportProgress = builder.exportProgress;
            this.jobDataParsingTaskId = builder.jobDataParsingTaskId;
            this.jobGroupDescription = builder.jobGroupDescription;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
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
            private String modifyTime; 
            private Progress progress; 
            private String scriptId; 
            private String scriptName; 
            private String scriptVersion; 
            private String status; 
            private Strategy strategy; 
            private Integer totalCallNum; 

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
    public static class JobGroups extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
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
