// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Project} extends {@link TeaModel}
 *
 * <p>Project</p>
 */
public class Project extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetCount")
    private Long datasetCount;

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

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineConcurrency")
    private Long engineConcurrency;

    @com.aliyun.core.annotation.NameInMap("FileCount")
    private Long fileCount;

    @com.aliyun.core.annotation.NameInMap("ProjectMaxDatasetCount")
    private Long projectMaxDatasetCount;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("ProjectQueriesPerSecond")
    private Long projectQueriesPerSecond;

    @com.aliyun.core.annotation.NameInMap("ServiceRole")
    private String serviceRole;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TotalFileSize")
    private Long totalFileSize;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private Project(Builder builder) {
        this.createTime = builder.createTime;
        this.datasetCount = builder.datasetCount;
        this.datasetMaxBindCount = builder.datasetMaxBindCount;
        this.datasetMaxEntityCount = builder.datasetMaxEntityCount;
        this.datasetMaxFileCount = builder.datasetMaxFileCount;
        this.datasetMaxRelationCount = builder.datasetMaxRelationCount;
        this.datasetMaxTotalFileSize = builder.datasetMaxTotalFileSize;
        this.description = builder.description;
        this.engineConcurrency = builder.engineConcurrency;
        this.fileCount = builder.fileCount;
        this.projectMaxDatasetCount = builder.projectMaxDatasetCount;
        this.projectName = builder.projectName;
        this.projectQueriesPerSecond = builder.projectQueriesPerSecond;
        this.serviceRole = builder.serviceRole;
        this.tags = builder.tags;
        this.templateId = builder.templateId;
        this.totalFileSize = builder.totalFileSize;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Project create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetCount
     */
    public Long getDatasetCount() {
        return this.datasetCount;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engineConcurrency
     */
    public Long getEngineConcurrency() {
        return this.engineConcurrency;
    }

    /**
     * @return fileCount
     */
    public Long getFileCount() {
        return this.fileCount;
    }

    /**
     * @return projectMaxDatasetCount
     */
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectQueriesPerSecond
     */
    public Long getProjectQueriesPerSecond() {
        return this.projectQueriesPerSecond;
    }

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
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

    public static final class Builder {
        private String createTime; 
        private Long datasetCount; 
        private Long datasetMaxBindCount; 
        private Long datasetMaxEntityCount; 
        private Long datasetMaxFileCount; 
        private Long datasetMaxRelationCount; 
        private Long datasetMaxTotalFileSize; 
        private String description; 
        private Long engineConcurrency; 
        private Long fileCount; 
        private Long projectMaxDatasetCount; 
        private String projectName; 
        private Long projectQueriesPerSecond; 
        private String serviceRole; 
        private java.util.List < Tags> tags; 
        private String templateId; 
        private Long totalFileSize; 
        private String updateTime; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatasetCount.
         */
        public Builder datasetCount(Long datasetCount) {
            this.datasetCount = datasetCount;
            return this;
        }

        /**
         * DatasetMaxBindCount.
         */
        public Builder datasetMaxBindCount(Long datasetMaxBindCount) {
            this.datasetMaxBindCount = datasetMaxBindCount;
            return this;
        }

        /**
         * DatasetMaxEntityCount.
         */
        public Builder datasetMaxEntityCount(Long datasetMaxEntityCount) {
            this.datasetMaxEntityCount = datasetMaxEntityCount;
            return this;
        }

        /**
         * DatasetMaxFileCount.
         */
        public Builder datasetMaxFileCount(Long datasetMaxFileCount) {
            this.datasetMaxFileCount = datasetMaxFileCount;
            return this;
        }

        /**
         * DatasetMaxRelationCount.
         */
        public Builder datasetMaxRelationCount(Long datasetMaxRelationCount) {
            this.datasetMaxRelationCount = datasetMaxRelationCount;
            return this;
        }

        /**
         * DatasetMaxTotalFileSize.
         */
        public Builder datasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
            this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EngineConcurrency.
         */
        public Builder engineConcurrency(Long engineConcurrency) {
            this.engineConcurrency = engineConcurrency;
            return this;
        }

        /**
         * FileCount.
         */
        public Builder fileCount(Long fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * ProjectMaxDatasetCount.
         */
        public Builder projectMaxDatasetCount(Long projectMaxDatasetCount) {
            this.projectMaxDatasetCount = projectMaxDatasetCount;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * ProjectQueriesPerSecond.
         */
        public Builder projectQueriesPerSecond(Long projectQueriesPerSecond) {
            this.projectQueriesPerSecond = projectQueriesPerSecond;
            return this;
        }

        /**
         * ServiceRole.
         */
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TotalFileSize.
         */
        public Builder totalFileSize(Long totalFileSize) {
            this.totalFileSize = totalFileSize;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Project build() {
            return new Project(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
