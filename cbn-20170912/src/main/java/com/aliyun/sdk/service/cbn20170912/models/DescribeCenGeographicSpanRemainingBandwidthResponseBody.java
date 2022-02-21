// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenGeographicSpanRemainingBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenGeographicSpanRemainingBandwidthResponseBody</p>
 */
public class DescribeCenGeographicSpanRemainingBandwidthResponseBody extends TeaModel {
    @NameInMap("RemainingBandwidth")
    private Long remainingBandwidth;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCenGeographicSpanRemainingBandwidthResponseBody(Builder builder) {
        this.remainingBandwidth = builder.remainingBandwidth;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenGeographicSpanRemainingBandwidthResponseBody create() {
        return builder().build();
    }

    /**
     * @return remainingBandwidth
     */
    public Long getRemainingBandwidth() {
        return this.remainingBandwidth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long remainingBandwidth; 
        private String requestId; 

        /**
         * RemainingBandwidth.
         */
        public Builder remainingBandwidth(Long remainingBandwidth) {
            this.remainingBandwidth = remainingBandwidth;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCenGeographicSpanRemainingBandwidthResponseBody build() {
            return new DescribeCenGeographicSpanRemainingBandwidthResponseBody(this);
        } 

    } 

}
