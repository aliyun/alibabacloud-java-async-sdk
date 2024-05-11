// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushAllExperimentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>PushAllExperimentVersionResponseBody</p>
 */
public class PushAllExperimentVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureId")
    private String featureId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PushAllExperimentVersionResponseBody(Builder builder) {
        this.featureId = builder.featureId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushAllExperimentVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureId
     */
    public String getFeatureId() {
        return this.featureId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureId; 
        private String requestId; 

        /**
         * FeatureId.
         */
        public Builder featureId(String featureId) {
            this.featureId = featureId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushAllExperimentVersionResponseBody build() {
            return new PushAllExperimentVersionResponseBody(this);
        } 

    } 

}
