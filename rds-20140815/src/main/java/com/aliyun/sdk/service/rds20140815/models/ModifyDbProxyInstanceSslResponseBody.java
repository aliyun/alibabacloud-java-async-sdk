// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDbProxyInstanceSslResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDbProxyInstanceSslResponseBody</p>
 */
public class ModifyDbProxyInstanceSslResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDbProxyInstanceSslResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDbProxyInstanceSslResponseBody create() {
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
         * <p>BF46A62B-3717-4397-9338-36BB95C898B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDbProxyInstanceSslResponseBody build() {
            return new ModifyDbProxyInstanceSslResponseBody(this);
        } 

    } 

}
