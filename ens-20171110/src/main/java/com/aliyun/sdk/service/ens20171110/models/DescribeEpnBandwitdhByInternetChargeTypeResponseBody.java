// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandwitdhByInternetChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnBandwitdhByInternetChargeTypeResponseBody</p>
 */
public class DescribeEpnBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthValue")
    private Long bandwidthValue;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeEpnBandwitdhByInternetChargeTypeResponseBody(Builder builder) {
        this.bandwidthValue = builder.bandwidthValue;
        this.internetChargeType = builder.internetChargeType;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnBandwitdhByInternetChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthValue
     */
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private Long bandwidthValue; 
        private String internetChargeType; 
        private String requestId; 
        private String timeStamp; 

        /**
         * The bandwidth. Unit: bit/s.
         */
        public Builder bandwidthValue(Long bandwidthValue) {
            this.bandwidthValue = bandwidthValue;
            return this;
        }

        /**
         * The metering method. Valid values:
         * <p>
         * 
         * *   BandwidthByDay: Pay by daily peak bandwidth
         * *   95BandwidthByMonth: Pay by monthly 95th percentile bandwidth
         * *   PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth
         * *   PayByBandwidth: Pay by fixed bandwidth
         * 
         * You can specify only one metering method for network usage and cannot overwrite the existing metering method.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
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
         * The timestamp when the monitoring data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeEpnBandwitdhByInternetChargeTypeResponseBody build() {
            return new DescribeEpnBandwitdhByInternetChargeTypeResponseBody(this);
        } 

    } 

}
