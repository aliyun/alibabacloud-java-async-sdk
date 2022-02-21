// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionTestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVersionTestResponseBody</p>
 */
public class CreateVersionTestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TestId")
    private String testId;

    private CreateVersionTestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.testId = builder.testId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVersionTestResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return testId
     */
    public String getTestId() {
        return this.testId;
    }

    public static final class Builder {
        private String requestId; 
        private String testId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TestId.
         */
        public Builder testId(String testId) {
            this.testId = testId;
            return this;
        }

        public CreateVersionTestResponseBody build() {
            return new CreateVersionTestResponseBody(this);
        } 

    } 

}
