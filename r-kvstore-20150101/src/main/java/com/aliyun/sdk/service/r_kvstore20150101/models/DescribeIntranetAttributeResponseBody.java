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

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("IntranetBandwidth")
    private Integer intranetBandwidth;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIntranetAttributeResponseBody(Builder builder) {
        this.autoRenewal = builder.autoRenewal;
        this.bandwidthExpireTime = builder.bandwidthExpireTime;
        this.expireTime = builder.expireTime;
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
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
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
        private String expireTime; 
        private Integer intranetBandwidth; 
        private String requestId; 

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * BandwidthExpireTime.
         */
        public Builder bandwidthExpireTime(String bandwidthExpireTime) {
            this.bandwidthExpireTime = bandwidthExpireTime;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * IntranetBandwidth.
         */
        public Builder intranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }

        /**
         * RequestId.
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
