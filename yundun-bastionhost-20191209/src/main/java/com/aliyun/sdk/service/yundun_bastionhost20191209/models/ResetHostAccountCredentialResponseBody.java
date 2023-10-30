// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetHostAccountCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>ResetHostAccountCredentialResponseBody</p>
 */
public class ResetHostAccountCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetHostAccountCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetHostAccountCredentialResponseBody create() {
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

        public ResetHostAccountCredentialResponseBody build() {
            return new ResetHostAccountCredentialResponseBody(this);
        } 

    } 

}
