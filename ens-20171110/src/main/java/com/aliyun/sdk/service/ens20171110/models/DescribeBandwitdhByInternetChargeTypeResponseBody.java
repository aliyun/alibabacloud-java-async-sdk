// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeBandwitdhByInternetChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwitdhByInternetChargeTypeResponseBody</p>
 */
public class DescribeBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthValue")
    private Long bandwidthValue;

    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeBandwitdhByInternetChargeTypeResponseBody(Builder builder) {
        this.bandwidthValue = builder.bandwidthValue;
        this.internetChargeType = builder.internetChargeType;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwitdhByInternetChargeTypeResponseBody create() {
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
         * <p>The bandwidth. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder bandwidthValue(Long bandwidthValue) {
            this.bandwidthValue = bandwidthValue;
            return this;
        }

        /**
         * <p>The metering method. Valid values:</p>
         * <ul>
         * <li>BandwidthByDay: Pay by daily peak bandwidth</li>
         * <li>95BandwidthByMonth: Pay by monthly 95th percentile bandwidth</li>
         * <li>PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth</li>
         * <li>PayByBandwidth: Pay by fixed bandwidth</li>
         * </ul>
         * <p>You can specify only one metering method for network usage and cannot overwrite the existing metering method.</p>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>08027633-8501-5A36-B90D-F7C38B5EC75D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp. The time follows the ISO 8601 standard. The time is displayed in UTC. Example: 2016-10-20T04:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-12T05:45:00Z</p>
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeBandwitdhByInternetChargeTypeResponseBody build() {
            return new DescribeBandwitdhByInternetChargeTypeResponseBody(this);
        } 

    } 

}
