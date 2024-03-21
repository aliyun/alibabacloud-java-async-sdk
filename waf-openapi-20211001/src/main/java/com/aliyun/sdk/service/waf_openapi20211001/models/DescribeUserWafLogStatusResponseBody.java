// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserWafLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserWafLogStatusResponseBody</p>
 */
public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    @NameInMap("LogRegionId")
    private String logRegionId;

    @NameInMap("LogStatus")
    private String logStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusUpdateTime")
    private Long statusUpdateTime;

    private DescribeUserWafLogStatusResponseBody(Builder builder) {
        this.logRegionId = builder.logRegionId;
        this.logStatus = builder.logStatus;
        this.requestId = builder.requestId;
        this.statusUpdateTime = builder.statusUpdateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserWafLogStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStatus
     */
    public String getLogStatus() {
        return this.logStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusUpdateTime
     */
    public Long getStatusUpdateTime() {
        return this.statusUpdateTime;
    }

    public static final class Builder {
        private String logRegionId; 
        private String logStatus; 
        private String requestId; 
        private Long statusUpdateTime; 

        /**
         * LogRegionId.
         */
        public Builder logRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * LogStatus.
         */
        public Builder logStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusUpdateTime.
         */
        public Builder statusUpdateTime(Long statusUpdateTime) {
            this.statusUpdateTime = statusUpdateTime;
            return this;
        }

        public DescribeUserWafLogStatusResponseBody build() {
            return new DescribeUserWafLogStatusResponseBody(this);
        } 

    } 

}
