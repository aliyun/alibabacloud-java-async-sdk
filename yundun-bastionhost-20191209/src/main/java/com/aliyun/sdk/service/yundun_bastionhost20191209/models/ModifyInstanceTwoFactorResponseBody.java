// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTwoFactorResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceTwoFactorResponseBody</p>
 */
public class ModifyInstanceTwoFactorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceTwoFactorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTwoFactorResponseBody create() {
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
         * The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: 0 to 168. Unit: hours. If you set this parameter to 0, the local user must pass two-factor authentication every time the local user logs on to the bastion host.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceTwoFactorResponseBody build() {
            return new ModifyInstanceTwoFactorResponseBody(this);
        } 

    } 

}
