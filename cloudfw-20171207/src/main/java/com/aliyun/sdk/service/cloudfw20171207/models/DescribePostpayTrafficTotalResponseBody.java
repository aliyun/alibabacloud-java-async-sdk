// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        private Long totalTraffic; 
        private Long totalVpcAssets; 
        private Long totalVpcTraffic; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of assets protected all types of firewalls.
         */
        public Builder totalAssets(Long totalAssets) {
            this.totalAssets = totalAssets;
            return this;
        }

        /**
         * The volume of burstable protected traffic for which fees are generated. Unit: bytes.
         */
        public Builder totalBillTraffic(Long totalBillTraffic) {
            this.totalBillTraffic = totalBillTraffic;
            return this;
        }

        /**
         * The total number of assets protected by the Internet firewall.
         */
        public Builder totalInternetAssets(Long totalInternetAssets) {
            this.totalInternetAssets = totalInternetAssets;
            return this;
        }

        /**
         * The total traffic for the Internet firewall. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the Internet boundary. Unit: bytes.
         */
        public Builder totalInternetTraffic(Long totalInternetTraffic) {
            this.totalInternetTraffic = totalInternetTraffic;
            return this;
        }

        /**
         * The total number of assets protected by NAT firewalls.
         */
        public Builder totalNatAssets(Long totalNatAssets) {
            this.totalNatAssets = totalNatAssets;
            return this;
        }

        /**
         * The total traffic for NAT firewalls. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the NAT boundary. Unit: bytes.
         */
        public Builder totalNatTraffic(Long totalNatTraffic) {
            this.totalNatTraffic = totalNatTraffic;
            return this;
        }

        /**
         * The total volume of traffic. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic. Unit: bytes.
         */
        public Builder totalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        /**
         * The total number of assets protected by virtual private cloud (VPC) firewalls.
         */
        public Builder totalVpcAssets(Long totalVpcAssets) {
            this.totalVpcAssets = totalVpcAssets;
            return this;
        }

        /**
         * The total traffic for VPC firewalls. If you use Cloud Firewall that uses the subscription billing method, this parameter indicates the total volume of burstable protected traffic on the VPC boundary. Unit: bytes.
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
