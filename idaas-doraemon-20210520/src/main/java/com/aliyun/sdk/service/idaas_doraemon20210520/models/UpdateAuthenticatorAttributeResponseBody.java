// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthenticatorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAuthenticatorAttributeResponseBody</p>
 */
public class UpdateAuthenticatorAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateAuthenticatorAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthenticatorAttributeResponseBody create() {
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

        public UpdateAuthenticatorAttributeResponseBody build() {
            return new UpdateAuthenticatorAttributeResponseBody(this);
        } 

    } 

}
