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
 * {@link GetCatalogSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogSummaryRequest</p>
 */
public class GetCatalogSummaryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    private GetCatalogSummaryRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    public static final class Builder extends Request.Builder<GetCatalogSummaryRequest, Builder> {
        private String catalogId; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogSummaryRequest request) {
            super(request);
            this.catalogId = request.catalogId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        @Override
        public GetCatalogSummaryRequest build() {
            return new GetCatalogSummaryRequest(this);
        } 

    } 

}
