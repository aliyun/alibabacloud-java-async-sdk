// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpireLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ExpireLoginTokenResponseBody</p>
 */
public class ExpireLoginTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ExpireLoginTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpireLoginTokenResponseBody create() {
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

        public ExpireLoginTokenResponseBody build() {
            return new ExpireLoginTokenResponseBody(this);
        } 

    } 

}
