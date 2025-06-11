// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link AddExternalSAMLIdPCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>AddExternalSAMLIdPCertificateResponseBody</p>
 */
public class AddExternalSAMLIdPCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddExternalSAMLIdPCertificateResponseBody(Builder builder) {
        this.certificateId = builder.certificateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddExternalSAMLIdPCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificateId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddExternalSAMLIdPCertificateResponseBody model) {
            this.certificateId = model.certificateId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the SAML signing certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-c-00wk2fb4foracls0****</p>
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12B3E332-DD16-515B-B695-39BA233AA172</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddExternalSAMLIdPCertificateResponseBody build() {
            return new AddExternalSAMLIdPCertificateResponseBody(this);
        } 

    } 

}
