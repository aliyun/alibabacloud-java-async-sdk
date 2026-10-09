// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link UpdateCACertificateStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateCACertificateStatusRequest</p>
 */
public class UpdateCACertificateStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateCACertificateStatusRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.identifier = builder.identifier;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCACertificateStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateCACertificateStatusRequest, Builder> {
        private String clientToken; 
        private String identifier; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCACertificateStatusRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.identifier = request.identifier;
            this.status = request.status;
        } 

        /**
         * <p>A client token used to ensure the idempotence of the request.</p>
         * <p>Generate a unique parameter value from your client for each request. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3838B684-3075-582B-9A45-8C99104029DF</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The unique identifier of the CA certificate.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/465957.html">DescribeCACertificateList</a> to query the unique identifiers of all CA certificates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The operation to perform on the CA certificate. Set the value to <strong>REVOKE</strong>. This revokes the CA certificate and changes its status to <strong>REVOKE</strong>.</p>
         * <blockquote>
         * <p>This operation is supported only when the CA certificate is in the <strong>ISSUE</strong> state. Call <a href="https://help.aliyun.com/document_detail/465954.html">DescribeCACertificate</a> to query the current status of the CA certificate.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>REVOKE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateCACertificateStatusRequest build() {
            return new UpdateCACertificateStatusRequest(this);
        } 

    } 

}
