// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeMarketRemainsQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMarketRemainsQuotaResponseBody</p>
 */
public class DescribeMarketRemainsQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemainsQuota")
    private Long remainsQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder remainsQuota(Long remainsQuota) {
            this.remainsQuota = remainsQuota;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
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
