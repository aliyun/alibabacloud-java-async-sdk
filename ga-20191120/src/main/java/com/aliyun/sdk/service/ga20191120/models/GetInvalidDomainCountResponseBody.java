// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInvalidDomainCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetInvalidDomainCountResponseBody</p>
 */
public class GetInvalidDomainCountResponseBody extends TeaModel {
    @NameInMap("InvalidDomainCount")
    private String invalidDomainCount;

    @NameInMap("RequestId")
    private String requestId;

    private GetInvalidDomainCountResponseBody(Builder builder) {
        this.invalidDomainCount = builder.invalidDomainCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInvalidDomainCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return invalidDomainCount
     */
    public String getInvalidDomainCount() {
        return this.invalidDomainCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String invalidDomainCount; 
        private String requestId; 

        /**
         * The number of invalid domain names.
         */
        public Builder invalidDomainCount(String invalidDomainCount) {
            this.invalidDomainCount = invalidDomainCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInvalidDomainCountResponseBody build() {
            return new GetInvalidDomainCountResponseBody(this);
        } 

    } 

}
