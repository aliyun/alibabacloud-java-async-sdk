// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link CreateCdnDeliverTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCdnDeliverTaskResponseBody</p>
 */
public class CreateCdnDeliverTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliverId")
    private String deliverId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCdnDeliverTaskResponseBody(Builder builder) {
        this.deliverId = builder.deliverId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdnDeliverTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCdnDeliverTaskResponseBody model) {
            this.deliverId = model.deliverId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>1025</p>
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

        public CreateCdnDeliverTaskResponseBody build() {
            return new CreateCdnDeliverTaskResponseBody(this);
        } 

    } 

}
