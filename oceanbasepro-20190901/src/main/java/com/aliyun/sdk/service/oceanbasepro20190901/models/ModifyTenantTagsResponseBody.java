// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantTagsResponseBody</p>
 */
public class ModifyTenantTagsResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyTenantTagsResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 

        /**
         * 打标情况
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyTenantTagsResponseBody build() {
            return new ModifyTenantTagsResponseBody(this);
        } 

    } 

}
