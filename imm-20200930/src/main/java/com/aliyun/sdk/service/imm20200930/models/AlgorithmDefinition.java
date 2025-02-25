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

        /**
         * AlgorithmDefinitionId.
         */
        public Builder algorithmDefinitionId(String algorithmDefinitionId) {
            this.algorithmDefinitionId = algorithmDefinitionId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.List<java.util.Map<String, String>> customLabels) {
            this.customLabels = customLabels;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
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
         * TrainingSpecification.
         */
        public Builder trainingSpecification(TrainingSpecification trainingSpecification) {
            this.trainingSpecification = trainingSpecification;
            return this;
        }

        /**
         * UpdateTime.
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
