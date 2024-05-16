// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateExpireCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserCertificateExpireCountResponseBody</p>
 */
public class DescribeUserCertificateExpireCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpireWithin30DaysCount")
    private Integer expireWithin30DaysCount;

    @com.aliyun.core.annotation.NameInMap("ExpiredCount")
    private Integer expiredCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserCertificateExpireCountResponseBody(Builder builder) {
        this.expireWithin30DaysCount = builder.expireWithin30DaysCount;
        this.expiredCount = builder.expiredCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateExpireCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return expireWithin30DaysCount
     */
    public Integer getExpireWithin30DaysCount() {
        return this.expireWithin30DaysCount;
    }

    /**
     * @return expiredCount
     */
    public Integer getExpiredCount() {
        return this.expiredCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer expireWithin30DaysCount; 
        private Integer expiredCount; 
        private String requestId; 

        /**
         * The number of domain names whose SSL certificates are about to expires within 30 days.
         */
        public Builder expireWithin30DaysCount(Integer expireWithin30DaysCount) {
            this.expireWithin30DaysCount = expireWithin30DaysCount;
            return this;
        }

        /**
         * The number of domain names whose SSL certificates have already expired.
         */
        public Builder expiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserCertificateExpireCountResponseBody build() {
            return new DescribeUserCertificateExpireCountResponseBody(this);
        } 

    } 

}
