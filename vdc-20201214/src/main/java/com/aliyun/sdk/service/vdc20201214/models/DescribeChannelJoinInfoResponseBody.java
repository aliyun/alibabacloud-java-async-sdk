// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelJoinInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelJoinInfoResponseBody</p>
 */
public class DescribeChannelJoinInfoResponseBody extends TeaModel {
    @NameInMap("JoinFastSuccessRate")
    private String joinFastSuccessRate;

    @NameInMap("JoinSlowThreshold")
    private Long joinSlowThreshold;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeChannelJoinInfoResponseBody(Builder builder) {
        this.joinFastSuccessRate = builder.joinFastSuccessRate;
        this.joinSlowThreshold = builder.joinSlowThreshold;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelJoinInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return joinFastSuccessRate
     */
    public String getJoinFastSuccessRate() {
        return this.joinFastSuccessRate;
    }

    /**
     * @return joinSlowThreshold
     */
    public Long getJoinSlowThreshold() {
        return this.joinSlowThreshold;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String joinFastSuccessRate; 
        private Long joinSlowThreshold; 
        private String requestId; 

        /**
         * JoinFastSuccessRate.
         */
        public Builder joinFastSuccessRate(String joinFastSuccessRate) {
            this.joinFastSuccessRate = joinFastSuccessRate;
            return this;
        }

        /**
         * JoinSlowThreshold.
         */
        public Builder joinSlowThreshold(Long joinSlowThreshold) {
            this.joinSlowThreshold = joinSlowThreshold;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeChannelJoinInfoResponseBody build() {
            return new DescribeChannelJoinInfoResponseBody(this);
        } 

    } 

}
