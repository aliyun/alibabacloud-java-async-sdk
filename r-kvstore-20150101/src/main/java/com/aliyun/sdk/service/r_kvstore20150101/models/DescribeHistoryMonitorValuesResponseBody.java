// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryMonitorValuesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryMonitorValuesResponseBody</p>
 */
public class DescribeHistoryMonitorValuesResponseBody extends TeaModel {
    @NameInMap("MonitorHistory")
    private String monitorHistory;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHistoryMonitorValuesResponseBody(Builder builder) {
        this.monitorHistory = builder.monitorHistory;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryMonitorValuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorHistory
     */
    public String getMonitorHistory() {
        return this.monitorHistory;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String monitorHistory; 
        private String requestId; 

        /**
         * The monitoring data returned in the JSON format. For more information, see [Metrics](~~189831~~).
         * <p>
         * 
         * > 
         * 
         * *   Only metrics whose values are not 0 are returned. This improves data transmission efficiency. Metrics that are not displayed are represented by the default value of **0**.
         * 
         * *   The query results are aligned with the data aggregation frequency. If the specified time range to query is less than or equal to 10 minutes and the data is aggregated once every 5 seconds, query results are returned at an interval of 5 seconds. If the specified StartTime value does not coincide with a point in time for data aggregation, the system returns the latest point in time for data aggregation as the first point in time. For example, if you set the StartTime parameter to 2022-01-20T12:01:48Z, the first point in time returned is 2022-01-20T12:01:45Z.
         */
        public Builder monitorHistory(String monitorHistory) {
            this.monitorHistory = monitorHistory;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHistoryMonitorValuesResponseBody build() {
            return new DescribeHistoryMonitorValuesResponseBody(this);
        } 

    } 

}
