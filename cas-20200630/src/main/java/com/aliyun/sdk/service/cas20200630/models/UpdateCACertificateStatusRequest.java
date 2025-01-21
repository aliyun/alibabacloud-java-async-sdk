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
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private UpdateCACertificateStatusRequest(Builder builder) {
        super(builder);
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
        private String identifier; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCACertificateStatusRequest request) {
            super(request);
            this.identifier = request.identifier;
            this.status = request.status;
        } 

        /**
         * <p>The unique identifier of the CA certificate whose status you want to change.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/328095.html">DescribeCACertificateList</a> operation to query the unique identifiers of all CA certificates.</p>
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
         * <p>The state to which you want to change the CA certificate. Set to the value to <strong>REVOKE</strong>. After this operation is called, the status of the CA certificate is changed to <strong>REVOKE</strong>.</p>
         * <blockquote>
         * <p> You can call this operation only if the status of a CA certificate is <strong>ISSUE</strong>. You can call the <a href="https://help.aliyun.com/document_detail/328096.html">DescribeCACertificate</a> operation to query the status of a CA certificate.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
