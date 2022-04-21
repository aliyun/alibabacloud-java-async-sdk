// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>DeployFunctionResponseBody</p>
 */
public class DeployFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeployFunctionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployFunctionResponseBody create() {
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

        public DeployFunctionResponseBody build() {
            return new DeployFunctionResponseBody(this);
        } 

    } 

}
