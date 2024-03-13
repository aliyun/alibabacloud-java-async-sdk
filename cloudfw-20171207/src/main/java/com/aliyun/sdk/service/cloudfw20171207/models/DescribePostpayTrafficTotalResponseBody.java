// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostpayTrafficTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayTrafficTotalResponseBody</p>
 */
public class DescribePostpayTrafficTotalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalAssets")
    private Long totalAssets;

    @NameInMap("TotalNatAssets")
    private Long totalNatAssets;

    @NameInMap("TotalNatTraffic")
    private Long totalNatTraffic;

    @NameInMap("TotalTraffic")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalAssets.
         */
        public Builder totalAssets(Long totalAssets) {
            this.totalAssets = totalAssets;
            return this;
        }

        /**
         * TotalNatAssets.
         */
        public Builder totalNatAssets(Long totalNatAssets) {
            this.totalNatAssets = totalNatAssets;
            return this;
        }

        /**
         * TotalNatTraffic.
         */
        public Builder totalNatTraffic(Long totalNatTraffic) {
            this.totalNatTraffic = totalNatTraffic;
            return this;
        }

        /**
         * TotalTraffic.
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
