// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddPublishBatchResponseBody} extends {@link TeaModel}
 *
 * <p>AddPublishBatchResponseBody</p>
 */
public class AddPublishBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private Long batchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddPublishBatchResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPublishBatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long batchId; 
        private String requestId; 

        /**
         * BatchId.
         */
        public Builder batchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPublishBatchResponseBody build() {
            return new AddPublishBatchResponseBody(this);
        } 

    } 

}
