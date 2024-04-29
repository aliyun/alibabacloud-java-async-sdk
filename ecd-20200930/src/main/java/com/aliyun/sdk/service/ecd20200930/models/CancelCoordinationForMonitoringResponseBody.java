// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCoordinationForMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>CancelCoordinationForMonitoringResponseBody</p>
 */
public class CancelCoordinationForMonitoringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelCoordinationForMonitoringResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCoordinationForMonitoringResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelCoordinationForMonitoringResponseBody build() {
            return new CancelCoordinationForMonitoringResponseBody(this);
        } 

    } 

}
