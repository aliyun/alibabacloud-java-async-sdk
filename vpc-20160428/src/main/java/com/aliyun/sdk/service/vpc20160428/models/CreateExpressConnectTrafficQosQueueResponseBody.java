// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExpressConnectTrafficQosQueueResponseBody</p>
 */
public class CreateExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QosId")
    private String qosId;

    @NameInMap("QueueId")
    private String queueId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateExpressConnectTrafficQosQueueResponseBody(Builder builder) {
        this.qosId = builder.qosId;
        this.queueId = builder.queueId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosQueueResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qosId; 
        private String queueId; 
        private String requestId; 

        /**
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * QueueId.
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExpressConnectTrafficQosQueueResponseBody build() {
            return new CreateExpressConnectTrafficQosQueueResponseBody(this);
        } 

    } 

}
