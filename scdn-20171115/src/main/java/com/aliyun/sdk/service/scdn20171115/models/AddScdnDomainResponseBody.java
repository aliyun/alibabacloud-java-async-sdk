// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddScdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>AddScdnDomainResponseBody</p>
 */
public class AddScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddScdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddScdnDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddScdnDomainResponseBody build() {
            return new AddScdnDomainResponseBody(this);
        } 

    } 

}
