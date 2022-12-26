// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityEventMarkMissListResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecurityEventMarkMissListResponseBody</p>
 */
public class DeleteSecurityEventMarkMissListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSecurityEventMarkMissListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityEventMarkMissListResponseBody create() {
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

        public DeleteSecurityEventMarkMissListResponseBody build() {
            return new DeleteSecurityEventMarkMissListResponseBody(this);
        } 

    } 

}
