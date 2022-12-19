// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SasInstallCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SasInstallCodeResponseBody</p>
 */
public class SasInstallCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private String data;

    private SasInstallCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SasInstallCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private String data; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The installation verification code that is used to run the installation command when you manually install the Security Center agent.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public SasInstallCodeResponseBody build() {
            return new SasInstallCodeResponseBody(this);
        } 

    } 

}
