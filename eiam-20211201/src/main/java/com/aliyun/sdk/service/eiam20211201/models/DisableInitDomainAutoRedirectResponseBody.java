// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInitDomainAutoRedirectResponseBody} extends {@link TeaModel}
 *
 * <p>DisableInitDomainAutoRedirectResponseBody</p>
 */
public class DisableInitDomainAutoRedirectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisableInitDomainAutoRedirectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInitDomainAutoRedirectResponseBody create() {
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

        public DisableInitDomainAutoRedirectResponseBody build() {
            return new DisableInitDomainAutoRedirectResponseBody(this);
        } 

    } 

}
