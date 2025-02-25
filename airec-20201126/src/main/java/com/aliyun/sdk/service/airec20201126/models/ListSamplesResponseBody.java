// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSamplesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSamplesResponseBody</p>
 */
public class ListSamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Sample > result;

    private ListSamplesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSamplesResponseBody create() {
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
    public java.util.List < Sample > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Sample > result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Sample > result) {
            this.result = result;
            return this;
        }

        public ListSamplesResponseBody build() {
            return new ListSamplesResponseBody(this);
        } 

    } 

}
