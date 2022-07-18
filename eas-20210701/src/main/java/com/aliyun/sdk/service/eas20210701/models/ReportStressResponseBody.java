// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportStressResponseBody} extends {@link TeaModel}
 *
 * <p>ReportStressResponseBody</p>
 */
public class ReportStressResponseBody extends TeaModel {
    @NameInMap("ReportUrl")
    private String reportUrl;

    @NameInMap("RequestId")
    private String requestId;

    private ReportStressResponseBody(Builder builder) {
        this.reportUrl = builder.reportUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportStressResponseBody create() {
        return builder().build();
    }

    /**
     * @return reportUrl
     */
    public String getReportUrl() {
        return this.reportUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String reportUrl; 
        private String requestId; 

        /**
         * ReportUrl.
         */
        public Builder reportUrl(String reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportStressResponseBody build() {
            return new ReportStressResponseBody(this);
        } 

    } 

}
