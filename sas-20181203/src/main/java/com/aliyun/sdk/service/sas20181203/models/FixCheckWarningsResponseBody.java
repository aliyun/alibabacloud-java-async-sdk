// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>FixCheckWarningsResponseBody</p>
 */
public class FixCheckWarningsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private Long batchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private FixCheckWarningsResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixCheckWarningsResponseBody create() {
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
         * The ID of the baseline risk item that has been fixed by using the Batch Repair feature.
         */
        public Builder batchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FixCheckWarningsResponseBody build() {
            return new FixCheckWarningsResponseBody(this);
        } 

    } 

}
