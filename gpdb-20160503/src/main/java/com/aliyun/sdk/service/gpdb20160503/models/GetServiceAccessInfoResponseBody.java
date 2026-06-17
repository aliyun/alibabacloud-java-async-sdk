// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetServiceAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceAccessInfoResponseBody</p>
 */
public class GetServiceAccessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private GetServiceAccessInfoResponseBody(Builder builder) {
        this.callbackUrl = builder.callbackUrl;
        this.requestId = builder.requestId;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceAccessInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder {
        private String callbackUrl; 
        private String requestId; 
        private String verifyCode; 

        private Builder() {
        } 

        private Builder(GetServiceAccessInfoResponseBody model) {
            this.callbackUrl = model.callbackUrl;
            this.requestId = model.requestId;
            this.verifyCode = model.verifyCode;
        } 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VerifyCode.
         */
        public Builder verifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }

        public GetServiceAccessInfoResponseBody build() {
            return new GetServiceAccessInfoResponseBody(this);
        } 

    } 

}
