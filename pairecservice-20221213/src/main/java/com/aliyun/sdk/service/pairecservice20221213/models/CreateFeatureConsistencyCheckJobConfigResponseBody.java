// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureConsistencyCheckJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureConsistencyCheckJobConfigResponseBody</p>
 */
public class CreateFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    private String featureConsistencyCheckJobConfigId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFeatureConsistencyCheckJobConfigResponseBody(Builder builder) {
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureConsistencyCheckJobConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureConsistencyCheckJobConfigId; 
        private String requestId; 

        /**
         * FeatureConsistencyCheckJobConfigId.
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFeatureConsistencyCheckJobConfigResponseBody build() {
            return new CreateFeatureConsistencyCheckJobConfigResponseBody(this);
        } 

    } 

}
