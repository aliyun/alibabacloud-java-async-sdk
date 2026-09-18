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
 * {@link DescribeScanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanResponseBody</p>
 */
public class DescribeScanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    private Long codeBundleId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("currentPhase")
    private String currentPhase;

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

    @com.aliyun.core.annotation.NameInMap("securityCredits")
    private Float securityCredits;

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

    private DescribeScanResponseBody(Builder builder) {
        this.codeBundleId = builder.codeBundleId;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.currentPhase = builder.currentPhase;
        this.engineSnapshot = builder.engineSnapshot;
        this.finishedAt = builder.finishedAt;
        this.id = builder.id;
        this.kind = builder.kind;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.scanMetrics = builder.scanMetrics;
        this.scanProgress = builder.scanProgress;
        this.securityCredits = builder.securityCredits;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.taskName = builder.taskName;
        this.updatedAt = builder.updatedAt;
        this.workerId = builder.workerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanResponseBody create() {
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
     * @return currentPhase
     */
    public String getCurrentPhase() {
        return this.currentPhase;
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
     * @return securityCredits
     */
    public Float getSecurityCredits() {
        return this.securityCredits;
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
        private String currentPhase; 
        private EngineSnapshot engineSnapshot; 
        private String finishedAt; 
        private Long id; 
        private String kind; 
        private Long projectId; 
        private String requestId; 
        private ScanMetrics scanMetrics; 
        private Long scanProgress; 
        private Float securityCredits; 
        private String startedAt; 
        private String status; 
        private String taskName; 
        private String updatedAt; 
        private String workerId; 

        private Builder() {
        } 

        private Builder(DescribeScanResponseBody model) {
            this.codeBundleId = model.codeBundleId;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.currentPhase = model.currentPhase;
            this.engineSnapshot = model.engineSnapshot;
            this.finishedAt = model.finishedAt;
            this.id = model.id;
            this.kind = model.kind;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.scanMetrics = model.scanMetrics;
            this.scanProgress = model.scanProgress;
            this.securityCredits = model.securityCredits;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.taskName = model.taskName;
            this.updatedAt = model.updatedAt;
            this.workerId = model.workerId;
        } 

        /**
         * <p>The function code package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
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
         * <p>The scan phase. Valid values:</p>
         * <ul>
         * <li>threat_model: threat modeling.</li>
         * <li>discovery: vulnerability discovery.</li>
         * <li>panel: vulnerability review.</li>
         * <li>adversarial: adversarial verification.</li>
         * <li>finalize: report compilation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discovery</p>
         */
        public Builder currentPhase(String currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }

        /**
         * <p>The supported engine types.</p>
         */
        public Builder engineSnapshot(EngineSnapshot engineSnapshot) {
            this.engineSnapshot = engineSnapshot;
            return this;
        }

        /**
         * <p>The time when the scan finished.</p>
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
         * <p>The scan type. Valid values:</p>
         * <ul>
         * <li>full: full</li>
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
         * <p>1111</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scan results.</p>
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
         * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder securityCredits(Float securityCredits) {
            this.securityCredits = securityCredits;
            return this;
        }

        /**
         * <p>The time when the task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>running: Running.</li>
         * <li>completed: Completed.</li>
         * <li>failed: Failed.</li>
         * <li>canceling: Being canceled.</li>
         * <li>canceled: Canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
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
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder workerId(String workerId) {
            this.workerId = workerId;
            return this;
        }

        public DescribeScanResponseBody build() {
            return new DescribeScanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResponseBody</p>
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
             * <p>Indicates whether Static Application Security Testing (SAST) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * <p>Indicates whether Software Composition Analysis (SCA) is supported.</p>
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
     * {@link DescribeScanResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScanResponseBody</p>
     */
    public static class ScanMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credit")
        private Float credit;

        @com.aliyun.core.annotation.NameInMap("fileCount")
        private Long fileCount;

        @com.aliyun.core.annotation.NameInMap("linesOfCode")
        private Long linesOfCode;

        @com.aliyun.core.annotation.NameInMap("tokenTotal")
        private Long tokenTotal;

        private ScanMetrics(Builder builder) {
            this.credit = builder.credit;
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
         * @return credit
         */
        public Float getCredit() {
            return this.credit;
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
            private Float credit; 
            private Long fileCount; 
            private Long linesOfCode; 
            private Long tokenTotal; 

            private Builder() {
            } 

            private Builder(ScanMetrics model) {
                this.credit = model.credit;
                this.fileCount = model.fileCount;
                this.linesOfCode = model.linesOfCode;
                this.tokenTotal = model.tokenTotal;
            } 

            /**
             * <p>The number of credits consumed by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder credit(Float credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>73894</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The number of lines of code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder linesOfCode(Long linesOfCode) {
                this.linesOfCode = linesOfCode;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is no longer used.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
