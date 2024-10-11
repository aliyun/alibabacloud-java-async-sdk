// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloneSampleResponseBody} extends {@link TeaModel}
 *
 * <p>CloneSampleResponseBody</p>
 */
public class CloneSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Sample result;

    private CloneSampleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneSampleResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Sample result) {
            this.result = result;
            return this;
        }

        public CloneSampleResponseBody build() {
            return new CloneSampleResponseBody(this);
        } 

    } 

}
