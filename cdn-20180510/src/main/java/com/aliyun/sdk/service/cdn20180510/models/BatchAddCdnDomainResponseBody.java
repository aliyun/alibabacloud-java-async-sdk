// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddCdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAddCdnDomainResponseBody</p>
 */
public class BatchAddCdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BatchAddCdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddCdnDomainResponseBody create() {
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

        public BatchAddCdnDomainResponseBody build() {
            return new BatchAddCdnDomainResponseBody(this);
        } 

    } 

}
