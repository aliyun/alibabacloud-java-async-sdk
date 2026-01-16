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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckDomainResponseBody model) {
            this.domainStatus = model.domainStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Domain status. Indicates whether the verification was successful, with values as follows:</p>
         * <ul>
         * <li><strong>0</strong>: Available, verified successfully</li>
         * <li><strong>1</strong>: Unavailable, verification failed</li>
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
         * <p>Request ID</p>
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
