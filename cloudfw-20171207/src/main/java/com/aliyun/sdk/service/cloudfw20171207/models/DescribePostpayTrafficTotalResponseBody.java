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

    @com.aliyun.core.annotation.NameInMap("TotalNatAssets")
    private Long totalNatAssets;

    @com.aliyun.core.annotation.NameInMap("TotalNatTraffic")
    private Long totalNatTraffic;

    @com.aliyun.core.annotation.NameInMap("TotalTraffic")
    private Long totalTraffic;

    private DescribePostpayTrafficTotalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalAssets = builder.totalAssets;
        this.totalNatAssets = builder.totalNatAssets;
        this.totalNatTraffic = builder.totalNatTraffic;
        this.totalTraffic = builder.totalTraffic;
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

    public static final class Builder {
        private String requestId; 
        private Long totalAssets; 
        private Long totalNatAssets; 
        private Long totalNatTraffic; 
        private Long totalTraffic; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the assets that are protected by the Internet firewall.
         */
        public Builder totalAssets(Long totalAssets) {
            this.totalAssets = totalAssets;
            return this;
        }

        /**
         * The total number of the assets that are protected by the NAT firewall.
         */
        public Builder totalNatAssets(Long totalNatAssets) {
            this.totalNatAssets = totalNatAssets;
            return this;
        }

        /**
         * The total traffic for the NAT firewall. Unit: bytes.
         */
        public Builder totalNatTraffic(Long totalNatTraffic) {
            this.totalNatTraffic = totalNatTraffic;
            return this;
        }

        /**
         * The total traffic for the Internet firewall. Unit: bytes.
         */
        public Builder totalTraffic(Long totalTraffic) {
            this.totalTraffic = totalTraffic;
            return this;
        }

        public DescribePostpayTrafficTotalResponseBody build() {
            return new DescribePostpayTrafficTotalResponseBody(this);
        } 

    } 

}
