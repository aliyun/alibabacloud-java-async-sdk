// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatisticReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListStatisticReportResponseBody</p>
 */
public class ListStatisticReportResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < java.util.Map<String, ?>> result;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListStatisticReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatisticReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> result; 
        private Long totalCount; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried reports. Valid values:
         * <p>
         * 
         * For more information about the metrics in data quality reports, see the Upload behavioral data section of [Data collection 2.0](~~131547~~).
         * 
         * For more information about the metrics in application and A/B test reports, see the Core metrics section of [Metrics of statistical reports](~~187654~~).
         * 
         * For more information about the metrics in query analysis reports, see the Query analysis metrics section of [Metrics of statistical reports](~~187654~~).
         */
        public Builder result(java.util.List < java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }

        /**
         * The total number of the queried reports.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStatisticReportResponseBody build() {
            return new ListStatisticReportResponseBody(this);
        } 

    } 

}
