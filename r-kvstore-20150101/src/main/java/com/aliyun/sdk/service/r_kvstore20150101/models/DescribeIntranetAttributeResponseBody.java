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
 * {@link DescribeIntranetAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntranetAttributeResponseBody</p>
 */
public class DescribeIntranetAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.NameInMap("BandwidthExpireTime")
    private String bandwidthExpireTime;

    @com.aliyun.core.annotation.NameInMap("BandwidthPrePaid")
    private String bandwidthPrePaid;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("HasPrePaidBandWidthOrderRunning")
    private Boolean hasPrePaidBandWidthOrderRunning;

    @com.aliyun.core.annotation.NameInMap("IntranetBandwidth")
    private Integer intranetBandwidth;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeIntranetAttributeResponseBody model) {
            this.autoRenewal = model.autoRenewal;
            this.bandwidthExpireTime = model.bandwidthExpireTime;
            this.bandwidthPrePaid = model.bandwidthPrePaid;
            this.expireTime = model.expireTime;
            this.hasPrePaidBandWidthOrderRunning = model.hasPrePaidBandWidthOrderRunning;
            this.intranetBandwidth = model.intranetBandwidth;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether auto-renewal is enabled for the extra internal bandwidth that you purchased. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong>: Auto-renewal is disabled.</li>
         * </ul>
         * <blockquote>
         * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The expiration time of the purchased bandwidth. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em> T <em>HH:mm:ss</em> Z format.</p>
         * <blockquote>
         * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-03-06T16:00:00Z</p>
         */
        public Builder bandwidthExpireTime(String bandwidthExpireTime) {
            this.bandwidthExpireTime = bandwidthExpireTime;
            return this;
        }

        /**
         * <p>The billing method of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: pay-as-you-go</li>
         * <li><strong>1</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder bandwidthPrePaid(String bandwidthPrePaid) {
            this.bandwidthPrePaid = bandwidthPrePaid;
            return this;
        }

        /**
         * <p>The time when the extra internal bandwidth that you purchased for temporary use expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p>If no extra internal bandwidth for temporary use is purchased or the extra internal bandwidth that you purchased for temporary use has expired, <strong>0</strong> is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Specifies whether the instance has unexpired bandwidth plans. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance has unexpired bandwidth plans.</li>
         * <li><strong>false</strong>: The instance does not have unexpired bandwidth plans.</li>
         * </ul>
         * <blockquote>
         * <p>If no extra internal bandwidth is purchased, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasPrePaidBandWidthOrderRunning(Boolean hasPrePaidBandWidthOrderRunning) {
            this.hasPrePaidBandWidthOrderRunning = hasPrePaidBandWidthOrderRunning;
            return this;
        }

        /**
         * <p>The internal bandwidth of the instance. This parameter indicates the combined bandwidth of all shards in the instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        public Builder intranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25D42CC3-FBA1-4AEC-BCE2-B8DD3137****</p>
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
