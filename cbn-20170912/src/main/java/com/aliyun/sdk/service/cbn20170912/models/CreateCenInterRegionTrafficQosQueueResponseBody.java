// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenInterRegionTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenInterRegionTrafficQosQueueResponseBody</p>
 */
public class CreateCenInterRegionTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QosQueueId")
    private String qosQueueId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCenInterRegionTrafficQosQueueResponseBody(Builder builder) {
        this.qosQueueId = builder.qosQueueId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenInterRegionTrafficQosQueueResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosQueueId
     */
    public String getQosQueueId() {
        return this.qosQueueId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qosQueueId; 
        private String requestId; 

        /**
         * QosQueueId.
         */
        public Builder qosQueueId(String qosQueueId) {
            this.qosQueueId = qosQueueId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCenInterRegionTrafficQosQueueResponseBody build() {
            return new CreateCenInterRegionTrafficQosQueueResponseBody(this);
        } 

    } 

}
