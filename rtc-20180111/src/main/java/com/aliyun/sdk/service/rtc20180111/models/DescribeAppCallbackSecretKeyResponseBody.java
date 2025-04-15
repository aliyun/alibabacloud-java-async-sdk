// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAppCallbackSecretKeyResponseBody model) {
            this.callbackSecretKey = model.callbackSecretKey;
            this.requestId = model.requestId;
        } 

        /**
         * CallbackSecretKey.
         */
        public Builder callbackSecretKey(String callbackSecretKey) {
            this.callbackSecretKey = callbackSecretKey;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
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
