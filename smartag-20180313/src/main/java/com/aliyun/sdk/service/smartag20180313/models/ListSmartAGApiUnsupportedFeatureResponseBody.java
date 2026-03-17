// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListSmartAGApiUnsupportedFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>ListSmartAGApiUnsupportedFeatureResponseBody</p>
 */
public class ListSmartAGApiUnsupportedFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<Features> features;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSmartAGApiUnsupportedFeatureResponseBody(Builder builder) {
        this.features = builder.features;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartAGApiUnsupportedFeatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return features
     */
    public java.util.List<Features> getFeatures() {
        return this.features;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Features> features; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSmartAGApiUnsupportedFeatureResponseBody model) {
            this.features = model.features;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of unsupported features.</p>
         */
        public Builder features(java.util.List<Features> features) {
            this.features = features;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7459545D-2F0D-43E6-9957-CB7E0223332B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSmartAGApiUnsupportedFeatureResponseBody build() {
            return new ListSmartAGApiUnsupportedFeatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSmartAGApiUnsupportedFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>ListSmartAGApiUnsupportedFeatureResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Feature")
        private String feature;

        private Features(Builder builder) {
            this.feature = builder.feature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        public static final class Builder {
            private String feature; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.feature = model.feature;
            } 

            /**
             * <p>The unsupported feature.</p>
             * <p>For more information about the description of each feature, see the related API reference.</p>
             * 
             * <strong>example:</strong>
             * <p>ISP</p>
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
