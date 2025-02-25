// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyDedicatedHostAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostAutoRenewAttributeResponseBody</p>
 */
public class ModifyDedicatedHostAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedHostAutoRenewAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostAutoRenewAttributeResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2A4EA075-CB5B-41B7-B0EB-70D339F6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDedicatedHostAutoRenewAttributeResponseBody build() {
            return new ModifyDedicatedHostAutoRenewAttributeResponseBody(this);
        } 

    } 

}
