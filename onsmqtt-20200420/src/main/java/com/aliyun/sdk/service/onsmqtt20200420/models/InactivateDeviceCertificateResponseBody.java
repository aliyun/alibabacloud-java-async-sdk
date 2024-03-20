// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InactivateDeviceCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>InactivateDeviceCertificateResponseBody</p>
 */
public class InactivateDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("DeviceSn")
    private String deviceSn;

    @NameInMap("RequestId")
    private String requestId;

    private InactivateDeviceCertificateResponseBody(Builder builder) {
        this.deviceSn = builder.deviceSn;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InactivateDeviceCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deviceSn; 
        private String requestId; 

        /**
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InactivateDeviceCertificateResponseBody build() {
            return new InactivateDeviceCertificateResponseBody(this);
        } 

    } 

}
