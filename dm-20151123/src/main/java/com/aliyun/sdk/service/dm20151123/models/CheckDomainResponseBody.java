// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @NameInMap("DomainStatus")
    private Integer domainStatus;

    @NameInMap("RequestId")
    private String requestId;

    private CheckDomainResponseBody(Builder builder) {
        this.domainStatus = builder.domainStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainStatus
     */
    public Integer getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer domainStatus; 
        private String requestId; 

        /**
         * The status of the domain name. Indicates whether the domain name is verified and available.
         * <p>
         * 
         * *   0: indicates that the domain name is verified and available.
         * *   1: indicates that the domain name fails to be verified and is unavailable.
         * *   2: indicates that the domain name is available, but not filed or configured with a CNAME record.
         * *   3: indicates that the domain name is available but not filed.
         * *   4: indicates that the domain name is available but not configured with a CNAME record.
         */
        public Builder domainStatus(Integer domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDomainResponseBody build() {
            return new CheckDomainResponseBody(this);
        } 

    } 

}
