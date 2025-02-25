// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link DisablePolicyTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DisablePolicyTypeResponseBody</p>
 */
public class DisablePolicyTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisablePolicyTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisablePolicyTypeResponseBody create() {
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
         * <p>6E27F22C-EDA3-132E-A53F-77DE3BC2343D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisablePolicyTypeResponseBody build() {
            return new DisablePolicyTypeResponseBody(this);
        } 

    } 

}
