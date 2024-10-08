// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifySiteResponseBody} extends {@link TeaModel}
 *
 * <p>VerifySiteResponseBody</p>
 */
public class VerifySiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Passed")
    private Boolean passed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifySiteResponseBody(Builder builder) {
        this.passed = builder.passed;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifySiteResponseBody create() {
        return builder().build();
    }

    /**
     * @return passed
     */
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean passed; 
        private String requestId; 

        /**
         * Passed.
         */
        public Builder passed(Boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifySiteResponseBody build() {
            return new VerifySiteResponseBody(this);
        } 

    } 

}
