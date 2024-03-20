// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActiveDeviceCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>ActiveDeviceCertificateResponseBody</p>
 */
public class ActiveDeviceCertificateResponseBody extends TeaModel {
    @NameInMap("DeviceSn")
    private String deviceSn;

    @NameInMap("RequestId")
    private String requestId;

    private ActiveDeviceCertificateResponseBody(Builder builder) {
        this.deviceSn = builder.deviceSn;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveDeviceCertificateResponseBody create() {
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

        public ActiveDeviceCertificateResponseBody build() {
            return new ActiveDeviceCertificateResponseBody(this);
        } 

    } 

}
