// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateAdditionalCertificatesFromListenerResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateAdditionalCertificatesFromListenerResponseBody</p>
 */
public class DissociateAdditionalCertificatesFromListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DissociateAdditionalCertificatesFromListenerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateAdditionalCertificatesFromListenerResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DissociateAdditionalCertificatesFromListenerResponseBody build() {
            return new DissociateAdditionalCertificatesFromListenerResponseBody(this);
        } 

    } 

}
