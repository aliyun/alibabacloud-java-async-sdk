// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMarketRemainsQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMarketRemainsQuotaResponseBody</p>
 */
public class DescribeMarketRemainsQuotaResponseBody extends TeaModel {
    @NameInMap("RemainsQuota")
    private Long remainsQuota;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMarketRemainsQuotaResponseBody(Builder builder) {
        this.remainsQuota = builder.remainsQuota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMarketRemainsQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return remainsQuota
     */
    public Long getRemainsQuota() {
        return this.remainsQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long remainsQuota; 
        private String requestId; 

        /**
         * RemainsQuota.
         */
        public Builder remainsQuota(Long remainsQuota) {
            this.remainsQuota = remainsQuota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMarketRemainsQuotaResponseBody build() {
            return new DescribeMarketRemainsQuotaResponseBody(this);
        } 

    } 

}
