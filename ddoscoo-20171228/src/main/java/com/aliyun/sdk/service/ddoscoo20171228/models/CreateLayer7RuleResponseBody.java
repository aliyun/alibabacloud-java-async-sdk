// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayer7RuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLayer7RuleResponseBody</p>
 */
public class CreateLayer7RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateLayer7RuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayer7RuleResponseBody create() {
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

        public CreateLayer7RuleResponseBody build() {
            return new CreateLayer7RuleResponseBody(this);
        } 

    } 

}
