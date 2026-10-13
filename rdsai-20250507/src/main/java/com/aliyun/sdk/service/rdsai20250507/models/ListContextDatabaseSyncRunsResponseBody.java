// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListContextDatabaseSyncRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContextDatabaseSyncRunsResponseBody</p>
 */
public class ListContextDatabaseSyncRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContextDatabaseSyncRunsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextDatabaseSyncRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContextDatabaseSyncRunsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContextDatabaseSyncRunsResponseBody build() {
            return new ListContextDatabaseSyncRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContextDatabaseSyncRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncRunsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cancelled")
        private Integer cancelled;

        @com.aliyun.core.annotation.NameInMap("Deferred")
        private Integer deferred;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("MetadataUpdated")
        private Integer metadataUpdated;

        @com.aliyun.core.annotation.NameInMap("Processing")
        private Integer processing;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Integer skipped;

        @com.aliyun.core.annotation.NameInMap("Unchanged")
        private Integer unchanged;

        @com.aliyun.core.annotation.NameInMap("UploadAccepted")
        private Integer uploadAccepted;

        @com.aliyun.core.annotation.NameInMap("Uploaded")
        private Integer uploaded;

        private Summary(Builder builder) {
            this.cancelled = builder.cancelled;
            this.deferred = builder.deferred;
            this.failed = builder.failed;
            this.metadataUpdated = builder.metadataUpdated;
            this.processing = builder.processing;
            this.skipped = builder.skipped;
            this.unchanged = builder.unchanged;
            this.uploadAccepted = builder.uploadAccepted;
            this.uploaded = builder.uploaded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return cancelled
         */
        public Integer getCancelled() {
            return this.cancelled;
        }

        /**
         * @return deferred
         */
        public Integer getDeferred() {
            return this.deferred;
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return metadataUpdated
         */
        public Integer getMetadataUpdated() {
            return this.metadataUpdated;
        }

        /**
         * @return processing
         */
        public Integer getProcessing() {
            return this.processing;
        }

        /**
         * @return skipped
         */
        public Integer getSkipped() {
            return this.skipped;
        }

        /**
         * @return unchanged
         */
        public Integer getUnchanged() {
            return this.unchanged;
        }

        /**
         * @return uploadAccepted
         */
        public Integer getUploadAccepted() {
            return this.uploadAccepted;
        }

        /**
         * @return uploaded
         */
        public Integer getUploaded() {
            return this.uploaded;
        }

        public static final class Builder {
            private Integer cancelled; 
            private Integer deferred; 
            private Integer failed; 
            private Integer metadataUpdated; 
            private Integer processing; 
            private Integer skipped; 
            private Integer unchanged; 
            private Integer uploadAccepted; 
            private Integer uploaded; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.cancelled = model.cancelled;
                this.deferred = model.deferred;
                this.failed = model.failed;
                this.metadataUpdated = model.metadataUpdated;
                this.processing = model.processing;
                this.skipped = model.skipped;
                this.unchanged = model.unchanged;
                this.uploadAccepted = model.uploadAccepted;
                this.uploaded = model.uploaded;
            } 

            /**
             * <p>The number of canceled items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancelled(Integer cancelled) {
                this.cancelled = cancelled;
                return this;
            }

            /**
             * <p>The number of deferred items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deferred(Integer deferred) {
                this.deferred = deferred;
                return this;
            }

            /**
             * <p>The number of failed items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The number of items with updated metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder metadataUpdated(Integer metadataUpdated) {
                this.metadataUpdated = metadataUpdated;
                return this;
            }

            /**
             * <p>The number of items being processed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processing(Integer processing) {
                this.processing = processing;
                return this;
            }

            /**
             * <p>The number of skipped items.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipped(Integer skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The number of unchanged items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder unchanged(Integer unchanged) {
                this.unchanged = unchanged;
                return this;
            }

            /**
             * <p>The number of accepted uploads.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder uploadAccepted(Integer uploadAccepted) {
                this.uploadAccepted = uploadAccepted;
                return this;
            }

            /**
             * <p>The number of uploaded items.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder uploaded(Integer uploaded) {
                this.uploaded = uploaded;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContextDatabaseSyncRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncRunsResponseBody</p>
     */
    public static class Runs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempt")
        private Integer attempt;

        @com.aliyun.core.annotation.NameInMap("CancelRequestedAt")
        private String cancelRequestedAt;

        @com.aliyun.core.annotation.NameInMap("DryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("JobConfigVersion")
        private Integer jobConfigVersion;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("LastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("PluginRef")
        private String pluginRef;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("ScheduledAt")
        private String scheduledAt;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private Summary summary;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private String trigger;

        private Runs(Builder builder) {
            this.attempt = builder.attempt;
            this.cancelRequestedAt = builder.cancelRequestedAt;
            this.dryRun = builder.dryRun;
            this.finishedAt = builder.finishedAt;
            this.jobConfigVersion = builder.jobConfigVersion;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.lastError = builder.lastError;
            this.pluginRef = builder.pluginRef;
            this.requestId = builder.requestId;
            this.runId = builder.runId;
            this.scheduledAt = builder.scheduledAt;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.summary = builder.summary;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runs create() {
            return builder().build();
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return cancelRequestedAt
         */
        public String getCancelRequestedAt() {
            return this.cancelRequestedAt;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return jobConfigVersion
         */
        public Integer getJobConfigVersion() {
            return this.jobConfigVersion;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return pluginRef
         */
        public String getPluginRef() {
            return this.pluginRef;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return scheduledAt
         */
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        /**
         * @return trigger
         */
        public String getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private Integer attempt; 
            private String cancelRequestedAt; 
            private Boolean dryRun; 
            private String finishedAt; 
            private Integer jobConfigVersion; 
            private String jobId; 
            private String jobName; 
            private String knowledgeBaseId; 
            private String lastError; 
            private String pluginRef; 
            private String requestId; 
            private String runId; 
            private String scheduledAt; 
            private String startedAt; 
            private String status; 
            private Summary summary; 
            private String trigger; 

            private Builder() {
            } 

            private Builder(Runs model) {
                this.attempt = model.attempt;
                this.cancelRequestedAt = model.cancelRequestedAt;
                this.dryRun = model.dryRun;
                this.finishedAt = model.finishedAt;
                this.jobConfigVersion = model.jobConfigVersion;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.lastError = model.lastError;
                this.pluginRef = model.pluginRef;
                this.requestId = model.requestId;
                this.runId = model.runId;
                this.scheduledAt = model.scheduledAt;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.summary = model.summary;
                this.trigger = model.trigger;
            } 

            /**
             * <p>The number of attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * <p>The time when the cancellation was requested.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder cancelRequestedAt(String cancelRequestedAt) {
                this.cancelRequestedAt = cancelRequestedAt;
                return this;
            }

            /**
             * <p>Specifies whether the run is a dry run.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The configuration version number of the import job.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder jobConfigVersion(Integer jobConfigVersion) {
                this.jobConfigVersion = jobConfigVersion;
                return this;
            }

            /**
             * <p>The job ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the import job.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D team document import</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The ID of the destination knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-as1llqmkol****</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The latest error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Data source authorization has expired</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The plugin reference.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:dingtalk@1.0.0">dingtalk@1.0.0</a></p>
             */
            public Builder pluginRef(String pluginRef) {
                this.pluginRef = pluginRef;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1B2C3D4E-5F6A-4B7C-8D9E-0F1A2B3C4D5E</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The run ID, which is a system-generated UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The scheduled run time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder scheduledAt(String scheduledAt) {
                this.scheduledAt = scheduledAt;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00+08:00</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The run status. Valid values: queued, running, cancelling, succeeded, partial, failed, cancelled, skipped, and dead.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The summary of the run results.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;uploaded&quot;:12,&quot;unchanged&quot;:3,&quot;skipped&quot;:1,&quot;deferred&quot;:0,&quot;failed&quot;:0,&quot;processing&quot;:0}</p>
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The trigger method of the run. Valid values: manual, schedule, and retry.</p>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder trigger(String trigger) {
                this.trigger = trigger;
                return this;
            }

            public Runs build() {
                return new Runs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContextDatabaseSyncRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContextDatabaseSyncRunsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Runs")
        private java.util.List<Runs> runs;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.runs = builder.runs;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return runs
         */
        public java.util.List<Runs> getRuns() {
            return this.runs;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<Runs> runs; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.runs = model.runs;
                this.total = model.total;
            } 

            /**
             * <p>The page number. Pages start from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of runs.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;RunId&quot;:&quot;run-as1llqmkol****&quot;, &quot;JobId&quot;:&quot;job-as1llqmkol****&quot;, &quot;JobName&quot;:&quot;R&amp;D team document import&quot;, &quot;KnowledgeBaseId&quot;:&quot;kb-as1llqmkol****&quot;}]</p>
             */
            public Builder runs(java.util.List<Runs> runs) {
                this.runs = runs;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
