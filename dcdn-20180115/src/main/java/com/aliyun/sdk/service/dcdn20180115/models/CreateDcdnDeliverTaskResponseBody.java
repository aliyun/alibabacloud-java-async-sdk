// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnDeliverTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDcdnDeliverTaskResponseBody</p>
 */
public class CreateDcdnDeliverTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    private String deliverId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDcdnDeliverTaskResponseBody(Builder builder) {
        this.deliverId = builder.deliverId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnDeliverTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliverId
     */
    public String getDeliverId() {
        return this.deliverId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deliverId; 
        private String requestId; 

        /**
         * <p>The ID of the change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        public Builder deliverId(String deliverId) {
            this.deliverId = deliverId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDcdnDeliverTaskResponseBody build() {
            return new CreateDcdnDeliverTaskResponseBody(this);
        } 

    } 

}
