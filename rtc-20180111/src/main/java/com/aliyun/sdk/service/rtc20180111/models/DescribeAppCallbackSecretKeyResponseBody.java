// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppCallbackSecretKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppCallbackSecretKeyResponseBody</p>
 */
public class DescribeAppCallbackSecretKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallbackSecretKey")
    private String callbackSecretKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAppCallbackSecretKeyResponseBody(Builder builder) {
        this.callbackSecretKey = builder.callbackSecretKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppCallbackSecretKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbackSecretKey
     */
    public String getCallbackSecretKey() {
        return this.callbackSecretKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String callbackSecretKey; 
        private String requestId; 

        /**
         * CallbackSecretKey.
         */
        public Builder callbackSecretKey(String callbackSecretKey) {
            this.callbackSecretKey = callbackSecretKey;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppCallbackSecretKeyResponseBody build() {
            return new DescribeAppCallbackSecretKeyResponseBody(this);
        } 

    } 

}
