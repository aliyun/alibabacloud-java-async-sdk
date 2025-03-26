// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExpressConnectTrafficQosQueueResponseBody</p>
 */
public class CreateExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosId")
    private String qosId;

    @com.aliyun.core.annotation.NameInMap("QueueId")
    private String queueId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateExpressConnectTrafficQosQueueResponseBody model) {
            this.qosId = model.qosId;
            this.queueId = model.queueId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-2giu0a6vd5x0mv4700</p>
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the QoS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4CF20CC7-D1FC-425B-A15B-DF7C8E2131A7</p>
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
