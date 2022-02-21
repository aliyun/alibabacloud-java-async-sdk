// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateScdnDomainResponseBody</p>
 */
public class UpdateScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateScdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScdnDomainResponseBody create() {
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

        public UpdateScdnDomainResponseBody build() {
            return new UpdateScdnDomainResponseBody(this);
        } 

    } 

}
