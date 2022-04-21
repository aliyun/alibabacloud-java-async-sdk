// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCorsDomainResponseBody} extends {@link TeaModel}
 *
 * <p>AddCorsDomainResponseBody</p>
 */
public class AddCorsDomainResponseBody extends TeaModel {
    @NameInMap("DomainId")
    private String domainId;

    @NameInMap("RequestId")
    private String requestId;

    private AddCorsDomainResponseBody(Builder builder) {
        this.domainId = builder.domainId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCorsDomainResponseBody create() {
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

        public AddCorsDomainResponseBody build() {
            return new AddCorsDomainResponseBody(this);
        } 

    } 

}
