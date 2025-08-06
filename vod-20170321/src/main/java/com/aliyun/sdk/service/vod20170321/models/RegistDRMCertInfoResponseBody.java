// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link RegistDRMCertInfoResponseBody} extends {@link TeaModel}
 *
 * <p>RegistDRMCertInfoResponseBody</p>
 */
public class RegistDRMCertInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegistDRMCertInfoResponseBody(Builder builder) {
        this.certId = builder.certId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistDRMCertInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegistDRMCertInfoResponseBody model) {
            this.certId = model.certId;
            this.requestId = model.requestId;
        } 

        /**
         * CertId.
         */
        public Builder certId(String certId) {
            this.certId = certId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegistDRMCertInfoResponseBody build() {
            return new RegistDRMCertInfoResponseBody(this);
        } 

    } 

}
