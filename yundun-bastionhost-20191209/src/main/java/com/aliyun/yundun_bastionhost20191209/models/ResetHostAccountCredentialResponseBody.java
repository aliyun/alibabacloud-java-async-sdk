// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>RequestId.</p>
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
