// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCdnDomainExistResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCdnDomainExistResponseBody</p>
 */
public class CheckCdnDomainExistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CheckCdnDomainExistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCdnDomainExistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the domain name. Valid values:
         * <p>
         * 
         * *   **DomainNotExist**: The domain name is not added.
         * *   **DomainExistOtherUser**: The domain name has been added by another account.
         * *   **DomainExistCdnProduct**: The domain name has been added to Alibaba Cloud CDN.
         * *   **DomainExistDcdnProduct**: The domain name has been added to Dynamic Content Delivery Network (DCDN).
         * *   **DomainExistScdnProduct**: The domain name has been added to Secure CDN (SCDN).
         * *   **DomainExistVodProduct**: The domain name has been added to ApsaraVideo VOD.
         * *   **DomainExistLiveProduct**: The domain name has been added to ApsaraVideo Live.
         * *   **DomainExistDcdnipaProduct**: The domain name has been added to DCDN IP Application Accelerator (IPA).
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CheckCdnDomainExistResponseBody build() {
            return new CheckCdnDomainExistResponseBody(this);
        } 

    } 

}
