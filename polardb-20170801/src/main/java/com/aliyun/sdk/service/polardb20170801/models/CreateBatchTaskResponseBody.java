// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBatchTaskResponseBody</p>
 */
public class CreateBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBatchTaskResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String batchId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBatchTaskResponseBody model) {
            this.batchId = model.batchId;
            this.requestId = model.requestId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
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

        public CreateBatchTaskResponseBody build() {
            return new CreateBatchTaskResponseBody(this);
        } 

    } 

}
