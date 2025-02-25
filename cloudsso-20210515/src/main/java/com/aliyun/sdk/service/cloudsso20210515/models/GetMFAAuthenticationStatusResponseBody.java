// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMFAAuthenticationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationStatusResponseBody</p>
 */
public class GetMFAAuthenticationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFAAuthenticationStatus")
    private String MFAAuthenticationStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMFAAuthenticationStatusResponseBody(Builder builder) {
        this.MFAAuthenticationStatus = builder.MFAAuthenticationStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMFAAuthenticationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return MFAAuthenticationStatus
     */
    public String getMFAAuthenticationStatus() {
        return this.MFAAuthenticationStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String MFAAuthenticationStatus; 
        private String requestId; 

        /**
         * <p>The status of MFA. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder MFAAuthenticationStatus(String MFAAuthenticationStatus) {
            this.MFAAuthenticationStatus = MFAAuthenticationStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5E688346-DF1A-5537-9BFC-8A9974D29586</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMFAAuthenticationStatusResponseBody build() {
            return new GetMFAAuthenticationStatusResponseBody(this);
        } 

    } 

}
