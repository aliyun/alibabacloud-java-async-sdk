// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySsoStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectorySsoStatusResponseBody</p>
 */
public class GetDirectorySsoStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SsoStatus")
    private Boolean ssoStatus;

    private GetDirectorySsoStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ssoStatus = builder.ssoStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectorySsoStatusResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SsoStatus.
         */
        public Builder ssoStatus(Boolean ssoStatus) {
            this.ssoStatus = ssoStatus;
            return this;
        }

        public GetDirectorySsoStatusResponseBody build() {
            return new GetDirectorySsoStatusResponseBody(this);
        } 

    } 

}
