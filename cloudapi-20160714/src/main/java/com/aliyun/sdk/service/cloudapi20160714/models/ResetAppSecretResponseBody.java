// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppSecretResponseBody} extends {@link TeaModel}
 *
 * <p>ResetAppSecretResponseBody</p>
 */
public class ResetAppSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetAppSecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppSecretResponseBody create() {
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

        public ResetAppSecretResponseBody build() {
            return new ResetAppSecretResponseBody(this);
        } 

    } 

}
