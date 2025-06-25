// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateCertsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCertsResponseBody</p>
 */
public class CreateCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCertsResponseBody(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCertsResponseBody model) {
            this.certIdentifier = model.certIdentifier;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123456-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5BBA38B1-07AE-559F-8766-AB50****C300</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCertsResponseBody build() {
            return new CreateCertsResponseBody(this);
        } 

    } 

}
