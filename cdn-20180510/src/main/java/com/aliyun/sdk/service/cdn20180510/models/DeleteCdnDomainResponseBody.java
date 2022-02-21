// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCdnDomainResponseBody</p>
 */
public class DeleteCdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteCdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCdnDomainResponseBody create() {
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

        public DeleteCdnDomainResponseBody build() {
            return new DeleteCdnDomainResponseBody(this);
        } 

    } 

}
