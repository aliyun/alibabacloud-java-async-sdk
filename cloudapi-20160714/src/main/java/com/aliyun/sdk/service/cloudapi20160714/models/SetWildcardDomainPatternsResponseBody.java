// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetWildcardDomainPatternsResponseBody} extends {@link TeaModel}
 *
 * <p>SetWildcardDomainPatternsResponseBody</p>
 */
public class SetWildcardDomainPatternsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetWildcardDomainPatternsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWildcardDomainPatternsResponseBody create() {
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
         * auditing
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetWildcardDomainPatternsResponseBody build() {
            return new SetWildcardDomainPatternsResponseBody(this);
        } 

    } 

}
