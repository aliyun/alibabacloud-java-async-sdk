// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link DecodeDiagnosticMessageRequest} extends {@link RequestModel}
 *
 * <p>DecodeDiagnosticMessageRequest</p>
 */
public class DecodeDiagnosticMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
    private String encodedDiagnosticMessage;

    private DecodeDiagnosticMessageRequest(Builder builder) {
        super(builder);
        this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecodeDiagnosticMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodedDiagnosticMessage
     */
    public String getEncodedDiagnosticMessage() {
        return this.encodedDiagnosticMessage;
    }

    public static final class Builder extends Request.Builder<DecodeDiagnosticMessageRequest, Builder> {
        private String encodedDiagnosticMessage; 

        private Builder() {
            super();
        } 

        private Builder(DecodeDiagnosticMessageRequest request) {
            super(request);
            this.encodedDiagnosticMessage = request.encodedDiagnosticMessage;
        } 

        /**
         * <p>The encoded diagnostic information in the response that contains an access denied error. The error is caused by no RAM permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAZBgxr0U1MjA1NTM1LUM4BBktMzE5RS1CODgxLUU1QTI0RDNFQTM1****</p>
         */
        public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.putQueryParameter("EncodedDiagnosticMessage", encodedDiagnosticMessage);
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }

        @Override
        public DecodeDiagnosticMessageRequest build() {
            return new DecodeDiagnosticMessageRequest(this);
        } 

    } 

}
