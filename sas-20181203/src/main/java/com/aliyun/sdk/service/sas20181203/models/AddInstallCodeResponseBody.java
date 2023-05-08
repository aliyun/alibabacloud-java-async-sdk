// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInstallCodeResponseBody} extends {@link TeaModel}
 *
 * <p>AddInstallCodeResponseBody</p>
 */
public class AddInstallCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddInstallCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstallCodeResponseBody create() {
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
         * The validity period of the installation command. The value is a 13-digit timestamp.
         * <p>
         * 
         * >  The installation command is valid only within the validity period. An expired installation command cannot be used to install the Security Center agent.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddInstallCodeResponseBody build() {
            return new AddInstallCodeResponseBody(this);
        } 

    } 

}
