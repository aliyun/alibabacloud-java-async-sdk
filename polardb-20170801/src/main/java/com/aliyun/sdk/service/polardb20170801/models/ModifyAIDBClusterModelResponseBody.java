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
 * {@link ModifyAIDBClusterModelResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAIDBClusterModelResponseBody</p>
 */
public class ModifyAIDBClusterModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetModelName")
    private String targetModelName;

    @com.aliyun.core.annotation.NameInMap("TargetOssPath")
    private String targetOssPath;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    @com.aliyun.core.annotation.NameInMap("TotalBatches")
    private Long totalBatches;

    @com.aliyun.core.annotation.NameInMap("TotalMsds")
    private Long totalMsds;

    @com.aliyun.core.annotation.NameInMap("Warnings")
    private java.util.List<String> warnings;

    private ModifyAIDBClusterModelResponseBody(Builder builder) {
        this.dryRun = builder.dryRun;
        this.modelType = builder.modelType;
        this.requestId = builder.requestId;
        this.targetModelName = builder.targetModelName;
        this.targetOssPath = builder.targetOssPath;
        this.taskId = builder.taskId;
        this.totalBatches = builder.totalBatches;
        this.totalMsds = builder.totalMsds;
        this.warnings = builder.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAIDBClusterModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetModelName
     */
    public String getTargetModelName() {
        return this.targetModelName;
    }

    /**
     * @return targetOssPath
     */
    public String getTargetOssPath() {
        return this.targetOssPath;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    /**
     * @return totalBatches
     */
    public Long getTotalBatches() {
        return this.totalBatches;
    }

    /**
     * @return totalMsds
     */
    public Long getTotalMsds() {
        return this.totalMsds;
    }

    /**
     * @return warnings
     */
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }

    public static final class Builder {
        private Boolean dryRun; 
        private String modelType; 
        private String requestId; 
        private String targetModelName; 
        private String targetOssPath; 
        private Integer taskId; 
        private Long totalBatches; 
        private Long totalMsds; 
        private java.util.List<String> warnings; 

        private Builder() {
        } 

        private Builder(ModifyAIDBClusterModelResponseBody model) {
            this.dryRun = model.dryRun;
            this.modelType = model.modelType;
            this.requestId = model.requestId;
            this.targetModelName = model.targetModelName;
            this.targetOssPath = model.targetOssPath;
            this.taskId = model.taskId;
            this.totalBatches = model.totalBatches;
            this.totalMsds = model.totalMsds;
            this.warnings = model.warnings;
        } 

        /**
         * <p>Indicates whether the request is a dry-run request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The model type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resolved target model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        public Builder targetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }

        /**
         * <p>The resolved target OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>/my-model-bucket/models/qwen3</p>
         */
        public Builder targetOssPath(String targetOssPath) {
            this.targetOssPath = targetOssPath;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task. This parameter is empty when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The number of change batches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalBatches(Long totalBatches) {
            this.totalBatches = totalBatches;
            return this;
        }

        /**
         * <p>The number of affected model serving instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalMsds(Long totalMsds) {
            this.totalMsds = totalMsds;
            return this;
        }

        /**
         * <p>The change warnings returned by the upstream. The caller must display these warnings.</p>
         */
        public Builder warnings(java.util.List<String> warnings) {
            this.warnings = warnings;
            return this;
        }

        public ModifyAIDBClusterModelResponseBody build() {
            return new ModifyAIDBClusterModelResponseBody(this);
        } 

    } 

}
