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
 * {@link GetCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogRequest</p>
 */
public class GetCatalogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    private GetCatalogRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogRequest create() {
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

    public static final class Builder extends Request.Builder<GetCatalogRequest, Builder> {
        private String catalog; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogRequest request) {
            super(request);
            this.catalog = request.catalog;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxxx</p>
         */
        public Builder catalog(String catalog) {
            this.putPathParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        @Override
        public GetCatalogRequest build() {
            return new GetCatalogRequest(this);
        } 

    } 

}
