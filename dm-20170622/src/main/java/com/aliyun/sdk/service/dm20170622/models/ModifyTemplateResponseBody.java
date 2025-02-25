// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTemplateResponseBody</p>
 */
public class ModifyTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateResponseBody create() {
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

        public ModifyTemplateResponseBody build() {
            return new ModifyTemplateResponseBody(this);
        } 

    } 

}
