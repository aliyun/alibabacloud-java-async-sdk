// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchStopDcdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BatchStopDcdnDomainResponseBody</p>
 */
public class BatchStopDcdnDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
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
