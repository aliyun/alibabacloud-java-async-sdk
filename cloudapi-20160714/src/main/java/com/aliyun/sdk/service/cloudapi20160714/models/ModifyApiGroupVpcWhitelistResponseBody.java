// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupVpcWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupVpcWhitelistResponseBody</p>
 */
public class ModifyApiGroupVpcWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyApiGroupVpcWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupVpcWhitelistResponseBody create() {
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

        public ModifyApiGroupVpcWhitelistResponseBody build() {
            return new ModifyApiGroupVpcWhitelistResponseBody(this);
        } 

    } 

}
