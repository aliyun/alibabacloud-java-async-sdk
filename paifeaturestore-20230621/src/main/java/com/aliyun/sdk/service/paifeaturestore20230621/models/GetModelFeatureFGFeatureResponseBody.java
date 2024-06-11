// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelFeatureFGFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelFeatureFGFeatureResponseBody</p>
 */
public class GetModelFeatureFGFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LookupFeatures")
    private java.util.List < LookupFeatures> lookupFeatures;

    @com.aliyun.core.annotation.NameInMap("RawFeatures")
    private java.util.List < RawFeatures> rawFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Reserves")
    private java.util.List < String > reserves;

    @com.aliyun.core.annotation.NameInMap("SequenceFeatures")
    private java.util.List < SequenceFeatures> sequenceFeatures;

    private GetModelFeatureFGFeatureResponseBody(Builder builder) {
        this.lookupFeatures = builder.lookupFeatures;
        this.rawFeatures = builder.rawFeatures;
        this.requestId = builder.requestId;
        this.reserves = builder.reserves;
        this.sequenceFeatures = builder.sequenceFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelFeatureFGFeatureResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private java.util.List < LookupFeatures> lookupFeatures; 
        private java.util.List < RawFeatures> rawFeatures; 
        private String requestId; 
        private java.util.List < String > reserves; 
        private java.util.List < SequenceFeatures> sequenceFeatures; 

        /**
         * LookupFeatures.
         */
        public Builder lookupFeatures(java.util.List < LookupFeatures> lookupFeatures) {
            this.lookupFeatures = lookupFeatures;
            return this;
        }

        /**
         * RawFeatures.
         */
        public Builder rawFeatures(java.util.List < RawFeatures> rawFeatures) {
            this.rawFeatures = rawFeatures;
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
         * Reserves.
         */
        public Builder reserves(java.util.List < String > reserves) {
            this.reserves = reserves;
            return this;
        }

        /**
         * SequenceFeatures.
         */
        public Builder sequenceFeatures(java.util.List < SequenceFeatures> sequenceFeatures) {
            this.sequenceFeatures = sequenceFeatures;
            return this;
        }

        public GetModelFeatureFGFeatureResponseBody build() {
            return new GetModelFeatureFGFeatureResponseBody(this);
        } 

    } 

    public static class LookupFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("KeyFeatureDomain")
        private String keyFeatureDomain;

        @com.aliyun.core.annotation.NameInMap("KeyFeatureName")
        private String keyFeatureName;

        @com.aliyun.core.annotation.NameInMap("MapFeatureDomain")
        private String mapFeatureDomain;

        @com.aliyun.core.annotation.NameInMap("MapFeatureName")
        private String mapFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
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
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureDomain")
        private String featureDomain;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("InputFeatureName")
        private String inputFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
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
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureDomain")
        private String featureDomain;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("InputFeatureName")
        private String inputFeatureName;

        @com.aliyun.core.annotation.NameInMap("ValueType")
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
        @com.aliyun.core.annotation.NameInMap("AttributeDelim")
        private String attributeDelim;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("SequenceDelim")
        private String sequenceDelim;

        @com.aliyun.core.annotation.NameInMap("SequenceLength")
        private Long sequenceLength;

        @com.aliyun.core.annotation.NameInMap("SubFeatures")
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
