// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestFixedFlowDividersResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateABTestFixedFlowDividersResponseBody</p>
 */
public class UpdateABTestFixedFlowDividersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < String > result;

    private UpdateABTestFixedFlowDividersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestFixedFlowDividersResponseBody create() {
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
    public java.util.List < String > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        public UpdateABTestFixedFlowDividersResponseBody build() {
            return new UpdateABTestFixedFlowDividersResponseBody(this);
        } 

    } 

}
