// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAcceleratorResponseBody</p>
 */
public class DeleteAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAcceleratorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAcceleratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String requestId; 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAcceleratorResponseBody build() {
            return new DeleteAcceleratorResponseBody(this);
        } 

    } 

}
