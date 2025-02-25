// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveExternalSAMLIdPCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveExternalSAMLIdPCertificateResponseBody</p>
 */
public class RemoveExternalSAMLIdPCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveExternalSAMLIdPCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveExternalSAMLIdPCertificateResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>400979BC-92EC-58B9-B47C-6913BD56A6FD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveExternalSAMLIdPCertificateResponseBody build() {
            return new RemoveExternalSAMLIdPCertificateResponseBody(this);
        } 

    } 

}
