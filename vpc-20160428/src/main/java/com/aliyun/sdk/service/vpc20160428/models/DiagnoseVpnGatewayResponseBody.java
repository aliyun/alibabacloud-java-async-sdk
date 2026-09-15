// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DiagnoseVpnGatewayResponseBody model) {
            this.diagnoseId = model.diagnoseId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The diagnosis ID.</p>
         * <p>After this operation returns the diagnosis ID, you can call the <a href="https://help.aliyun.com/document_detail/2521963.html">GetVpnGatewayDiagnoseResult</a> operation to query the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>vpndgn-uf6kuxbe3iv028k3s****</p>
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
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
