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
         * codeBundleId.
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * engineSnapshot.
         */
        public Builder engineSnapshot(EngineSnapshot engineSnapshot) {
            this.engineSnapshot = engineSnapshot;
            return this;
        }

        /**
         * finishedAt.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scanMetrics.
         */
        public Builder scanMetrics(ScanMetrics scanMetrics) {
            this.scanMetrics = scanMetrics;
            return this;
        }

        /**
         * scanProgress.
         */
        public Builder scanProgress(Long scanProgress) {
            this.scanProgress = scanProgress;
            return this;
        }

        /**
         * startedAt.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * workerId.
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
             * sast.
             */
            public Builder sast(Boolean sast) {
                this.sast = sast;
                return this;
            }

            /**
             * sca.
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
             * fileCount.
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * linesOfCode.
             */
            public Builder linesOfCode(Long linesOfCode) {
                this.linesOfCode = linesOfCode;
                return this;
            }

            /**
             * tokenTotal.
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
