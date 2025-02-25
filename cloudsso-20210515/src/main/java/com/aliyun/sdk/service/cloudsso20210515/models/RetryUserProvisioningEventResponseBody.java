// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RetryUserProvisioningEventResponseBody} extends {@link TeaModel}
 *
 * <p>RetryUserProvisioningEventResponseBody</p>
 */
public class RetryUserProvisioningEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RetryUserProvisioningEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryUserProvisioningEventResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6F90F3D-4502-5877-B80B-97476F6AE2CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RetryUserProvisioningEventResponseBody build() {
            return new RetryUserProvisioningEventResponseBody(this);
        } 

    } 

}
