// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperationCustomizeReportChartResponseBody} extends {@link TeaModel}
 *
 * <p>OperationCustomizeReportChartResponseBody</p>
 */
public class OperationCustomizeReportChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OperationCustomizeReportChartResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationCustomizeReportChartResponseBody create() {
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
         * <p>432B2D4E-C8D3-52E4-9F68-35E0C05F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperationCustomizeReportChartResponseBody build() {
            return new OperationCustomizeReportChartResponseBody(this);
        } 

    } 

}
