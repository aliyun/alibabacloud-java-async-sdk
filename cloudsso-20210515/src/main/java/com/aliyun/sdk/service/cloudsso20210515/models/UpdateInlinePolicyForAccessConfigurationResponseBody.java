// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateInlinePolicyForAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInlinePolicyForAccessConfigurationResponseBody</p>
 */
public class UpdateInlinePolicyForAccessConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateInlinePolicyForAccessConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInlinePolicyForAccessConfigurationResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B13E4EE-3853-5852-9165-597C32AD8FB7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateInlinePolicyForAccessConfigurationResponseBody build() {
            return new UpdateInlinePolicyForAccessConfigurationResponseBody(this);
        } 

    } 

}
