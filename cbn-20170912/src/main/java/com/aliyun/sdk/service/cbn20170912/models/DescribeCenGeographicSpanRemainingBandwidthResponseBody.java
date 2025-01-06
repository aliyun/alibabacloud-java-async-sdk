// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeCenGeographicSpanRemainingBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenGeographicSpanRemainingBandwidthResponseBody</p>
 */
public class DescribeCenGeographicSpanRemainingBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemainingBandwidth")
    private Long remainingBandwidth;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The remaining bandwidth of the bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder remainingBandwidth(Long remainingBandwidth) {
            this.remainingBandwidth = remainingBandwidth;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4B345CD-2CBA-4881-AF6D-E5D9BAE1CA7B</p>
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
