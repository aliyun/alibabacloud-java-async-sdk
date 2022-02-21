// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestGrayResponseBody} extends {@link TeaModel}
 *
 * <p>TestGrayResponseBody</p>
 */
public class TestGrayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private TestGrayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestGrayResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TestGrayResponseBody build() {
            return new TestGrayResponseBody(this);
        } 

    } 

}
