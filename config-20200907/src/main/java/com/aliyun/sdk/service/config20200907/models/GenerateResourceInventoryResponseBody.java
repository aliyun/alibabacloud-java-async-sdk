// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateResourceInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateResourceInventoryResponseBody</p>
 */
public class GenerateResourceInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private GenerateResourceInventoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateResourceInventoryResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateResourceInventoryResponseBody build() {
            return new GenerateResourceInventoryResponseBody(this);
        } 

    } 

}
