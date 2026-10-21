// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDetectionRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDetectionRuleResponseBody</p>
 */
public class CreateDetectionRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectionRuleId")
    private String detectionRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDetectionRuleResponseBody(Builder builder) {
        this.detectionRuleId = builder.detectionRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDetectionRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionRuleId
     */
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detectionRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDetectionRuleResponseBody model) {
            this.detectionRuleId = model.detectionRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-ha1i09ob3zmqrs85****</p>
         */
        public Builder detectionRuleId(String detectionRuleId) {
            this.detectionRuleId = detectionRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CC09D0C-1CD7-54BD-A853-DCB2D945****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDetectionRuleResponseBody build() {
            return new CreateDetectionRuleResponseBody(this);
        } 

    } 

}
