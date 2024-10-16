// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListModelFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelFeaturesResponseBody</p>
 */
public class ListModelFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelFeatures")
    private java.util.List < ModelFeatures> modelFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListModelFeaturesResponseBody(Builder builder) {
        this.modelFeatures = builder.modelFeatures;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelFeatures
     */
    public java.util.List < ModelFeatures> getModelFeatures() {
        return this.modelFeatures;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ModelFeatures> modelFeatures; 
        private String requestId; 
        private Long totalCount; 

        /**
         * ModelFeatures.
         */
        public Builder modelFeatures(java.util.List < ModelFeatures> modelFeatures) {
            this.modelFeatures = modelFeatures;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelFeaturesResponseBody build() {
            return new ListModelFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelFeaturesResponseBody</p>
     */
    public static class ModelFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("LabelTableName")
        private String labelTableName;

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

        private ModelFeatures(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.labelTableName = builder.labelTableName;
            this.modelFeatureId = builder.modelFeatureId;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelFeatures create() {
            return builder().build();
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
         * @return labelTableName
         */
        public String getLabelTableName() {
            return this.labelTableName;
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

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String labelTableName; 
            private String modelFeatureId; 
            private String name; 
            private String owner; 
            private String projectId; 
            private String projectName; 

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
             * LabelTableName.
             */
            public Builder labelTableName(String labelTableName) {
                this.labelTableName = labelTableName;
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

            public ModelFeatures build() {
                return new ModelFeatures(this);
            } 

        } 

    }
}
