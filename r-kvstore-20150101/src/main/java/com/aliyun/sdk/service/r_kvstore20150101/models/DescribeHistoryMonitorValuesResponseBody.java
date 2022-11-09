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
         * MonitorHistory.
         */
        public Builder monitorHistory(String monitorHistory) {
            this.monitorHistory = monitorHistory;
            return this;
        }

        /**
         * RequestId.
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
