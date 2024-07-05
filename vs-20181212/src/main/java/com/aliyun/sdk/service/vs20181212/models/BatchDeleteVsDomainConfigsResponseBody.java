// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteVsDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteVsDomainConfigsResponseBody</p>
 */
public class BatchDeleteVsDomainConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchDeleteVsDomainConfigsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteVsDomainConfigsResponseBody create() {
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

        public BatchDeleteVsDomainConfigsResponseBody build() {
            return new BatchDeleteVsDomainConfigsResponseBody(this);
        } 

    } 

}
