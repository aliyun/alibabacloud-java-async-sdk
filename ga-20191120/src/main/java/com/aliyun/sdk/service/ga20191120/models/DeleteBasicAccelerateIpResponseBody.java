// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicAccelerateIpResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicAccelerateIpResponseBody</p>
 */
public class DeleteBasicAccelerateIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBasicAccelerateIpResponseBody(Builder builder) {
        this.accelerateIpId = builder.accelerateIpId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicAccelerateIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accelerateIpId; 
        private String requestId; 

        /**
         * The ID of the accelerated IP address that is deleted.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBasicAccelerateIpResponseBody build() {
            return new DeleteBasicAccelerateIpResponseBody(this);
        } 

    } 

}
