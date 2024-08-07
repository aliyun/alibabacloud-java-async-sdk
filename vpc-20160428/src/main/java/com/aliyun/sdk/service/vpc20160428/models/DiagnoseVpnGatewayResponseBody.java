// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseVpnGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DiagnoseVpnGatewayResponseBody</p>
 */
public class DiagnoseVpnGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnoseId")
    private String diagnoseId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DiagnoseVpnGatewayResponseBody(Builder builder) {
        this.diagnoseId = builder.diagnoseId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseVpnGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String diagnoseId; 
        private String requestId; 

        /**
         * The ID of the diagnostic.
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DiagnoseVpnGatewayResponseBody build() {
            return new DiagnoseVpnGatewayResponseBody(this);
        } 

    } 

}
