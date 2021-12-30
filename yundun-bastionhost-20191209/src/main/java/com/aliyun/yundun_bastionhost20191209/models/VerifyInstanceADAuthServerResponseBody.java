// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link VerifyInstanceADAuthServerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyInstanceADAuthServerResponseBody</p>
 */
public class VerifyInstanceADAuthServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private VerifyInstanceADAuthServerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyInstanceADAuthServerResponseBody create() {
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyInstanceADAuthServerResponseBody build() {
            return new VerifyInstanceADAuthServerResponseBody(this);
        } 

    } 

}
