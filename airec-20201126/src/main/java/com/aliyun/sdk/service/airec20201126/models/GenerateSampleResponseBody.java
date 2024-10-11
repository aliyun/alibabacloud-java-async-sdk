// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateSampleResponseBody</p>
 */
public class GenerateSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Sample result;

    private GenerateSampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSampleResponseBody create() {
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

        public GenerateSampleResponseBody build() {
            return new GenerateSampleResponseBody(this);
        } 

    } 

}
