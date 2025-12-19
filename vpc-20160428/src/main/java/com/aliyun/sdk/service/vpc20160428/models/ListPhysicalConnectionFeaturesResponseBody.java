// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListPhysicalConnectionFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhysicalConnectionFeaturesResponseBody</p>
 */
public class ListPhysicalConnectionFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionFeatures")
    private java.util.List<PhysicalConnectionFeatures> physicalConnectionFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return physicalConnectionFeatures
     */
    public java.util.List<PhysicalConnectionFeatures> getPhysicalConnectionFeatures() {
        return this.physicalConnectionFeatures;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PhysicalConnectionFeatures> physicalConnectionFeatures; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPhysicalConnectionFeaturesResponseBody model) {
            this.physicalConnectionFeatures = model.physicalConnectionFeatures;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of Express Connect circuit features.</p>
         */
        public Builder physicalConnectionFeatures(java.util.List<PhysicalConnectionFeatures> physicalConnectionFeatures) {
            this.physicalConnectionFeatures = physicalConnectionFeatures;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A599D38F-3618-18FD-9427-108FB9B5BD26</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPhysicalConnectionFeaturesResponseBody build() {
            return new ListPhysicalConnectionFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPhysicalConnectionFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhysicalConnectionFeaturesResponseBody</p>
     */
    public static class PhysicalConnectionFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureKey")
        private String featureKey;

        @com.aliyun.core.annotation.NameInMap("FeatureValue")
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

            private Builder() {
            } 

            private Builder(PhysicalConnectionFeatures model) {
                this.featureKey = model.featureKey;
                this.featureValue = model.featureValue;
            } 

            /**
             * <p>The feature key of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>SubifRateLimit</strong>: subinterface throttling</li>
             * <li><strong>BFD Capability</strong>: Bidirectional Forwarding Detection (BFD)</li>
             * <li><strong>DualStack</strong>: Dual stack</li>
             * <li><strong>CEN</strong>: When a virtual border router (VBR) is attached to a Cloud Enterprise Network (CEN) instance and BGP routes are advertised on the user side, attributes such as <strong>as-path</strong> and <strong>community</strong> are carried.</li>
             * <li><strong>CENv6</strong>: When a VBR is attached to an IPv6 CEN instance and BGP routes are advertised on the user side, attributes such as <strong>as-path</strong> and <strong>community</strong> are carried.</li>
             * <li><strong>QOS</strong>: The device supports configuring QOS policies on physical ports.</li>
             * <li><strong>MSHA</strong>: The device supports fast switching groups between two VBRs.</li>
             * <li><strong>MULTI_MS_HA</strong>: The device supports a maximum of eight VBRs that can be added to the same ECR.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SubifRateLimit</p>
             */
            public Builder featureKey(String featureKey) {
                this.featureKey = featureKey;
                return this;
            }

            /**
             * <p>The feature value of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: Supported</li>
             * <li><strong>NOK</strong>: Not supported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
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
