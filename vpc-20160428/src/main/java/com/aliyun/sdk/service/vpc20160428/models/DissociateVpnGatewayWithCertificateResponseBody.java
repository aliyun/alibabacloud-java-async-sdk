// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DissociateVpnGatewayWithCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateVpnGatewayWithCertificateResponseBody</p>
 */
public class DissociateVpnGatewayWithCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DissociateVpnGatewayWithCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateVpnGatewayWithCertificateResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>611CB80C-B6A9-43DB-9E38-0B0AC3D9B58F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DissociateVpnGatewayWithCertificateResponseBody build() {
            return new DissociateVpnGatewayWithCertificateResponseBody(this);
        } 

    } 

}
