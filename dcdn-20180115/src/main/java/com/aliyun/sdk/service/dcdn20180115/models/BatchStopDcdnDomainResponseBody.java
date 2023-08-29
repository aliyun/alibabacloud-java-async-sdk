// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopDcdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStopDcdnDomainResponseBody</p>
 */
public class BatchStopDcdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BatchStopDcdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStopDcdnDomainResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchStopDcdnDomainResponseBody build() {
            return new BatchStopDcdnDomainResponseBody(this);
        } 

    } 

}
