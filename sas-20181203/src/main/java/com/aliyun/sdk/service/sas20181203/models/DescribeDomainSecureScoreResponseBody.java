// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSecureScoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureScoreResponseBody</p>
 */
public class DescribeDomainSecureScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityScore")
    private Integer securityScore;

    private DescribeDomainSecureScoreResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityScore = builder.securityScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureScoreResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityScore
     */
    public Integer getSecurityScore() {
        return this.securityScore;
    }

    public static final class Builder {
        private String requestId; 
        private Integer securityScore; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityScore.
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }

        public DescribeDomainSecureScoreResponseBody build() {
            return new DescribeDomainSecureScoreResponseBody(this);
        } 

    } 

}
