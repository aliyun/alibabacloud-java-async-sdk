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
 * {@link ListCACertificateLogRequest} extends {@link RequestModel}
 *
 * <p>ListCACertificateLogRequest</p>
 */
public class ListCACertificateLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private ListCACertificateLogRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCACertificateLogRequest create() {
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

    public static final class Builder extends Request.Builder<ListCACertificateLogRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(ListCACertificateLogRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
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

        @Override
        public ListCACertificateLogRequest build() {
            return new ListCACertificateLogRequest(this);
        } 

    } 

}
