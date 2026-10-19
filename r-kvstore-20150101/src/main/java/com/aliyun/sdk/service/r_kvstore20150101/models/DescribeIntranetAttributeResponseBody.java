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

    @com.aliyun.core.annotation.NameInMap("IntranetBandWidthBurst")
    private Integer intranetBandWidthBurst;

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
        this.intranetBandWidthBurst = builder.intranetBandWidthBurst;
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
     * @return intranetBandWidthBurst
     */
    public Integer getIntranetBandWidthBurst() {
        return this.intranetBandWidthBurst;
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
        private Integer intranetBandWidthBurst; 
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
            this.intranetBandWidthBurst = model.intranetBandWidthBurst;
            this.intranetBandwidth = model.intranetBandwidth;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether auto-renewal is enabled for the purchased bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is not returned if no bandwidth has been purchased.</p>
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
         * <p>The expiration time of the purchased bandwidth, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format.</p>
         * <blockquote>
         * <p>This parameter is not returned if no additional bandwidth has been purchased for the instance.</p>
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
         * <li><strong>0</strong>: pay-as-you-go.</li>
         * <li><strong>1</strong>: subscription.</li>
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
         * <p>The expiration time of the temporary bandwidth, in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format.</p>
         * <blockquote>
         * <p>If no temporary bandwidth adjustment has been performed on the instance or the temporary bandwidth has expired, this parameter returns <strong>0</strong>.</p>
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
         * <p>Indicates whether the instance has an unexpired bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: An unexpired bandwidth plan exists.</li>
         * <li><strong>false</strong>: No unexpired bandwidth plan exists.<blockquote>
         * <p>This parameter is not returned if no additional bandwidth has been purchased for the instance.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasPrePaidBandWidthOrderRunning(Boolean hasPrePaidBandWidthOrderRunning) {
            this.hasPrePaidBandWidthOrderRunning = hasPrePaidBandWidthOrderRunning;
            return this;
        }

        /**
         * IntranetBandWidthBurst.
         */
        public Builder intranetBandWidthBurst(Integer intranetBandWidthBurst) {
            this.intranetBandWidthBurst = intranetBandWidthBurst;
            return this;
        }

        /**
         * <p>The current internal network bandwidth of the instance. This parameter indicates the total bandwidth of all shards in the instance. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        public Builder intranetBandwidth(Integer intranetBandwidth) {
            this.intranetBandwidth = intranetBandwidth;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
