// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAIServiceSecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAIServiceSecurityIpsResponseBody</p>
 */
public class ModifyAIServiceSecurityIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAIServiceSecurityIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAIServiceSecurityIpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyAIServiceSecurityIpsResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAIServiceSecurityIpsResponseBody build() {
            return new ModifyAIServiceSecurityIpsResponseBody(this);
        } 

    } 

}
