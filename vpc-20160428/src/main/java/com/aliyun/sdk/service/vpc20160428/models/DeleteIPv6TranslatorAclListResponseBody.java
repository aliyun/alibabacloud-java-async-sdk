// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIPv6TranslatorAclListResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIPv6TranslatorAclListResponseBody</p>
 */
public class DeleteIPv6TranslatorAclListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIPv6TranslatorAclListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIPv6TranslatorAclListResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteIPv6TranslatorAclListResponseBody build() {
            return new DeleteIPv6TranslatorAclListResponseBody(this);
        } 

    } 

}
