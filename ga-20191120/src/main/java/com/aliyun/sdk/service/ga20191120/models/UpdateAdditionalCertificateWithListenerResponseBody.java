// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdditionalCertificateWithListenerResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAdditionalCertificateWithListenerResponseBody</p>
 */
public class UpdateAdditionalCertificateWithListenerResponseBody extends TeaModel {
    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAdditionalCertificateWithListenerResponseBody(Builder builder) {
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdditionalCertificateWithListenerResponseBody create() {
        return builder().build();
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String listenerId; 
        private String requestId; 

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAdditionalCertificateWithListenerResponseBody build() {
            return new UpdateAdditionalCertificateWithListenerResponseBody(this);
        } 

    } 

}
