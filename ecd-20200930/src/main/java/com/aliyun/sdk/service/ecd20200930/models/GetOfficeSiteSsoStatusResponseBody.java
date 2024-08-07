// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficeSiteSsoStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetOfficeSiteSsoStatusResponseBody</p>
 */
public class GetOfficeSiteSsoStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SsoStatus")
    private Boolean ssoStatus;

    private GetOfficeSiteSsoStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ssoStatus = builder.ssoStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficeSiteSsoStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ssoStatus
     */
    public Boolean getSsoStatus() {
        return this.ssoStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean ssoStatus; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether SSO is enabled.
         */
        public Builder ssoStatus(Boolean ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }

        public GetOfficeSiteSsoStatusResponseBody build() {
            return new GetOfficeSiteSsoStatusResponseBody(this);
        } 

    } 

}
