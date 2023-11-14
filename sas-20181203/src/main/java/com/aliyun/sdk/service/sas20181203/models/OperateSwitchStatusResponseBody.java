// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSwitchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>OperateSwitchStatusResponseBody</p>
 */
public class OperateSwitchStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OperateSwitchStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSwitchStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperateSwitchStatusResponseBody build() {
            return new OperateSwitchStatusResponseBody(this);
        } 

    } 

}
