// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveIPv6TranslatorAclListEntryResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveIPv6TranslatorAclListEntryResponseBody</p>
 */
public class RemoveIPv6TranslatorAclListEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveIPv6TranslatorAclListEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveIPv6TranslatorAclListEntryResponseBody create() {
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

        public RemoveIPv6TranslatorAclListEntryResponseBody build() {
            return new RemoveIPv6TranslatorAclListEntryResponseBody(this);
        } 

    } 

}
