// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVSwitchCidrReservationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVSwitchCidrReservationResponseBody</p>
 */
public class CreateVSwitchCidrReservationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationId")
    private String vSwitchCidrReservationId;

    private CreateVSwitchCidrReservationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vSwitchCidrReservationId = builder.vSwitchCidrReservationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVSwitchCidrReservationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitchCidrReservationId
     */
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

    public static final class Builder {
        private String requestId; 
        private String vSwitchCidrReservationId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the reserved CIDR block.
         */
        public Builder vSwitchCidrReservationId(String vSwitchCidrReservationId) {
            this.vSwitchCidrReservationId = vSwitchCidrReservationId;
            return this;
        }

        public CreateVSwitchCidrReservationResponseBody build() {
            return new CreateVSwitchCidrReservationResponseBody(this);
        } 

    } 

}
