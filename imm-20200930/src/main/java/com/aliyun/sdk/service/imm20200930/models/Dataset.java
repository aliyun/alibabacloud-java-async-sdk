// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Dataset} extends {@link TeaModel}
 *
 * <p>Dataset</p>
 */
public class Dataset extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindCount")
    private Long bindCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetMaxBindCount")
    private Long datasetMaxBindCount;

    @com.aliyun.core.annotation.NameInMap("DatasetMaxEntityCount")
    private Long datasetMaxEntityCount;

    @com.aliyun.core.annotation.NameInMap("DatasetMaxFileCount")
    private Long datasetMaxFileCount;

    @com.aliyun.core.annotation.NameInMap("DatasetMaxRelationCount")
    private Long datasetMaxRelationCount;

    @com.aliyun.core.annotation.NameInMap("DatasetMaxTotalFileSize")
    private Long datasetMaxTotalFileSize;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FileCount")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TotalFileSize")
    private Long totalFileSize;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("WorkflowParameters")
    @Deprecated
    private java.util.List<WorkflowParameter> workflowParameters;

    private Dataset(Builder builder) {
        this.bindCount = builder.bindCount;
        this.createTime = builder.createTime;
        this.datasetMaxBindCount = builder.datasetMaxBindCount;
        this.datasetMaxEntityCount = builder.datasetMaxEntityCount;
        this.datasetMaxFileCount = builder.datasetMaxFileCount;
        this.datasetMaxRelationCount = builder.datasetMaxRelationCount;
        this.datasetMaxTotalFileSize = builder.datasetMaxTotalFileSize;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.fileCount = builder.fileCount;
        this.projectName = builder.projectName;
        this.templateId = builder.templateId;
        this.totalFileSize = builder.totalFileSize;
        this.updateTime = builder.updateTime;
        this.workflowParameters = builder.workflowParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dataset create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindCount
     */
    public Long getBindCount() {
        return this.bindCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetMaxBindCount
     */
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    /**
     * @return datasetMaxEntityCount
     */
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    /**
     * @return datasetMaxFileCount
     */
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    /**
     * @return datasetMaxRelationCount
     */
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    /**
     * @return datasetMaxTotalFileSize
     */
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileCount
     */
    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return totalFileSize
     */
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workflowParameters
     */
    public java.util.List<WorkflowParameter> getWorkflowParameters() {
        return this.workflowParameters;
    }

    public static final class Builder {
        private Long bindCount; 
        private String createTime; 
        private Long datasetMaxBindCount; 
        private Long datasetMaxEntityCount; 
        private Long datasetMaxFileCount; 
        private Long datasetMaxRelationCount; 
        private Long datasetMaxTotalFileSize; 
        private String datasetName; 
        private String description; 
        private Long fileCount; 
        private String projectName; 
        private String templateId; 
        private Long totalFileSize; 
        private String updateTime; 
        private java.util.List<WorkflowParameter> workflowParameters; 

        private Builder() {
        } 

        private Builder(Dataset model) {
            this.bindCount = model.bindCount;
            this.createTime = model.createTime;
            this.datasetMaxBindCount = model.datasetMaxBindCount;
            this.datasetMaxEntityCount = model.datasetMaxEntityCount;
            this.datasetMaxFileCount = model.datasetMaxFileCount;
            this.datasetMaxRelationCount = model.datasetMaxRelationCount;
            this.datasetMaxTotalFileSize = model.datasetMaxTotalFileSize;
            this.datasetName = model.datasetName;
            this.description = model.description;
            this.fileCount = model.fileCount;
            this.projectName = model.projectName;
            this.templateId = model.templateId;
            this.totalFileSize = model.totalFileSize;
            this.updateTime = model.updateTime;
            this.workflowParameters = model.workflowParameters;
        } 

        /**
         * <p>The number of OSS buckets currently bound to the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * <p>The timestamp when the dataset was created, in RFC3339Nano format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The maximum number of bindings allowed for each dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder datasetMaxBindCount(Long datasetMaxBindCount) {
            this.datasetMaxBindCount = datasetMaxBindCount;
            return this;
        }

        /**
         * <p>The maximum number of metadata entities allowed in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000000</p>
         */
        public Builder datasetMaxEntityCount(Long datasetMaxEntityCount) {
            this.datasetMaxEntityCount = datasetMaxEntityCount;
            return this;
        }

        /**
         * <p>The maximum number of files allowed in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000</p>
         */
        public Builder datasetMaxFileCount(Long datasetMaxFileCount) {
            this.datasetMaxFileCount = datasetMaxFileCount;
            return this;
        }

        /**
         * <p>The maximum number of metadata relationships allowed in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000000</p>
         */
        public Builder datasetMaxRelationCount(Long datasetMaxRelationCount) {
            this.datasetMaxRelationCount = datasetMaxRelationCount;
            return this;
        }

        /**
         * <p>The maximum total file size allowed in the dataset, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>90000000000000000</p>
         */
        public Builder datasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
            this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset001</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据集</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The current number of files in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The workflow template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultId</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The total file size in the dataset, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * <p>The timestamp when the dataset was last modified, in RFC3339Nano format.</p>
         * <blockquote>
         * <p>If the dataset has not been updated since it was created, this timestamp is the same as the creation timestamp.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-06-29T14:50:13.011643661+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The custom parameters.</p>
         */
        public Builder workflowParameters(java.util.List<WorkflowParameter> workflowParameters) {
            this.workflowParameters = workflowParameters;
            return this;
        }

        public Dataset build() {
            return new Dataset(this);
        } 

    } 

}
