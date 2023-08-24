// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIntranetAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntranetAttributeResponseBody</p>
 */
public class DescribeIntranetAttributeResponseBody extends TeaModel {
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @NameInMap("BandwidthExpireTime")
    private String bandwidthExpireTime;

    @NameInMap("BandwidthPrePaid")
    private String bandwidthPrePaid;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("HasPrePaidBandWidthOrderRunning")
    private Boolean hasPrePaidBandWidthOrderRunning;

    @NameInMap("IntranetBandwidth")
    private Integer intranetBandwidth;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIntranetAttributeResponseBody(Builder builder) {
        this.autoRenewal = builder.autoRenewal;
        this.bandwidthExpireTime = builder.bandwidthExpireTime;
        this.bandwidthPrePaid = builder.bandwidthPrePaid;
        this.expireTime = builder.expireTime;
        this.hasPrePaidBandWidthOrderRunning = builder.hasPrePaidBandWidthOrderRunning;
        this.intranetBandwidth = builder.intranetBandwidth;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntranetAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return bandwidthExpireTime
     */
    public String getBandwidthExpireTime() {
        return this.bandwidthExpireTime;
    }

    /**
     * @return bandwidthPrePaid
     */
    public String getBandwidthPrePaid() {
        return this.bandwidthPrePaid;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return hasPrePaidBandWidthOrderRunning
     */
    public Boolean getHasPrePaidBandWidthOrderRunning() {
        return this.hasPrePaidBandWidthOrderRunning;
    }

    /**
     * @return intranetBandwidth
     */
    public Integer getIntranetBandwidth() {
        return this.intranetBandwidth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean autoRenewal; 
        private String bandwidthExpireTime; 
        private String bandwidthPrePaid; 
        private String expireTime; 
        private Boolean hasPrePaidBandWidthOrderRunning; 
        private Integer intranetBandwidth; 
        private String requestId; 

        /**
         * Indicates whether auto-renewal is enabled for the extra internal bandwidth that you purchased. Valid values:
         * <p>
         * 
         * *   **true**: Auto-renewal is enabled.
         * *   **false**: Auto-renewal is disabled.
         * 
         * > If no extra internal bandwidth is purchased, this parameter is not returned.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * The time when the extra internal bandwidth that you purchased expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * > If no extra internal bandwidth is purchased, this parameter is not returned.
         */
        public Builder bandwidthExpireTime(String bandwidthExpireTime) {
            this.bandwidthExpireTime = bandwidthExpireTime;
            return this;
        }

        /**
         * BandwidthPrePaid.
         */
        public Builder bandwidthPrePaid(String bandwidthPrePaid) {
            this.bandwidthPrePaid = bandwidthPrePaid;
            return this;
        }

        /**
         * The time when the extra internal bandwidth that you purchased for temporary use expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         * <p>
         * 
         * > If no extra internal bandwidth for temporary use is purchased or the extra internal bandwidth that you purchased for temporary use has expired, **0** is returned for this parameter.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Does the instance have unexpired prepaid bandwidth package, value:
         * <p>
         * - true
         * - false
         */
        public Builder hasPrePaidBandWidthOrderRunning(Boolean hasPrePaidBandWidthOrderRunning) {
            this.hasPrePaidBandWidthOrderRunning = hasPrePaidBandWidthOrderRunning;
            return this;
        }

        /**
         * The current internal bandwidth of the instance. Unit: Mbit/s.
         */
        public Builder intranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIntranetAttributeResponseBody build() {
            return new DescribeIntranetAttributeResponseBody(this);
        } 

    } 

}
