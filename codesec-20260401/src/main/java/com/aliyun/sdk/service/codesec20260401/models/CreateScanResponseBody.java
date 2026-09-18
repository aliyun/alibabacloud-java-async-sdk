// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateScanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScanResponseBody</p>
 */
public class CreateScanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    private Long codeBundleId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("engineSnapshot")
    private EngineSnapshot engineSnapshot;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scanMetrics")
    private ScanMetrics scanMetrics;

    @com.aliyun.core.annotation.NameInMap("scanProgress")
    private Long scanProgress;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("workerId")
    private String workerId;

    private CreateScanResponseBody(Builder builder) {
        this.codeBundleId = builder.codeBundleId;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.engineSnapshot = builder.engineSnapshot;
        this.finishedAt = builder.finishedAt;
        this.id = builder.id;
        this.kind = builder.kind;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.scanMetrics = builder.scanMetrics;
        this.scanProgress = builder.scanProgress;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.taskName = builder.taskName;
        this.updatedAt = builder.updatedAt;
        this.workerId = builder.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeBundleId
     */
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return engineSnapshot
     */
    public EngineSnapshot getEngineSnapshot() {
        return this.engineSnapshot;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanMetrics
     */
    public ScanMetrics getScanMetrics() {
        return this.scanMetrics;
    }

    /**
     * @return scanProgress
     */
    public Long getScanProgress() {
        return this.scanProgress;
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
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return workerId
     */
    public String getWorkerId() {
        return this.workerId;
    }

    public static final class Builder {
        private Long codeBundleId; 
        private String createdAt; 
        private String createdBy; 
        private EngineSnapshot engineSnapshot; 
        private String finishedAt; 
        private Long id; 
        private String kind; 
        private Long projectId; 
        private String requestId; 
        private ScanMetrics scanMetrics; 
        private Long scanProgress; 
        private String startedAt; 
        private String status; 
        private String taskName; 
        private String updatedAt; 
        private String workerId; 

        private Builder() {
        } 

        private Builder(CreateScanResponseBody model) {
            this.codeBundleId = model.codeBundleId;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.engineSnapshot = model.engineSnapshot;
            this.finishedAt = model.finishedAt;
            this.id = model.id;
            this.kind = model.kind;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.scanMetrics = model.scanMetrics;
            this.scanProgress = model.scanProgress;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.taskName = model.taskName;
            this.updatedAt = model.updatedAt;
            this.workerId = model.workerId;
        } 

        /**
         * <p>The code package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The user ID of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>3221</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The supported types.</p>
         */
        public Builder engineSnapshot(EngineSnapshot engineSnapshot) {
            this.engineSnapshot = engineSnapshot;
            return this;
        }

        /**
         * <p>The scan end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li>full: full data</li>
         * <li>incremental: incremental</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scan information.</p>
         */
        public Builder scanMetrics(ScanMetrics scanMetrics) {
            this.scanMetrics = scanMetrics;
            return this;
        }

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder scanProgress(Long scanProgress) {
            this.scanProgress = scanProgress;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>completed: Completed.</li>
         * <li>failed: Failed.</li>
         * <li>canceling: Being canceled.</li>
         * <li>canceled: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workerId(String workerId) {
            this.workerId = workerId;
            return this;
        }

        public CreateScanResponseBody build() {
            return new CreateScanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateScanResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScanResponseBody</p>
     */
    public static class EngineSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sast")
        private Boolean sast;

        @com.aliyun.core.annotation.NameInMap("sca")
        private Boolean sca;

        private EngineSnapshot(Builder builder) {
            this.sast = builder.sast;
            this.sca = builder.sca;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineSnapshot create() {
            return builder().build();
        }

        /**
         * @return sast
         */
        public Boolean getSast() {
            return this.sast;
        }

        /**
         * @return sca
         */
        public Boolean getSca() {
            return this.sca;
        }

        public static final class Builder {
            private Boolean sast; 
            private Boolean sca; 

            private Builder() {
            } 

            private Builder(EngineSnapshot model) {
                this.sast = model.sast;
                this.sca = model.sca;
            } 

            /**
             * <p>Indicates whether SAST is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * <p>Indicates whether SCA is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sca(Boolean sca) {
                this.sca = sca;
                return this;
            }

            public EngineSnapshot build() {
                return new EngineSnapshot(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateScanResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScanResponseBody</p>
     */
    public static class ScanMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileCount")
        private Long fileCount;

        @com.aliyun.core.annotation.NameInMap("linesOfCode")
        private Long linesOfCode;

        @com.aliyun.core.annotation.NameInMap("tokenTotal")
        private Long tokenTotal;

        private ScanMetrics(Builder builder) {
            this.fileCount = builder.fileCount;
            this.linesOfCode = builder.linesOfCode;
            this.tokenTotal = builder.tokenTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanMetrics create() {
            return builder().build();
        }

        /**
         * @return fileCount
         */
        public Long getFileCount() {
            return this.fileCount;
        }

        /**
         * @return linesOfCode
         */
        public Long getLinesOfCode() {
            return this.linesOfCode;
        }

        /**
         * @return tokenTotal
         */
        public Long getTokenTotal() {
            return this.tokenTotal;
        }

        public static final class Builder {
            private Long fileCount; 
            private Long linesOfCode; 
            private Long tokenTotal; 

            private Builder() {
            } 

            private Builder(ScanMetrics model) {
                this.fileCount = model.fileCount;
                this.linesOfCode = model.linesOfCode;
                this.tokenTotal = model.tokenTotal;
            } 

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The number of lines of code.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder linesOfCode(Long linesOfCode) {
                this.linesOfCode = linesOfCode;
                return this;
            }

            /**
             * <p>Deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder tokenTotal(Long tokenTotal) {
                this.tokenTotal = tokenTotal;
                return this;
            }

            public ScanMetrics build() {
                return new ScanMetrics(this);
            } 

        } 

    }
}
