// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticMetricSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticMetricSetResponseBody</p>
 */
public class CreateDiagnosticMetricSetResponseBody extends TeaModel {
    @NameInMap("MetricSetId")
    private String metricSetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDiagnosticMetricSetResponseBody(Builder builder) {
        this.metricSetId = builder.metricSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticMetricSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricSetId
     */
    public String getMetricSetId() {
        return this.metricSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String metricSetId; 
        private String requestId; 

        /**
         * MetricSetId.
         */
        public Builder metricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * The ID of the diagnostic metric set, which is the unique identifier of the set.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDiagnosticMetricSetResponseBody build() {
            return new CreateDiagnosticMetricSetResponseBody(this);
        } 

    } 

}
