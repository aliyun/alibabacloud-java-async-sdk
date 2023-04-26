// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopVodDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStopVodDomainResponseBody</p>
 */
public class BatchStopVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BatchStopVodDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchStopVodDomainResponseBody create() {
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

        public BatchStopVodDomainResponseBody build() {
            return new BatchStopVodDomainResponseBody(this);
        } 

    } 

}
