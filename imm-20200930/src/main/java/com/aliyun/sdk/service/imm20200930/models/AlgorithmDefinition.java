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
 * {@link AlgorithmDefinition} extends {@link TeaModel}
 *
 * <p>AlgorithmDefinition</p>
 */
public class AlgorithmDefinition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmDefinitionId")
    private String algorithmDefinitionId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.List<java.util.Map<String, String>> customLabels;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("TrainingSpecification")
    private TrainingSpecification trainingSpecification;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private AlgorithmDefinition(Builder builder) {
        this.algorithmDefinitionId = builder.algorithmDefinitionId;
        this.createTime = builder.createTime;
        this.customLabels = builder.customLabels;
        this.description = builder.description;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.trainingSpecification = builder.trainingSpecification;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlgorithmDefinition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmDefinitionId
     */
    public String getAlgorithmDefinitionId() {
        return this.algorithmDefinitionId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customLabels
     */
    public java.util.List<java.util.Map<String, String>> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return trainingSpecification
     */
    public TrainingSpecification getTrainingSpecification() {
        return this.trainingSpecification;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String algorithmDefinitionId; 
        private String createTime; 
        private java.util.List<java.util.Map<String, String>> customLabels; 
        private String description; 
        private String name; 
        private String ownerId; 
        private String projectName; 
        private TrainingSpecification trainingSpecification; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(AlgorithmDefinition model) {
            this.algorithmDefinitionId = model.algorithmDefinitionId;
            this.createTime = model.createTime;
            this.customLabels = model.customLabels;
            this.description = model.description;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.projectName = model.projectName;
            this.trainingSpecification = model.trainingSpecification;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The ID of the algorithm definition.</p>
         * 
         * <strong>example:</strong>
         * <p>8fc6e718-8d19-495f-a510-bcee3c598588</p>
         */
        public Builder algorithmDefinitionId(String algorithmDefinitionId) {
            this.algorithmDefinitionId = algorithmDefinitionId;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-31T10:19:40.572325888+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Custom labels.</p>
         */
        public Builder customLabels(java.util.List<java.util.Map<String, String>> customLabels) {
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>algoName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>traningtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The model training parameters.</p>
         */
        public Builder trainingSpecification(TrainingSpecification trainingSpecification) {
            this.trainingSpecification = trainingSpecification;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-31T10:19:40.572325888+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public AlgorithmDefinition build() {
            return new AlgorithmDefinition(this);
        } 

    } 

}
