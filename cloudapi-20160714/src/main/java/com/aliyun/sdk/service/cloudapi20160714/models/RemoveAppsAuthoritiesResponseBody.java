// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAppsAuthoritiesResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveAppsAuthoritiesResponseBody</p>
 */
public class RemoveAppsAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveAppsAuthoritiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAppsAuthoritiesResponseBody create() {
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
         * Revokes the access permissions on a specified API from multiple applications. In this case, multiple applications map to a single API.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveAppsAuthoritiesResponseBody build() {
            return new RemoveAppsAuthoritiesResponseBody(this);
        } 

    } 

}
