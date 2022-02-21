// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmRecoveryPlanResponseBody} extends {@link TeaModel}
 *
 * <p>AddGtmRecoveryPlanResponseBody</p>
 */
public class AddGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("RecoveryPlanId")
    private String recoveryPlanId;

    @NameInMap("RequestId")
    private String requestId;

    private AddGtmRecoveryPlanResponseBody(Builder builder) {
        this.recoveryPlanId = builder.recoveryPlanId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGtmRecoveryPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return recoveryPlanId
     */
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recoveryPlanId; 
        private String requestId; 

        /**
         * RecoveryPlanId.
         */
        public Builder recoveryPlanId(String recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddGtmRecoveryPlanResponseBody build() {
            return new AddGtmRecoveryPlanResponseBody(this);
        } 

    } 

}
