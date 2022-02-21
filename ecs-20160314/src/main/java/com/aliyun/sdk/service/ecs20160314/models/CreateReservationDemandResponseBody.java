// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReservationDemandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReservationDemandResponseBody</p>
 */
public class CreateReservationDemandResponseBody extends TeaModel {
    @NameInMap("DemandId")
    private String demandId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateReservationDemandResponseBody(Builder builder) {
        this.demandId = builder.demandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReservationDemandResponseBody create() {
        return builder().build();
    }

    /**
     * @return demandId
     */
    public String getDemandId() {
        return this.demandId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String demandId; 
        private String requestId; 

        /**
         * DemandId.
         */
        public Builder demandId(String demandId) {
            this.demandId = demandId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateReservationDemandResponseBody build() {
            return new CreateReservationDemandResponseBody(this);
        } 

    } 

}
