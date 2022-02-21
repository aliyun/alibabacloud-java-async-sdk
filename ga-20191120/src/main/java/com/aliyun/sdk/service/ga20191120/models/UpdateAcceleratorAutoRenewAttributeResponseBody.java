// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAcceleratorAutoRenewAttributeResponseBody</p>
 */
public class UpdateAcceleratorAutoRenewAttributeResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAcceleratorAutoRenewAttributeResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAcceleratorAutoRenewAttributeResponseBody create() {
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
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAcceleratorAutoRenewAttributeResponseBody build() {
            return new UpdateAcceleratorAutoRenewAttributeResponseBody(this);
        } 

    } 

}
