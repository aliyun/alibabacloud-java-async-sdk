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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    private GetCatalogSummaryRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.date = builder.date;
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

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder extends Request.Builder<GetCatalogSummaryRequest, Builder> {
        private String catalogId; 
        private String date; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogSummaryRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.date = request.date;
        } 

        /**
         * <p>The ID of the data catalog.</p>
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

        /**
         * <p>The date of the storage overview.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-18</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        @Override
        public GetCatalogSummaryRequest build() {
            return new GetCatalogSummaryRequest(this);
        } 

    } 

}
