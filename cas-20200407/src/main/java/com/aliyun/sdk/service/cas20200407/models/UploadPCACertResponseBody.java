// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadPCACertResponseBody model) {
            this.identifier = model.identifier;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1ed65580-7e33-6a50-8630-dd13fdc009ee</p>
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
