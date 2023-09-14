// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureConsistencyCheckJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureConsistencyCheckJobResponseBody</p>
 */
public class CreateFeatureConsistencyCheckJobResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckJobId")
    private String featureConsistencyCheckJobId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFeatureConsistencyCheckJobResponseBody(Builder builder) {
        this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureConsistencyCheckJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureConsistencyCheckJobId
     */
    public String getFeatureConsistencyCheckJobId() {
        return this.featureConsistencyCheckJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureConsistencyCheckJobId; 
        private String requestId; 

        /**
         * FeatureConsistencyCheckJobId.
         */
        public Builder featureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
            this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFeatureConsistencyCheckJobResponseBody build() {
            return new CreateFeatureConsistencyCheckJobResponseBody(this);
        } 

    } 

}
