// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectModelFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectModelFeatureResponseBody</p>
 */
public class GetProjectModelFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List < Features> features;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LabelDatasourceId")
    private String labelDatasourceId;

    @com.aliyun.core.annotation.NameInMap("LabelDatasourceTable")
    private String labelDatasourceTable;

    @com.aliyun.core.annotation.NameInMap("LabelEventTime")
    private String labelEventTime;

    @com.aliyun.core.annotation.NameInMap("LabelTableId")
    private String labelTableId;

    @com.aliyun.core.annotation.NameInMap("ModelFeatureId")
    private String modelFeatureId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrainingSetFGTable")
    private String trainingSetFGTable;

    @com.aliyun.core.annotation.NameInMap("TrainingSetTable")
    private String trainingSetTable;

    private GetProjectModelFeatureResponseBody(Builder builder) {
        this.features = builder.features;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labelDatasourceId = builder.labelDatasourceId;
        this.labelDatasourceTable = builder.labelDatasourceTable;
        this.labelEventTime = builder.labelEventTime;
        this.labelTableId = builder.labelTableId;
        this.modelFeatureId = builder.modelFeatureId;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.trainingSetFGTable = builder.trainingSetFGTable;
        this.trainingSetTable = builder.trainingSetTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectModelFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return features
     */
    public java.util.List < Features> getFeatures() {
        return this.features;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return labelDatasourceId
     */
    public String getLabelDatasourceId() {
        return this.labelDatasourceId;
    }

    /**
     * @return labelDatasourceTable
     */
    public String getLabelDatasourceTable() {
        return this.labelDatasourceTable;
    }

    /**
     * @return labelEventTime
     */
    public String getLabelEventTime() {
        return this.labelEventTime;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trainingSetFGTable
     */
    public String getTrainingSetFGTable() {
        return this.trainingSetFGTable;
    }

    /**
     * @return trainingSetTable
     */
    public String getTrainingSetTable() {
        return this.trainingSetTable;
    }

    public static final class Builder {
        private java.util.List < Features> features; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String labelDatasourceId; 
        private String labelDatasourceTable; 
        private String labelEventTime; 
        private String labelTableId; 
        private String modelFeatureId; 
        private String name; 
        private String owner; 
        private String projectId; 
        private String projectName; 
        private String requestId; 
        private String trainingSetFGTable; 
        private String trainingSetTable; 

        /**
         * Features.
         */
        public Builder features(java.util.List < Features> features) {
            this.features = features;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * LabelDatasourceId.
         */
        public Builder labelDatasourceId(String labelDatasourceId) {
            this.labelDatasourceId = labelDatasourceId;
            return this;
        }

        /**
         * LabelDatasourceTable.
         */
        public Builder labelDatasourceTable(String labelDatasourceTable) {
            this.labelDatasourceTable = labelDatasourceTable;
            return this;
        }

        /**
         * LabelEventTime.
         */
        public Builder labelEventTime(String labelEventTime) {
            this.labelEventTime = labelEventTime;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.labelTableId = labelTableId;
            return this;
        }

        /**
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.modelFeatureId = modelFeatureId;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrainingSetFGTable.
         */
        public Builder trainingSetFGTable(String trainingSetFGTable) {
            this.trainingSetFGTable = trainingSetFGTable;
            return this;
        }

        /**
         * TrainingSetTable.
         */
        public Builder trainingSetTable(String trainingSetTable) {
            this.trainingSetTable = trainingSetTable;
            return this;
        }

        public GetProjectModelFeatureResponseBody build() {
            return new GetProjectModelFeatureResponseBody(this);
        } 

    } 

    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("FeatureViewName")
        private String featureViewName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.aliasName = builder.aliasName;
            this.featureViewId = builder.featureViewId;
            this.featureViewName = builder.featureViewName;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return featureViewId
         */
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        /**
         * @return featureViewName
         */
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private String featureViewId; 
            private String featureViewName; 
            private String name; 
            private String type; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * FeatureViewId.
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
                return this;
            }

            /**
             * FeatureViewName.
             */
            public Builder featureViewName(String featureViewName) {
                this.featureViewName = featureViewName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
