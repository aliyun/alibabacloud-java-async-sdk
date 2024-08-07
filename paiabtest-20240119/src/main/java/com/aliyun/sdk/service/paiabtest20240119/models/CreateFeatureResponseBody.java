// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureResponseBody</p>
 */
public class CreateFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureId")
    private String featureId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFeatureResponseBody(Builder builder) {
        this.featureId = builder.featureId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureResponseBody create() {
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

        public CreateFeatureResponseBody build() {
            return new CreateFeatureResponseBody(this);
        } 

    } 

}
