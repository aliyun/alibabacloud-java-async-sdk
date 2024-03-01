// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteControlPolicyTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteControlPolicyTemplateResponseBody</p>
 */
public class DeleteControlPolicyTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteControlPolicyTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteControlPolicyTemplateResponseBody create() {
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

        public DeleteControlPolicyTemplateResponseBody build() {
            return new DeleteControlPolicyTemplateResponseBody(this);
        } 

    } 

}
