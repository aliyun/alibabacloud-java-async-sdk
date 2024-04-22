// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserSuppressionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserSuppressionResponseBody</p>
 */
public class CreateUserSuppressionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuppressionId")
    private String suppressionId;

    private CreateUserSuppressionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suppressionId = builder.suppressionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserSuppressionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suppressionId
     */
    public String getSuppressionId() {
        return this.suppressionId;
    }

    public static final class Builder {
        private String requestId; 
        private String suppressionId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuppressionId.
         */
        public Builder suppressionId(String suppressionId) {
            this.suppressionId = suppressionId;
            return this;
        }

        public CreateUserSuppressionResponseBody build() {
            return new CreateUserSuppressionResponseBody(this);
        } 

    } 

}
