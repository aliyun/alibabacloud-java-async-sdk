// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DetectStackDriftResponseBody model) {
            this.driftDetectionId = model.driftDetectionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the drift detection.</p>
         * 
         * <strong>example:</strong>
         * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
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
