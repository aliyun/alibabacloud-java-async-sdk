// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody</p>
 */
public class UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody build() {
            return new UpdateCenInterRegionTrafficQosPolicyAttributeResponseBody(this);
        } 

    } 

}
