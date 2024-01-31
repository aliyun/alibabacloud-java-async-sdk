// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelFeatureFGFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateModelFeatureFGFeatureResponseBody</p>
 */
public class UpdateModelFeatureFGFeatureResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private UpdateModelFeatureFGFeatureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelFeatureFGFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateModelFeatureFGFeatureResponseBody build() {
            return new UpdateModelFeatureFGFeatureResponseBody(this);
        } 

    } 

}
