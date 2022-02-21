// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberACLsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMemberACLsResponseBody</p>
 */
public class ModifyMemberACLsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyMemberACLsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMemberACLsResponseBody create() {
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

        public ModifyMemberACLsResponseBody build() {
            return new ModifyMemberACLsResponseBody(this);
        } 

    } 

}
