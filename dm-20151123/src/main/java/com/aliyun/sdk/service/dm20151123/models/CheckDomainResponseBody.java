// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CheckDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainResponseBody</p>
 */
public class CheckDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private Integer domainStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The status of the domain name. Indicates whether the domain name is verified and available.</p>
         * <ul>
         * <li>0: indicates that the domain name is verified and available.</li>
         * <li>1: indicates that the domain name fails to be verified and is unavailable.</li>
         * <li>2: indicates that the domain name is available, but not filed or configured with a CNAME record.</li>
         * <li>3: indicates that the domain name is available but not filed.</li>
         * <li>4: indicates that the domain name is available but not configured with a CNAME record.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domainStatus(Integer domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F0B82E83-A1D9-4FE6-97D2-F4B231F80B02</p>
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
