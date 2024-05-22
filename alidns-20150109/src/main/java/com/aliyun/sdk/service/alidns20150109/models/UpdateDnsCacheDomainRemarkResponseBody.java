// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsCacheDomainRemarkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDnsCacheDomainRemarkResponseBody</p>
 */
public class UpdateDnsCacheDomainRemarkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDnsCacheDomainRemarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsCacheDomainRemarkResponseBody create() {
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

        public UpdateDnsCacheDomainRemarkResponseBody build() {
            return new UpdateDnsCacheDomainRemarkResponseBody(this);
        } 

    } 

}
