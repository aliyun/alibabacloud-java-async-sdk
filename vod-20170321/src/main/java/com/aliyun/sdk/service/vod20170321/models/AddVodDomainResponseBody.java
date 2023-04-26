// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodDomainResponseBody} extends {@link TeaModel}
 *
 * <p>AddVodDomainResponseBody</p>
 */
public class AddVodDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddVodDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodDomainResponseBody create() {
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
         * The URL that is used for health checks.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddVodDomainResponseBody build() {
            return new AddVodDomainResponseBody(this);
        } 

    } 

}
