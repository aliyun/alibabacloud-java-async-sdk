// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountFactoryBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccountFactoryBaselineResponseBody</p>
 */
public class CreateAccountFactoryBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccountFactoryBaselineResponseBody(Builder builder) {
        this.baselineId = builder.baselineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountFactoryBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String baselineId; 
        private String requestId; 

        /**
         * BaselineId.
         */
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccountFactoryBaselineResponseBody build() {
            return new CreateAccountFactoryBaselineResponseBody(this);
        } 

    } 

}
