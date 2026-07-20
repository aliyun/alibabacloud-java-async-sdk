// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link VerifyCatalogKmsRequest} extends {@link RequestModel}
 *
 * <p>VerifyCatalogKmsRequest</p>
 */
public class VerifyCatalogKmsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsKeyId;

    private VerifyCatalogKmsRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.kmsKeyId = builder.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCatalogKmsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public static final class Builder extends Request.Builder<VerifyCatalogKmsRequest, Builder> {
        private String catalog; 
        private String kmsKeyId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCatalogKmsRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.kmsKeyId = request.kmsKeyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder catalog(String catalog) {
            this.putPathParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("kmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        @Override
        public VerifyCatalogKmsRequest build() {
            return new VerifyCatalogKmsRequest(this);
        } 

    } 

}
