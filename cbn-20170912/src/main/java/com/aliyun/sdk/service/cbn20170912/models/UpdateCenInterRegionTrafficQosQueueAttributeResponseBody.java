// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link UpdateCenInterRegionTrafficQosQueueAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCenInterRegionTrafficQosQueueAttributeResponseBody</p>
 */
public class UpdateCenInterRegionTrafficQosQueueAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCenInterRegionTrafficQosQueueAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCenInterRegionTrafficQosQueueAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateCenInterRegionTrafficQosQueueAttributeResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6DF9A765-BCD2-5C7E-8C32-C35C8A361A39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCenInterRegionTrafficQosQueueAttributeResponseBody build() {
            return new UpdateCenInterRegionTrafficQosQueueAttributeResponseBody(this);
        } 

    } 

}
