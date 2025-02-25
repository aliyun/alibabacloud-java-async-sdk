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
 * {@link CreateCenInterRegionTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenInterRegionTrafficQosQueueResponseBody</p>
 */
public class CreateCenInterRegionTrafficQosQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosQueueId")
    private String qosQueueId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-irqhi8k5fdyuu5****</p>
         */
        public Builder qosQueueId(String qosQueueId) {
            this.qosQueueId = qosQueueId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>845F66F6-5C27-53A1-9428-B859086237B2</p>
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
