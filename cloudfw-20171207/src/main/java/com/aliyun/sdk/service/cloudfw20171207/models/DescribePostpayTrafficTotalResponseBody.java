// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePostpayTrafficTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayTrafficTotalResponseBody</p>
 */
public class DescribePostpayTrafficTotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAssets")
    private Long totalAssets;

    @com.aliyun.core.annotation.NameInMap("TotalBillTraffic")
    private Long totalBillTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalInternetAssets")
    private Long totalInternetAssets;

    @com.aliyun.core.annotation.NameInMap("TotalInternetTraffic")
    private Long totalInternetTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalNatAssets")
    private Long totalNatAssets;

    @com.aliyun.core.annotation.NameInMap("TotalNatTraffic")
    private Long totalNatTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalSdlBillTraffic")
    private Long totalSdlBillTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalSdlFreeTraffic")
    private Long totalSdlFreeTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalTraffic")
    private Long totalTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalVpcAssets")
    private Long totalVpcAssets;

    @com.aliyun.core.annotation.NameInMap("TotalVpcTraffic")
    private Long totalVpcTraffic;

    private DescribePostpayTrafficTotalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalAssets = builder.totalAssets;
        this.totalBillTraffic = builder.totalBillTraffic;
        this.totalInternetAssets = builder.totalInternetAssets;
        this.totalInternetTraffic = builder.totalInternetTraffic;
        this.totalNatAssets = builder.totalNatAssets;
        this.totalNatTraffic = builder.totalNatTraffic;
        this.totalSdlBillTraffic = builder.totalSdlBillTraffic;
        this.totalSdlFreeTraffic = builder.totalSdlFreeTraffic;
        this.totalTraffic = builder.totalTraffic;
        this.totalVpcAssets = builder.totalVpcAssets;
        this.totalVpcTraffic = builder.totalVpcTraffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficTotalResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalAssets
     */
    public Long getTotalAssets() {
        return this.totalAssets;
    }

    /**
     * @return totalBillTraffic
     */
    public Long getTotalBillTraffic() {
        return this.totalBillTraffic;
    }

    /**
     * @return totalInternetAssets
     */
    public Long getTotalInternetAssets() {
        return this.totalInternetAssets;
    }

    /**
     * @return totalInternetTraffic
     */
    public Long getTotalInternetTraffic() {
        return this.totalInternetTraffic;
    }

    /**
     * @return totalNatAssets
     */
    public Long getTotalNatAssets() {
        return this.totalNatAssets;
    }

    /**
     * @return totalNatTraffic
     */
    public Long getTotalNatTraffic() {
        return this.totalNatTraffic;
    }

    /**
     * @return totalSdlBillTraffic
     */
    public Long getTotalSdlBillTraffic() {
        return this.totalSdlBillTraffic;
    }

    /**
     * @return totalSdlFreeTraffic
     */
    public Long getTotalSdlFreeTraffic() {
        return this.totalSdlFreeTraffic;
    }

    /**
     * @return totalTraffic
     */
    public Long getTotalTraffic() {
        return this.totalTraffic;
    }

    /**
     * @return totalVpcAssets
     */
    public Long getTotalVpcAssets() {
        return this.totalVpcAssets;
    }

    /**
     * @return totalVpcTraffic
     */
    public Long getTotalVpcTraffic() {
        return this.totalVpcTraffic;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalAssets; 
        private Long totalBillTraffic; 
        private Long totalInternetAssets; 
        private Long totalInternetTraffic; 
        private Long totalNatAssets; 
        private Long totalNatTraffic; 
        private Long totalSdlBillTraffic; 
        private Long totalSdlFreeTraffic; 
        private Long totalTraffic; 
        private Long totalVpcAssets; 
        private Long totalVpcTraffic; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>826B6280-9704-5643-97B1-6B47AC3F027A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of assets protected all types of firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalAssets(Long totalAssets) {
            this.totalAssets = totalAssets;
            return this;
        }

        /**
         * <p>The volume of burstable protected traffic for which fees are generated. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2320274874426</p>
         */
        public Builder totalBillTraffic(Long totalBillTraffic) {
            this.totalBillTraffic = totalBillTraffic;
            return this;
        }

        /**
         * <p>The total number of assets protected by the Internet firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder totalInternetAssets(Long totalInternetAssets) {
            this.totalInternetAssets = totalInternetAssets;
            return this;
        }

        /**
         * <p>The total traffic for the Internet firewall. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the Internet boundary. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2320274874426</p>
         */
        public Builder totalInternetTraffic(Long totalInternetTraffic) {
            this.totalInternetTraffic = totalInternetTraffic;
            return this;
        }

        /**
         * <p>The total number of assets protected by NAT firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNatAssets(Long totalNatAssets) {
            this.totalNatAssets = totalNatAssets;
            return this;
        }

        /**
         * <p>The total traffic for NAT firewalls. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the NAT boundary. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>560646279</p>
         */
        public Builder totalNatTraffic(Long totalNatTraffic) {
            this.totalNatTraffic = totalNatTraffic;
            return this;
        }

        /**
         * TotalSdlBillTraffic.
         */
        public Builder totalSdlBillTraffic(Long totalSdlBillTraffic) {
            this.totalSdlBillTraffic = totalSdlBillTraffic;
            return this;
        }

        /**
         * TotalSdlFreeTraffic.
         */
        public Builder totalSdlFreeTraffic(Long totalSdlFreeTraffic) {
            this.totalSdlFreeTraffic = totalSdlFreeTraffic;
            return this;
        }

        /**
         * <p>The total volume of traffic. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2320274874426</p>
         */
        public Builder totalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        /**
         * <p>The total number of assets protected by virtual private cloud (VPC) firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalVpcAssets(Long totalVpcAssets) {
            this.totalVpcAssets = totalVpcAssets;
            return this;
        }

        /**
         * <p>The total traffic for VPC firewalls. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the VPC boundary. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2320274874426</p>
         */
        public Builder totalVpcTraffic(Long totalVpcTraffic) {
            this.totalVpcTraffic = totalVpcTraffic;
            return this;
        }

        public DescribePostpayTrafficTotalResponseBody build() {
            return new DescribePostpayTrafficTotalResponseBody(this);
        } 

    } 

}
