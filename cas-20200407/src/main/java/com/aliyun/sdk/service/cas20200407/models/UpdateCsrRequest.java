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
 * {@link UpdateCsrRequest} extends {@link RequestModel}
 *
 * <p>UpdateCsrRequest</p>
 */
public class UpdateCsrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CsrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long csrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    private UpdateCsrRequest(Builder builder) {
        super(builder);
        this.csrId = builder.csrId;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return csrId
     */
    public Long getCsrId() {
        return this.csrId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<UpdateCsrRequest, Builder> {
        private Long csrId; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCsrRequest request) {
            super(request);
            this.csrId = request.csrId;
            this.key = request.key;
        } 

        /**
         * <p>The ID of the CSR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5209</p>
         */
        public Builder csrId(Long csrId) {
            this.putQueryParameter("CsrId", csrId);
            this.csrId = csrId;
            return this;
        }

        /**
         * <p>The private key content of the certificate in the PEM format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY----- MII.... -----END RSA PRIVATE KEY-----</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public UpdateCsrRequest build() {
            return new UpdateCsrRequest(this);
        } 

    } 

}
