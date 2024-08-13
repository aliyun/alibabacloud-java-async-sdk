// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadPCACertResponseBody} extends {@link TeaModel}
 *
 * <p>UploadPCACertResponseBody</p>
 */
public class UploadPCACertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadPCACertResponseBody(Builder builder) {
        this.identifier = builder.identifier;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPCACertResponseBody create() {
        return builder().build();
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String identifier; 
        private String requestId; 

        /**
         * The unique identifier of the certificate.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadPCACertResponseBody build() {
            return new UploadPCACertResponseBody(this);
        } 

    } 

}
