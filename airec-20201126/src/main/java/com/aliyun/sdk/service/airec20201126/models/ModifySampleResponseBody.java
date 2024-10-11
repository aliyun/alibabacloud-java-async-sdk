// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySampleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySampleResponseBody</p>
 */
public class ModifySampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Sample result;

    private ModifySampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySampleResponseBody create() {
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
    public Sample getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Sample result; 

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
        public Builder result(Sample result) {
            this.result = result;
            return this;
        }

        public ModifySampleResponseBody build() {
            return new ModifySampleResponseBody(this);
        } 

    } 

}
