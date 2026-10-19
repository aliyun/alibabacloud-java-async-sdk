// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeHistoryMonitorValuesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryMonitorValuesResponseBody</p>
 */
public class DescribeHistoryMonitorValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorHistory")
    private String monitorHistory;

    @com.aliyun.core.annotation.NameInMap("MonitorLegend")
    private String monitorLegend;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHistoryMonitorValuesResponseBody(Builder builder) {
        this.monitorHistory = builder.monitorHistory;
        this.monitorLegend = builder.monitorLegend;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryMonitorValuesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monitorHistory
     */
    public String getMonitorHistory() {
        return this.monitorHistory;
    }

    /**
     * @return monitorLegend
     */
    public String getMonitorLegend() {
        return this.monitorLegend;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String monitorHistory; 
        private String monitorLegend; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHistoryMonitorValuesResponseBody model) {
            this.monitorHistory = model.monitorHistory;
            this.monitorLegend = model.monitorLegend;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The monitoring information returned in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/122091.html">Monitoring parameter description</a>.</p>
         * <blockquote>
         * <p>To improve data transmission efficiency, only non-zero monitoring data is returned. All other monitoring data that is not displayed has a default value of <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;2022-11-06T00:00:00Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:05Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:10Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:15Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:20Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;},\&quot;2022-11-06T00:00:25Z\&quot;:{\&quot;memoryUsage\&quot;:\&quot;6.67\&quot;}}&quot;</p>
         */
        public Builder monitorHistory(String monitorHistory) {
            this.monitorHistory = monitorHistory;
            return this;
        }

        /**
         * MonitorLegend.
         */
        public Builder monitorLegend(String monitorLegend) {
            this.monitorLegend = monitorLegend;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0997EE8-F4C2-4503-9168-85177ED7****</p>
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
