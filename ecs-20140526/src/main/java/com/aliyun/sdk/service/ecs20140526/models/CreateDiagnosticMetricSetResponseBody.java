// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateDiagnosticMetricSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticMetricSetResponseBody</p>
 */
public class CreateDiagnosticMetricSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetricSetId")
    private String metricSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the diagnostic metric set, which is the unique identifier of the set.</p>
         * 
         * <strong>example:</strong>
         * <p>dms-o7ymuutup5l*****</p>
         */
        public Builder metricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
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
