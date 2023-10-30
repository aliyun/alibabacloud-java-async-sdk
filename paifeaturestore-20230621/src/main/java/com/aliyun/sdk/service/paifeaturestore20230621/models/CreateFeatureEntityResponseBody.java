// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureEntityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureEntityResponseBody</p>
 */
public class CreateFeatureEntityResponseBody extends TeaModel {
    @NameInMap("FeatureEntityId")
    private String featureEntityId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFeatureEntityResponseBody(Builder builder) {
        this.featureEntityId = builder.featureEntityId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureEntityId; 
        private String requestId; 

        /**
         * FeatureEntityId.
         */
        public Builder featureEntityId(String featureEntityId) {
            this.featureEntityId = featureEntityId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFeatureEntityResponseBody build() {
            return new CreateFeatureEntityResponseBody(this);
        } 

    } 

}
