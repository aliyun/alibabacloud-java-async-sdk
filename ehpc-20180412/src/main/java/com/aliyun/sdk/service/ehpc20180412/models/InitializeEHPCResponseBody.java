// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeEHPCResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeEHPCResponseBody</p>
 */
public class InitializeEHPCResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private InitializeEHPCResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeEHPCResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InitializeEHPCResponseBody build() {
            return new InitializeEHPCResponseBody(this);
        } 

    } 

}
