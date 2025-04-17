// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GetBatchResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchResponseBody</p>
 */
public class GetBatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Batch")
    private DataIngestion batch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBatchResponseBody(Builder builder) {
        this.batch = builder.batch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batch
     */
    public DataIngestion getBatch() {
        return this.batch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataIngestion batch; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetBatchResponseBody model) {
            this.batch = model.batch;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the batch processing task.</p>
         */
        public Builder batch(DataIngestion batch) {
            this.batch = batch;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBatchResponseBody build() {
            return new GetBatchResponseBody(this);
        } 

    } 

}
