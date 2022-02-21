// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCapacityReservationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCapacityReservationResponseBody</p>
 */
public class CreateCapacityReservationResponseBody extends TeaModel {
    @NameInMap("CapacityReservationId")
    private String capacityReservationId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCapacityReservationResponseBody(Builder builder) {
        this.capacityReservationId = builder.capacityReservationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCapacityReservationResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacityReservationId
     */
    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String capacityReservationId; 
        private String requestId; 

        /**
         * CapacityReservationId.
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }

        /**
         * RequestId.
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
