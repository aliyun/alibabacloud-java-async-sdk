// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelFeatureRequest} extends {@link RequestModel}
 *
 * <p>CreateModelFeatureRequest</p>
 */
public class CreateModelFeatureRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Features")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Features> features;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelTableId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SequenceFeatureViewIds")
    private java.util.List < String > sequenceFeatureViewIds;

    private CreateModelFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.features = builder.features;
        this.labelTableId = builder.labelTableId;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.sequenceFeatureViewIds = builder.sequenceFeatureViewIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelFeatureRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return features
     */
    public java.util.List < Features> getFeatures() {
        return this.features;
    }

    /**
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sequenceFeatureViewIds
     */
    public java.util.List < String > getSequenceFeatureViewIds() {
        return this.sequenceFeatureViewIds;
    }

    public static final class Builder extends Request.Builder<CreateModelFeatureRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List < Features> features; 
        private String labelTableId; 
        private String name; 
        private String projectId; 
        private java.util.List < String > sequenceFeatureViewIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.features = request.features;
            this.labelTableId = request.labelTableId;
            this.name = request.name;
            this.projectId = request.projectId;
            this.sequenceFeatureViewIds = request.sequenceFeatureViewIds;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public Builder features(java.util.List < Features> features) {
            this.putBodyParameter("Features", features);
            this.features = features;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SequenceFeatureViewIds.
         */
        public Builder sequenceFeatureViewIds(java.util.List < String > sequenceFeatureViewIds) {
            this.putBodyParameter("SequenceFeatureViewIds", sequenceFeatureViewIds);
            this.sequenceFeatureViewIds = sequenceFeatureViewIds;
            return this;
        }

        @Override
        public CreateModelFeatureRequest build() {
            return new CreateModelFeatureRequest(this);
        } 

    } 

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
