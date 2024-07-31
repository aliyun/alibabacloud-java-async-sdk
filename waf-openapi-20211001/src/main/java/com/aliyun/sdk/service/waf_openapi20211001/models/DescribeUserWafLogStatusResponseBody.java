// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserWafLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserWafLogStatusResponseBody</p>
 */
public class DescribeUserWafLogStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.NameInMap("LogStatus")
    private String logStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusUpdateTime")
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
         * The ID of the region where WAF logs are stored. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: China (Hangzhou).
         * *   **cn-beijing**: China (Beijing).
         * *   **cn-hongkong**: China (Hong Kong).
         * *   **ap-southeast-1**: Singapore.
         * *   **ap-southeast-2**: Australia (Sydney).
         * *   **ap-southeast-3**: Malaysia (Kuala Lumpur).
         * *   **ap-southeast-5**: Indonesia (Jakarta).
         * *   **ap-southeast-6**: Philippines (Manila).
         * *   **ap-southeast-7**: Thailand (Bangkok).
         * *   **me-east-1**: UAE (Dubai).
         * *   **eu-central-1**: Germany (Frankfurt).
         * *   **us-east-1**: US (Virginia).
         * *   **us-west-1**: US (Silicon Valley).
         * *   **ap-northeast-1**: Japan (Tokyo).
         * *   **ap-northeast-2**: South Korea (Seoul).
         * *   **ap-south-1**: India (Mumbai) Closing Down.
         * *   **eu-west-1**: UK (London).
         * *   **cn-hangzhou-finance**: China East 1 Finance.
         * *   **cn-shanghai-finance-1**: China East 2 Finance.
         * *   **cn-shenzhen-finance**: China South 1 Finance.
         * 
         * >  The China East 1 Finance, China East 2 Finance, and China South 1 Finance regions are available only for Alibaba Finance Cloud users. Alibaba Finance Cloud users are also limited to storing logs within these specific regions.
         */
        public Builder logRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * The status of WAF logs.
         * <p>
         * 
         * *   **initializing**
         * *   **initialize_failed**
         * *   **normal**
         * *   **releasing**
         * *   **release_failed**
         */
        public Builder logStatus(String logStatus) {
            this.logStatus = logStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the log status was modified. Unit: milliseconds.
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
