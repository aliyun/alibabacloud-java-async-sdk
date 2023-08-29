// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStartDcdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStartDcdnDomainResponseBody</p>
 */
public class BatchStartDcdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BatchStartDcdnDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStartDcdnDomainResponseBody create() {
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

        public BatchStartDcdnDomainResponseBody build() {
            return new BatchStartDcdnDomainResponseBody(this);
        } 

    } 

}
