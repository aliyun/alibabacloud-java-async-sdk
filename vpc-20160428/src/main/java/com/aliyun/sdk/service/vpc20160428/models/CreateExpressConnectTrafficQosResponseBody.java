// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectTrafficQosResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExpressConnectTrafficQosResponseBody</p>
 */
public class CreateExpressConnectTrafficQosResponseBody extends TeaModel {
    @NameInMap("QosId")
    private String qosId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateExpressConnectTrafficQosResponseBody(Builder builder) {
        this.qosId = builder.qosId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qosId; 
        private String requestId; 

        /**
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExpressConnectTrafficQosResponseBody build() {
            return new CreateExpressConnectTrafficQosResponseBody(this);
        } 

    } 

}
