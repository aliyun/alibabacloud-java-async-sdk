// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMFAAuthenticationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationStatusResponseBody</p>
 */
public class GetMFAAuthenticationStatusResponseBody extends TeaModel {
    @NameInMap("MFAAuthenticationStatus")
    private String MFAAuthenticationStatus;

    @NameInMap("RequestId")
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
         * MFAAuthenticationStatus.
         */
        public Builder MFAAuthenticationStatus(String MFAAuthenticationStatus) {
            this.MFAAuthenticationStatus = MFAAuthenticationStatus;
            return this;
        }

        /**
         * RequestId.
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
