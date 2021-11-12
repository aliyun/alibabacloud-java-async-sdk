// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link FixCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>FixCheckWarningsResponseBody</p>
 */
public class FixCheckWarningsResponseBody extends TeaModel {
    @NameInMap("BatchId")
    private Long batchId;

    @NameInMap("RequestId")
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
         * <p>BatchId.</p>
         */
        public Builder batchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
