// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHostAccountResponseBody</p>
 */
public class ModifyHostAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyHostAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostAccountResponseBody create() {
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
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHostAccountResponseBody build() {
            return new ModifyHostAccountResponseBody(this);
        } 

    } 

}
