// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReactivateDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ReactivateDomainResponseBody</p>
 */
public class ReactivateDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReactivateDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactivateDomainResponseBody create() {
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
         * *   This operation is intended for API providers.
         * <p>
         * *   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.
         * *   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.
         * *   You can call this operation to reactivate the domain name to resume normal access.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReactivateDomainResponseBody build() {
            return new ReactivateDomainResponseBody(this);
        } 

    } 

}
