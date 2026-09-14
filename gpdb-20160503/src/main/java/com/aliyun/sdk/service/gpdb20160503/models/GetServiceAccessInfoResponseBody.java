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
         * <p>The redirect URL for logging on to the service console.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxxxx">http://xxxxxxxxx</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The verification code for the service console logon URL.</p>
         * 
         * <strong>example:</strong>
         * <p>dcwedsxcx</p>
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
