// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackDriftResponseBody} extends {@link TeaModel}
 *
 * <p>DetectStackDriftResponseBody</p>
 */
public class DetectStackDriftResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DriftDetectionId")
    private String driftDetectionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectStackDriftResponseBody(Builder builder) {
        this.driftDetectionId = builder.driftDetectionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectStackDriftResponseBody create() {
        return builder().build();
    }

    /**
     * @return driftDetectionId
     */
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String driftDetectionId; 
        private String requestId; 

        /**
         * The ID of the drift detection.
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectStackDriftResponseBody build() {
            return new DetectStackDriftResponseBody(this);
        } 

    } 

}
