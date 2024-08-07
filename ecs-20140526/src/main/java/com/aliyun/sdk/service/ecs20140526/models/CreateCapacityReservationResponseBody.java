// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCapacityReservationResponseBody</p>
 */
public class CreateCapacityReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
    private String privatePoolOptionsId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCapacityReservationResponseBody(Builder builder) {
        this.privatePoolOptionsId = builder.privatePoolOptionsId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationResponseBody create() {
        return builder().build();
    }

    /**
     * @return privatePoolOptionsId
     */
    public String getPrivatePoolOptionsId() {
        return this.privatePoolOptionsId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String privatePoolOptionsId; 
        private String requestId; 

        /**
         * The capacity reservation ID.
         */
        public Builder privatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCapacityReservationResponseBody build() {
            return new CreateCapacityReservationResponseBody(this);
        } 

    } 

}
