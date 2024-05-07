// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountMFAInfoResponseBody</p>
 */
public class GetAccountMFAInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsMFAEnable")
    private Boolean isMFAEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountMFAInfoResponseBody(Builder builder) {
        this.isMFAEnable = builder.isMFAEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountMFAInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return isMFAEnable
     */
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isMFAEnable; 
        private String requestId; 

        /**
         * Indicates whether MFA is enabled. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isMFAEnable(Boolean isMFAEnable) {
            this.isMFAEnable = isMFAEnable;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountMFAInfoResponseBody build() {
            return new GetAccountMFAInfoResponseBody(this);
        } 

    } 

}
