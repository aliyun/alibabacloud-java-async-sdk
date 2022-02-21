// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTemplatePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>SetTemplatePermissionResponseBody</p>
 */
public class SetTemplatePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetTemplatePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTemplatePermissionResponseBody create() {
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

        public SetTemplatePermissionResponseBody build() {
            return new SetTemplatePermissionResponseBody(this);
        } 

    } 

}
