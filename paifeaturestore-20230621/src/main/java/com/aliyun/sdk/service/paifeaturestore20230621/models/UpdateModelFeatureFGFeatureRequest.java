// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelFeatureFGFeatureRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelFeatureFGFeatureRequest</p>
 */
public class UpdateModelFeatureFGFeatureRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ModelFeatureId")
    @Validation(required = true)
    private String modelFeatureId;

    @Body
    @NameInMap("LookupFeatures")
    private java.util.List < LookupFeatures> lookupFeatures;

    @Body
    @NameInMap("RawFeatures")
    private java.util.List < RawFeatures> rawFeatures;

    @Body
    @NameInMap("Reserves")
    @Validation(required = true)
    private java.util.List < String > reserves;

    @Body
    @NameInMap("SequenceFeatures")
    private java.util.List < SequenceFeatures> sequenceFeatures;

    private UpdateModelFeatureFGFeatureRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modelFeatureId = builder.modelFeatureId;
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
     * @return lookupFeatures
     */
    public java.util.List < LookupFeatures> getLookupFeatures() {
        return this.lookupFeatures;
    }

    /**
     * @return rawFeatures
     */
    public java.util.List < RawFeatures> getRawFeatures() {
        return this.rawFeatures;
    }

    /**
     * @return reserves
     */
    public java.util.List < String > getReserves() {
        return this.reserves;
    }

    /**
     * @return sequenceFeatures
     */
    public java.util.List < SequenceFeatures> getSequenceFeatures() {
        return this.sequenceFeatures;
    }

    public static final class Builder extends Request.Builder<UpdateModelFeatureFGFeatureRequest, Builder> {
        private String instanceId; 
        private String modelFeatureId; 
        private java.util.List < LookupFeatures> lookupFeatures; 
        private java.util.List < RawFeatures> rawFeatures; 
        private java.util.List < String > reserves; 
        private java.util.List < SequenceFeatures> sequenceFeatures; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelFeatureFGFeatureRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modelFeatureId = request.modelFeatureId;
            this.lookupFeatures = request.lookupFeatures;
            this.rawFeatures = request.rawFeatures;
            this.reserves = request.reserves;
            this.sequenceFeatures = request.sequenceFeatures;
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
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.putPathParameter("ModelFeatureId", modelFeatureId);
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        /**
         * LookupFeatures.
         */
        public Builder lookupFeatures(java.util.List < LookupFeatures> lookupFeatures) {
            this.putBodyParameter("LookupFeatures", lookupFeatures);
            this.lookupFeatures = lookupFeatures;
            return this;
        }

        /**
         * RawFeatures.
         */
        public Builder rawFeatures(java.util.List < RawFeatures> rawFeatures) {
            this.putBodyParameter("RawFeatures", rawFeatures);
            this.rawFeatures = rawFeatures;
            return this;
        }

        /**
         * Reserves.
         */
        public Builder reserves(java.util.List < String > reserves) {
            this.putBodyParameter("Reserves", reserves);
            this.reserves = reserves;
            return this;
        }

        /**
         * SequenceFeatures.
         */
        public Builder sequenceFeatures(java.util.List < SequenceFeatures> sequenceFeatures) {
            this.putBodyParameter("SequenceFeatures", sequenceFeatures);
            this.sequenceFeatures = sequenceFeatures;
            return this;
        }

        @Override
        public UpdateModelFeatureFGFeatureRequest build() {
            return new UpdateModelFeatureFGFeatureRequest(this);
        } 

    } 

    public static class LookupFeatures extends TeaModel {
        @NameInMap("DefaultValue")
        @Validation(required = true)
        private String defaultValue;

        @NameInMap("FeatureName")
        @Validation(required = true)
        private String featureName;

        @NameInMap("KeyFeatureDomain")
        @Validation(required = true)
        private String keyFeatureDomain;

        @NameInMap("KeyFeatureName")
        @Validation(required = true)
        private String keyFeatureName;

        @NameInMap("MapFeatureDomain")
        @Validation(required = true)
        private String mapFeatureDomain;

        @NameInMap("MapFeatureName")
        @Validation(required = true)
        private String mapFeatureName;

        @NameInMap("ValueType")
        @Validation(required = true)
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

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * KeyFeatureDomain.
             */
            public Builder keyFeatureDomain(String keyFeatureDomain) {
                this.keyFeatureDomain = keyFeatureDomain;
                return this;
            }

            /**
             * KeyFeatureName.
             */
            public Builder keyFeatureName(String keyFeatureName) {
                this.keyFeatureName = keyFeatureName;
                return this;
            }

            /**
             * MapFeatureDomain.
             */
            public Builder mapFeatureDomain(String mapFeatureDomain) {
                this.mapFeatureDomain = mapFeatureDomain;
                return this;
            }

            /**
             * MapFeatureName.
             */
            public Builder mapFeatureName(String mapFeatureName) {
                this.mapFeatureName = mapFeatureName;
                return this;
            }

            /**
             * ValueType.
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
    public static class RawFeatures extends TeaModel {
        @NameInMap("DefaultValue")
        @Validation(required = true)
        private String defaultValue;

        @NameInMap("FeatureDomain")
        @Validation(required = true)
        private String featureDomain;

        @NameInMap("FeatureName")
        @Validation(required = true)
        private String featureName;

        @NameInMap("FeatureType")
        @Validation(required = true)
        private String featureType;

        @NameInMap("InputFeatureName")
        @Validation(required = true)
        private String inputFeatureName;

        @NameInMap("ValueType")
        @Validation(required = true)
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

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * FeatureDomain.
             */
            public Builder featureDomain(String featureDomain) {
                this.featureDomain = featureDomain;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureType.
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * InputFeatureName.
             */
            public Builder inputFeatureName(String inputFeatureName) {
                this.inputFeatureName = inputFeatureName;
                return this;
            }

            /**
             * ValueType.
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
    public static class SubFeatures extends TeaModel {
        @NameInMap("DefaultValue")
        @Validation(required = true)
        private String defaultValue;

        @NameInMap("FeatureDomain")
        @Validation(required = true)
        private String featureDomain;

        @NameInMap("FeatureName")
        @Validation(required = true)
        private String featureName;

        @NameInMap("FeatureType")
        @Validation(required = true)
        private String featureType;

        @NameInMap("InputFeatureName")
        @Validation(required = true)
        private String inputFeatureName;

        @NameInMap("ValueType")
        @Validation(required = true)
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

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * FeatureDomain.
             */
            public Builder featureDomain(String featureDomain) {
                this.featureDomain = featureDomain;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureType.
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * InputFeatureName.
             */
            public Builder inputFeatureName(String inputFeatureName) {
                this.inputFeatureName = inputFeatureName;
                return this;
            }

            /**
             * ValueType.
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
    public static class SequenceFeatures extends TeaModel {
        @NameInMap("AttributeDelim")
        @Validation(required = true)
        private String attributeDelim;

        @NameInMap("FeatureName")
        @Validation(required = true)
        private String featureName;

        @NameInMap("SequenceDelim")
        @Validation(required = true)
        private String sequenceDelim;

        @NameInMap("SequenceLength")
        @Validation(required = true)
        private Long sequenceLength;

        @NameInMap("SubFeatures")
        private java.util.List < SubFeatures> subFeatures;

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
        public java.util.List < SubFeatures> getSubFeatures() {
            return this.subFeatures;
        }

        public static final class Builder {
            private String attributeDelim; 
            private String featureName; 
            private String sequenceDelim; 
            private Long sequenceLength; 
            private java.util.List < SubFeatures> subFeatures; 

            /**
             * AttributeDelim.
             */
            public Builder attributeDelim(String attributeDelim) {
                this.attributeDelim = attributeDelim;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * SequenceDelim.
             */
            public Builder sequenceDelim(String sequenceDelim) {
                this.sequenceDelim = sequenceDelim;
                return this;
            }

            /**
             * SequenceLength.
             */
            public Builder sequenceLength(Long sequenceLength) {
                this.sequenceLength = sequenceLength;
                return this;
            }

            /**
             * SubFeatures.
             */
            public Builder subFeatures(java.util.List < SubFeatures> subFeatures) {
                this.subFeatures = subFeatures;
                return this;
            }

            public SequenceFeatures build() {
                return new SequenceFeatures(this);
            } 

        } 

    }
}
