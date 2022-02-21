// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSecondLevelMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CancelSecondLevelMonitorResponseBody</p>
 */
public class CancelSecondLevelMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelSecondLevelMonitorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSecondLevelMonitorResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelSecondLevelMonitorResponseBody build() {
            return new CancelSecondLevelMonitorResponseBody(this);
        } 

    } 

}
