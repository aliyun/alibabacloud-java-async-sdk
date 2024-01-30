// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainSunriseClaimResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainSunriseClaimResponseBody</p>
 */
public class CheckDomainSunriseClaimResponseBody extends TeaModel {
    @NameInMap("ClaimKey")
    private String claimKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Integer result;

    private CheckDomainSunriseClaimResponseBody(Builder builder) {
        this.claimKey = builder.claimKey;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainSunriseClaimResponseBody create() {
        return builder().build();
    }

    /**
     * @return claimKey
     */
    public String getClaimKey() {
        return this.claimKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    public static final class Builder {
        private String claimKey; 
        private String requestId; 
        private Integer result; 

        /**
         * ClaimKey.
         */
        public Builder claimKey(String claimKey) {
            this.claimKey = claimKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public CheckDomainSunriseClaimResponseBody build() {
            return new CheckDomainSunriseClaimResponseBody(this);
        } 

    } 

}
