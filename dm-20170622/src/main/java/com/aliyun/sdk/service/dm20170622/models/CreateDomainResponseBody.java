// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDomainResponseBody</p>
 */
public class CreateDomainResponseBody extends TeaModel {
    @NameInMap("DomainId")
    private String domainId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDomainResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainId; 
        private String requestId; 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDomainResponseBody build() {
            return new CreateDomainResponseBody(this);
        } 

    } 

}
