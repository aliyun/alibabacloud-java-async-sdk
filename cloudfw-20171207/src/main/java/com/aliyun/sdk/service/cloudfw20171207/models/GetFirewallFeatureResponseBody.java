// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link GetFirewallFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetFirewallFeatureResponseBody</p>
 */
public class GetFirewallFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private java.util.List<Features> features;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFirewallFeatureResponseBody(Builder builder) {
        this.features = builder.features;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFirewallFeatureResponseBody create() {
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

        private Builder(GetFirewallFeatureResponseBody model) {
            this.features = model.features;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of firewall feature statuses. This list always returns the statuses of application control and web filtering.</p>
         */
        public Builder features(java.util.List<Features> features) {
            this.features = features;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFirewallFeatureResponseBody build() {
            return new GetFirewallFeatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFirewallFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetFirewallFeatureResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Features(Builder builder) {
            this.featureName = builder.featureName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String featureName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.featureName = model.featureName;
                this.status = model.status;
            } 

            /**
             * <p>The feature name. Valid values:</p>
             * <ul>
             * <li><strong>ApplicationControl</strong>: Application control.</li>
             * <li><strong>WebFilter</strong>: Web filtering.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ApplicationControl</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>The activation status of the feature. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
}
