// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAdditionalCertificatesWithListenerResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateAdditionalCertificatesWithListenerResponseBody</p>
 */
public class AssociateAdditionalCertificatesWithListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateAdditionalCertificatesWithListenerResponseBody(Builder builder) {
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAdditionalCertificatesWithListenerResponseBody create() {
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
         * The listener ID.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateAdditionalCertificatesWithListenerResponseBody build() {
            return new AssociateAdditionalCertificatesWithListenerResponseBody(this);
        } 

    } 

}
