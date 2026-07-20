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
 * {@link GetCatalogKmsGrantsRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogKmsGrantsRequest</p>
 */
public class GetCatalogKmsGrantsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    private GetCatalogKmsGrantsRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogKmsGrantsRequest create() {
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

    public static final class Builder extends Request.Builder<GetCatalogKmsGrantsRequest, Builder> {
        private String catalog; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogKmsGrantsRequest request) {
            super(request);
            this.catalog = request.catalog;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder catalog(String catalog) {
            this.putPathParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        @Override
        public GetCatalogKmsGrantsRequest build() {
            return new GetCatalogKmsGrantsRequest(this);
        } 

    } 

}
