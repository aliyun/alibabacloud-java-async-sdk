// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AuthorizeInstanceGroupResponseBody</p>
 */
public class AuthorizeInstanceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AuthorizeInstanceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeInstanceGroupResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AuthorizeInstanceGroupResponseBody build() {
            return new AuthorizeInstanceGroupResponseBody(this);
        } 

    } 

}
