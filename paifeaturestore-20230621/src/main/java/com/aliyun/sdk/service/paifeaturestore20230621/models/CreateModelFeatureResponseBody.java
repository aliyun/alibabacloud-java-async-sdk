// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelFeatureResponseBody</p>
 */
public class CreateModelFeatureResponseBody extends TeaModel {
    @NameInMap("ModelFeatureId")
    private String modelFeatureId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateModelFeatureResponseBody(Builder builder) {
        this.modelFeatureId = builder.modelFeatureId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelFeatureId
     */
    public String getModelFeatureId() {
        return this.modelFeatureId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String modelFeatureId; 
        private String requestId; 

        /**
         * ModelFeatureId.
         */
        public Builder modelFeatureId(String modelFeatureId) {
            this.modelFeatureId = modelFeatureId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelFeatureResponseBody build() {
            return new CreateModelFeatureResponseBody(this);
        } 

    } 

}
