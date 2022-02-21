// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainLatestTransactionDigestsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainLatestTransactionDigestsResponseBody</p>
 */
public class DescribeAntChainLatestTransactionDigestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < java.util.Map<String, ?>> result;

    private DescribeAntChainLatestTransactionDigestsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainLatestTransactionDigestsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainLatestTransactionDigestsResponseBody build() {
            return new DescribeAntChainLatestTransactionDigestsResponseBody(this);
        } 

    } 

}
