// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBatchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBatchesResponseBody</p>
 */
public class ListBatchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Batches")
    private java.util.List < DataIngestion > batches;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBatchesResponseBody(Builder builder) {
        this.batches = builder.batches;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return batches
     */
    public java.util.List < DataIngestion > getBatches() {
        return this.batches;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataIngestion > batches; 
        private String nextToken; 
        private String requestId; 

        /**
         * Batches.
         */
        public Builder batches(java.util.List < DataIngestion > batches) {
            this.batches = batches;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBatchesResponseBody build() {
            return new ListBatchesResponseBody(this);
        } 

    } 

}
