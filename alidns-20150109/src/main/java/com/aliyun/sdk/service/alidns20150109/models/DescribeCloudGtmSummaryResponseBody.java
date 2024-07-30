// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudGtmSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmSummaryResponseBody</p>
 */
public class DescribeCloudGtmSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTotalCount")
    private Integer instanceTotalCount;

    @com.aliyun.core.annotation.NameInMap("MonitorTaskTotalCount")
    private Integer monitorTaskTotalCount;

    @com.aliyun.core.annotation.NameInMap("MonitorTaskTotalQuota")
    private Integer monitorTaskTotalQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudGtmSummaryResponseBody(Builder builder) {
        this.instanceTotalCount = builder.instanceTotalCount;
        this.monitorTaskTotalCount = builder.monitorTaskTotalCount;
        this.monitorTaskTotalQuota = builder.monitorTaskTotalQuota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceTotalCount
     */
    public Integer getInstanceTotalCount() {
        return this.instanceTotalCount;
    }

    /**
     * @return monitorTaskTotalCount
     */
    public Integer getMonitorTaskTotalCount() {
        return this.monitorTaskTotalCount;
    }

    /**
     * @return monitorTaskTotalQuota
     */
    public Integer getMonitorTaskTotalQuota() {
        return this.monitorTaskTotalQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer instanceTotalCount; 
        private Integer monitorTaskTotalCount; 
        private Integer monitorTaskTotalQuota; 
        private String requestId; 

        /**
         * The total number of instances within the current account.
         */
        public Builder instanceTotalCount(Integer instanceTotalCount) {
            this.instanceTotalCount = instanceTotalCount;
            return this;
        }

        /**
         * The total number of configured health check tasks.
         */
        public Builder monitorTaskTotalCount(Integer monitorTaskTotalCount) {
            this.monitorTaskTotalCount = monitorTaskTotalCount;
            return this;
        }

        /**
         * The quota on the number of health check tasks.
         */
        public Builder monitorTaskTotalQuota(Integer monitorTaskTotalQuota) {
            this.monitorTaskTotalQuota = monitorTaskTotalQuota;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmSummaryResponseBody build() {
            return new DescribeCloudGtmSummaryResponseBody(this);
        } 

    } 

}
