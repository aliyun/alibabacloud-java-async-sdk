// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link UpdateModelFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureRequest</p>
 */
public class UpdateModelFeatureRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelFeatureId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelFeatureId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<Features> features;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelPriorityLevel")
    private Long labelPriorityLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelTableId")
    private String labelTableId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SequenceFeatureViewIds")
    private java.util.List<String> sequenceFeatureViewIds;

    private UpdateModelFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.features = builder.features;
        this.labelPriorityLevel = builder.labelPriorityLevel;
        this.labelTableId = builder.labelTableId;
        this.sequenceFeatureViewIds = builder.sequenceFeatureViewIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return features
     */
    public java.util.List<Features> getFeatures() {
        return this.features;
    }

    /**
     * @return labelPriorityLevel
     */
    public Long getLabelPriorityLevel() {
        return this.labelPriorityLevel;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return sequenceFeatureViewIds
     */
    public java.util.List<String> getSequenceFeatureViewIds() {
        return this.sequenceFeatureViewIds;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private java.util.List<Features> features; 
        private Long labelPriorityLevel; 
        private String labelTableId; 
        private java.util.List<String> sequenceFeatureViewIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.features = request.features;
            this.labelPriorityLevel = request.labelPriorityLevel;
            this.labelTableId = request.labelTableId;
            this.sequenceFeatureViewIds = request.sequenceFeatureViewIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(java.util.List<Features> features) {
            this.putBodyParameter("Features", features);
            this.features = features;
            return this;
        }

        /**
         * LabelPriorityLevel.
         */
        public Builder labelPriorityLevel(Long labelPriorityLevel) {
            this.putBodyParameter("LabelPriorityLevel", labelPriorityLevel);
            this.labelPriorityLevel = labelPriorityLevel;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.putBodyParameter("LabelTableId", labelTableId);
            this.labelTableId = labelTableId;
            return this;
        }

        /**
         * SequenceFeatureViewIds.
         */
        public Builder sequenceFeatureViewIds(java.util.List<String> sequenceFeatureViewIds) {
            this.putBodyParameter("SequenceFeatureViewIds", sequenceFeatureViewIds);
            this.sequenceFeatureViewIds = sequenceFeatureViewIds;
            return this;
        }

        @Override
        public UpdateModelFeatureRequest build() {
            return new UpdateModelFeatureRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelFeatureRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelFeatureRequest</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("FeatureViewId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureViewId;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Features(Builder builder) {
            this.aliasName = builder.aliasName;
            this.featureViewId = builder.featureViewId;
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.aliasName = model.aliasName;
                this.featureViewId = model.featureViewId;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder featureViewId(String featureViewId) {
                this.featureViewId = featureViewId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>gender</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
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
