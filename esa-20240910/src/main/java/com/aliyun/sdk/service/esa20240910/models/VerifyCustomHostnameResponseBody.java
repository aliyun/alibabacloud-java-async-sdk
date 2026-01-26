// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyCustomHostnameResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCustomHostnameResponseBody</p>
 */
public class VerifyCustomHostnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Passed")
    private Boolean passed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private VerifyCustomHostnameResponseBody(Builder builder) {
        this.passed = builder.passed;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCustomHostnameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(VerifyCustomHostnameResponseBody model) {
            this.passed = model.passed;
            this.requestId = model.requestId;
        } 

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

        public VerifyCustomHostnameResponseBody build() {
            return new VerifyCustomHostnameResponseBody(this);
        } 

    } 

}
