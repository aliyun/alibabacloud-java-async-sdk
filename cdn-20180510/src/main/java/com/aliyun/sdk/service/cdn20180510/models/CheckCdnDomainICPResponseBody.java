// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCdnDomainICPResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCdnDomainICPResponseBody</p>
 */
public class CheckCdnDomainICPResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CheckCdnDomainICPResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCdnDomainICPResponseBody create() {
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
         * The status of the resource plan. Valid value:
         * <p>
         * 
         * *   **DomainIsRegistration**: An ICP filing is obtained for the domain name.
         * *   **DomainNotRegistration**: No ICP filing is obtained for the domain name.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CheckCdnDomainICPResponseBody build() {
            return new CheckCdnDomainICPResponseBody(this);
        } 

    } 

}
