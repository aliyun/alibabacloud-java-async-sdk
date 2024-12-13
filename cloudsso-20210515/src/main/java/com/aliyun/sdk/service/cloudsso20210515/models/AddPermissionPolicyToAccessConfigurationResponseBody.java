// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddPermissionPolicyToAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>AddPermissionPolicyToAccessConfigurationResponseBody</p>
 */
public class AddPermissionPolicyToAccessConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddPermissionPolicyToAccessConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPermissionPolicyToAccessConfigurationResponseBody create() {
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
         * <p>B7C6E839-FB65-59BE-B753-003AA8AF7DF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPermissionPolicyToAccessConfigurationResponseBody build() {
            return new AddPermissionPolicyToAccessConfigurationResponseBody(this);
        } 

    } 

}
