// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link GetCaCertResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaCertResponseBody</p>
 */
public class GetCaCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCert")
    private String caCert;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCaCertResponseBody(Builder builder) {
        this.caCert = builder.caCert;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCert
     */
    public String getCaCert() {
        return this.caCert;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String caCert; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCaCertResponseBody model) {
            this.caCert = model.caCert;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Base64-encoded content of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nMIIFszCCA5ugAwIBAgIDM/1OMA0GCSqGSIb3DQEBCwUAME427zhT4HDLcCEW****-----END CERTIFICATE-----\n</p>
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0496204-7586-5B4C-B364-2361CC0ED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCaCertResponseBody build() {
            return new GetCaCertResponseBody(this);
        } 

    } 

}
