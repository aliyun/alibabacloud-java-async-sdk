// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhysicalConnectionFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhysicalConnectionFeaturesResponseBody</p>
 */
public class ListPhysicalConnectionFeaturesResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionFeatures")
    private java.util.List < PhysicalConnectionFeatures> physicalConnectionFeatures;

    @NameInMap("RequestId")
    private String requestId;

    private ListPhysicalConnectionFeaturesResponseBody(Builder builder) {
        this.physicalConnectionFeatures = builder.physicalConnectionFeatures;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhysicalConnectionFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalConnectionFeatures
     */
    public java.util.List < PhysicalConnectionFeatures> getPhysicalConnectionFeatures() {
        return this.physicalConnectionFeatures;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PhysicalConnectionFeatures> physicalConnectionFeatures; 
        private String requestId; 

        /**
         * PhysicalConnectionFeatures.
         */
        public Builder physicalConnectionFeatures(java.util.List < PhysicalConnectionFeatures> physicalConnectionFeatures) {
            this.physicalConnectionFeatures = physicalConnectionFeatures;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPhysicalConnectionFeaturesResponseBody build() {
            return new ListPhysicalConnectionFeaturesResponseBody(this);
        } 

    } 

    public static class PhysicalConnectionFeatures extends TeaModel {
        @NameInMap("FeatureKey")
        private String featureKey;

        @NameInMap("FeatureValue")
        private String featureValue;

        private PhysicalConnectionFeatures(Builder builder) {
            this.featureKey = builder.featureKey;
            this.featureValue = builder.featureValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionFeatures create() {
            return builder().build();
        }

        /**
         * @return featureKey
         */
        public String getFeatureKey() {
            return this.featureKey;
        }

        /**
         * @return featureValue
         */
        public String getFeatureValue() {
            return this.featureValue;
        }

        public static final class Builder {
            private String featureKey; 
            private String featureValue; 

            /**
             * FeatureKey.
             */
            public Builder featureKey(String featureKey) {
                this.featureKey = featureKey;
                return this;
            }

            /**
             * FeatureValue.
             */
            public Builder featureValue(String featureValue) {
                this.featureValue = featureValue;
                return this;
            }

            public PhysicalConnectionFeatures build() {
                return new PhysicalConnectionFeatures(this);
            } 

        } 

    }
}
