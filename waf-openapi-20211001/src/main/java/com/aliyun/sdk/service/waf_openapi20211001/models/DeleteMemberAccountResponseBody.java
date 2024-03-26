// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMemberAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMemberAccountResponseBody</p>
 */
public class DeleteMemberAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteMemberAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemberAccountResponseBody create() {
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

        public DeleteMemberAccountResponseBody build() {
            return new DeleteMemberAccountResponseBody(this);
        } 

    } 

}
