// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the resource plan. Valid value:</p>
         * <ul>
         * <li><strong>DomainIsRegistration</strong>: An ICP filing is obtained for the domain name.</li>
         * <li><strong>DomainNotRegistration</strong>: No ICP filing is obtained for the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DomainIsRegistration</p>
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
