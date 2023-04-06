// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>SetPasswordComplexityConfigurationResponseBody</p>
 */
public class SetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetPasswordComplexityConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPasswordComplexityConfigurationResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetPasswordComplexityConfigurationResponseBody build() {
            return new SetPasswordComplexityConfigurationResponseBody(this);
        } 

    } 

}
