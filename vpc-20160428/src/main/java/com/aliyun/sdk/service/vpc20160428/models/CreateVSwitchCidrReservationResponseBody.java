// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateVSwitchCidrReservationResponseBody model) {
            this.requestId = model.requestId;
            this.vSwitchCidrReservationId = model.vSwitchCidrReservationId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vcr-bp1m12saqteraw3rp****</p>
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
