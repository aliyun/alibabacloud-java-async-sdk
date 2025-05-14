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
 * {@link UpdateModelFeatureFGFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureFGFeatureRequest</p>
 */
public class UpdateModelFeatureFGFeatureRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("LookupFeatures")
    private java.util.List<LookupFeatures> lookupFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RawFeatures")
    private java.util.List<RawFeatures> rawFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reserves")
    private java.util.List<String> reserves;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SequenceFeatures")
    private java.util.List<SequenceFeatures> sequenceFeatures;

    private UpdateModelFeatureFGFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
        this.regionId = builder.regionId;
        this.lookupFeatures = builder.lookupFeatures;
        this.rawFeatures = builder.rawFeatures;
        this.reserves = builder.reserves;
        this.sequenceFeatures = builder.sequenceFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureFGFeatureRequest create() {
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
     * @return lookupFeatures
     */
    public java.util.List<LookupFeatures> getLookupFeatures() {
        return this.lookupFeatures;
    }

    /**
     * @return rawFeatures
     */
    public java.util.List<RawFeatures> getRawFeatures() {
        return this.rawFeatures;
    }

    /**
     * @return reserves
     */
    public java.util.List<String> getReserves() {
        return this.reserves;
    }

    /**
     * @return sequenceFeatures
     */
    public java.util.List<SequenceFeatures> getSequenceFeatures() {
        return this.sequenceFeatures;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureFGFeatureRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private String regionId; 
        private java.util.List<LookupFeatures> lookupFeatures; 
        private java.util.List<RawFeatures> rawFeatures; 
        private java.util.List<String> reserves; 
        private java.util.List<SequenceFeatures> sequenceFeatures; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureFGFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.regionId = request.regionId;
            this.lookupFeatures = request.lookupFeatures;
            this.rawFeatures = request.rawFeatures;
            this.reserves = request.reserves;
            this.sequenceFeatures = request.sequenceFeatures;
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
         * <p>3</p>
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
         * LookupFeatures.
         */
        public Builder lookupFeatures(java.util.List<LookupFeatures> lookupFeatures) {
            this.putBodyParameter("LookupFeatures", lookupFeatures);
            this.lookupFeatures = lookupFeatures;
            return this;
        }

        /**
         * RawFeatures.
         */
        public Builder rawFeatures(java.util.List<RawFeatures> rawFeatures) {
            this.putBodyParameter("RawFeatures", rawFeatures);
            this.rawFeatures = rawFeatures;
            return this;
        }

        /**
         * Reserves.
         */
        public Builder reserves(java.util.List<String> reserves) {
            this.putBodyParameter("Reserves", reserves);
            this.reserves = reserves;
            return this;
        }

        /**
         * SequenceFeatures.
         */
        public Builder sequenceFeatures(java.util.List<SequenceFeatures> sequenceFeatures) {
            this.putBodyParameter("SequenceFeatures", sequenceFeatures);
            this.sequenceFeatures = sequenceFeatures;
            return this;
        }

        @Override
        public UpdateModelFeatureFGFeatureRequest build() {
            return new UpdateModelFeatureFGFeatureRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelFeatureFGFeatureRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelFeatureFGFeatureRequest</p>
     */
    public static class LookupFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("KeyFeatureDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String keyFeatureDomain;

        @com.aliyun.core.annotation.NameInMap("KeyFeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String keyFeatureName;

        @com.aliyun.core.annotation.NameInMap("MapFeatureDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mapFeatureDomain;

        @com.aliyun.core.annotation.NameInMap("MapFeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mapFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String valueType;

        private LookupFeatures(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.featureName = builder.featureName;
            this.keyFeatureDomain = builder.keyFeatureDomain;
            this.keyFeatureName = builder.keyFeatureName;
            this.mapFeatureDomain = builder.mapFeatureDomain;
            this.mapFeatureName = builder.mapFeatureName;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LookupFeatures create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return keyFeatureDomain
         */
        public String getKeyFeatureDomain() {
            return this.keyFeatureDomain;
        }

        /**
         * @return keyFeatureName
         */
        public String getKeyFeatureName() {
            return this.keyFeatureName;
        }

        /**
         * @return mapFeatureDomain
         */
        public String getMapFeatureDomain() {
            return this.mapFeatureDomain;
        }

        /**
         * @return mapFeatureName
         */
        public String getMapFeatureName() {
            return this.mapFeatureName;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String defaultValue; 
            private String featureName; 
            private String keyFeatureDomain; 
            private String keyFeatureName; 
            private String mapFeatureDomain; 
            private String mapFeatureName; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(LookupFeatures model) {
                this.defaultValue = model.defaultValue;
                this.featureName = model.featureName;
                this.keyFeatureDomain = model.keyFeatureDomain;
                this.keyFeatureName = model.keyFeatureName;
                this.mapFeatureDomain = model.mapFeatureDomain;
                this.mapFeatureName = model.mapFeatureName;
                this.valueType = model.valueType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>-1024</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Item</p>
             */
            public Builder keyFeatureDomain(String keyFeatureDomain) {
                this.keyFeatureDomain = keyFeatureDomain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder keyFeatureName(String keyFeatureName) {
                this.keyFeatureName = keyFeatureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder mapFeatureDomain(String mapFeatureDomain) {
                this.mapFeatureDomain = mapFeatureDomain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder mapFeatureName(String mapFeatureName) {
                this.mapFeatureName = mapFeatureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public LookupFeatures build() {
                return new LookupFeatures(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateModelFeatureFGFeatureRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelFeatureFGFeatureRequest</p>
     */
    public static class RawFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureDomain;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("InputFeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inputFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String valueType;

        private RawFeatures(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.featureDomain = builder.featureDomain;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.inputFeatureName = builder.inputFeatureName;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RawFeatures create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return featureDomain
         */
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return inputFeatureName
         */
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String defaultValue; 
            private String featureDomain; 
            private String featureName; 
            private String featureType; 
            private String inputFeatureName; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(RawFeatures model) {
                this.defaultValue = model.defaultValue;
                this.featureDomain = model.featureDomain;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.inputFeatureName = model.inputFeatureName;
                this.valueType = model.valueType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>-1024</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder featureDomain(String featureDomain) {
                this.featureDomain = featureDomain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>IdFeature</p>
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder inputFeatureName(String inputFeatureName) {
                this.inputFeatureName = inputFeatureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public RawFeatures build() {
                return new RawFeatures(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateModelFeatureFGFeatureRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelFeatureFGFeatureRequest</p>
     */
    public static class SubFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureDomain;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("InputFeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String inputFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String valueType;

        private SubFeatures(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.featureDomain = builder.featureDomain;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.inputFeatureName = builder.inputFeatureName;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubFeatures create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return featureDomain
         */
        public String getFeatureDomain() {
            return this.featureDomain;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return inputFeatureName
         */
        public String getInputFeatureName() {
            return this.inputFeatureName;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String defaultValue; 
            private String featureDomain; 
            private String featureName; 
            private String featureType; 
            private String inputFeatureName; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(SubFeatures model) {
                this.defaultValue = model.defaultValue;
                this.featureDomain = model.featureDomain;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.inputFeatureName = model.inputFeatureName;
                this.valueType = model.valueType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>-1024</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder featureDomain(String featureDomain) {
                this.featureDomain = featureDomain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RawFeature</p>
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder inputFeatureName(String inputFeatureName) {
                this.inputFeatureName = inputFeatureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public SubFeatures build() {
                return new SubFeatures(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateModelFeatureFGFeatureRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelFeatureFGFeatureRequest</p>
     */
    public static class SequenceFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeDelim")
        @com.aliyun.core.annotation.Validation(required = true)
        private String attributeDelim;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("SequenceDelim")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sequenceDelim;

        @com.aliyun.core.annotation.NameInMap("SequenceLength")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long sequenceLength;

        @com.aliyun.core.annotation.NameInMap("SubFeatures")
        private java.util.List<SubFeatures> subFeatures;

        private SequenceFeatures(Builder builder) {
            this.attributeDelim = builder.attributeDelim;
            this.featureName = builder.featureName;
            this.sequenceDelim = builder.sequenceDelim;
            this.sequenceLength = builder.sequenceLength;
            this.subFeatures = builder.subFeatures;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SequenceFeatures create() {
            return builder().build();
        }

        /**
         * @return attributeDelim
         */
        public String getAttributeDelim() {
            return this.attributeDelim;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return sequenceDelim
         */
        public String getSequenceDelim() {
            return this.sequenceDelim;
        }

        /**
         * @return sequenceLength
         */
        public Long getSequenceLength() {
            return this.sequenceLength;
        }

        /**
         * @return subFeatures
         */
        public java.util.List<SubFeatures> getSubFeatures() {
            return this.subFeatures;
        }

        public static final class Builder {
            private String attributeDelim; 
            private String featureName; 
            private String sequenceDelim; 
            private Long sequenceLength; 
            private java.util.List<SubFeatures> subFeatures; 

            private Builder() {
            } 

            private Builder(SequenceFeatures model) {
                this.attributeDelim = model.attributeDelim;
                this.featureName = model.featureName;
                this.sequenceDelim = model.sequenceDelim;
                this.sequenceLength = model.sequenceLength;
                this.subFeatures = model.subFeatures;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <h1></h1>
             */
            public Builder attributeDelim(String attributeDelim) {
                this.attributeDelim = attributeDelim;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>item_id</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>;</p>
             */
            public Builder sequenceDelim(String sequenceDelim) {
                this.sequenceDelim = sequenceDelim;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder sequenceLength(Long sequenceLength) {
                this.sequenceLength = sequenceLength;
                return this;
            }

            /**
             * SubFeatures.
             */
            public Builder subFeatures(java.util.List<SubFeatures> subFeatures) {
                this.subFeatures = subFeatures;
                return this;
            }

            public SequenceFeatures build() {
                return new SequenceFeatures(this);
            } 

        } 

    }
}
